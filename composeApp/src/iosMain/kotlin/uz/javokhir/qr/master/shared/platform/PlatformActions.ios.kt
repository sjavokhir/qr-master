package uz.javokhir.qr.master.shared.platform

import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asSkiaBitmap
import kotlinx.cinterop.ExperimentalForeignApi
import org.jetbrains.skia.Image
import platform.Contacts.CNContactStore
import platform.Contacts.CNLabelHome
import platform.Contacts.CNLabelPhoneNumberMain
import platform.Contacts.CNLabeledValue
import platform.Contacts.CNMutableContact
import platform.Contacts.CNPhoneNumber
import platform.Contacts.CNSaveRequest
import platform.CoreFoundation.kCFAbsoluteTimeIntervalSince1970
import platform.CoreLocation.CLLocationCoordinate2DMake
import platform.EventKit.EKEntityType
import platform.EventKit.EKEvent
import platform.EventKit.EKEventStore
import platform.EventKit.EKSpan
import platform.Foundation.NSDate
import platform.Foundation.NSError
import platform.Foundation.NSString
import platform.Foundation.NSURL
import platform.MapKit.MKMapItem
import platform.MapKit.MKPlacemark
import platform.NetworkExtension.NEHotspotConfiguration
import platform.NetworkExtension.NEHotspotConfigurationManager
import platform.Photos.PHAssetChangeRequest
import platform.Photos.PHAuthorizationStatusAuthorized
import platform.Photos.PHPhotoLibrary
import platform.UIKit.UIActivityViewController
import platform.UIKit.UIAlertAction
import platform.UIKit.UIAlertActionStyleDefault
import platform.UIKit.UIAlertController
import platform.UIKit.UIAlertControllerStyleAlert
import platform.UIKit.UIApplication
import platform.UIKit.UIImage
import platform.UIKit.UIPasteboard
import platform.UIKit.UIWindow
import uz.javokhir.qr.master.core.extensions.tryCatch
import uz.javokhir.qr.master.extensions.toNSData
import uz.javokhir.qr.master.ui.localization.AppStrings

actual fun toast(message: String) {
    val window = UIApplication.sharedApplication.windows.last() as? UIWindow
    val currentViewController = window?.rootViewController
    val alert = UIAlertController.alertControllerWithTitle(
        title = null,
        message = message,
        preferredStyle = UIAlertControllerStyleAlert
    )
    alert.addAction(
        UIAlertAction.actionWithTitle(
            title = AppStrings.ok,
            style = UIAlertActionStyleDefault,
            handler = null
        )
    )
    currentViewController?.presentViewController(
        viewControllerToPresent = alert,
        animated = true,
        completion = null,
    )
}

actual fun openUrl(
    url: String,
    chromeCustomTabsEnabled: Boolean,
) {
    if (url.startsWith("http://") || url.startsWith("https://")) {
        NSURL.URLWithString(url)?.let {
            UIApplication.sharedApplication.openURL(it)
        }
    } else {
        NSURL.URLWithString("https://$url")?.let {
            UIApplication.sharedApplication.openURL(it)
        }
    }
}

actual fun shareText(text: String) {
    val window = UIApplication.sharedApplication.windows.last() as? UIWindow
    val currentViewController = window?.rootViewController
    val activityViewController = UIActivityViewController(
        activityItems = listOf(text),
        applicationActivities = null
    )
    currentViewController?.presentViewController(
        viewControllerToPresent = activityViewController,
        animated = true,
        completion = null,
    )
}

actual fun copyToClipboard(text: String) {
    UIPasteboard.generalPasteboard.setString(text)
    toast(AppStrings.copiedToClipboard)
}

actual fun dial(phone: String) {
    NSURL.URLWithString("tel://$phone")?.let {
        UIApplication.sharedApplication.openURL(it)
    }
}

actual fun sendMail(
    email: String,
    subject: String,
    message: String,
) {
    NSURL.URLWithString("mailto:$email?subject=$subject?body=$message")?.let {
        UIApplication.sharedApplication.openURL(it)
    }
}

actual fun sendSms(
    phone: String,
    message: String,
) {
    NSURL.URLWithString("smsto:$phone?body=$message")?.let {
        UIApplication.sharedApplication.openURL(it)
    }
}

