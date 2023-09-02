package uz.javokhir.qr.master.ui.icons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val Patreon: ImageVector
    get() {
        if (_icLogoPatreon != null) {
            return _icLogoPatreon!!
        }
        _icLogoPatreon = Builder(
            name = "IcLogoPatreon",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            group {}
            group {
                path(
                    fill = SolidColor(Color(0xFFffffff)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(24.0f, 0.0f)
                    curveTo(30.3652f, 0.0f, 36.4697f, 2.5286f, 40.9706f, 7.0294f)
                    curveTo(45.4714f, 11.5303f, 48.0f, 17.6348f, 48.0f, 24.0f)
                    curveTo(48.0f, 30.3652f, 45.4714f, 36.4697f, 40.9706f, 40.9706f)
                    curveTo(36.4697f, 45.4714f, 30.3652f, 48.0f, 24.0f, 48.0f)
                    curveTo(17.6348f, 48.0f, 11.5303f, 45.4714f, 7.0294f, 40.9706f)
                    curveTo(2.5286f, 36.4697f, 0.0f, 30.3652f, 0.0f, 24.0f)
                    curveTo(0.0f, 17.6348f, 2.5286f, 11.5303f, 7.0294f, 7.0294f)
                    curveTo(11.5303f, 2.5286f, 17.6348f, 0.0f, 24.0f, 0.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFFF424D)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd
                ) {
                    moveTo(48.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(48.0f)
                    horizontalLineTo(48.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(17.4336f, 33.6f)
                    horizontalLineTo(13.92f)
                    verticalLineTo(14.4f)
                    horizontalLineTo(17.4336f)
                    verticalLineTo(33.6f)
                    close()
                    moveTo(19.536f, 21.6096f)
                    curveTo(19.536f, 17.6352f, 22.7616f, 14.4f, 26.7312f, 14.4f)
                    curveTo(30.6816f, 14.4f, 33.9024f, 17.6352f, 33.9024f, 21.6096f)
                    curveTo(33.9024f, 25.5696f, 30.6816f, 28.7952f, 26.7312f, 28.7952f)
                    curveTo(22.7616f, 28.7952f, 19.536f, 25.5696f, 19.536f, 21.6096f)
                    close()
                }
            }
        }.build()
        return _icLogoPatreon!!
    }

private var _icLogoPatreon: ImageVector? = null
