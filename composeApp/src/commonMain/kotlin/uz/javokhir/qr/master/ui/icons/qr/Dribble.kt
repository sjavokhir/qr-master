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

internal val Dribble: ImageVector
    get() {
        if (_dribble != null) {
            return _dribble!!
        }
        _dribble = Builder(
            name = "Dribble",
            defaultWidth = 72.0.dp,
            defaultHeight = 73.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 73.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFB2215A)),
                stroke = null,
                fillAlpha = 0.1f,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(0.0f, 0.0573f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(-72.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE74D89)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(36.1938f, 17.8776f)
                curveTo(46.3423f, 17.8776f, 54.5533f, 26.0886f, 54.5533f, 36.2217f)
                curveTo(54.5533f, 46.3548f, 46.3423f, 54.5813f, 36.1938f, 54.5813f)
                curveTo(26.0453f, 54.5813f, 17.8342f, 46.3702f, 17.8342f, 36.2371f)
                curveTo(17.8342f, 26.104f, 26.0453f, 17.8776f, 36.1938f, 17.8776f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB2215A)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(36.1953f, 55.8884f)
                curveTo(25.3395f, 55.8884f, 16.5134f, 47.0777f, 16.5134f, 36.2372f)
                curveTo(16.5134f, 25.3814f, 25.3395f, 16.5707f, 36.1953f, 16.5707f)
                curveTo(47.0512f, 16.5707f, 55.8773f, 25.3814f, 55.8773f, 36.2219f)
                curveTo(55.8773f, 47.0623f, 47.0512f, 55.8884f, 36.1953f, 55.8884f)
                close()
                moveTo(52.7866f, 38.9127f)
                curveTo(52.2177f, 38.7282f, 47.5893f, 37.3597f, 42.3152f, 38.1901f)
                curveTo(44.514f, 44.2176f, 45.4059f, 49.1381f, 45.575f, 50.153f)
                curveTo(49.3576f, 47.6158f, 52.0485f, 43.5872f, 52.7866f, 38.9127f)
                close()
                moveTo(42.7611f, 51.706f)
                curveTo(42.5151f, 50.2298f, 41.531f, 45.0941f, 39.1784f, 38.9743f)
                curveTo(39.1476f, 38.9896f, 39.1015f, 39.005f, 39.0707f, 39.005f)
                curveTo(29.5835f, 42.311f, 26.1852f, 48.8767f, 25.8777f, 49.4918f)
                curveTo(28.7224f, 51.706f, 32.3051f, 53.0284f, 36.1953f, 53.0284f)
                curveTo(38.5172f, 53.0437f, 40.7468f, 52.5671f, 42.7611f, 51.706f)
                close()
                moveTo(23.7096f, 47.4775f)
                curveTo(24.094f, 46.8316f, 28.707f, 39.2049f, 37.3793f, 36.391f)
                curveTo(37.5946f, 36.3141f, 37.8253f, 36.2526f, 38.0405f, 36.1911f)
                curveTo(37.6254f, 35.2378f, 37.1641f, 34.2844f, 36.672f, 33.3465f)
                curveTo(28.2765f, 35.8528f, 20.1269f, 35.7452f, 19.3888f, 35.7298f)
                curveTo(19.3888f, 35.899f, 19.3735f, 36.0681f, 19.3735f, 36.2372f)
                curveTo(19.3888f, 40.558f, 21.0187f, 44.4944f, 23.7096f, 47.4775f)
                close()
                moveTo(19.7425f, 32.8083f)
                curveTo(20.4959f, 32.8237f, 27.4154f, 32.8544f, 35.2881f, 30.7632f)
                curveTo(32.505f, 25.812f, 29.4912f, 21.6603f, 29.0606f, 21.0606f)
                curveTo(24.3401f, 23.2748f, 20.8342f, 27.611f, 19.7425f, 32.8083f)
                close()
                moveTo(32.259f, 19.9228f)
                curveTo(32.7203f, 20.5378f, 35.7802f, 24.6895f, 38.5326f, 29.7484f)
                curveTo(44.514f, 27.5034f, 47.0358f, 24.1206f, 47.3433f, 23.69f)
                curveTo(44.3756f, 21.0606f, 40.47f, 19.4615f, 36.1953f, 19.4615f)
                curveTo(34.8422f, 19.4615f, 33.5198f, 19.6306f, 32.259f, 19.9228f)
                close()
                moveTo(49.2039f, 25.6275f)
                curveTo(48.8502f, 26.1041f, 46.0363f, 29.7176f, 39.8242f, 32.2547f)
                curveTo(40.2086f, 33.0543f, 40.593f, 33.8693f, 40.9467f, 34.6842f)
                curveTo(41.0697f, 34.9764f, 41.1927f, 35.2685f, 41.3157f, 35.5453f)
                curveTo(46.9128f, 34.838f, 52.4637f, 35.9758f, 53.0172f, 36.0835f)
                curveTo(52.9711f, 32.1317f, 51.5565f, 28.4875f, 49.2039f, 25.6275f)
                close()
            }
        }.build()
        return _dribble!!
    }

private var _dribble: ImageVector? = null
