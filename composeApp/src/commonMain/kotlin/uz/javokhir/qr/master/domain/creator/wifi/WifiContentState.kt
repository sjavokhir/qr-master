package uz.javokhir.qr.master.domain.creator.wifi

import uz.javokhir.qr.master.data.model.common.QrData

data class WifiContentState(
    val networkName: String = "",
    val password: String = "",
    val authentication: Authentication = Authentication.WEP,
    val hidden: Boolean = false,
    val enabled: Boolean = false,
    val setEncoded: Boolean = false
) : QrData {

    val authentications: List<Authentication>
        get() = listOf(
            Authentication.WEP,
            Authentication.WPA_WPA2,
            Authentication.OPEN
        )

    enum class Authentication {
        WEP,
        WPA_WPA2 {
            override fun toString(): String = "WPA"
        },
        OPEN {
            override fun toString(): String = "nopass"
        }
    }

    override fun encode(): String = buildString {
        append("WIFI:")
        append("S:$networkName;")
        append("T:$authentication;")
        append("P:$password;")
        append("H:$hidden;")
    }

    override fun decode(): String {
        val type = when (authentication) {
            Authentication.WEP -> "WEP"
            Authentication.WPA_WPA2 -> "WPA"
            Authentication.OPEN -> "Open"
        }

        return """
            $networkName
            $type
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
            val authentication = when (groups[2]) {
                "WEP" -> WifiContentState.Authentication.WEP
                "WPA" -> WifiContentState.Authentication.WPA_WPA2
                else -> WifiContentState.Authentication.OPEN
            }
            val password = groups[3]
            val hidden = groups[4].toBooleanStrictOrNull() ?: false

            WifiContentState(
                networkName = networkName,
                password = password,
                authentication = authentication,
                hidden = hidden
            )
        }
    } catch (_: Throwable) {
        null
    }
}
