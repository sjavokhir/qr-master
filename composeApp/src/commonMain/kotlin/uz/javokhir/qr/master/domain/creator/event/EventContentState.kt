package uz.javokhir.qr.master.domain.creator.event

import uz.javokhir.qr.master.core.datetime.toDT
import uz.javokhir.qr.master.core.datetime.toTimestamp
import uz.javokhir.qr.master.data.model.common.QrData

data class EventContentState(
    val name: String = "",
    val location: String = "",
    val description: String = "",
    val allDay: Boolean = false,
    val start: Boolean = true,
    val startTimestamp: Long = 0L,
    val startDateTime: String = "",
    val endTimestamp: Long = 0L,
    val endDateTime: String = "",
    val enabled: Boolean = false,
    val setEncoded: Boolean = false
) : QrData {

    override fun encode(): String = buildString {
        append("BEGIN:VEVENT\n")
        append("SUMMARY:$name\n")

        if (allDay) {
            append("DTSTART;VALUE=DATE:${startTimestamp.toDT(allDay)}\n")
        } else {
            append("DTSTART:${startTimestamp.toDT(allDay)}\n")
        }

        if (allDay) {
            append("DTEND;VALUE=DATE:${endTimestamp.toDT(allDay)}\n")
        } else {
            append("DTEND:${endTimestamp.toDT(allDay)}\n")
        }

        append("LOCATION:$location\n")
        append("DESCRIPTION:$description\n")
        append("END:VEVENT")
    }

    override fun decode(): String = buildString {
        append(name)

        if (startDateTime.isNotEmpty()) {
            append("\n").append(startDateTime)
        }

        if (endDateTime.isNotEmpty()) {
            append("\n").append(endDateTime)
        }

        if (location.isNotEmpty()) {
            append("\n").append(location)
        }

        if (description.isNotEmpty()) {
            append("\n").append(description)
        }
    }

    override fun isNotBlank(): Boolean {
        return "$name$location$description$startDateTime$endDateTime".isNotEmpty()
    }
}

fun String.toEventContent(): EventContentState? {
    return try {
        val nameMatch = Regex("SUMMARY:(.*?)\\n").find(this)
        val locationMatch = Regex("LOCATION:(.*?)\\n").find(this)
        val descriptionMatch = Regex("DESCRIPTION:(.*?)\\n").find(this)
        val startDateTimeMatch = Regex("DTSTART:(.*?)\\n").find(this)
        val startDateMatch = Regex("DTSTART;VALUE=DATE:(.*?)\\n").find(this)
        val endDateTimeMatch = Regex("DTEND:(.*?)\\n").find(this)
        val endDateMatch = Regex("DTEND;VALUE=DATE:(.*?)\\n").find(this)

        val name = nameMatch?.groupValues?.get(1)
        val location = locationMatch?.groupValues?.get(1)
        val description = descriptionMatch?.groupValues?.get(1)
        val startDateTime = startDateTimeMatch?.groupValues?.get(1)
        val startDate = startDateMatch?.groupValues?.get(1)
        val endDateTime = endDateTimeMatch?.groupValues?.get(1)
        val endDate = endDateMatch?.groupValues?.get(1)

        val startTimestamp = if (!startDateTime.isNullOrEmpty()) {
            startDateTime.toTimestamp(false)
        } else if (!startDate.isNullOrEmpty()) {
            startDate.toTimestamp(true)
        } else 0L

        val endTimestamp = if (!endDateTime.isNullOrEmpty()) {
            endDateTime.toTimestamp(false)
        } else if (!endDate.isNullOrEmpty()) {
            endDate.toTimestamp(true)
        } else 0L

        EventContentState(
            name = name.orEmpty(),
            location = location.orEmpty(),
            description = description.orEmpty(),
            allDay = !startDate.isNullOrEmpty() || !endDate.isNullOrEmpty(),
            startTimestamp = startTimestamp,
            endTimestamp = endTimestamp,
        )
    } catch (_: Throwable) {
        null
    }
}