package uz.javokhir.qr.master.domain.creator.contact

import uz.javokhir.qr.master.data.model.common.QrData

data class ContactContentState(
    val name: String = "",
    val phone: String = "",
    val email: String = "",
    val address: String = "",
    val enabled: Boolean = false,
    val setEncoded: Boolean = false
) : QrData {

    override fun encode(): String = buildString {
        append("BEGIN:VCARD\n")
        append("VERSION:3.0\n")
        append("N:$name\n")
        append("FN:$name\n")
        append("TEL:$phone\n")
        append("EMAIL:$email\n")
        append("ADR:$address\n")
        append("END:VCARD")
    }

    override fun decode(): String = buildString {
        append(name).append("\n")
        append(phone)

        if (email.isNotEmpty()) {
            append("\n").append(email)
        }

        if (address.isNotEmpty()) {
            append("\n").append(address)
        }
    }

    override fun isNotBlank(): Boolean {
        return "$name$phone$email$address".isNotEmpty()
    }
}

fun String.toContactContent(): ContactContentState? {
    return try {
        val nameMatch = Regex("FN:(.*?)\\n").find(this)
        val phoneMatch = Regex("TEL:(.*?)\\n").find(this)
        val emailMatch = Regex("EMAIL:(.*?)\\n").find(this)
        val addressMatch = Regex("ADR:(.*?)\\n").find(this)

        val name = nameMatch?.groupValues?.get(1)
        val phone = phoneMatch?.groupValues?.get(1)
        val email = emailMatch?.groupValues?.get(1)
        val address = addressMatch?.groupValues?.get(1)

        ContactContentState(
            name = name.orEmpty(),
            phone = phone.orEmpty(),
            email = email.orEmpty(),
            address = address.orEmpty()
        )
    } catch (_: Throwable) {
        null
    }
}