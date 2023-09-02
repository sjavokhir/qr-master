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

internal val Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(
            name = "Facebook",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF337FFF)),
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
                fill = SolidColor(Color(0xFF337FFF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(44.8087f, 38.2496f)
                lineTo(45.8346f, 31.7375f)
                horizontalLineTo(39.5153f)
                verticalLineTo(27.5046f)
                curveTo(39.5153f, 25.7239f, 40.3976f, 23.984f, 43.2187f, 23.984f)
                horizontalLineTo(46.1321f)
                verticalLineTo(18.4385f)
                curveTo(44.4355f, 18.1681f, 42.7211f, 18.0219f, 41.0028f, 18.0009f)
                curveTo(35.8017f, 18.0009f, 32.4061f, 21.1247f, 32.4061f, 26.772f)
                verticalLineTo(31.7375f)
                horizontalLineTo(26.6408f)
                verticalLineTo(38.2496f)
                horizontalLineTo(32.4061f)
                verticalLineTo(54.0009f)
                horizontalLineTo(39.5153f)
                verticalLineTo(38.2496f)
                horizontalLineTo(44.8087f)
                close()
            }
        }.build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
