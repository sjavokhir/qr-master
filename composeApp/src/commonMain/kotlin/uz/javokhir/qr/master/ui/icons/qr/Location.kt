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

internal val Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(
            name = "Location",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF006ED4)),
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
                fill = SolidColor(Color(0xFF006ED4)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(41.6f, 53.65f)
                lineTo(29.45f, 49.35f)
                lineTo(20.5f, 52.9f)
                curveTo(19.9333f, 53.2f, 19.375f, 53.1833f, 18.825f, 52.85f)
                curveTo(18.275f, 52.5167f, 18.0f, 52.0167f, 18.0f, 51.35f)
                verticalLineTo(23.45f)
                curveTo(18.0f, 23.0167f, 18.125f, 22.6333f, 18.375f, 22.3f)
                curveTo(18.625f, 21.9667f, 18.95f, 21.7167f, 19.35f, 21.55f)
                lineTo(28.45f, 18.35f)
                curveTo(28.7833f, 18.25f, 29.1167f, 18.2f, 29.45f, 18.2f)
                curveTo(29.7833f, 18.2f, 30.1167f, 18.25f, 30.45f, 18.35f)
                lineTo(42.6f, 22.6f)
                lineTo(51.5f, 19.05f)
                curveTo(52.0667f, 18.7833f, 52.625f, 18.8083f, 53.175f, 19.125f)
                curveTo(53.725f, 19.4417f, 54.0f, 19.9333f, 54.0f, 20.6f)
                verticalLineTo(48.85f)
                curveTo(54.0f, 49.2167f, 53.875f, 49.5333f, 53.625f, 49.8f)
                curveTo(53.375f, 50.0667f, 53.0667f, 50.2667f, 52.7f, 50.4f)
                lineTo(43.6f, 53.65f)
                curveTo(43.2667f, 53.75f, 42.9333f, 53.8f, 42.6f, 53.8f)
                curveTo(42.2667f, 53.8f, 41.9333f, 53.75f, 41.6f, 53.65f)
                close()
                moveTo(40.9f, 50.25f)
                verticalLineTo(25.0f)
                lineTo(31.1f, 21.7f)
                verticalLineTo(46.95f)
                lineTo(40.9f, 50.25f)
                close()
            }
        }.build()
        return _location!!
    }

private var _location: ImageVector? = null
