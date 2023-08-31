package uz.javokhir.qr.master.domain.creator.text

sealed class TextContentEvent {
    data class Encoded(val value: String) : TextContentEvent()
    data class TextChanged(val text: String) : TextContentEvent()
}