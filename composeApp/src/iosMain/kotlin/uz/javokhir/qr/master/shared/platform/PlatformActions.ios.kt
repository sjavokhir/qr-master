package uz.javokhir.qr.master.shared.platform

import platform.Foundation.NSURL
import platform.UIKit.UIActivityViewController
import platform.UIKit.UIAlertAction
import platform.UIKit.UIAlertActionStyleDefault
import platform.UIKit.UIAlertController
import platform.UIKit.UIAlertControllerStyleAlert
import platform.UIKit.UIApplication
import platform.UIKit.UIPasteboard
import platform.UIKit.UIWindow
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
    val nsUrl = NSURL.URLWithString(url) ?: return
    UIApplication.sharedApplication.openURL(nsUrl)
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

actual fun dial(phone: String) {}

actual fun vibrate(milliseconds: Long) {}

actual fun searchGoogle(
    query: String,
    chromeCustomTabsEnabled: Boolean,
) {}

actual fun sendMail(
    email: String,
    subject: String,
    message: String,
) {}

actual fun sendSms(
    phone: String,
    message: String,
) {}

actual fun addContact(
    phone: String,
    name: String,
    company: String,
    job: String,
    email: String,
    address: String,
) {}

actual fun showLocation(
    latitude: String,
    longitude: String,
) {}

actual fun showAddress(address: String) {}

actual fun connectToWifi(
    networkName: String,
    password: String,
    hidden: Boolean,
) {}

actual fun addToCalendar(
    name: String,
    location: String,
    description: String,
    allDay: Boolean,
    startMillis: Long?,
    endMillis: Long?,
) {}

actual fun saveQrImage() {
}

actual fun shareQrImage() {
}