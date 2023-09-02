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

internal val Tumblr: ImageVector
    get() {
        if (_tumblr != null) {
            return _tumblr!!
        }
        _tumblr = Builder(
            name = "Tumblr",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF001935)),
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
                moveTo(31.0f, 38.0f)
                horizontalLineTo(26.2762f)
                curveTo(22.027f, 38.0f, 18.8606f, 35.8331f, 18.8606f, 30.6507f)
                verticalLineTo(22.3505f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.8552f)
                curveTo(19.2484f, 16.7627f, 21.0259f, 13.139f, 21.2301f, 10.0f)
                horizontalLineTo(25.6415f)
                verticalLineTo(17.1269f)
                horizontalLineTo(30.7897f)
                verticalLineTo(22.3505f)
                horizontalLineTo(25.6423f)
                verticalLineTo(29.5779f)
                curveTo(25.6423f, 31.744f, 26.7455f, 32.493f, 28.5017f, 32.493f)
                horizontalLineTo(30.9939f)
                lineTo(31.0f, 38.0f)
                close()
            }
        }.build()
        return _tumblr!!
    }

private var _tumblr: ImageVector? = null
