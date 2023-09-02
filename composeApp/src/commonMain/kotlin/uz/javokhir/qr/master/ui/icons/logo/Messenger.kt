package uz.javokhir.qr.master.ui.icons.logo

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.radialGradient
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

internal val Messenger: ImageVector
    get() {
        if (_messenger != null) {
            return _messenger!!
        }
        _messenger = Builder(
            name = "Messenger",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = radialGradient(
                    0.0f to Color(0xFF0099FF),
                    0.609754f to Color(0xFFA033FF),
                    0.934823f to Color(0xFFFF5280),
                    1.0f to Color(0xFFFF7061),
                    center = Offset(9.23877f, 47.7433f),
                    radius = 52.3006f
                ),
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
                pathFillType = EvenOdd
            ) {
                moveTo(8.0f, 23.52f)
                curveTo(8.0f, 14.6023f, 14.9867f, 8.0f, 24.0f, 8.0f)
                curveTo(33.0133f, 8.0f, 40.0f, 14.6023f, 40.0f, 23.52f)
                curveTo(40.0f, 32.4378f, 33.0133f, 39.0401f, 24.0f, 39.0401f)
                curveTo(22.3811f, 39.0401f, 20.8278f, 38.8263f, 19.3685f, 38.425f)
                curveTo(19.0848f, 38.3469f, 18.7831f, 38.369f, 18.5139f, 38.4877f)
                lineTo(15.3381f, 39.8897f)
                curveTo(14.5074f, 40.2564f, 13.5697f, 39.6657f, 13.5419f, 38.7578f)
                lineTo(13.4547f, 35.9117f)
                curveTo(13.444f, 35.561f, 13.2862f, 35.2333f, 13.0249f, 34.9994f)
                curveTo(9.9117f, 32.2153f, 8.0f, 28.1846f, 8.0f, 23.52f)
                close()
                moveTo(19.0921f, 20.6021f)
                lineTo(14.3921f, 28.0588f)
                curveTo(13.941f, 28.7744f, 14.8206f, 29.5808f, 15.4945f, 29.0694f)
                lineTo(20.543f, 25.2379f)
                curveTo(20.8845f, 24.9787f, 21.3565f, 24.9773f, 21.6994f, 25.2346f)
                lineTo(25.4377f, 28.0382f)
                curveTo(26.5594f, 28.8796f, 28.1603f, 28.5842f, 28.908f, 27.398f)
                lineTo(33.608f, 19.9413f)
                curveTo(34.0589f, 19.2257f, 33.1794f, 18.4193f, 32.5055f, 18.9306f)
                lineTo(27.457f, 22.7621f)
                curveTo(27.1154f, 23.0213f, 26.6435f, 23.0227f, 26.3005f, 22.7654f)
                lineTo(22.5624f, 19.9618f)
                curveTo(21.4406f, 19.1205f, 19.8397f, 19.4159f, 19.0921f, 20.6021f)
                close()
            }
        }.build()
        return _messenger!!
    }

private var _messenger: ImageVector? = null
