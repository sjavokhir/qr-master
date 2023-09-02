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

internal val Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(
            name = "Youtube",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFF3000)),
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
                fill = SolidColor(Color(0xFFFF3000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(56.0255f, 26.0969f)
                curveTo(55.5554f, 24.3296f, 54.1648f, 22.9354f, 52.3955f, 22.4576f)
                curveTo(49.1964f, 21.6002f, 36.3608f, 21.6002f, 36.3608f, 21.6002f)
                curveTo(36.3608f, 21.6002f, 23.5317f, 21.6002f, 20.326f, 22.4576f)
                curveTo(18.5633f, 22.9289f, 17.1726f, 24.3231f, 16.696f, 26.0969f)
                curveTo(15.8408f, 29.3042f, 15.8408f, 36.0002f, 15.8408f, 36.0002f)
                curveTo(15.8408f, 36.0002f, 15.8408f, 42.6962f, 16.696f, 45.9034f)
                curveTo(17.1661f, 47.6707f, 18.5567f, 49.0649f, 20.326f, 49.5427f)
                curveTo(23.5317f, 50.4002f, 36.3608f, 50.4002f, 36.3608f, 50.4002f)
                curveTo(36.3608f, 50.4002f, 49.1964f, 50.4002f, 52.3955f, 49.5427f)
                curveTo(54.1583f, 49.0714f, 55.5489f, 47.6772f, 56.0255f, 45.9034f)
                curveTo(56.8808f, 42.6962f, 56.8808f, 36.0002f, 56.8808f, 36.0002f)
                curveTo(56.8808f, 36.0002f, 56.8808f, 29.3042f, 56.0255f, 26.0969f)
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
                moveTo(32.2607f, 42.1725f)
                lineTo(42.9222f, 36.0002f)
                lineTo(32.2607f, 29.8278f)
                verticalLineTo(42.1725f)
                close()
            }
        }.build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
