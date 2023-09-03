package uz.javokhir.qr.master.shared.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import kotlinx.cinterop.ExperimentalForeignApi
import platform.CoreGraphics.CGAffineTransformMakeScale
import platform.CoreImage.CIContext
import platform.CoreImage.CIFilter
import platform.CoreImage.QRCodeGenerator
import platform.CoreImage.createCGImage
import platform.Foundation.setValue
import platform.UIKit.UIImage
import uz.javokhir.qr.master.data.model.common.QrCustomizeModel
import uz.javokhir.qr.master.extensions.toNSData
import uz.javokhir.qr.master.shared.platform.toImageBitmap

@OptIn(ExperimentalForeignApi::class)
@Composable
actual fun rememberQrBitmap(
    content: String,
    customize: QrCustomizeModel,
    size: Int,
): ImageBitmap? {
    val filter = CIFilter.QRCodeGenerator().apply {
        setValue(content.toNSData(), forKey = "inputMessage")
    }
    val outputImg = filter.outputImage ?: return null

    // Scale the image to the desired size
    val scale = (size / outputImg.extent.size).toDouble()
    val transformedImage = outputImg.imageByApplyingTransform(
        CGAffineTransformMakeScale(scale, scale)
    )

    // Convert the CIImage to a UIImage
    val context = CIContext()
    val cgImage = context.createCGImage(transformedImage, transformedImage.extent)
    val uiImage = UIImage.imageWithCGImage(cgImage)

    return uiImage.toImageBitmap()
}