package uz.javokhir.qr.master.domain.creator.socialMedia

import kotlinx.coroutines.flow.update
import uz.javokhir.qr.master.core.extensions.tryCatch
import uz.javokhir.qr.master.data.model.mode.GenerateMode
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class SocialMediaContentScreenModel :
    BaseScreenModel<SocialMediaContentState, SocialMediaContentEvent>(SocialMediaContentState()) {

    override fun onEvent(event: SocialMediaContentEvent) {
        when (event) {
            is SocialMediaContentEvent.Encoded -> onEncoded(event.value)
            is SocialMediaContentEvent.SetGenerateMode -> setGenerateMode(event.mode)
            is SocialMediaContentEvent.UsernameChanged -> onUsernameChanged(event.username)
        }
    }

    private fun onEncoded(value: String) {
        if (state.value.setEncoded) return

        tryCatch {
            detectSocialMedia(value)?.let { info ->
                setGenerateMode(info.first)
                onUsernameChanged(info.second)
            }
        }
    }

    private fun setGenerateMode(mode: GenerateMode) {
        stateData.update { it.copy(mode = mode) }
    }

    private fun onUsernameChanged(username: String) {
        stateData.update {
            it.copy(
                username = username,
                enabled = username.isNotEmpty(),
                setEncoded = true
            )
        }
    }
}

fun detectSocialMedia(link: String): Pair<GenerateMode, String>? {
    val pair = when {
        link.contains("youtube.com") -> GenerateMode.Youtube to """youtube\.com/@([^;/]+)"""
        link.contains("wa.me") -> GenerateMode.WhatsApp to """wa\.me/([^;/]+)"""
        link.contains("instagram.com") -> GenerateMode.Instagram to """instagram\.com/([^;/]+)"""
        link.contains("facebook.com") -> GenerateMode.Facebook to """facebook\.com/([^;/]+)"""
        link.contains("twitter.com") -> GenerateMode.Twitter to """twitter\.com/([^;/]+)"""
        link.contains("tiktok.com") -> GenerateMode.TikTok to """tiktok\.com/@([^;/]+)"""
        link.contains("t.me") -> GenerateMode.Telegram to """t\.me/([^;/]+)"""
        link.contains("vk.com") -> GenerateMode.VKontakte to """vk\.com/([^;/]+)"""
        link.contains("twitch.tv") -> GenerateMode.Twitch to """twitch\.tv/([^;/]+)"""
        link.contains("linkedin.com") -> GenerateMode.LinkedIn to """linkedin\.com/in/([^;/]+)"""
        link.contains("github.com") -> GenerateMode.Github to """github\.com/([^;/]+)"""
        link.contains("medium.com") -> GenerateMode.Medium to """medium\.com/([^;/]+)"""
        link.contains("dribbble.com") -> GenerateMode.Dribbble to """dribbble\.com/([^;/]+)"""
        link.contains("behance.net") -> GenerateMode.Behance to """behance\.net/([^;/]+)"""
        else -> return null
    }

    val matchResult = Regex(pair.second, RegexOption.IGNORE_CASE).find(link)
    if (matchResult != null) {
        val username = matchResult.groupValues[1]
        return pair.first to username
    }

    return null
}