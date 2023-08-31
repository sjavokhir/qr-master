package uz.javokhir.kqr.master.view

import androidx.compose.runtime.Composable
import uz.javokhir.kqr.master.shared.PlatformImage

@Composable
expect fun rememberQrImage(
    content: String,
    size: Int,
    padding: Int,
): PlatformImage?