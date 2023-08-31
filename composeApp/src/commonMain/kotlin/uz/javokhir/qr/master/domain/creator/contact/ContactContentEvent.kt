package uz.javokhir.qr.master.domain.creator.contact

sealed class ContactContentEvent {
    data class Encoded(val value: String) : ContactContentEvent()
    data class NameChanged(val name: String) : ContactContentEvent()
    data class PhoneChanged(val phone: String) : ContactContentEvent()
    data class EmailChanged(val email: String) : ContactContentEvent()
    data class AddressChanged(val address: String) : ContactContentEvent()
}
