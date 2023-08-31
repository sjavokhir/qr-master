package uz.javokhir.qr.master.domain.creator.event

import kotlinx.coroutines.flow.update
import uz.javokhir.qr.master.core.datetime.toDefaultDate
import uz.javokhir.qr.master.core.datetime.toDefaultDateTime
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class EventContentScreenModel :
    BaseScreenModel<EventContentState, EventContentEvent>(EventContentState()) {

    override fun onEvent(event: EventContentEvent) {
        when (event) {
            is EventContentEvent.Encoded -> onEncoded(event.value)
            is EventContentEvent.NameChanged -> onValueChanged(name = event.name)
            is EventContentEvent.LocationChanged -> onValueChanged(location = event.location)
            is EventContentEvent.DescriptionChanged -> onValueChanged(description = event.description)
            is EventContentEvent.AllDayChecked -> onValueChanged(allDay = event.checked)
            is EventContentEvent.ShowPicker -> onShowPicker(event.start)
            is EventContentEvent.DateTimeChanged -> onDateTimeChanged(event.timestamp)
        }
    }

    private fun onEncoded(value: String) {
        if (state.value.setEncoded) return

        val content = value.toEventContent() ?: return

        onValueChanged(
            name = content.name,
            location = content.location,
            description = content.description,
            allDay = content.allDay,
            startTimestamp = content.startTimestamp,
            endTimestamp = content.endTimestamp,
        )
    }

    private fun onShowPicker(start: Boolean) {
        stateData.update { it.copy(start = start) }
    }

    private fun onDateTimeChanged(timestamp: Long) {
        if (state.value.start) {
            onValueChanged(startTimestamp = timestamp)
        } else {
            onValueChanged(endTimestamp = timestamp)
        }
    }

    private fun onValueChanged(
        name: String? = null,
        location: String? = null,
        description: String? = null,
        allDay: Boolean? = null,
        startTimestamp: Long? = null,
        endTimestamp: Long? = null,
    ) {
        stateData.update {
            val mName = name ?: it.name
            val mAllDay = allDay ?: it.allDay
            val mStartTimestamp = startTimestamp ?: it.startTimestamp
            val mEndTimestamp = endTimestamp ?: it.endTimestamp

            it.copy(
                name = mName,
                location = location ?: it.location,
                description = description ?: it.description,
                allDay = mAllDay,
                startTimestamp = mStartTimestamp,
                startDateTime = if (mStartTimestamp == 0L) {
                    ""
                } else if (mAllDay) {
                    mStartTimestamp.toDefaultDate()
                } else {
                    mStartTimestamp.toDefaultDateTime()
                },
                endTimestamp = mEndTimestamp,
                endDateTime = if (mEndTimestamp == 0L) {
                    ""
                } else if (mAllDay) {
                    mEndTimestamp.toDefaultDate()
                } else {
                    mEndTimestamp.toDefaultDateTime()
                },
                enabled = mName.isNotEmpty() && mStartTimestamp != 0L,
                setEncoded = true
            )
        }
    }
}