package uz.javokhir.qr.master.camera

import uz.javokhir.qr.master.core.extensions.isUrlValid
import uz.javokhir.qr.master.core.extensions.tryCatch
import uz.javokhir.qr.master.data.model.mode.GenerateMode
import uz.javokhir.qr.master.domain.creator.contact.toContactContent
import uz.javokhir.qr.master.domain.creator.email.toEmailContent
import uz.javokhir.qr.master.domain.creator.event.toEventContent
import uz.javokhir.qr.master.domain.creator.location.toLocationContent
import uz.javokhir.qr.master.domain.creator.phone.toPhoneContent
import uz.javokhir.qr.master.domain.creator.sms.toSmsContent
import uz.javokhir.qr.master.domain.creator.socialMedia.SocialMediaContentState
import uz.javokhir.qr.master.domain.creator.socialMedia.detectSocialMedia
import uz.javokhir.qr.master.domain.creator.text.TextContentState
import uz.javokhir.qr.master.domain.creator.website.WebsiteContentState
import uz.javokhir.qr.master.domain.creator.wifi.toWifiContent
import uz.javokhir.qr.master.shared.platform.openUrl

class Detector {

    fun detectQrCode(
        code: String,
        openWebPagesEnabled: Boolean,
        chromeCustomTabsEnabled: Boolean,
        onResult: (String, String, GenerateMode) -> Unit,
    ) {
        tryCatch {
            val generateMode: GenerateMode
            val encoded: String
            val decoded: String
            val notBlank: Boolean
            var validUrl = false

            if (code.isUrlValid()) {
                validUrl = true

                val social = detectSocialMedia(code)

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
                    val content = WebsiteContentState(code)

                    generateMode = GenerateMode.Website
                    encoded = content.encode()
                    decoded = content.decode()
                    notBlank = content.isNotBlank()
                }
            } else if (code.toSmsContent() != null) {
                val content = code.toSmsContent()!!

                generateMode = GenerateMode.Sms
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            } else if (code.toPhoneContent() != null) {
                val content = code.toPhoneContent()!!

                generateMode = GenerateMode.PhoneNumber
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            } else if (code.toEmailContent() != null) {
                val content = code.toEmailContent()!!

                generateMode = GenerateMode.EmailAddress
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            } else if (code.toWifiContent() != null) {
                val content = code.toWifiContent()!!

                generateMode = GenerateMode.Wifi
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            } else if (code.toContactContent() != null) {
                val content = code.toContactContent()!!

                generateMode = GenerateMode.ContactVCard
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            } else if (code.toEventContent() != null) {
                val content = code.toEventContent()!!

                generateMode = GenerateMode.CalendarEvent
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            } else if (code.toLocationContent() != null) {
                val content = code.toLocationContent()!!

                generateMode = GenerateMode.Location
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            } else {
                val content = TextContentState(code)

                generateMode = GenerateMode.Text
                encoded = content.encode()
                decoded = content.decode()
                notBlank = content.isNotBlank()
            }

            if (notBlank) {
                if (openWebPagesEnabled && validUrl) {
                    openUrl(decoded, chromeCustomTabsEnabled)
                }

                onResult(encoded, decoded, generateMode)
            }
        }
    }
}