package uz.javokhir.qr.master.screens.pickerLocation

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import uz.javokhir.qr.master.core.extensions.roundLast5
import kotlin.jvm.Transient

data class LocationPickerScreen(
    @Transient val onSelectLocation: (String) -> Unit,
) : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        LocationPickerScreenContent {
            onSelectLocation(
                "${it.latitude.roundLast5()},${it.longitude.roundLast5()}"
            )
            navigator.pop()
        }
    }
}