package uz.javokhir.qr.master.ui.icons.qr

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val Text: ImageVector
    get() {
        if (_text != null) {
            return _text!!
        }
        _text = Builder(
            name = "Text",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF673AB7)),
                stroke = null,
                fillAlpha = 0.1f,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(-72.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF673AB7)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(29.45f, 47.5f)
                horizontalLineTo(42.55f)
                curveTo(42.975f, 47.5f, 43.3313f, 47.3554f, 43.6187f, 47.0663f)
                curveTo(43.9062f, 46.7771f, 44.05f, 46.4187f, 44.05f, 45.9913f)
                curveTo(44.05f, 45.5638f, 43.9062f, 45.2083f, 43.6187f, 44.925f)
                curveTo(43.3313f, 44.6417f, 42.975f, 44.5f, 42.55f, 44.5f)
                horizontalLineTo(29.45f)
                curveTo(29.025f, 44.5f, 28.6687f, 44.6446f, 28.3813f, 44.9338f)
                curveTo(28.0938f, 45.2229f, 27.95f, 45.5813f, 27.95f, 46.0087f)
                curveTo(27.95f, 46.4363f, 28.0938f, 46.7917f, 28.3813f, 47.075f)
                curveTo(28.6687f, 47.3583f, 29.025f, 47.5f, 29.45f, 47.5f)
                close()
                moveTo(29.45f, 39.0f)
                horizontalLineTo(42.55f)
                curveTo(42.975f, 39.0f, 43.3313f, 38.8554f, 43.6187f, 38.5663f)
                curveTo(43.9062f, 38.2771f, 44.05f, 37.9187f, 44.05f, 37.4913f)
                curveTo(44.05f, 37.0638f, 43.9062f, 36.7083f, 43.6187f, 36.425f)
                curveTo(43.3313f, 36.1417f, 42.975f, 36.0f, 42.55f, 36.0f)
                horizontalLineTo(29.45f)
                curveTo(29.025f, 36.0f, 28.6687f, 36.1446f, 28.3813f, 36.4338f)
                curveTo(28.0938f, 36.7229f, 27.95f, 37.0813f, 27.95f, 37.5087f)
                curveTo(27.95f, 37.9362f, 28.0938f, 38.2917f, 28.3813f, 38.575f)
                curveTo(28.6687f, 38.8583f, 29.025f, 39.0f, 29.45f, 39.0f)
                close()
                moveTo(23.0f, 56.0f)
                curveTo(22.2f, 56.0f, 21.5f, 55.7f, 20.9f, 55.1f)
                curveTo(20.3f, 54.5f, 20.0f, 53.8f, 20.0f, 53.0f)
                verticalLineTo(19.0f)
                curveTo(20.0f, 18.2f, 20.3f, 17.5f, 20.9f, 16.9f)
                curveTo(21.5f, 16.3f, 22.2f, 16.0f, 23.0f, 16.0f)
                horizontalLineTo(39.8f)
                curveTo(40.2148f, 16.0f, 40.6102f, 16.0833f, 40.9861f, 16.25f)
                curveTo(41.362f, 16.4167f, 41.6833f, 16.6333f, 41.95f, 16.9f)
                lineTo(51.1f, 26.05f)
                curveTo(51.3667f, 26.3167f, 51.5833f, 26.638f, 51.75f, 27.0139f)
                curveTo(51.9167f, 27.3898f, 52.0f, 27.7852f, 52.0f, 28.2f)
                verticalLineTo(53.0f)
                curveTo(52.0f, 53.8f, 51.7f, 54.5f, 51.1f, 55.1f)
                curveTo(50.5f, 55.7f, 49.8f, 56.0f, 49.0f, 56.0f)
                horizontalLineTo(23.0f)
                close()
                moveTo(39.55f, 26.8f)
                curveTo(39.55f, 27.225f, 39.6938f, 27.5813f, 39.9813f, 27.8688f)
                curveTo(40.2688f, 28.1562f, 40.625f, 28.3f, 41.05f, 28.3f)
                horizontalLineTo(49.0f)
                lineTo(39.55f, 19.0f)
                verticalLineTo(26.8f)
                close()
            }
        }.build()
        return _text!!
    }

private var _text: ImageVector? = null
