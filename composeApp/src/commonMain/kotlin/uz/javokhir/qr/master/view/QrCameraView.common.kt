package uz.javokhir.qr.master.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import uz.javokhir.qr.master.data.model.mode.GenerateMode

@Composable
expect fun QrCameraView(
    modifier: Modifier,
    flashlightOn: Boolean,
    vibrateEnabled: Boolean,
    openWebPagesEnabled: Boolean,
    chromeCustomTabsEnabled: Boolean,
    onResult: (String, String, GenerateMode) -> Unit,
)