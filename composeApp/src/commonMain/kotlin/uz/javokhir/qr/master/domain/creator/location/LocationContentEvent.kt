package uz.javokhir.qr.master.domain.creator.location

sealed class LocationContentEvent {
    data class Encoded(val value: String) : LocationContentEvent()
    data class LocationChanged(val location: String) : LocationContentEvent()
    data class LatitudeChanged(val latitude: String) : LocationContentEvent()
    data class LongitudeChanged(val longitude: String) : LocationContentEvent()
}
