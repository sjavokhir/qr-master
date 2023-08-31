package uz.javokhir.qr.master.domain.creator.location

import uz.javokhir.qr.master.data.model.common.QrData

data class LocationContentState(
    val latitude: String = "",
    val longitude: String = "",
    val enabled: Boolean = false,
    val setEncoded: Boolean = false
) : QrData {

    override fun encode(): String = "geo:$latitude,$longitude"

    override fun decode(): String = "$latitude, $longitude"

    override fun isNotBlank(): Boolean {
        return "$latitude$longitude".isNotEmpty()
    }
}

fun String.toLocationContent(): LocationContentState? {
    return try {
        if (startsWith("geo:")) {
            val (latitude, longitude) = removePrefix("geo:").split(",")

            LocationContentState(latitude, longitude)
        } else null
    } catch (_: Throwable) {
        null
    }
}
