package uz.javokhir.qr.master.view

import androidx.compose.runtime.Composable
import uz.javokhir.qr.master.shared.PlatformImage

@Composable
expect fun rememberQrImage(
    content: String,
    size: Int,
    padding: Int,
): PlatformImage?