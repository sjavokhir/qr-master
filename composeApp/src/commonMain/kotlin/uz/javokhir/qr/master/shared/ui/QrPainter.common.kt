package uz.javokhir.qr.master.shared.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap

@Composable
expect fun rememberQrBitmap(
    content: String,
    size: Int = 512,
    padding: Int = 2,
): ImageBitmap?