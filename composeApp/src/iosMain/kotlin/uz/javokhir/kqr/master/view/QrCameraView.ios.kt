package uz.javokhir.kqr.master.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import uz.javokhir.kqr.master.data.model.mode.GenerateMode

@Composable
actual fun QrCameraView(
    modifier: Modifier,
    flashlightOn: Boolean,
    vibrateEnabled: Boolean,
    openWebPagesEnabled: Boolean,
    chromeCustomTabsEnabled: Boolean,
    onResult: (String, String, GenerateMode) -> Unit,
) {
}