package uz.javokhir.qr.master.domain.creator.email

import kotlinx.coroutines.flow.update
import uz.javokhir.qr.master.core.extensions.isEmailValid
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class EmailContentScreenModel :
    BaseScreenModel<EmailContentState, EmailContentEvent>(EmailContentState()) {

    override fun onEvent(event: EmailContentEvent) {
        when (event) {
            is EmailContentEvent.Encoded -> onEncoded(event.value)
            is EmailContentEvent.EmailChanged -> onValueChanged(email = event.email)
            is EmailContentEvent.SubjectChanged -> onValueChanged(subject = event.subject)
            is EmailContentEvent.MessageChanged -> onValueChanged(message = event.message)
        }
    }

    private fun onEncoded(value: String) {
        if (state.value.setEncoded) return

        val content = value.toEmailContent() ?: return

        onValueChanged(
            email = content.email,
            subject = content.subject,
            message = content.message
        )
    }

    private fun onValueChanged(
        email: String? = null,
        subject: String? = null,
        message: String? = null,
    ) {
        stateData.update {
            val mEmail = email ?: it.email

            it.copy(
                email = mEmail,
                subject = subject ?: it.subject,
                message = message ?: it.message,
                enabled = mEmail.isEmailValid(),
                setEncoded = true
            )
        }
    }
}