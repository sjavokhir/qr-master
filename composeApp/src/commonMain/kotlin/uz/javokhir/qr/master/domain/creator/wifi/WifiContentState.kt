package uz.javokhir.qr.master.domain.creator.wifi

import uz.javokhir.qr.master.data.model.common.QrData

data class WifiContentState(
    val networkName: String = "",
    val password: String = "",
    val hidden: Boolean = false,
    val enabled: Boolean = false,
    val setEncoded: Boolean = false,
) : QrData {

    override fun encode(): String = buildString {
        append("WIFI:")
        append("S:$networkName;")
        append("T:WPA;")
        append("P:$password;")
        append("H:$hidden;")
    }

    override fun decode(): String {
        return """
            $networkName
            WPA
            $password
        """.trimIndent()
    }

    override fun isNotBlank(): Boolean {
        return "$networkName$password".isNotEmpty()
    }
}

fun String.toWifiContent(): WifiContentState? {
    return try {
        val wifiRegex = Regex("""WIFI:S:(.*?);T:(.*?);P:(.*?);H:(.*?);""")
        val matchResult = wifiRegex.find(this)

        matchResult?.groupValues?.let { groups ->
            val networkName = groups[1]
            val password = groups[3]
            val hidden = groups[4].toBooleanStrictOrNull() ?: false

            WifiContentState(
                networkName = networkName,
                password = password,
                hidden = hidden
            )
        }
    } catch (_: Throwable) {
        null
    }
}
