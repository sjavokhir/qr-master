package uz.javokhir.qr.master.camera.detector

import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import com.google.android.gms.tasks.Task
import com.google.mlkit.vision.barcode.BarcodeScannerOptions
import com.google.mlkit.vision.barcode.BarcodeScanning
import com.google.mlkit.vision.barcode.common.Barcode
import com.google.mlkit.vision.common.InputImage
import uz.javokhir.qr.master.AndroidApp
import uz.javokhir.qr.master.camera.core.VisionProcessorBase
import uz.javokhir.qr.master.core.extensions.roundLast5
import uz.javokhir.qr.master.core.extensions.tryCatch
import uz.javokhir.qr.master.data.model.mode.GenerateMode
import uz.javokhir.qr.master.domain.creator.business.BusinessContentState
import uz.javokhir.qr.master.domain.creator.contact.ContactContentState
import uz.javokhir.qr.master.domain.creator.email.EmailContentState
import uz.javokhir.qr.master.domain.creator.location.LocationContentState
import uz.javokhir.qr.master.domain.creator.phone.PhoneContentState
import uz.javokhir.qr.master.domain.creator.sms.SmsContentState
import uz.javokhir.qr.master.domain.creator.socialMedia.SocialMediaContentState
import uz.javokhir.qr.master.domain.creator.socialMedia.detectSocialMedia
import uz.javokhir.qr.master.domain.creator.text.TextContentState
import uz.javokhir.qr.master.domain.creator.website.WebsiteContentState
import uz.javokhir.qr.master.domain.creator.wifi.WifiContentState
import uz.javokhir.qr.master.shared.platform.openUrl

