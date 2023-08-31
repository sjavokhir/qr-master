package uz.javokhir.qr.master.domain.scanner

import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.inject
import uz.javokhir.qr.master.data.store.AppStore
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class ScannerScreenModel :
    BaseScreenModel<ScannerState, ScannerEvent>(ScannerState()) {

    private val appStore by inject<AppStore>()

    init {
        coroutineScope.launch {
            stateData.update {
                it.copy(
                    vibrateEnabled = appStore.isVibrateEnabled(),
                    openWebPagesEnabled = appStore.isOpenWebPagesEnabled(),
                    chromeCustomTabsEnabled = appStore.isChromeCustomTabsEnabled()
                )
            }
        }
    }

    override fun onEvent(event: ScannerEvent) {
    }
}