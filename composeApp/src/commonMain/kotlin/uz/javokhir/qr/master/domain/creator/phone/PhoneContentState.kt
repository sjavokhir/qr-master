package uz.javokhir.qr.master.domain.creator.phone

import uz.javokhir.qr.master.data.model.common.QrData

data class PhoneContentState(
    val phone: String = "",
    val enabled: Boolean = false,
    val setEncoded: Boolean = false
) : QrData {

    override fun encode(): String = "tel:$phone"

    override fun decode(): String = phone

    override fun isNotBlank(): Boolean = phone.isNotEmpty()
}

fun String.toPhoneContent(): PhoneContentState? {
    return try {
        if (startsWith("tel:")) {
            PhoneContentState(substringAfter("tel:"))
        } else null
    } catch (_: Throwable) {
        null
    }
}
