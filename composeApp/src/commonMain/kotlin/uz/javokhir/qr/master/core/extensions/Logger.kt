package uz.javokhir.qr.master.core.extensions

import uz.javokhir.qr.master.core.datetime.currentTimestamp

fun Any?.log() {
    println("LOG_TAG: ${this?.toString()}")
}

fun tryCatch(onTryAction: () -> Unit) {
    try {
        onTryAction()
    } catch (t: Throwable) {
        t.log()
    }
}

inline fun shouldRequest(
    timestamp: Long,
    delay: Long,
    onChangeAction: (Long) -> Unit
): Boolean {
    val currentTimestamp = currentTimestamp()
    if (currentTimestamp - timestamp < delay) return false
    onChangeAction(currentTimestamp)
    return true
}