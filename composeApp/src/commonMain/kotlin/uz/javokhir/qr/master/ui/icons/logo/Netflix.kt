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

internal val Netflix: ImageVector
    get() {
        if (_netflix != null) {
            return _netflix!!
        }
        _netflix = Builder(
            name = "Netflix",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF171717)),
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
                fill = SolidColor(Color(0xFFAF1F1F)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.0237f, 8.4055f)
                curveTo(15.9429f, 8.3737f, 15.1659f, 8.0657f, 15.0543f, 8.0214f)
                curveTo(15.0513f, 8.0202f, 15.0447f, 8.0175f, 15.0368f, 8.0144f)
                curveTo(15.024f, 8.0094f, 15.0291f, 8.0115f, 15.0229f, 8.0091f)
                curveTo(15.0094f, 8.0038f, 15.005f, 8.002f, 15.0002f, 8.0001f)
                curveTo(15.0002f, 8.239f, 15.0001f, 8.5927f, 15.0f, 8.971f)
                curveTo(15.0f, 9.4547f, 15.0f, 9.9684f, 15.0f, 10.2236f)
                curveTo(15.0f, 10.7158f, 15.0f, 11.9823f, 15.0f, 12.4503f)
                curveTo(15.0f, 13.3536f, 15.0f, 20.3161f, 15.0f, 20.8029f)
                curveTo(15.0f, 21.2769f, 15.0f, 39.4979f, 15.0f, 40.0f)
                curveTo(17.5531f, 39.7f, 18.8298f, 39.5833f, 21.427f, 39.4676f)
                curveTo(21.427f, 38.9805f, 21.427f, 34.1492f, 21.427f, 33.4446f)
                curveTo(21.427f, 29.377f, 21.427f, 26.5144f, 21.427f, 24.9365f)
                curveTo(21.427f, 24.2724f, 21.427f, 24.0264f, 21.427f, 23.3452f)
                curveTo(21.2303f, 22.8015f, 20.3981f, 20.4939f, 20.1851f, 19.9127f)
                curveTo(19.7872f, 18.8044f, 17.5222f, 12.5487f, 17.3412f, 12.0483f)
                curveTo(17.1788f, 11.5992f, 16.7267f, 10.351f, 16.583f, 9.9515f)
                curveTo(16.499f, 9.7205f, 16.2797f, 9.1156f, 16.1631f, 8.793f)
                curveTo(16.072f, 8.5408f, 16.0802f, 8.5615f, 16.0237f, 8.4055f)
            }
            path(
                fill = SolidColor(Color(0xFFAF1F1F)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(31.9765f, 39.5943f)
                curveTo(32.0573f, 39.626f, 32.8343f, 39.9342f, 32.9459f, 39.9786f)
                curveTo(32.9489f, 39.9797f, 32.9555f, 39.9822f, 32.9634f, 39.9854f)
                curveTo(32.9763f, 39.9904f, 32.9712f, 39.9883f, 32.9774f, 39.9907f)
                curveTo(32.9908f, 39.9961f, 32.9952f, 39.9979f, 33.0f, 39.9996f)
                curveTo(33.0001f, 39.7609f, 33.0002f, 39.4072f, 33.0002f, 39.0289f)
                curveTo(33.0002f, 38.545f, 33.0002f, 38.0315f, 33.0002f, 37.7763f)
                curveTo(33.0002f, 37.2842f, 33.0002f, 36.0174f, 33.0002f, 35.5495f)
                curveTo(33.0002f, 34.6463f, 33.0002f, 27.6839f, 33.0002f, 27.197f)
                curveTo(33.0002f, 26.7229f, 33.0002f, 8.5021f, 33.0002f, 8.0f)
                curveTo(32.4953f, 8.0f, 27.3875f, 8.0f, 26.5732f, 8.0f)
                curveTo(26.5732f, 8.4874f, 26.5732f, 13.8507f, 26.5732f, 14.5553f)
                curveTo(26.5732f, 18.6228f, 26.5732f, 21.4855f, 26.5732f, 23.0634f)
                curveTo(26.5732f, 23.7274f, 26.5732f, 23.9735f, 26.5732f, 24.6547f)
                curveTo(26.7699f, 25.1984f, 27.6021f, 27.506f, 27.8151f, 28.0871f)
                curveTo(28.2131f, 29.1955f, 30.478f, 35.4513f, 30.6591f, 35.9516f)
                curveTo(30.8214f, 36.4006f, 31.2735f, 37.6489f, 31.4172f, 38.0482f)
                curveTo(31.5012f, 38.2795f, 31.7205f, 38.8844f, 31.8371f, 39.2068f)
                curveTo(31.9282f, 39.4591f, 31.92f, 39.4385f, 31.9765f, 39.5943f)
            }
            path(
                fill = SolidColor(Color(0xFFE50914)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.4269f, 8.0f)
                horizontalLineTo(15.0f)
                lineTo(26.3805f, 39.4677f)
                curveTo(29.5787f, 39.5467f, 32.9999f, 40.0f, 32.9999f, 40.0f)
                lineTo(21.4269f, 8.0f)
            }
        }.build()
        return _netflix!!
    }

private var _netflix: ImageVector? = null
