package uz.javokhir.kqr.master.view

import android.graphics.Bitmap
import android.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.asImageBitmap
import kotlinx.coroutines.launch
import uz.javokhir.kqr.master.shared.PlatformImage
import uz.javokhir.kqr.master.shared.ioDispatcher

@Composable
actual fun rememberQrImage(
    content: String,
    size: Int,
    padding: Int,
): PlatformImage? {
    var bitmap by remember(content) {
        mutableStateOf<Bitmap?>(null)
    }

    LaunchedEffect(bitmap) {
        if (bitmap != null) return@LaunchedEffect

        launch(ioDispatcher) {
//            val barcodeEncoder = BarcodeEncoder()
//            val encodeHints = mutableMapOf<EncodeHintType, Any?>()
//                .apply {
//                    this[EncodeHintType.MARGIN] = padding
//                }
//
//            tryCatch {
//                bitmap = barcodeEncoder.encodeBitmap(
//                    content,
//                    BarcodeFormat.QR_CODE,
//                    size,
//                    size,
//                    encodeHints
//                )
//            }
        }
    }

    return remember(bitmap) {
        val currentBitmap = (bitmap ?: Bitmap.createBitmap(
            size,
            size,
            Bitmap.Config.ARGB_8888,
        ).apply { eraseColor(Color.TRANSPARENT) }).asImageBitmap()

        PlatformImage(currentBitmap)
    }
}