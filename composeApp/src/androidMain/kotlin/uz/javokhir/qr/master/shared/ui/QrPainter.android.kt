package uz.javokhir.qr.master.shared.ui

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.Path
import android.graphics.RectF
import android.graphics.drawable.Drawable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toBitmap
import com.github.alexzhirkevich.customqrgenerator.QrData
import com.github.alexzhirkevich.customqrgenerator.style.Neighbors
import com.github.alexzhirkevich.customqrgenerator.vector.QrCodeDrawable
import com.github.alexzhirkevich.customqrgenerator.vector.createQrVectorOptions
import com.github.alexzhirkevich.customqrgenerator.vector.style.QrVectorBallShape
import com.github.alexzhirkevich.customqrgenerator.vector.style.QrVectorColor
import com.github.alexzhirkevich.customqrgenerator.vector.style.QrVectorFrameShape
import com.github.alexzhirkevich.customqrgenerator.vector.style.QrVectorLogoPadding
import com.github.alexzhirkevich.customqrgenerator.vector.style.QrVectorLogoShape
import com.github.alexzhirkevich.customqrgenerator.vector.style.QrVectorPixelShape
import com.github.alexzhirkevich.customqrgenerator.vector.style.QrVectorShapeModifier
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import uz.javokhir.qr.master.AndroidApp
import uz.javokhir.qr.master.data.model.common.QrCustomizeModel
import uz.javokhir.qr.master.data.model.mode.QrCornerMode
import uz.javokhir.qr.master.data.model.mode.QrDotMode
import uz.javokhir.qr.master.data.model.mode.QrPatternMode
import uz.javokhir.qr.master.extensions.drawableId

@Composable
actual fun rememberQrBitmap(
    content: String,
    customize: QrCustomizeModel,
    size: Int,
): ImageBitmap? {
    check(content.isNotEmpty()) { "Content must not be empty" }

    val drawableState = remember {
        mutableStateOf<Drawable?>(null)
    }

    // Use dependency on 'content' to re-trigger the effect when content changes
    LaunchedEffect(content) {
        val drawable = generateQrDrawable(content, customize)
        drawableState.value = drawable
    }

    val drawable = drawableState.value

    return if (drawable != null) {
        remember(drawable) {
            drawableToBitmap(drawable, size).asImageBitmap()
        }
    } else {
        createDefaultBitmap().asImageBitmap()
    }
}

