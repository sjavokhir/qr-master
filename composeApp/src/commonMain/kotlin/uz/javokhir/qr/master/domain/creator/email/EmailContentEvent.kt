package uz.javokhir.qr.master.domain.creator.email

sealed class EmailContentEvent {
    data class Encoded(val value: String) : EmailContentEvent()
    data class EmailChanged(val email: String) : EmailContentEvent()
    data class SubjectChanged(val subject: String) : EmailContentEvent()
    data class MessageChanged(val message: String) : EmailContentEvent()
}
