package uz.javokhir.qr.master.domain.history

import uz.javokhir.qr.master.data.database.entity.HistoryEntity

data class HistoryState(
    val scannedQuery: String = "",
    val createdQuery: String = "",
    val scannedHistory: List<HistoryEntity> = emptyList(),
    val createdHistory: List<HistoryEntity> = emptyList(),
    val scanned: Boolean = true,
    val loading: Boolean = false,
)
