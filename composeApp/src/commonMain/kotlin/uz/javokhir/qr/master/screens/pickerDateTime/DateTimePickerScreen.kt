package uz.javokhir.qr.master.screens.pickerDateTime

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import kotlin.jvm.Transient

data class DateTimePickerScreen(
    val showTime: Boolean,
    @Transient val onSelectTimestamp: (Long) -> Unit,
) : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        DateTimePickerScreenContent(showTime) {
            onSelectTimestamp(it)
            navigator.pop()
        }
    }
}