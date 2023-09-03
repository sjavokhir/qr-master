package uz.javokhir.qr.master.shared.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import uz.javokhir.qr.master.data.model.common.QrCustomizeModel

@Composable
expect fun rememberQrBitmap(
    content: String,
    customize: QrCustomizeModel,
    size: Int = 1024,
): ImageBitmap?