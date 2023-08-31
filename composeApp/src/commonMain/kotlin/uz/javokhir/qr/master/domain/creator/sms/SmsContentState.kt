package uz.javokhir.qr.master.domain.creator.sms

import uz.javokhir.qr.master.data.model.common.QrData

data class SmsContentState(
    val phone: String = "",
    val message: String = "",
    val enabled: Boolean = false,
    val setEncoded: Boolean = false
) : QrData {

    override fun encode(): String = "smsto:$phone?body=$message"

    override fun decode(): String = """
        $phone
        $message
    """.trimIndent()

    override fun isNotBlank(): Boolean {
        return "$phone$message".isNotEmpty()
    }
}

fun String.toSmsContent(): SmsContentState? {
    return try {
        if (startsWith("smsto:")) {
            val parts = split("?body=")
            val phone = parts[0].removePrefix("smsto:")
            val message = parts[1]

            SmsContentState(
                phone = phone,
                message = message
            )
        } else null
    } catch (_: Throwable) {
        null
    }
}
