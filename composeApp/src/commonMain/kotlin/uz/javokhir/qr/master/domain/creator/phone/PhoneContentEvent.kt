package uz.javokhir.qr.master.domain.creator.phone

sealed class PhoneContentEvent {
    data class Encoded(val value: String) : PhoneContentEvent()
    data class PhoneChanged(val phone: String) : PhoneContentEvent()
}
