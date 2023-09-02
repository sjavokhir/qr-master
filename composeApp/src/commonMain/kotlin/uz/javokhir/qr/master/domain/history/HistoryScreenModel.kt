package uz.javokhir.qr.master.domain.history

import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.inject
import uz.javokhir.qr.master.data.database.dao.HistoryDao
import uz.javokhir.qr.master.data.database.entity.HistoryEntity
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class HistoryScreenModel :
    BaseScreenModel<HistoryState, HistoryEvent>(HistoryState()) {

    private val historyDao by inject<HistoryDao>()

    init {
        if (state.value.scanned) {
            getHistory(true, state.value.scannedQuery)
        } else {
            getHistory(false, state.value.createdQuery)
        }
    }

    override fun onEvent(event: HistoryEvent) {
        when (event) {
            is HistoryEvent.PageChanged -> {
                if (event.page == 0) {
                    getHistory(true, state.value.scannedQuery)
                } else {
                    getHistory(false, state.value.createdQuery)
                }
            }

            is HistoryEvent.QueryChanged -> getHistory(event.scanned, event.query)
        }
    }

    private fun getHistory(scanned: Boolean, query: String) {
        setLoading(scanned, query)

        coroutineScope.launch {
            historyDao.getHistory(scanned, query).collectLatest { setSuccess(it) }
        }
    }

    private fun setLoading(scanned: Boolean, query: String) {
        stateData.update {
            if (scanned) {
                it.copy(
                    scannedQuery = query,
                    scanned = scanned,
                    loading = true
                )
            } else {
                it.copy(
                    createdQuery = query,
                    scanned = scanned,
                    loading = true
                )
            }
        }
    }

    private fun setSuccess(result: List<HistoryEntity>) {
        stateData.update {
            if (it.scanned) {
                it.copy(
                    scannedHistory = result,
                    loading = false
                )
            } else {
                it.copy(
                    createdHistory = result,
                    loading = false
                )
            }
        }
    }
}