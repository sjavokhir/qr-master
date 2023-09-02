package uz.javokhir.qr.master.ui.icons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val Medium: ImageVector
    get() {
        if (_medium != null) {
            return _medium!!
        }
        _medium = Builder(
            name = "Medium",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
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
                pathFillType = NonZero
            ) {
                moveTo(17.0248f, 33.0f)
                curveTo(12.0403f, 33.0f, 8.0f, 28.9716f, 8.0f, 23.9998f)
                curveTo(8.0f, 19.0281f, 12.0406f, 15.0f, 17.0248f, 15.0f)
                curveTo(22.009f, 15.0f, 26.0499f, 19.0293f, 26.0499f, 23.9998f)
                curveTo(26.0499f, 28.9704f, 22.0093f, 33.0f, 17.0248f, 33.0f)
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
                moveTo(31.4378f, 32.4719f)
                curveTo(28.9457f, 32.4719f, 26.9253f, 28.6778f, 26.9253f, 23.9998f)
                curveTo(26.9253f, 19.3219f, 28.9457f, 15.5278f, 31.4378f, 15.5278f)
                curveTo(33.9299f, 15.5278f, 35.9504f, 19.3219f, 35.9504f, 23.9998f)
                curveTo(35.9504f, 28.679f, 33.9299f, 32.4719f, 31.4378f, 32.4719f)
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
                moveTo(39.9999f, 23.9998f)
                curveTo(39.9999f, 28.1921f, 39.2893f, 31.5904f, 38.4128f, 31.5904f)
                curveTo(37.5364f, 31.5904f, 36.8257f, 28.1909f, 36.8257f, 23.9998f)
                curveTo(36.8257f, 19.8088f, 37.5364f, 16.4093f, 38.4131f, 16.4093f)
                curveTo(39.2899f, 16.4093f, 39.9999f, 19.8079f, 39.9999f, 23.9998f)
            }
        }.build()
        return _medium!!
    }

private var _medium: ImageVector? = null
