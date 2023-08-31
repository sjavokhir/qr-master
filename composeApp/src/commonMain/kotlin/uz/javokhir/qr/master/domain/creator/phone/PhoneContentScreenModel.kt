package uz.javokhir.qr.master.domain.creator.phone

import kotlinx.coroutines.flow.update
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class PhoneContentScreenModel :
    BaseScreenModel<PhoneContentState, PhoneContentEvent>(PhoneContentState()) {

    override fun onEvent(event: PhoneContentEvent) {
        when (event) {
            is PhoneContentEvent.Encoded -> onEncoded(event.value)
            is PhoneContentEvent.PhoneChanged -> onPhoneChanged(event.phone)
        }
    }

    private fun onEncoded(value: String) {
        if (state.value.setEncoded) return

        val content = value.toPhoneContent() ?: return

        onPhoneChanged(content.phone)
    }

    private fun onPhoneChanged(phone: String) {
        stateData.update {
            it.copy(
                phone = phone,
                enabled = phone.isNotEmpty(),
                setEncoded = true
            )
        }
    }
}