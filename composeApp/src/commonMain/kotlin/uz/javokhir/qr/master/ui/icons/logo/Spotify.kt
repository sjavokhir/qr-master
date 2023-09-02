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

internal val Spotify: ImageVector
    get() {
        if (_spotify != null) {
            return _spotify!!
        }
        _spotify = Builder(
            name = "Spotify",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1ED760)),
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
                moveTo(38.1973f, 21.2764f)
                curveTo(39.2609f, 21.9097f, 40.6403f, 21.5583f, 41.2728f, 20.4916f)
                curveTo(41.9054f, 19.4264f, 41.5555f, 18.0487f, 40.4884f, 17.4153f)
                curveTo(31.5823f, 12.1287f, 17.4893f, 11.6313f, 9.0119f, 14.2051f)
                curveTo(7.8248f, 14.5658f, 7.1561f, 15.8189f, 7.5157f, 17.0056f)
                curveTo(7.8749f, 18.1916f, 9.1288f, 18.861f, 10.3147f, 18.501f)
                curveTo(17.7002f, 16.2597f, 30.4608f, 16.6822f, 38.1973f, 21.2764f)
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
                moveTo(37.9435f, 28.0813f)
                curveTo(38.4849f, 27.2025f, 38.2076f, 26.0507f, 37.3277f, 25.5086f)
                curveTo(29.9204f, 20.9568f, 19.0839f, 19.6749f, 10.3673f, 22.3206f)
                curveTo(9.379f, 22.6215f, 8.8214f, 23.6645f, 9.1192f, 24.654f)
                curveTo(9.4202f, 25.6414f, 10.4648f, 26.1991f, 11.4546f, 25.9001f)
                curveTo(19.0851f, 23.5845f, 28.9201f, 24.7328f, 35.3698f, 28.6975f)
                curveTo(36.2497f, 29.2381f, 37.4007f, 28.962f, 37.9435f, 28.0813f)
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
                moveTo(35.007f, 34.6166f)
                curveTo(35.438f, 33.9111f, 35.2159f, 32.9896f, 34.5111f, 32.5589f)
                curveTo(28.1846f, 28.6936f, 20.3428f, 27.7943f, 11.2002f, 29.8838f)
                curveTo(10.3933f, 30.0679f, 9.8908f, 30.8701f, 10.0752f, 31.6755f)
                curveTo(10.2593f, 32.4797f, 11.0612f, 32.9845f, 11.8662f, 32.8001f)
                curveTo(20.2209f, 30.8915f, 27.314f, 31.6697f, 32.9501f, 35.1141f)
                curveTo(33.6549f, 35.5451f, 34.576f, 35.3238f, 35.007f, 34.6166f)
                close()
            }
        }.build()
        return _spotify!!
    }

private var _spotify: ImageVector? = null
