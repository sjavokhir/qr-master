package uz.javokhir.qr.master.domain.theme

import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.inject
import uz.javokhir.qr.master.data.model.mode.ThemeMode
import uz.javokhir.qr.master.data.store.AppStore
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class ThemeModeScreenModel :
    BaseScreenModel<ThemeModeState, ThemeModeEvent>(ThemeModeState()) {

    private val appStore by inject<AppStore>()

    init {
        stateData.update {
            it.copy(
                selectedTheme = appStore.getSelectedThemeMode(),
                themeModes = ThemeMode.entries
            )
        }
    }

    override fun onEvent(event: ThemeModeEvent) {
        when (event) {
            is ThemeModeEvent.SelectThemeMode -> selectTheme(event.themeMode)
        }
    }

    private fun selectTheme(themeMode: ThemeMode) {
        appStore.setSelectedThemeMode(themeMode)

        stateData.update { it.copy(selectedTheme = themeMode) }
    }
}