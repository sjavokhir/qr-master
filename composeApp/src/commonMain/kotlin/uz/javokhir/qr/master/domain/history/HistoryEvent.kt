package uz.javokhir.qr.master.domain.history

sealed class HistoryEvent {
    data class PageChanged(val page: Int) : HistoryEvent()
    data class QueryChanged(
        val scanned: Boolean,
        val query: String,
    ) : HistoryEvent()
}
