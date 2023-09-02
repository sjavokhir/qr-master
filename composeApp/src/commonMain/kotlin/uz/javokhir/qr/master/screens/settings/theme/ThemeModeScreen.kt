package uz.javokhir.qr.master.screens.settings.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import uz.javokhir.qr.master.domain.theme.ThemeModeScreenModel
import uz.javokhir.qr.master.screens.base.BaseScreenWrapper

object ThemeModeScreen : Screen {

    @Composable
    override fun Content() {
        val screenModel = rememberScreenModel { ThemeModeScreenModel() }
        val state by screenModel.state.collectAsState()

        BaseScreenWrapper(screenModel) {
            ThemeModeScreenContent(
                state = state,
                onEvent = screenModel::onEvent
            )
        }
    }
}