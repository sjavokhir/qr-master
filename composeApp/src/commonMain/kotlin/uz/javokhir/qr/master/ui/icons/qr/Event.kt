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

internal val Event: ImageVector
    get() {
        if (_event != null) {
            return _event!!
        }
        _event = Builder(
            name = "Event",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFF7D45)),
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
                fill = SolidColor(Color(0xFFFF7D45)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(41.8409f, 49.0f)
                curveTo(40.4803f, 49.0f, 39.3333f, 48.5303f, 38.4f, 47.5909f)
                curveTo(37.4667f, 46.6514f, 37.0f, 45.5014f, 37.0f, 44.1409f)
                curveTo(37.0f, 42.7803f, 37.4697f, 41.6333f, 38.4091f, 40.7f)
                curveTo(39.3486f, 39.7667f, 40.4986f, 39.3f, 41.8591f, 39.3f)
                curveTo(43.2197f, 39.3f, 44.3667f, 39.7697f, 45.3f, 40.7092f)
                curveTo(46.2333f, 41.6486f, 46.7f, 42.7986f, 46.7f, 44.1591f)
                curveTo(46.7f, 45.5197f, 46.2303f, 46.6667f, 45.2909f, 47.6f)
                curveTo(44.3514f, 48.5333f, 43.2014f, 49.0f, 41.8409f, 49.0f)
                close()
                moveTo(21.0f, 56.0f)
                curveTo(20.2f, 56.0f, 19.5f, 55.7f, 18.9f, 55.1f)
                curveTo(18.3f, 54.5f, 18.0f, 53.8f, 18.0f, 53.0f)
                verticalLineTo(22.0f)
                curveTo(18.0f, 21.2f, 18.3f, 20.5f, 18.9f, 19.9f)
                curveTo(19.5f, 19.3f, 20.2f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(24.25f)
                verticalLineTo(17.6f)
                curveTo(24.25f, 17.1467f, 24.4033f, 16.7667f, 24.71f, 16.46f)
                curveTo(25.0167f, 16.1533f, 25.3967f, 16.0f, 25.85f, 16.0f)
                curveTo(26.3175f, 16.0f, 26.7094f, 16.1533f, 27.0257f, 16.46f)
                curveTo(27.3419f, 16.7667f, 27.5f, 17.1467f, 27.5f, 17.6f)
                verticalLineTo(19.0f)
                horizontalLineTo(44.5f)
                verticalLineTo(17.6f)
                curveTo(44.5f, 17.1467f, 44.6533f, 16.7667f, 44.96f, 16.46f)
                curveTo(45.2667f, 16.1533f, 45.6467f, 16.0f, 46.1f, 16.0f)
                curveTo(46.5675f, 16.0f, 46.9594f, 16.1533f, 47.2757f, 16.46f)
                curveTo(47.5919f, 16.7667f, 47.75f, 17.1467f, 47.75f, 17.6f)
                verticalLineTo(19.0f)
                horizontalLineTo(51.0f)
                curveTo(51.8f, 19.0f, 52.5f, 19.3f, 53.1f, 19.9f)
                curveTo(53.7f, 20.5f, 54.0f, 21.2f, 54.0f, 22.0f)
                verticalLineTo(53.0f)
                curveTo(54.0f, 53.8f, 53.7f, 54.5f, 53.1f, 55.1f)
                curveTo(52.5f, 55.7f, 51.8f, 56.0f, 51.0f, 56.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.0f, 53.0f)
                horizontalLineTo(51.0f)
                verticalLineTo(31.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(53.0f)
                close()
            }
        }.build()
        return _event!!
    }

private var _event: ImageVector? = null
