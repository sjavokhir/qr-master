package uz.javokhir.qr.master.data.database.dao

import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import uz.javokhir.qr.master.core.datetime.currentTimestamp
import uz.javokhir.qr.master.data.database.entity.HistoryEntity
import uz.javokhir.qr.master.data.database.entity.toEntity
import uz.javokhir.qr.master.data.model.common.QrCustomizeModel
import uz.javokhir.qr.master.data.model.mode.GenerateMode
import uz.javokhir.qr.master.db.AppDatabase
import uz.javokhir.qr.master.domain.customize.CustomizeState
import uz.javokhir.qr.master.shared.platform.ioDispatcher

class HistoryDao(database: AppDatabase) {

    private val queries = database.appDatabaseQueries

    fun getHistory(scanned: Boolean, query: String): Flow<List<HistoryEntity>> {
        return queries.getHistory(if (scanned) 0 else 1)
            .asFlow()
            .mapToList(ioDispatcher)
            .map { log ->
                log.map { it.toEntity() }
                    .filter {
                        it.encoded.contains(query, ignoreCase = true)
                                || it.decoded.contains(query, ignoreCase = true)
                    }
                    .sortedByDescending { it.timestamp }
            }
            .flowOn(ioDispatcher)
    }

    fun insert(
        id: String,
        scanned: Boolean,
        generateMode: GenerateMode,
        encoded: String,
        decoded: String,
        customize: QrCustomizeModel,
    ) {
        queries.insert(
            id = id,
            timestamp = currentTimestamp(),
            history_type = if (scanned) 0 else 1,
            generate_mode = generateMode.ordinal.toLong(),
            encode = encoded,
            decode = decoded,
            selected_pattern = customize.selectedPattern.ordinal.toLong(),
            selected_corner = customize.selectedCorner.ordinal.toLong(),
            selected_dot = customize.selectedDot.ordinal.toLong(),
            pattern_dot_hex = customize.patternDotHex,
            pattern_background_hex = customize.patternBackgroundHex,
            frame_hex = customize.frameHex,
            frame_dot_hex = customize.frameDotHex,
            selected_logo = "",
            latitude = 0.0,
            longitude = 0.0,
        )
    }

    fun delete(id: String) {
        queries.delete(id)
    }

    fun clearAll(scanned: Boolean) {
        queries.clearAll(if (scanned) 0 else 1)
    }
}