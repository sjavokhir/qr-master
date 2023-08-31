package uz.javokhir.kqr.master.shared

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap

class AndroidImage(
    val imageBitmap: ImageBitmap
)

actual typealias PlatformImage = AndroidImage

actual fun PlatformImage.getImageBitmap(): ImageBitmap? = imageBitmap

actual fun ByteArray.toImageBitmap(): ImageBitmap = toAndroidBitmap().asImageBitmap()

private fun ByteArray.toAndroidBitmap(): Bitmap {
    return BitmapFactory.decodeByteArray(this, 0, size)
}