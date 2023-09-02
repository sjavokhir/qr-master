package uz.javokhir.qr.master.screens.creator

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import uz.javokhir.qr.master.domain.generateContents.GenerateContentsScreenModel
import uz.javokhir.qr.master.screens.base.BaseScreenWrapper

object CreatorScreen : Screen {

    @Composable
    override fun Content() {
        val screenModel = rememberScreenModel { GenerateContentsScreenModel() }
        val state by screenModel.state.collectAsState()

        BaseScreenWrapper(screenModel) {
            CreatorScreenContent(
                state = state,
                onUiEvent = screenModel::sendEvent,
            )
        }
    }
}