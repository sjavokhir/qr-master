package uz.javokhir.kqr.master.shared

import androidx.compose.ui.graphics.ImageBitmap

expect class PlatformImage

expect fun PlatformImage.getImageBitmap(): ImageBitmap?

expect fun ByteArray.toImageBitmap(): ImageBitmap
