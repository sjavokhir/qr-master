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

internal val Telegram: ImageVector
    get() {
        if (_telegram != null) {
            return _telegram!!
        }
        _telegram = Builder(
            name = "Telegram",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF34AADF)),
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
                fill = SolidColor(Color(0xFF34AADF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(36.1841f, 58.2138f)
                curveTo(47.0479f, 58.2138f, 55.8547f, 49.4069f, 55.8547f, 38.5431f)
                curveTo(55.8547f, 27.6794f, 47.0479f, 18.8725f, 36.1841f, 18.8725f)
                curveTo(25.3203f, 18.8725f, 16.5134f, 27.6794f, 16.5134f, 38.5431f)
                curveTo(16.5134f, 49.4069f, 25.3203f, 58.2138f, 36.1841f, 58.2138f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(24.9459f, 38.1123f)
                curveTo(24.9459f, 38.1123f, 34.6897f, 33.967f, 38.0691f, 32.5073f)
                curveTo(39.3645f, 31.9235f, 43.7577f, 30.0551f, 43.7577f, 30.0551f)
                curveTo(43.7577f, 30.0551f, 45.7853f, 29.2377f, 45.6163f, 31.2228f)
                curveTo(45.56f, 32.0402f, 45.1094f, 34.9011f, 44.6589f, 37.9956f)
                curveTo(43.983f, 42.3745f, 43.2508f, 47.1621f, 43.2508f, 47.1621f)
                curveTo(43.2508f, 47.1621f, 43.1381f, 48.505f, 42.1807f, 48.7386f)
                curveTo(41.2232f, 48.9721f, 39.6461f, 47.9212f, 39.3645f, 47.6876f)
                curveTo(39.1392f, 47.5125f, 35.1403f, 44.8851f, 33.6759f, 43.6006f)
                curveTo(33.2816f, 43.2503f, 32.8311f, 42.5497f, 33.7322f, 41.7323f)
                curveTo(35.7599f, 39.8055f, 38.1817f, 37.4117f, 39.6461f, 35.8937f)
                curveTo(40.322f, 35.193f, 40.9978f, 33.5582f, 38.1817f, 35.5433f)
                curveTo(34.1828f, 38.4043f, 30.2402f, 41.09f, 30.2402f, 41.09f)
                curveTo(30.2402f, 41.09f, 29.3391f, 41.6738f, 27.6494f, 41.1484f)
                curveTo(25.9597f, 40.623f, 23.9884f, 39.9223f, 23.9884f, 39.9223f)
                curveTo(23.9884f, 39.9223f, 22.6367f, 39.0465f, 24.9459f, 38.1123f)
                close()
            }
        }.build()
        return _telegram!!
    }

private var _telegram: ImageVector? = null
