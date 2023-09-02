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

internal val Gmail: ImageVector
    get() {
        if (_gmail != null) {
            return _gmail!!
        }
        _gmail = Builder(
            name = "Gmail",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF7F7F7)),
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
                fill = SolidColor(Color(0xFF4285F4)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.1818f, 36.0f)
                horizontalLineTo(15.2727f)
                verticalLineTo(23.6394f)
                lineTo(8.0f, 18.1862f)
                verticalLineTo(33.8187f)
                curveTo(8.0f, 35.0239f, 8.9764f, 36.0f, 10.1818f, 36.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF34A853)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(32.7273f, 36.0f)
                horizontalLineTo(37.8182f)
                curveTo(39.0237f, 36.0f, 40.0f, 35.0239f, 40.0f, 33.8187f)
                verticalLineTo(18.1862f)
                lineTo(32.7273f, 23.6394f)
                verticalLineTo(36.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBBC04)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(32.7273f, 14.1872f)
                verticalLineTo(23.6394f)
                lineTo(40.0f, 18.1862f)
                verticalLineTo(15.2778f)
                curveTo(40.0f, 12.5821f, 36.9218f, 11.0425f, 34.7637f, 12.6603f)
                lineTo(32.7273f, 14.1872f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEA4335)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.2727f, 23.6394f)
                verticalLineTo(14.1871f)
                lineTo(24.0f, 20.731f)
                lineTo(32.7273f, 14.1871f)
                verticalLineTo(23.6394f)
                lineTo(24.0f, 30.1832f)
                lineTo(15.2727f, 23.6394f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC5221F)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 15.2778f)
                verticalLineTo(18.1862f)
                lineTo(15.2727f, 23.6394f)
                verticalLineTo(14.1872f)
                lineTo(13.2364f, 12.6603f)
                curveTo(11.0782f, 11.0425f, 8.0f, 12.5821f, 8.0f, 15.2778f)
                close()
            }
        }.build()
        return _gmail!!
    }

private var _gmail: ImageVector? = null
