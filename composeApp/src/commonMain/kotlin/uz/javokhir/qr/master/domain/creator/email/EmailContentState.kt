package uz.javokhir.qr.master.domain.creator.email

import uz.javokhir.qr.master.data.model.common.QrData

data class EmailContentState(
    val email: String = "",
    val subject: String = "",
    val message: String = "",
    val enabled: Boolean = false,
    val setEncoded: Boolean = false
) : QrData {

    override fun encode(): String = "mailto:$email?subject=$subject?body=$message"

    override fun decode(): String = buildString {
        append(email)

        if (subject.isNotEmpty()) {
            append("\n").append(subject)
        }

        if (message.isNotEmpty()) {
            append("\n").append(message)
        }
    }

    override fun isNotBlank(): Boolean {
        return "$email$subject$message".isNotEmpty()
    }
}

fun String.toEmailContent(): EmailContentState? {
    return try {
        if (startsWith("mailto:")) {
            val parts = split("?subject=", "?body=")
            val email = parts[0].removePrefix("mailto:")
            val subject = parts[1]
            val message = parts[2]

            EmailContentState(
                email = email,
                subject = subject,
                message = message
            )
        } else null
    } catch (_: Throwable) {
        null
    }
}