package uz.javokhir.kqr.master.core.datetime

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant
import kotlinx.datetime.toLocalDateTime
import uz.javokhir.kqr.master.core.extensions.az

fun defaultDateTime(): String {
    return currentTimestamp().toDateTime().defaultDateTime
}

fun Long.toDefaultDateTime(): String {
    return toDateTime().defaultDateTime
}

fun Long.toDefaultDate(): String {
    return toDateTime().defaultDate
}

fun currentTimestamp(): Long {
    return Clock.System.now()
        .toLocalDateTime(TimeZone.currentSystemDefault())
        .toInstant(TimeZone.UTC)
        .toEpochMilliseconds()
}

fun Long?.actualDateMillis(hour: Int, minute: Int): Long {
    this ?: return currentTimestamp()

    val millisecondsPerSecond = 1000L
    val millisecondsPerMinute = 60 * millisecondsPerSecond
    val millisecondsPerHour = 60 * millisecondsPerMinute

    return this + hour * millisecondsPerHour + minute * millisecondsPerMinute
}

fun Long.toDT(isAllDay: Boolean): String {
    val model = Instant.fromEpochMilliseconds(this).toDateTimeModel()
    return "${model.year.az()}${model.month.az()}${model.dayOfMonth.az()}" + if (!isAllDay) {
        "T${model.hour.az()}${model.minute.az()}${model.second.az()}"
    } else ""
}

fun Long.toCalendarTimestamp(): Long {
    return Instant.fromEpochMilliseconds(this)
        .toLocalDateTime(TimeZone.UTC)
        .toInstant(TimeZone.currentSystemDefault())
        .toEpochMilliseconds()
}

fun Long.toDateTime(): DateTimeModel {
    return Instant.fromEpochMilliseconds(this).toDateTimeModel()
}

fun String?.toTimestamp(isAllDay: Boolean): Long {
    this ?: return 0L

    return try {
        val year = substring(0, 4).toIntOrNull() ?: return 0L
        val month = substring(4, 6).toIntOrNull() ?: return 0L
        val day = substring(6, 8).toIntOrNull() ?: return 0L
        var hour = 0
        var minute = 0
        var second = 0

        if (!isAllDay) {
            hour = substring(9, 11).toIntOrNull() ?: return 0L
            minute = substring(11, 13).toIntOrNull() ?: return 0L
            second = substring(13, 15).toIntOrNull() ?: return 0L
        }

        LocalDateTime(
            year = year,
            monthNumber = month,
            dayOfMonth = day,
            hour = hour,
            minute = minute,
            second = second
        ).toInstant(TimeZone.UTC).toEpochMilliseconds()
    } catch (_: Throwable) {
        0L
    }
}

private fun Instant.toDateTimeModel(): DateTimeModel {
    return toLocalDateTime(TimeZone.UTC).toDateTimeModel()
}

private fun LocalDateTime.toDateTimeModel(): DateTimeModel {
    return DateTimeModel(
        dayOfMonth = dayOfMonth,
        month = monthNumber,
        monthName = month.name,
        weekName = dayOfWeek.name,
        year = year,
        hour = hour,
        minute = minute,
        second = second
    )
}