package uz.javokhir.qr.master.domain.settings

import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.inject
import uz.javokhir.qr.master.data.store.AppStore
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class SettingsScreenModel :
    BaseScreenModel<SettingsState, SettingsEvent>(SettingsState()) {

    private val appStore by inject<AppStore>()

    init {
        coroutineScope.launch {
            stateData.update {
                it.copy(
                    vibrateChecked = appStore.isVibrateEnabled(),
                    openWebPagesChecked = appStore.isOpenWebPagesEnabled(),
                    chromeCustomTabsChecked = appStore.isChromeCustomTabsEnabled(),
                )
            }
        }
    }

    override fun onEvent(event: SettingsEvent) {
        when (event) {
            is SettingsEvent.CheckVibrate -> onVibrateChecked(event.checked)
            is SettingsEvent.CheckOpenWebPages -> onOpenWebPagesChecked(event.checked)
            is SettingsEvent.CheckChromeCustomTabs -> onChromeCustomTabsChecked(event.checked)
        }
    }

    private fun onVibrateChecked(checked: Boolean) {
        appStore.setVibrate(checked)

        stateData.update { it.copy(vibrateChecked = checked) }
    }

    private fun onOpenWebPagesChecked(checked: Boolean) {
        appStore.setOpenWebPages(checked)

        stateData.update { it.copy(openWebPagesChecked = checked) }
    }

    private fun onChromeCustomTabsChecked(checked: Boolean) {
        appStore.setChromeCustomTabs(checked)

        stateData.update { it.copy(chromeCustomTabsChecked = checked) }
    }
}