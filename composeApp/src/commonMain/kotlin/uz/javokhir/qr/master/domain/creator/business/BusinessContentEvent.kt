package uz.javokhir.qr.master.domain.creator.business

sealed class BusinessContentEvent {
    data class Encoded(val value: String) : BusinessContentEvent()
    data class NameChanged(val name: String) : BusinessContentEvent()
    data class IndustryChanged(val industry: String) : BusinessContentEvent()
    data class PhoneChanged(val phone: String) : BusinessContentEvent()
    data class EmailChanged(val email: String) : BusinessContentEvent()
    data class WebsiteChanged(val website: String) : BusinessContentEvent()
    data class AddressChanged(val address: String) : BusinessContentEvent()
}
