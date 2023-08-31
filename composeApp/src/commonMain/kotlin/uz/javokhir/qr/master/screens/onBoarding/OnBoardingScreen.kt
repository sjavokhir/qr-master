package uz.javokhir.qr.master.screens.onBoarding

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import uz.javokhir.qr.master.domain.onBoarding.OnBoardingScreenModel
import uz.javokhir.qr.master.screens.base.BaseScreenWrapper

object OnBoardingScreen : Screen {

    @Composable
    override fun Content() {
        val screenModel = rememberScreenModel { OnBoardingScreenModel() }
        val state by screenModel.state.collectAsState()

        BaseScreenWrapper(screenModel = screenModel) {
            OnBoardingScreenContent(
                state = state,
                onEvent = screenModel::onEvent
            )
        }
    }
}