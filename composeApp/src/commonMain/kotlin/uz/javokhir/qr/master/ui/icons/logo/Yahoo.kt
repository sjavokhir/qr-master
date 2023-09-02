package uz.javokhir.qr.master.ui.icons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val Yahoo: ImageVector
    get() {
        if (_yahoo != null) {
            return _yahoo!!
        }
        _yahoo = Builder(
            name = "Yahoo",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6001D2)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(24.0f, 24.0f)
                moveToRelative(-24.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFFffffff)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(40.0001f, 10.0f)
                lineTo(34.201f, 24.0f)
                horizontalLineTo(27.781f)
                lineTo(33.53f, 10.0f)
                horizontalLineTo(40.0001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.9593f, 16.87f)
                lineTo(17.5049f, 25.87f)
                lineTo(21.0704f, 16.87f)
                horizontalLineTo(26.7793f)
                lineTo(17.9656f, 38.0f)
                horizontalLineTo(12.2166f)
                lineTo(14.5903f, 32.4f)
                lineTo(8.0f, 16.87f)
                horizontalLineTo(13.9593f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(25.6677f, 29.0f)
                curveTo(25.6569f, 29.9315f, 26.0227f, 30.8281f, 26.6825f, 31.4868f)
                curveTo(27.3422f, 32.1456f, 28.2402f, 32.5108f, 29.1732f, 32.5f)
                curveTo(30.139f, 32.5108f, 31.0685f, 32.1332f, 31.7524f, 31.4522f)
                curveTo(32.4362f, 30.7713f, 32.817f, 29.8443f, 32.8089f, 28.88f)
                curveTo(32.8252f, 27.9459f, 32.4615f, 27.0451f, 31.8008f, 26.3836f)
                curveTo(31.1401f, 25.7221f, 30.239f, 25.3563f, 29.3034f, 25.37f)
                curveTo(28.3383f, 25.3673f, 27.412f, 25.7489f, 26.7296f, 26.4303f)
                curveTo(26.0472f, 27.1116f, 25.665f, 28.0364f, 25.6677f, 29.0f)
                verticalLineTo(29.0f)
                close()
            }
        }.build()
        return _yahoo!!
    }

private var _yahoo: ImageVector? = null
