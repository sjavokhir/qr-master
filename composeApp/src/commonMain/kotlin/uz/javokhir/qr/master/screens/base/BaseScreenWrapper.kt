package uz.javokhir.qr.master.screens.base

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import kotlinx.coroutines.flow.collectLatest
import uz.javokhir.qr.master.domain.base.BaseScreenModel
import uz.javokhir.qr.master.domain.base.UiEvent
import uz.javokhir.qr.master.shared.platform.toast
import uz.javokhir.qr.master.ui.components.AppBackground

@Composable
fun <State, ScreenEvent> BaseScreenWrapper(
    screenModel: BaseScreenModel<State, ScreenEvent>,
    content: @Composable () -> Unit,
) {
    val navigator = LocalNavigator.currentOrThrow

    LaunchedEffect(Unit) {
        screenModel.eventChannel.collectLatest { event ->
            when (event) {
                is UiEvent.Message -> toast(event.message)
                is UiEvent.Navigate -> navigator.push(event.screen)
                is UiEvent.Replace -> navigator.replace(event.screen)
                is UiEvent.ReplaceAll -> navigator.replaceAll(event.screen)
                UiEvent.NavigateUp -> navigator.pop()
            }
        }
    }

    AppBackground { content() }
}