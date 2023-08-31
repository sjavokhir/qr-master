package uz.javokhir.qr.master.domain.creator.contact

import kotlinx.coroutines.flow.update
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class ContactContentScreenModel :
    BaseScreenModel<ContactContentState, ContactContentEvent>(ContactContentState()) {

    override fun onEvent(event: ContactContentEvent) {
        when (event) {
            is ContactContentEvent.Encoded -> onEncoded(event.value)
            is ContactContentEvent.NameChanged -> onValueChanged(name = event.name)
            is ContactContentEvent.PhoneChanged -> onValueChanged(phone = event.phone)
            is ContactContentEvent.EmailChanged -> onValueChanged(email = event.email)
            is ContactContentEvent.AddressChanged -> onValueChanged(address = event.address)
        }
    }

    private fun onEncoded(value: String) {
        if (state.value.setEncoded) return

        val content = value.toContactContent() ?: return

        onValueChanged(
            name = content.name,
            phone = content.phone,
            email = content.email,
            address = content.address,
        )
    }

    private fun onValueChanged(
        name: String? = null,
        phone: String? = null,
        email: String? = null,
        address: String? = null,
    ) {
        stateData.update {
            val mName = name ?: it.name
            val mPhone = phone ?: it.phone

            it.copy(
                name = mName,
                phone = mPhone,
                email = email ?: it.email,
                address = address ?: it.address,
                enabled = mName.isNotEmpty() && mPhone.isNotEmpty(),
                setEncoded = true
            )
        }
    }
}