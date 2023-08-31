package uz.javokhir.qr.master.domain.creator.business

import uz.javokhir.qr.master.data.model.common.QrData

data class BusinessContentState(
    val name: String = "",
    val industry: String = "",
    val phone: String = "",
    val email: String = "",
    val website: String = "",
    val address: String = "",
    val enabled: Boolean = false,
    val setEncoded: Boolean = false
) : QrData {

    override fun encode(): String = buildString {
        append("BEGIN:VCARD\n")
        append("VERSION:3.0\n")
        append("N:$name\n")
        append("FN:$name\n")
        append("ORG:$industry\n")
        append("TEL:$phone\n")
        append("EMAIL:$email\n")
        append("ADR:$address\n")
        append("URL:$website\n")
        append("END:VCARD")
    }

    override fun decode(): String = buildString {
        append(name).append("\n")
        append(industry).append("\n")
        append(phone)

        if (email.isNotEmpty()) {
            append("\n").append(email)
        }

        if (website.isNotEmpty()) {
            append("\n").append(website)
        }

        if (address.isNotEmpty()) {
            append("\n").append(address)
        }
    }

    override fun isNotBlank(): Boolean {
        return "$name$industry$phone$email$website$address".isNotEmpty()
    }
}

fun String.toBusinessContent(): BusinessContentState? {
    return try {
        val nameMatch = Regex("FN:(.*?)\\n").find(this)
        val industryMatch = Regex("ORG:(.*?)\\n").find(this)
        val phoneMatch = Regex("TEL:(.*?)\\n").find(this)
        val emailMatch = Regex("EMAIL:(.*?)\\n").find(this)
        val websiteMatch = Regex("URL:(.*?)\\n").find(this)
        val addressMatch = Regex("ADR:(.*?)\\n").find(this)

        val name = nameMatch?.groupValues?.get(1)
        val industry = industryMatch?.groupValues?.get(1)
        val phone = phoneMatch?.groupValues?.get(1)
        val email = emailMatch?.groupValues?.get(1)
        val website = websiteMatch?.groupValues?.get(1)
        val address = addressMatch?.groupValues?.get(1)

        BusinessContentState(
            name = name.orEmpty(),
            industry = industry.orEmpty(),
            phone = phone.orEmpty(),
            email = email.orEmpty(),
            website = website.orEmpty(),
            address = address.orEmpty()
        )
    } catch (_: Throwable) {
        null
    }
}