@OptIn(ExperimentalForeignApi::class)
actual fun addContact(
    phone: String,
    name: String,
    company: String,
    job: String,
    email: String,
    address: String,
) {
    val store = CNContactStore()

    val contact = CNMutableContact()
    contact.setGivenName(name)

    val phoneNumber = CNLabeledValue(
        label = CNLabelPhoneNumberMain,
        value = CNPhoneNumber(stringValue = phone)
    )
    contact.setPhoneNumbers(listOf(phoneNumber))

    if (company.isNotEmpty()) {
        contact.setOrganizationName(company)
    }

    if (job.isNotEmpty()) {
        contact.setJobTitle(job)
    }

    if (email.isNotEmpty()) {
        val emailLabel = CNLabeledValue(
            label = CNLabelHome,
            value = email as NSString
        )

        contact.setEmailAddresses(listOf(emailLabel))
    }

    if (address.isNotEmpty()) {
        val addressLabel = CNLabeledValue(
            label = CNLabelHome,
            value = address as NSString
        )

        contact.setPostalAddresses(listOf(addressLabel))
    }

    val saveRequest = CNSaveRequest()
    saveRequest.addContact(contact, null)

    tryCatch {
        store.executeSaveRequest(saveRequest, null)
    }
}

@OptIn(ExperimentalForeignApi::class)
actual fun showLocation(
    latitude: String,
    longitude: String,
) {
    val coordinate = CLLocationCoordinate2DMake(
        latitude.toDoubleOrNull() ?: 0.0,
        longitude.toDoubleOrNull() ?: 0.0
    )
    val placemark = MKPlacemark(coordinate)
    val mapItem = MKMapItem(placemark)

    mapItem.openInMapsWithLaunchOptions(null)
}

actual fun showAddress(address: String) {
    showLocation("", "")
}

actual fun connectToWifi(
    networkName: String,
    password: String,
    hidden: Boolean,
) {
    val hotspotConfig = NEHotspotConfiguration(
        sSID = networkName,
        passphrase = password,
        isWEP = false
    )
    hotspotConfig.joinOnce = true
    hotspotConfig.setHidden(hidden)

    NEHotspotConfigurationManager.sharedManager().applyConfiguration(hotspotConfig) {
        if (it != null) {
            toast("Error configuring Wi-Fi: ${it.localizedDescription}")
        } else {
            toast("Wi-Fi configured successfully")
        }
    }
}

@OptIn(ExperimentalForeignApi::class)
actual fun addToCalendar(
    name: String,
    location: String,
    description: String,
    allDay: Boolean,
    startMillis: Long?,
    endMillis: Long?,
) {
    val eventStore = EKEventStore()

    eventStore.requestAccessToEntityType(EKEntityType.EKEntityTypeEvent) { granted, error ->
        if (granted && error == null) {
            val event = EKEvent.eventWithEventStore(eventStore)
            event.setTitle(name)

            if (description.isNotEmpty()) {
                event.setNotes(description)
            }

            if (location.isNotEmpty()) {
                event.setLocation(location)
            }

            if (startMillis != 0L) {
                event.setStartDate(
                    NSDate(timeIntervalSinceReferenceDate = kCFAbsoluteTimeIntervalSince1970)
                )
            }

            if (endMillis != 0L) {
                event.setEndDate(
                    NSDate(timeIntervalSinceReferenceDate = kCFAbsoluteTimeIntervalSince1970)
                )
            }

            event.setAllDay(allDay)

            tryCatch {
                eventStore.saveEvent(
                    event = event,
                    span = EKSpan.EKSpanThisEvent,
                    null
                )
            }
        }
    }
}

actual fun saveQrImage(qrBitmap: ImageBitmap?) {
    qrBitmap ?: return

    PHPhotoLibrary.requestAuthorization { status ->
        if (status == PHAuthorizationStatusAuthorized) {
            PHPhotoLibrary.sharedPhotoLibrary().performChanges({
                val bytes = Image.makeFromBitmap(qrBitmap.asSkiaBitmap()).encodeToData()?.bytes
                val nsData = bytes.toNSData()

                val image = UIImage(data = nsData)
                PHAssetChangeRequest.creationRequestForAssetFromImage(image)
            }, null)
        }
    }
}

actual fun shareQrImage(qrBitmap: ImageBitmap?) {
    qrBitmap ?: return

    val bytes = Image.makeFromBitmap(qrBitmap.asSkiaBitmap()).encodeToData()?.bytes
    val nsData = bytes.toNSData()

    val window = UIApplication.sharedApplication.windows.last() as? UIWindow
    val currentViewController = window?.rootViewController
    val activityViewController = UIActivityViewController(
        activityItems = listOf(
            UIImage(data = nsData),
            "Share QR"
        ),
        applicationActivities = null
    )
    currentViewController?.presentViewController(
        viewControllerToPresent = activityViewController,
        animated = true,
        completion = null,
    )
}