package uz.javokhir.qr.master.screens.base

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import kotlinx.coroutines.flow.collectLatest
import uz.javokhir.qr.master.domain.base.BaseScreenModel
import uz.javokhir.qr.master.domain.base.BottomNavigationMode
import uz.javokhir.qr.master.domain.base.UiEvent
import uz.javokhir.qr.master.shared.toast
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
                is UiEvent.ReplaceTo -> navigator.replaceTo(
                    navigationMode = event.navigationMode,
                    currentNavigationMode = event.currentNavigationMode
                )

                is UiEvent.Navigate -> navigator.push(event.screen)
                UiEvent.NavigateUp -> navigator.pop()
            }
        }
    }

    AppBackground { content() }
}

private fun Navigator.replaceTo(
    navigationMode: BottomNavigationMode,
    currentNavigationMode: BottomNavigationMode,
) {
    when (navigationMode) {
        BottomNavigationMode.Scanner -> {
//            if (navigationMode != currentNavigationMode) replaceAll(ScannerScreen)
        }

        BottomNavigationMode.Creator -> {
//            if (navigationMode != currentNavigationMode) replaceAll(CreatorScreen)
        }

        BottomNavigationMode.History -> {
//            if (navigationMode != currentNavigationMode) replaceAll(HistoryScreen)
        }

        BottomNavigationMode.Settings -> {
//            if (navigationMode != currentNavigationMode) replaceAll(SettingsScreen)
        }
    }
}