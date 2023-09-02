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

internal val Twitch: ImageVector
    get() {
        if (_twitch != null) {
            return _twitch!!
        }
        _twitch = Builder(
            name = "Twitch",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9147FF)),
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
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.4167f, 11.0f)
                lineTo(11.0f, 16.5357f)
                verticalLineTo(36.4643f)
                horizontalLineTo(17.5f)
                verticalLineTo(42.0f)
                lineTo(22.9167f, 36.4643f)
                horizontalLineTo(27.25f)
                lineTo(37.0f, 26.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.4167f)
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
                moveTo(30.5f, 29.8214f)
                lineTo(34.8333f, 25.3929f)
                verticalLineTo(13.2143f)
                horizontalLineTo(17.5f)
                verticalLineTo(29.8214f)
                horizontalLineTo(21.8333f)
                verticalLineTo(34.25f)
                lineTo(26.1667f, 29.8214f)
                horizontalLineTo(30.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(26.1667f, 17.6429f)
                horizontalLineTo(24.0f)
                verticalLineTo(24.2857f)
                horizontalLineTo(26.1667f)
                verticalLineTo(17.6429f)
                close()
                moveTo(31.5833f, 24.2857f)
                verticalLineTo(17.6429f)
                horizontalLineTo(29.4167f)
                verticalLineTo(24.2857f)
                horizontalLineTo(31.5833f)
                close()
            }
        }.build()
        return _twitch!!
    }

private var _twitch: ImageVector? = null
