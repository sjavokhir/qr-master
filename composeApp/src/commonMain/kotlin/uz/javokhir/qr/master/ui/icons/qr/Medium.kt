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

internal val Medium: ImageVector
    get() {
        if (_medium != null) {
            return _medium!!
        }
        _medium = Builder(
            name = "Medium",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF5F5F5)),
                stroke = null,
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
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(38.5918f, 36.3602f)
                curveTo(38.5918f, 42.5191f, 33.5107f, 47.5202f, 27.2163f, 47.5202f)
                curveTo(20.9218f, 47.5202f, 15.8407f, 42.5191f, 15.8407f, 36.3602f)
                curveTo(15.8407f, 30.2013f, 20.9218f, 25.2002f, 27.2163f, 25.2002f)
                curveTo(33.5107f, 25.2002f, 38.5918f, 30.2013f, 38.5918f, 36.3602f)
                close()
                moveTo(51.0544f, 36.3602f)
                curveTo(51.0544f, 42.1496f, 48.5012f, 46.855f, 45.3666f, 46.855f)
                curveTo(42.232f, 46.855f, 39.6788f, 42.1496f, 39.6788f, 36.3602f)
                curveTo(39.6788f, 30.5708f, 42.232f, 25.8654f, 45.3666f, 25.8654f)
                curveTo(48.5012f, 25.8654f, 51.0544f, 30.5462f, 51.0544f, 36.3602f)
                close()
                moveTo(56.1607f, 36.3602f)
                curveTo(56.1607f, 41.5583f, 55.276f, 45.7711f, 54.1637f, 45.7711f)
                curveTo(53.0514f, 45.7711f, 52.1666f, 41.5583f, 52.1666f, 36.3602f)
                curveTo(52.1666f, 31.162f, 53.0514f, 26.9493f, 54.1637f, 26.9493f)
                curveTo(55.276f, 26.9493f, 56.1607f, 31.162f, 56.1607f, 36.3602f)
                close()
            }
        }.build()
        return _medium!!
    }

private var _medium: ImageVector? = null
