package uz.javokhir.qr.master.domain.creator.biz

sealed class BizContentEvent {
    data class Encoded(val value: String) : BizContentEvent()
    data class FirstNameChanged(val firstName: String) : BizContentEvent()
    data class LastNameChanged(val lastName: String) : BizContentEvent()
    data class JobChanged(val job: String) : BizContentEvent()
    data class CompanyChanged(val company: String) : BizContentEvent()
    data class PhoneChanged(val phone: String) : BizContentEvent()
    data class EmailChanged(val email: String) : BizContentEvent()
    data class WebsiteChanged(val website: String) : BizContentEvent()
    data class AddressChanged(val address: String) : BizContentEvent()
}
