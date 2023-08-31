package uz.javokhir.qr.master.domain.creator.socialMedia

import uz.javokhir.qr.master.data.model.common.QrData
import uz.javokhir.qr.master.data.model.mode.GenerateMode

data class SocialMediaContentState(
    val username: String = "",
    val mode: GenerateMode = GenerateMode.Instagram,
    val enabled: Boolean = false,
    val setEncoded: Boolean = false,
) : QrData {

    override fun encode(): String {
        return when (mode) {
            GenerateMode.Youtube -> "https://youtube.com/@"
            GenerateMode.WhatsApp -> "https://wa.me/"
            GenerateMode.Instagram -> "https://instagram.com/"
            GenerateMode.Facebook -> "https://facebook.com/"
            GenerateMode.Twitter -> "https://twitter.com/"
            GenerateMode.TikTok -> "https://tiktok.com/@"
            GenerateMode.Telegram -> "https://t.me/"
            GenerateMode.VKontakte -> "https://vk.com/"
            GenerateMode.Twitch -> "https://twitch.tv/"
            GenerateMode.LinkedIn -> "https://linkedin.com/in/"
            GenerateMode.Github -> "https://github.com/"
            GenerateMode.Medium -> "https://medium.com/"
            GenerateMode.Dribbble -> "https://dribbble.com/"
            GenerateMode.Behance -> "https://behance.net/"
            else -> ""
        } + username
    }

    override fun decode(): String = encode()

    override fun isNotBlank(): Boolean = username.isNotEmpty()
}
