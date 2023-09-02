package uz.javokhir.qr.master.screens.scanner

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import uz.javokhir.qr.master.domain.scanner.ScannerScreenModel
import uz.javokhir.qr.master.screens.base.BaseScreenWrapper

object ScannerScreen : Screen {

    @Composable
    override fun Content() {
        val screenModel = rememberScreenModel { ScannerScreenModel() }
        val state by screenModel.state.collectAsState()

        BaseScreenWrapper(screenModel) {
            ScannerScreenContent(state = state)
        }
    }
}