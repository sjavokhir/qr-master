package uz.javokhir.qr.master.ui.icons.qr

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.radialGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val Instagram: ImageVector
    get() {
        if (_instagram != null) {
            return _instagram!!
        }
        _instagram = Builder(
            name = "Instagram",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFDE5C99)),
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
                fill = radialGradient(
                    0.09f to Color(0xFFFA8F21),
                    0.78f to Color(0xFFD82D7E),
                    center = Offset(21.7402f, 56.0169f),
                    radius = 51.3568f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(29.6282f, 36.1723f)
                curveTo(29.6282f, 32.5533f, 32.5629f, 29.6188f, 36.1841f, 29.6188f)
                curveTo(39.8052f, 29.6188f, 42.7415f, 32.5533f, 42.7415f, 36.1723f)
                curveTo(42.7415f, 39.7912f, 39.8052f, 42.7258f, 36.1841f, 42.7258f)
                curveTo(32.5629f, 42.7258f, 29.6282f, 39.7912f, 29.6282f, 36.1723f)
                close()
                moveTo(26.0834f, 36.1723f)
                curveTo(26.0834f, 41.7475f, 30.6055f, 46.2669f, 36.1841f, 46.2669f)
                curveTo(41.7627f, 46.2669f, 46.2847f, 41.7475f, 46.2847f, 36.1723f)
                curveTo(46.2847f, 30.597f, 41.7627f, 26.0777f, 36.1841f, 26.0777f)
                curveTo(30.6055f, 26.0777f, 26.0834f, 30.597f, 26.0834f, 36.1723f)
                close()
                moveTo(44.3241f, 25.6774f)
                curveTo(44.3239f, 26.144f, 44.4622f, 26.6002f, 44.7214f, 26.9882f)
                curveTo(44.9806f, 27.3763f, 45.3491f, 27.6788f, 45.7804f, 27.8575f)
                curveTo(46.2116f, 28.0362f, 46.6862f, 28.0831f, 47.1442f, 27.9923f)
                curveTo(47.6021f, 27.9015f, 48.0228f, 27.6769f, 48.353f, 27.3472f)
                curveTo(48.6833f, 27.0174f, 48.9083f, 26.5971f, 48.9995f, 26.1395f)
                curveTo(49.0908f, 25.682f, 49.0442f, 25.2076f, 48.8657f, 24.7765f)
                curveTo(48.6872f, 24.3453f, 48.3848f, 23.9768f, 47.9968f, 23.7174f)
                curveTo(47.6087f, 23.458f, 47.1524f, 23.3195f, 46.6855f, 23.3193f)
                horizontalLineTo(46.6846f)
                curveTo(46.0588f, 23.3196f, 45.4587f, 23.5681f, 45.0161f, 24.0103f)
                curveTo(44.5735f, 24.4524f, 44.3246f, 25.052f, 44.3241f, 25.6774f)
                close()
                moveTo(28.2371f, 52.1741f)
                curveTo(26.3193f, 52.0868f, 25.2769f, 51.7676f, 24.5842f, 51.4978f)
                curveTo(23.6658f, 51.1405f, 23.0106f, 50.715f, 22.3216f, 50.0274f)
                curveTo(21.6327f, 49.3398f, 21.2062f, 48.6855f, 20.8503f, 47.7677f)
                curveTo(20.5802f, 47.0757f, 20.2608f, 46.0336f, 20.1736f, 44.117f)
                curveTo(20.0782f, 42.0448f, 20.0592f, 41.4223f, 20.0592f, 36.1724f)
                curveTo(20.0592f, 30.9226f, 20.0798f, 30.3018f, 20.1736f, 28.2279f)
                curveTo(20.2609f, 26.3112f, 20.5827f, 25.2712f, 20.8503f, 24.5772f)
                curveTo(21.2078f, 23.6593f, 21.6336f, 23.0045f, 22.3216f, 22.3159f)
                curveTo(23.0096f, 21.6274f, 23.6643f, 21.2012f, 24.5842f, 20.8455f)
                curveTo(25.2766f, 20.5756f, 26.3193f, 20.2563f, 28.2371f, 20.1692f)
                curveTo(30.3106f, 20.0739f, 30.9334f, 20.0549f, 36.1841f, 20.0549f)
                curveTo(41.4347f, 20.0549f, 42.0582f, 20.0755f, 44.1334f, 20.1692f)
                curveTo(46.0512f, 20.2565f, 47.0918f, 20.5781f, 47.7863f, 20.8455f)
                curveTo(48.7047f, 21.2012f, 49.3599f, 21.6283f, 50.0489f, 22.3159f)
                curveTo(50.7378f, 23.0035f, 51.1627f, 23.6593f, 51.5203f, 24.5772f)
                curveTo(51.7903f, 25.2692f, 52.1097f, 26.3112f, 52.1969f, 28.2279f)
                curveTo(52.2923f, 30.3018f, 52.3113f, 30.9226f, 52.3113f, 36.1724f)
                curveTo(52.3113f, 41.4223f, 52.2923f, 42.043f, 52.1969f, 44.117f)
                curveTo(52.1096f, 46.0336f, 51.7886f, 47.0754f, 51.5203f, 47.7677f)
                curveTo(51.1627f, 48.6855f, 50.7369f, 49.3404f, 50.0489f, 50.0274f)
                curveTo(49.3609f, 50.7143f, 48.7047f, 51.1405f, 47.7863f, 51.4978f)
                curveTo(47.0939f, 51.7677f, 46.0512f, 52.087f, 44.1334f, 52.1741f)
                curveTo(42.0599f, 52.2694f, 41.4371f, 52.2884f, 36.1841f, 52.2884f)
                curveTo(30.9311f, 52.2884f, 30.3099f, 52.2694f, 28.2371f, 52.1741f)
                close()
                moveTo(28.0743f, 16.6325f)
                curveTo(25.9802f, 16.7278f, 24.5493f, 17.0596f, 23.2996f, 17.5456f)
                curveTo(22.0055f, 18.0474f, 20.9099f, 18.7207f, 19.8151f, 19.8131f)
                curveTo(18.7203f, 20.9055f, 18.0484f, 22.0022f, 17.5462f, 23.2956f)
                curveTo(17.06f, 24.5452f, 16.7279f, 25.9745f, 16.6326f, 28.0673f)
                curveTo(16.5356f, 30.1634f, 16.5134f, 30.8336f, 16.5134f, 36.1723f)
                curveTo(16.5134f, 41.511f, 16.5356f, 42.1811f, 16.6326f, 44.2772f)
                curveTo(16.7279f, 46.3702f, 17.06f, 47.7993f, 17.5462f, 49.049f)
                curveTo(18.0484f, 50.3416f, 18.7205f, 51.4395f, 19.8151f, 52.5314f)
                curveTo(20.9097f, 53.6234f, 22.0055f, 54.2957f, 23.2996f, 54.799f)
                curveTo(24.5516f, 55.2849f, 25.9802f, 55.6168f, 28.0743f, 55.7121f)
                curveTo(30.1727f, 55.8074f, 30.8422f, 55.8311f, 36.1841f, 55.8311f)
                curveTo(41.526f, 55.8311f, 42.1965f, 55.809f, 44.2939f, 55.7121f)
                curveTo(46.3881f, 55.6168f, 47.8181f, 55.2849f, 49.0685f, 54.799f)
                curveTo(50.3619f, 54.2957f, 51.4583f, 53.6238f, 52.553f, 52.5314f)
                curveTo(53.6478f, 51.439f, 54.3184f, 50.3416f, 54.8219f, 49.049f)
                curveTo(55.3082f, 47.7993f, 55.6418f, 46.37f, 55.7356f, 44.2772f)
                curveTo(55.831f, 42.1796f, 55.8531f, 41.511f, 55.8531f, 36.1723f)
                curveTo(55.8531f, 30.8336f, 55.831f, 30.1634f, 55.7356f, 28.0673f)
                curveTo(55.6402f, 25.9744f, 55.3082f, 24.5445f, 54.8219f, 23.2956f)
                curveTo(54.3184f, 22.003f, 53.6461f, 20.9073f, 52.553f, 19.8131f)
                curveTo(51.46f, 18.719f, 50.3619f, 18.0474f, 49.0701f, 17.5456f)
                curveTo(47.8181f, 17.0596f, 46.3879f, 16.7262f, 44.2955f, 16.6325f)
                curveTo(42.1981f, 16.5372f, 41.5276f, 16.5134f, 36.1856f, 16.5134f)
                curveTo(30.8437f, 16.5134f, 30.1727f, 16.5356f, 28.0743f, 16.6325f)
                close()
            }
            path(
                fill = radialGradient(
                    0.64f to Color(0x008C3AAA),
                    1.0f to Color(0xFF8C3AAA),
                    center = Offset(40.3722f, 57.7783f),
                    radius = 40.4762f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(29.6282f, 36.1723f)
                curveTo(29.6282f, 32.5533f, 32.5629f, 29.6188f, 36.1841f, 29.6188f)
                curveTo(39.8052f, 29.6188f, 42.7415f, 32.5533f, 42.7415f, 36.1723f)
                curveTo(42.7415f, 39.7912f, 39.8052f, 42.7258f, 36.1841f, 42.7258f)
                curveTo(32.5629f, 42.7258f, 29.6282f, 39.7912f, 29.6282f, 36.1723f)
                close()
                moveTo(26.0834f, 36.1723f)
                curveTo(26.0834f, 41.7475f, 30.6055f, 46.2669f, 36.1841f, 46.2669f)
                curveTo(41.7627f, 46.2669f, 46.2847f, 41.7475f, 46.2847f, 36.1723f)
                curveTo(46.2847f, 30.597f, 41.7627f, 26.0777f, 36.1841f, 26.0777f)
                curveTo(30.6055f, 26.0777f, 26.0834f, 30.597f, 26.0834f, 36.1723f)
                close()
                moveTo(44.3241f, 25.6774f)
                curveTo(44.3239f, 26.144f, 44.4622f, 26.6002f, 44.7214f, 26.9882f)
                curveTo(44.9806f, 27.3763f, 45.3491f, 27.6788f, 45.7804f, 27.8575f)
                curveTo(46.2116f, 28.0362f, 46.6862f, 28.0831f, 47.1442f, 27.9923f)
                curveTo(47.6021f, 27.9015f, 48.0228f, 27.6769f, 48.353f, 27.3472f)
                curveTo(48.6833f, 27.0174f, 48.9083f, 26.5971f, 48.9995f, 26.1395f)
                curveTo(49.0908f, 25.682f, 49.0442f, 25.2076f, 48.8657f, 24.7765f)
                curveTo(48.6872f, 24.3453f, 48.3848f, 23.9768f, 47.9968f, 23.7174f)
                curveTo(47.6087f, 23.458f, 47.1524f, 23.3195f, 46.6855f, 23.3193f)
                horizontalLineTo(46.6846f)
                curveTo(46.0588f, 23.3196f, 45.4587f, 23.5681f, 45.0161f, 24.0103f)
                curveTo(44.5735f, 24.4524f, 44.3246f, 25.052f, 44.3241f, 25.6774f)
                close()
                moveTo(28.2371f, 52.1741f)
                curveTo(26.3193f, 52.0868f, 25.2769f, 51.7676f, 24.5842f, 51.4978f)
                curveTo(23.6658f, 51.1405f, 23.0106f, 50.715f, 22.3216f, 50.0274f)
                curveTo(21.6327f, 49.3398f, 21.2062f, 48.6855f, 20.8503f, 47.7677f)
                curveTo(20.5802f, 47.0757f, 20.2608f, 46.0336f, 20.1736f, 44.117f)
                curveTo(20.0782f, 42.0448f, 20.0592f, 41.4223f, 20.0592f, 36.1724f)
                curveTo(20.0592f, 30.9226f, 20.0798f, 30.3018f, 20.1736f, 28.2279f)
                curveTo(20.2609f, 26.3112f, 20.5827f, 25.2712f, 20.8503f, 24.5772f)
                curveTo(21.2078f, 23.6593f, 21.6336f, 23.0045f, 22.3216f, 22.3159f)
                curveTo(23.0096f, 21.6274f, 23.6643f, 21.2012f, 24.5842f, 20.8455f)
                curveTo(25.2766f, 20.5756f, 26.3193f, 20.2563f, 28.2371f, 20.1692f)
                curveTo(30.3106f, 20.0739f, 30.9334f, 20.0549f, 36.1841f, 20.0549f)
                curveTo(41.4347f, 20.0549f, 42.0582f, 20.0755f, 44.1334f, 20.1692f)
                curveTo(46.0512f, 20.2565f, 47.0918f, 20.5781f, 47.7863f, 20.8455f)
                curveTo(48.7047f, 21.2012f, 49.3599f, 21.6283f, 50.0489f, 22.3159f)
                curveTo(50.7378f, 23.0035f, 51.1627f, 23.6593f, 51.5203f, 24.5772f)
                curveTo(51.7903f, 25.2692f, 52.1097f, 26.3112f, 52.1969f, 28.2279f)
                curveTo(52.2923f, 30.3018f, 52.3113f, 30.9226f, 52.3113f, 36.1724f)
                curveTo(52.3113f, 41.4223f, 52.2923f, 42.043f, 52.1969f, 44.117f)
                curveTo(52.1096f, 46.0336f, 51.7886f, 47.0754f, 51.5203f, 47.7677f)
                curveTo(51.1627f, 48.6855f, 50.7369f, 49.3404f, 50.0489f, 50.0274f)
                curveTo(49.3609f, 50.7143f, 48.7047f, 51.1405f, 47.7863f, 51.4978f)
                curveTo(47.0939f, 51.7677f, 46.0512f, 52.087f, 44.1334f, 52.1741f)
                curveTo(42.0599f, 52.2694f, 41.4371f, 52.2884f, 36.1841f, 52.2884f)
                curveTo(30.9311f, 52.2884f, 30.3099f, 52.2694f, 28.2371f, 52.1741f)
                close()
                moveTo(28.0743f, 16.6325f)
                curveTo(25.9802f, 16.7278f, 24.5493f, 17.0596f, 23.2996f, 17.5456f)
                curveTo(22.0055f, 18.0474f, 20.9099f, 18.7207f, 19.8151f, 19.8131f)
                curveTo(18.7203f, 20.9055f, 18.0484f, 22.0022f, 17.5462f, 23.2956f)
                curveTo(17.06f, 24.5452f, 16.7279f, 25.9745f, 16.6326f, 28.0673f)
                curveTo(16.5356f, 30.1634f, 16.5134f, 30.8336f, 16.5134f, 36.1723f)
                curveTo(16.5134f, 41.511f, 16.5356f, 42.1811f, 16.6326f, 44.2772f)
                curveTo(16.7279f, 46.3702f, 17.06f, 47.7993f, 17.5462f, 49.049f)
                curveTo(18.0484f, 50.3416f, 18.7205f, 51.4395f, 19.8151f, 52.5314f)
                curveTo(20.9097f, 53.6234f, 22.0055f, 54.2957f, 23.2996f, 54.799f)
                curveTo(24.5516f, 55.2849f, 25.9802f, 55.6168f, 28.0743f, 55.7121f)
                curveTo(30.1727f, 55.8074f, 30.8422f, 55.8311f, 36.1841f, 55.8311f)
                curveTo(41.526f, 55.8311f, 42.1965f, 55.809f, 44.2939f, 55.7121f)
                curveTo(46.3881f, 55.6168f, 47.8181f, 55.2849f, 49.0685f, 54.799f)
                curveTo(50.3619f, 54.2957f, 51.4583f, 53.6238f, 52.553f, 52.5314f)
                curveTo(53.6478f, 51.439f, 54.3184f, 50.3416f, 54.8219f, 49.049f)
                curveTo(55.3082f, 47.7993f, 55.6418f, 46.37f, 55.7356f, 44.2772f)
                curveTo(55.831f, 42.1796f, 55.8531f, 41.511f, 55.8531f, 36.1723f)
                curveTo(55.8531f, 30.8336f, 55.831f, 30.1634f, 55.7356f, 28.0673f)
                curveTo(55.6402f, 25.9744f, 55.3082f, 24.5445f, 54.8219f, 23.2956f)
                curveTo(54.3184f, 22.003f, 53.6461f, 20.9073f, 52.553f, 19.8131f)
                curveTo(51.46f, 18.719f, 50.3619f, 18.0474f, 49.0701f, 17.5456f)
                curveTo(47.8181f, 17.0596f, 46.3879f, 16.7262f, 44.2955f, 16.6325f)
                curveTo(42.1981f, 16.5372f, 41.5276f, 16.5134f, 36.1856f, 16.5134f)
                curveTo(30.8437f, 16.5134f, 30.1727f, 16.5356f, 28.0743f, 16.6325f)
                close()
            }
        }.build()
        return _instagram!!
    }

private var _instagram: ImageVector? = null
