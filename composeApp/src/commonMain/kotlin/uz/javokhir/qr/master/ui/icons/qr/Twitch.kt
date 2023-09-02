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

internal val Twitch: ImageVector
    get() {
        if (_twitch != null) {
            return _twitch!!
        }
        _twitch = Builder(
            name = "Twitch",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9146FF)),
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
                fill = SolidColor(Color(0xFF9146FF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(45.8049f, 38.2744f)
                lineTo(40.6146f, 43.0857f)
                horizontalLineTo(35.4242f)
                lineTo(30.8826f, 47.2955f)
                verticalLineTo(43.0857f)
                horizontalLineTo(25.0435f)
                verticalLineTo(25.0435f)
                horizontalLineTo(45.8049f)
                verticalLineTo(38.2744f)
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
                moveTo(27.7826f, 20.3478f)
                lineTo(26.2174f, 21.913f)
                lineTo(23.4783f, 39.5217f)
                lineTo(31.6957f, 43.8261f)
                lineTo(32.8696f, 45.3913f)
                lineTo(40.6957f, 42.6522f)
                lineTo(49.3044f, 36.0f)
                lineTo(49.6957f, 29.7391f)
                lineTo(49.3044f, 20.7391f)
                lineTo(48.1304f, 20.3478f)
                horizontalLineTo(27.7826f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9146FF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(26.8358f, 18.7826f)
                lineTo(20.3478f, 24.7967f)
                verticalLineTo(46.4474f)
                horizontalLineTo(28.1334f)
                verticalLineTo(52.4614f)
                lineTo(34.6213f, 46.4474f)
                horizontalLineTo(39.8117f)
                lineTo(51.49f, 35.622f)
                verticalLineTo(18.7826f)
                horizontalLineTo(26.8358f)
                close()
                moveTo(48.8948f, 34.4192f)
                lineTo(43.7045f, 39.2305f)
                horizontalLineTo(38.5141f)
                lineTo(33.9725f, 43.4403f)
                verticalLineTo(39.2305f)
                horizontalLineTo(28.1334f)
                verticalLineTo(21.1882f)
                horizontalLineTo(48.8948f)
                verticalLineTo(34.4192f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9146FF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(45.0028f, 25.3981f)
                horizontalLineTo(42.4076f)
                verticalLineTo(32.615f)
                horizontalLineTo(45.0028f)
                verticalLineTo(25.3981f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9146FF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(37.8676f, 25.3981f)
                horizontalLineTo(35.2724f)
                verticalLineTo(32.615f)
                horizontalLineTo(37.8676f)
                verticalLineTo(25.3981f)
                close()
            }
        }.build()
        return _twitch!!
    }

private var _twitch: ImageVector? = null
