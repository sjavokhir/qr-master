package uz.javokhir.qr.master.domain.creator.biz

import uz.javokhir.qr.master.data.model.common.QrData

data class BizContentState(
    val firstName: String = "",
    val lastName: String = "",
    val company: String = "",
    val job: String = "",
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
        append("N:$lastName;$firstName\n")
        append("FN:$firstName $lastName\n")
        append("ORG:$company\n")
        append("TITLE:$job\n")
        append("TEL:$phone\n")
        append("EMAIL:$email\n")
        append("ADR:$address\n")
        append("URL:$website\n")
        append("END:VCARD")
    }

    override fun decode(): String = buildString {
        append("$firstName $lastName".trim()).append("\n")
        append(phone)

        if (company.isNotEmpty()) {
            append("\n").append(company)
        }

        if (job.isNotEmpty()) {
            append("\n").append(job)
        }

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
        return "$firstName$lastName$company$job$phone$email$website$address".isNotEmpty()
    }
}

fun String.toBizContent(): BizContentState? {
    return try {
        val nameMatch = Regex("FN:(.*?)\\n").find(this)
        val companyMatch = Regex("ORG:(.*?)\\n").find(this)
        val jobMatch = Regex("TITLE:(.*?)\\n").find(this)
        val phoneMatch = Regex("TEL:(.*?)\\n").find(this)
        val emailMatch = Regex("EMAIL:(.*?)\\n").find(this)
        val websiteMatch = Regex("URL:(.*?)\\n").find(this)
        val addressMatch = Regex("ADR:(.*?)\\n").find(this)

        val name = nameMatch?.groupValues?.get(1)
        val company = companyMatch?.groupValues?.get(1)
        val job = jobMatch?.groupValues?.get(1)
        val phone = phoneMatch?.groupValues?.get(1)
        val email = emailMatch?.groupValues?.get(1)
        val website = websiteMatch?.groupValues?.get(1)
        val address = addressMatch?.groupValues?.get(1)

        BizContentState(
            firstName = name.orEmpty(),
            lastName = name.orEmpty(),
            company = company.orEmpty(),
            job = job.orEmpty(),
            phone = phone.orEmpty(),
            email = email.orEmpty(),
            website = website.orEmpty(),
            address = address.orEmpty()
        )
    } catch (_: Throwable) {
        null
    }
}