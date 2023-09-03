package uz.javokhir.qr.master.screens.customize

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import uz.javokhir.qr.master.data.model.common.QrCustomizeModel
import uz.javokhir.qr.master.domain.base.UiEvent
import uz.javokhir.qr.master.domain.customize.CustomizeEvent
import uz.javokhir.qr.master.domain.customize.CustomizeScreenModel
import uz.javokhir.qr.master.domain.customize.toModel
import uz.javokhir.qr.master.screens.base.BaseScreenWrapper
import kotlin.jvm.Transient

data class CustomizeScreen(
    val customize: QrCustomizeModel,
    @Transient val onCustomize: (QrCustomizeModel) -> Unit,
) : Screen {

    @Composable
    override fun Content() {
        val screenModel = rememberScreenModel { CustomizeScreenModel() }
        val state by screenModel.state.collectAsState()

        LaunchedEffect(customize) {
            screenModel.onEvent(CustomizeEvent.Customize(customize))
        }

        BaseScreenWrapper(screenModel = screenModel) {
            CustomizeScreenContent(
                state = state,
                onEvent = screenModel::onEvent,
                onCustomize = {
                    onCustomize(state.toModel())
                    screenModel.sendEvent(UiEvent.NavigateUp)
                }
            )
        }
    }
}
