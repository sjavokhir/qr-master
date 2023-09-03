package uz.javokhir.qr.master.domain.qrCode

import kotlinx.coroutines.flow.update
import org.koin.core.component.inject
import uz.javokhir.qr.master.data.database.dao.HistoryDao
import uz.javokhir.qr.master.data.store.AppStore
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class QrCodeScreenModel :
    BaseScreenModel<QrCodeState, QrCodeEvent>(QrCodeState()) {

    private val appStore by inject<AppStore>()
    private val historyDao by inject<HistoryDao>()

    init {
        stateData.update {
            it.copy(chromeCustomTabsEnabled = appStore.isChromeCustomTabsEnabled())
        }
    }

    override fun onEvent(event: QrCodeEvent) {
        when (event) {
            is QrCodeEvent.Insert -> insert(event)
            is QrCodeEvent.Delete -> delete(event.id)
        }
    }

    private fun insert(event: QrCodeEvent.Insert) {
        historyDao.insert(
            id = event.id,
            scanned = event.scanned,
            generateMode = event.mode,
            encoded = event.encoded,
            decoded = event.decoded,
            customize = event.customize
        )

        stateData.update { it.copy(saved = true) }
    }

    private fun delete(id: String) {
        historyDao.delete(id)
    }
}