class QrDetector(
    context: Context,
    private val vibrateEnabled: Boolean,
    private val openWebPagesEnabled: Boolean,
    private val chromeCustomTabsEnabled: Boolean,
    private val onResult: (String, String, GenerateMode) -> Unit,
) : VisionProcessorBase<MutableList<Barcode>>(context) {

    private var qrCodeDetected: Boolean = false

    init {
        qrCodeDetected = false
    }

    private val scanner = BarcodeScanning.getClient(
        BarcodeScannerOptions
            .Builder()
            .setBarcodeFormats(Barcode.FORMAT_ALL_FORMATS)
            .enableAllPotentialBarcodes()
            .build()
    )

    override fun stop() {
        super.stop()
        scanner.close()
    }

    override fun detectInImage(image: InputImage): Task<MutableList<Barcode>> {
        return scanner.process(image)
    }

    override fun onSuccess(results: MutableList<Barcode>) {
        if (!qrCodeDetected) {
            tryCatch {
                filterResults(results)?.let { onBarcodeParser(it) }
            }
        }
    }

    override fun onFailure(t: Throwable) {}

    private fun filterResults(results: List<Barcode>): Barcode? {
        return results.filter { it.boundingBox != null && !it.rawValue.isNullOrEmpty() }
            .maxByOrNull { it.boundingBox!!.width() * it.boundingBox!!.height() }
    }

    private fun onBarcodeParser(code: Barcode) {
        tryCatch {
            val generateMode: GenerateMode
            val encoded: String
            val decoded: String
            val notBlank: Boolean
            var validUrl = false

            if (code.url != null) {
                validUrl = true

                val social = detectSocialMedia(code.url?.url.orEmpty())

                if (social != null) {
                    val content = SocialMediaContentState(
                        username = social.second,
                        mode = social.first,
                    )

                    generateMode = content.mode
                    encoded = content.encode()
                    decoded = content.decode()
                    notBlank = content.isNotBlank()
                } else {
                    val content = WebsiteContentState(code.url?.url.orEmpty())

                    generateMode = GenerateMode.Website
                    encoded = content.encode()
                    decoded = content.decode()
                    notBlank = content.isNotBlank()
                }
            } else if (code.sms != null) {
                val content = SmsContentState(
                    phone = code.sms?.phoneNumber.orEmpty(),
                    message = code.sms?.message.orEmpty()
                )

                generateMode = GenerateMode.Sms
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            } else if (code.phone != null) {
                val content = PhoneContentState(code.phone?.number.orEmpty())

                generateMode = GenerateMode.PhoneNumber
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            } else if (code.email != null) {
                val content = EmailContentState(
                    email = code.email?.address.orEmpty(),
                    subject = code.email?.subject.orEmpty(),
                    message = code.email?.body.orEmpty()
                )

                generateMode = GenerateMode.EmailAddress
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            } else if (code.wifi != null) {
                val content = WifiContentState(
                    networkName = code.wifi?.ssid.orEmpty(),
                    password = code.wifi?.password.orEmpty(),
                )

                generateMode = GenerateMode.Wifi
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            } else if (code.contactInfo != null) {
                if (
                    !code.contactInfo?.organization.isNullOrEmpty() ||
                    !code.contactInfo?.urls.isNullOrEmpty()
                ) {
                    val content = BusinessContentState(
                        name = code.contactInfo?.title.orEmpty(),
                        industry = code.contactInfo?.organization.orEmpty(),
                        phone = code.contactInfo?.phones?.firstOrNull()?.number.orEmpty(),
                        email = code.contactInfo?.emails?.firstOrNull()?.address.orEmpty(),
                        website = code.contactInfo?.urls?.firstOrNull().orEmpty(),
                        address = code.contactInfo?.addresses
                            ?.firstOrNull()?.addressLines
                            ?.joinToString(", ").orEmpty()
                    )

                    generateMode = GenerateMode.BusinessVCard
                    encoded = content.encode()
                    decoded = content.decode()
                    notBlank = content.isNotBlank()
                } else {
                    val content = ContactContentState(
                        name = code.contactInfo?.title.orEmpty(),
                        phone = code.contactInfo?.phones?.firstOrNull()?.number.orEmpty(),
                        email = code.contactInfo?.emails?.firstOrNull()?.address.orEmpty(),
                        address = code.contactInfo?.addresses
                            ?.firstOrNull()?.addressLines
                            ?.joinToString(", ").orEmpty()
                    )

                    generateMode = GenerateMode.ContactVCard
                    encoded = content.encode()
                    decoded = content.decode()
                    notBlank = content.isNotBlank()
                }
            } else if (code.calendarEvent != null) {
                val content = SmsContentState(
                    phone = code.sms?.phoneNumber.orEmpty(),
                    message = code.sms?.message.orEmpty()
                )

                generateMode = GenerateMode.CalendarEvent
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            } else if (code.geoPoint != null) {
                val content = LocationContentState(
                    latitude = code.geoPoint?.lat?.roundLast5()?.toString().orEmpty(),
                    longitude = code.geoPoint?.lng?.roundLast5()?.toString().orEmpty()
                )

                generateMode = GenerateMode.Location
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            } else {
                val content = TextContentState(code.rawValue.orEmpty())

                generateMode = GenerateMode.Text
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            }

            if (notBlank) {
                qrCodeDetected = true

                if (vibrateEnabled) {
                    vibrate()
                }

                if (openWebPagesEnabled && validUrl) {
                    openUrl(decoded, chromeCustomTabsEnabled)
                }

                onResult(encoded, decoded, generateMode)
            }
        }
    }

    private fun vibrate(milliseconds: Long = 300) {
        tryCatch {
            val vibrator = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                val vibratorManager =
                    AndroidApp.INSTANCE.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
                vibratorManager.defaultVibrator
            } else {
                @Suppress("DEPRECATION")
                AndroidApp.INSTANCE.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            }

            vibrator.vibrate(
                VibrationEffect.createOneShot(
                    milliseconds,
                    VibrationEffect.DEFAULT_AMPLITUDE
                )
            )
        }
    }
}