package uz.javokhir.qr.master.screens.settings

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import uz.javokhir.qr.master.domain.settings.SettingsScreenModel
import uz.javokhir.qr.master.screens.base.BaseScreenWrapper

object SettingsScreen : Screen {

    @Composable
    override fun Content() {
        val screenModel = rememberScreenModel { SettingsScreenModel() }
        val state by screenModel.state.collectAsState()

        BaseScreenWrapper(screenModel) {
            SettingsScreenContent(
                state = state,
                onEvent = screenModel::onEvent,
                onUiEvent = screenModel::sendEvent
            )
        }
    }
}