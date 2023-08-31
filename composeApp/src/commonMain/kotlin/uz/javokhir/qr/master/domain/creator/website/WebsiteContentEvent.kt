package uz.javokhir.qr.master.domain.creator.website

sealed class WebsiteContentEvent {
    data class Encoded(val value: String) : WebsiteContentEvent()
    data class WebsiteChanged(val website: String) : WebsiteContentEvent()
}