private suspend fun generateQrDrawable(
    content: String,
    customize: QrCustomizeModel,
    context: Context = AndroidApp.INSTANCE,
): Drawable = withContext(Dispatchers.IO) {
    val options = createQrVectorOptions {
        padding = .10f

        background {
            color = QrVectorColor.Solid(
                Color.parseColor("#${customize.patternBackgroundHex}")
            )
        }

        if (customize.selectedLogo.isNotEmpty()) {
            context.drawableId(customize.selectedLogo)?.let { resource ->
                logo {
                    drawable = ContextCompat.getDrawable(context, resource)
                    size = .2f
                    padding = QrVectorLogoPadding.Natural(.1f)
                    shape = QrVectorLogoShape.Circle
                }
            }
        }

        colors {
            dark = QrVectorColor.Solid(Color.parseColor("#${customize.patternDotHex}"))
            frame = QrVectorColor.Solid(Color.parseColor("#${customize.frameHex}"))
            ball = QrVectorColor.Solid(Color.parseColor("#${customize.frameDotHex}"))
        }

        shapes {
            darkPixel = when (customize.selectedPattern) {
                QrPatternMode.Default -> QrVectorPixelShape.Default
                QrPatternMode.Rounded -> QrVectorPixelShape.RoundCorners(.25f)
                QrPatternMode.ExtraRounded -> QrVectorPixelShape.RoundCorners(.5f)
                QrPatternMode.Circle -> QrVectorPixelShape.Circle()
                QrPatternMode.CirclePadding -> QrVectorPixelShape.Circle(.85f)
                QrPatternMode.Horizontal -> QrVectorPixelShape.RoundCornersHorizontal()
                QrPatternMode.Vertical -> QrVectorPixelShape.RoundCornersVertical()
                QrPatternMode.Rhombus -> QrVectorPixelShape.Rhombus()
                QrPatternMode.Star -> QrVectorPixelShape.Star
                QrPatternMode.Classy -> Classy(.25f)
                QrPatternMode.ClassyRounded -> Classy(.5f)
            }
            frame = when (customize.selectedCorner) {
                QrCornerMode.Default -> QrVectorFrameShape.Default
                QrCornerMode.Rounded -> QrVectorFrameShape.RoundCorners(.25f)
                QrCornerMode.Circle -> QrVectorFrameShape.Circle()
                QrCornerMode.Two -> QrVectorFrameShape.RoundCorners(
                    corner = .3f,
                    topLeft = false,
                    bottomRight = false
                )

                QrCornerMode.Three -> QrVectorFrameShape.RoundCorners(
                    corner = .3f,
                    bottomRight = false
                )

                QrCornerMode.Dots -> QrVectorFrameShape.AsPixelShape(
                    QrVectorPixelShape.Circle()
                )

                QrCornerMode.DotsPadding -> QrVectorFrameShape.AsPixelShape(
                    QrVectorPixelShape.Circle(.85f)
                )

                QrCornerMode.Rhombus -> QrVectorFrameShape.AsPixelShape(
                    QrVectorPixelShape.Rhombus()
                )
            }
            ball = when (customize.selectedDot) {
                QrDotMode.Default -> QrVectorBallShape.Default
                QrDotMode.Rounded -> QrVectorBallShape.RoundCorners(.25f)
                QrDotMode.Circle -> QrVectorBallShape.Circle()
                QrDotMode.Rhombus -> QrVectorBallShape.Rhombus()
                QrDotMode.CornerTwo -> QrVectorBallShape.RoundCorners(
                    radius = .25f,
                    topLeft = false,
                    bottomRight = false
                )

                QrDotMode.CornerThree -> QrVectorBallShape.RoundCorners(
                    radius = .25f,
                    bottomRight = false
                )

                QrDotMode.Dots -> QrVectorBallShape.AsPixelShape(
                    QrVectorPixelShape.Circle()
                )

                QrDotMode.DotsPadding -> QrVectorBallShape.AsPixelShape(
                    QrVectorPixelShape.Circle(.85f)
                )

                QrDotMode.Horizontal -> QrVectorBallShape.AsPixelShape(
                    QrVectorPixelShape.RoundCornersHorizontal()
                )

                QrDotMode.Vertical -> QrVectorBallShape.AsPixelShape(
                    QrVectorPixelShape.RoundCornersVertical()
                )
            }
        }
    }
    val drawable = QrCodeDrawable(QrData.Text(content), options)
    drawable
}

private fun createDefaultBitmap(): Bitmap {
    return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888).apply {
        eraseColor(Color.TRANSPARENT)
    }
}

private fun drawableToBitmap(
    drawable: Drawable?,
    size: Int,
): Bitmap {
    if (drawable == null) return createDefaultBitmap()

    return drawable.toBitmap(size, size)
}

data class Classy(
    private val cornerRadius: Float,
    private val withNeighbors: Boolean = true,
    private val topLeft: Boolean = true,
    private val bottomLeft: Boolean = false,
    private val topRight: Boolean = false,
    private val bottomRight: Boolean = true,
) : QrVectorPixelShape, QrVectorShapeModifier {

    override fun Path.shape(size: Float, neighbors: Neighbors) {
        val corner = cornerRadius.coerceIn(0f, .5f) * size

        addRoundRect(
            RectF(0f, 0f, size, size),
            floatArrayOf(
                if (topLeft && (withNeighbors.not() || neighbors.top.not() && neighbors.left.not())) corner else 0f,
                if (topLeft && (withNeighbors.not() || neighbors.top.not() && neighbors.left.not())) corner else 0f,
                if (topRight && (withNeighbors.not() || neighbors.top.not() && neighbors.right.not())) corner else 0f,
                if (topRight && (withNeighbors.not() || neighbors.top.not() && neighbors.right.not())) corner else 0f,
                if (bottomRight && (withNeighbors.not() || neighbors.bottom.not() && neighbors.right.not())) corner else 0f,
                if (bottomRight && (withNeighbors.not() || neighbors.bottom.not() && neighbors.right.not())) corner else 0f,
                if (bottomLeft && (withNeighbors.not() || neighbors.bottom.not() && neighbors.left.not())) corner else 0f,
                if (bottomLeft && (withNeighbors.not() || neighbors.bottom.not() && neighbors.left.not())) corner else 0f,
            ),
            Path.Direction.CW
        )
    }
}