package uz.javokhir.qr.master.domain.creator.socialMedia

import uz.javokhir.qr.master.data.model.mode.GenerateMode

sealed class SocialMediaContentEvent {
    data class Encoded(val value: String) : SocialMediaContentEvent()
    data class SetGenerateMode(val mode: GenerateMode) : SocialMediaContentEvent()
    data class UsernameChanged(val username: String) : SocialMediaContentEvent()
}
