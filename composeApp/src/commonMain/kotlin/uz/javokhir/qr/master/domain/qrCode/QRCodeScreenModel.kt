package uz.javokhir.qr.master.domain.qrCode

import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.inject
import uz.javokhir.qr.master.data.database.dao.HistoryDao
import uz.javokhir.qr.master.data.store.AppStore
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class QRCodeScreenModel :
    BaseScreenModel<QRCodeState, QRCodeEvent>(QRCodeState()) {

    private val appStore by inject<AppStore>()
    private val historyDao by inject<HistoryDao>()

    init {
        coroutineScope.launch {
            stateData.update {
                it.copy(chromeCustomTabsEnabled = appStore.isChromeCustomTabsEnabled())
            }
        }
    }

    override fun onEvent(event: QRCodeEvent) {
        when (event) {
            is QRCodeEvent.Insert -> insert(event)
            is QRCodeEvent.Delete -> delete(event.id)
        }
    }

    private fun insert(event: QRCodeEvent.Insert) {
        coroutineScope.launch {
            historyDao.insert(
                id = event.id,
                isScanned = event.scanned,
                generateMode = event.mode,
                encoded = event.encoded,
                decoded = event.decoded,
                customize = event.customize
            )

            stateData.update { it.copy(saved = true) }
        }
    }

    private fun delete(id: String) {
        coroutineScope.launch {
            historyDao.delete(id)
        }
    }
}