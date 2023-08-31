package uz.javokhir.qr.master.domain.creator.sms

import kotlinx.coroutines.flow.update
import org.koin.core.component.KoinComponent
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class SmsContentScreenModel :
    BaseScreenModel<SmsContentState, SmsContentEvent>(SmsContentState()), KoinComponent {

    override fun onEvent(event: SmsContentEvent) {
        when (event) {
            is SmsContentEvent.Encoded -> onEncoded(event.value)
            is SmsContentEvent.MessageChanged -> onValueChanged(message = event.message)
            is SmsContentEvent.PhoneChanged -> onValueChanged(phone = event.phone)
        }
    }

    private fun onEncoded(value: String) {
        if (state.value.setEncoded) return

        val content = value.toSmsContent() ?: return

        onValueChanged(
            phone = content.phone,
            message = content.message
        )
    }

    private fun onValueChanged(
        phone: String? = null,
        message: String? = null,
    ) {
        stateData.update {
            val mPhone = phone ?: it.phone
            val mMessage = message ?: it.message

            it.copy(
                phone = mPhone,
                message = mMessage,
                enabled = mMessage.isNotEmpty() && mPhone.isNotEmpty(),
                setEncoded = true
            )
        }
    }
}