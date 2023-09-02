package uz.javokhir.qr.master.screens.history

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import uz.javokhir.qr.master.domain.history.HistoryScreenModel
import uz.javokhir.qr.master.screens.base.BaseScreenWrapper

object HistoryScreen : Screen {

    @Composable
    override fun Content() {
        val screenModel = rememberScreenModel { HistoryScreenModel() }
        val state by screenModel.state.collectAsState()

        BaseScreenWrapper(screenModel) {
            HistoryScreenContent(
                state = state,
                onEvent = screenModel::onEvent,
                onUiEvent = screenModel::sendEvent
            )
        }
    }
}