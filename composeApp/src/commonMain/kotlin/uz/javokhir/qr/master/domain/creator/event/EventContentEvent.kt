package uz.javokhir.qr.master.domain.creator.event

sealed class EventContentEvent {
    data class Encoded(val value: String) : EventContentEvent()
    data class NameChanged(val name: String) : EventContentEvent()
    data class LocationChanged(val location: String) : EventContentEvent()
    data class DescriptionChanged(val description: String) : EventContentEvent()
    data class AllDayChecked(val checked: Boolean) : EventContentEvent()
    data class ShowPicker(val start: Boolean) : EventContentEvent()
    data class DateTimeChanged(val timestamp: Long) : EventContentEvent()
}
