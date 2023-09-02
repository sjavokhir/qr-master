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

internal val Amazon: ImageVector
    get() {
        if (_amazon != null) {
            return _amazon!!
        }
        _amazon = Builder(
            name = "Amazon",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF131921)),
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
                fill = SolidColor(Color(0xFFFF9900)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(35.6092f, 31.8851f)
                curveTo(36.7414f, 31.7457f, 38.5404f, 31.8318f, 38.8945f, 32.2937f)
                horizontalLineTo(38.8944f)
                curveTo(39.1635f, 32.6454f, 38.8855f, 34.226f, 38.4295f, 35.3591f)
                curveTo(37.9705f, 36.486f, 37.2863f, 37.2824f, 36.9084f, 37.5899f)
                curveTo(36.5253f, 37.8975f, 36.2433f, 37.7784f, 36.4473f, 37.3165f)
                curveTo(36.6585f, 36.8546f, 37.8145f, 33.9908f, 37.3564f, 33.3896f)
                curveTo(36.932f, 32.8339f, 35.0068f, 33.0351f, 34.1125f, 33.1286f)
                curveTo(34.046f, 33.1355f, 33.9852f, 33.1419f, 33.9311f, 33.1473f)
                curveTo(33.7422f, 33.1643f, 33.5899f, 33.1813f, 33.4666f, 33.1951f)
                curveTo(33.0816f, 33.2381f, 32.9787f, 33.2496f, 32.9212f, 33.1313f)
                curveTo(32.7732f, 32.7145f, 34.4753f, 32.0203f, 35.6092f, 31.8851f)
                close()
                moveTo(8.8686f, 32.3482f)
                curveTo(14.1174f, 35.5537f, 22.2419f, 40.5154f, 35.1914f, 34.3422f)
                horizontalLineTo(35.1912f)
                curveTo(35.7493f, 34.1089f, 36.1394f, 34.4985f, 35.5872f, 35.2047f)
                curveTo(35.0312f, 35.917f, 30.587f, 40.0f, 23.1167f, 40.0f)
                curveTo(15.6514f, 40.0f, 9.9322f, 34.8912f, 8.1871f, 32.7716f)
                curveTo(7.7091f, 32.2217f, 8.26f, 31.9733f, 8.5842f, 32.1746f)
                curveTo(8.678f, 32.2318f, 8.7728f, 32.2897f, 8.8686f, 32.3482f)
                close()
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
                moveTo(30.3481f, 10.0614f)
                curveTo(28.7205f, 8.5369f, 26.0669f, 8.0f, 24.0307f, 8.0f)
                curveTo(20.0124f, 8.0f, 15.5246f, 9.5006f, 14.5795f, 14.4782f)
                curveTo(14.4844f, 15.0082f, 14.8648f, 15.288f, 15.2095f, 15.3655f)
                lineTo(19.3111f, 15.8061f)
                curveTo(19.6915f, 15.7882f, 19.9708f, 15.4131f, 20.0422f, 15.0319f)
                curveTo(20.3929f, 13.3171f, 21.8315f, 12.4895f, 23.4423f, 12.4895f)
                curveTo(24.3102f, 12.4895f, 25.297f, 12.8111f, 25.8142f, 13.5911f)
                curveTo(26.2967f, 14.3039f, 26.3316f, 15.2329f, 26.3286f, 16.0991f)
                lineTo(26.3283f, 16.1624f)
                lineTo(26.3277f, 16.2568f)
                lineTo(26.3263f, 16.4436f)
                lineTo(26.3259f, 16.5052f)
                lineTo(26.3256f, 16.5664f)
                lineTo(26.3254f, 16.6575f)
                verticalLineTo(17.2053f)
                curveTo(26.056f, 17.2361f, 25.7775f, 17.2657f, 25.492f, 17.2952f)
                lineTo(25.3356f, 17.3114f)
                lineTo(24.7787f, 17.3685f)
                lineTo(24.6171f, 17.3852f)
                curveTo(22.5106f, 17.604f, 20.1675f, 17.8864f, 18.3778f, 18.676f)
                curveTo(15.7327f, 19.8192f, 13.8721f, 22.1592f, 13.8721f, 25.5948f)
                curveTo(13.8721f, 29.9949f, 16.6421f, 32.1921f, 20.1968f, 32.1921f)
                curveTo(23.2046f, 32.1921f, 24.8453f, 31.4836f, 27.1635f, 29.1137f)
                curveTo(27.2021f, 29.1694f, 27.2395f, 29.2237f, 27.2757f, 29.2766f)
                lineTo(27.3187f, 29.3396f)
                lineTo(27.3398f, 29.3706f)
                lineTo(27.3813f, 29.4318f)
                lineTo(27.422f, 29.492f)
                lineTo(27.5588f, 29.6947f)
                lineTo(27.5967f, 29.7507f)
                lineTo(27.6341f, 29.8059f)
                lineTo(27.6527f, 29.8332f)
                lineTo(27.6896f, 29.8874f)
                curveTo(28.144f, 30.5512f, 28.5507f, 31.0725f, 29.5888f, 31.936f)
                curveTo(29.9006f, 32.1012f, 30.2999f, 32.0852f, 30.579f, 31.8423f)
                lineTo(30.5873f, 31.8349f)
                lineTo(30.5992f, 31.8468f)
                lineTo(30.6247f, 31.8241f)
                lineTo(30.7308f, 31.73f)
                lineTo(30.8428f, 31.6308f)
                lineTo(30.9905f, 31.5003f)
                lineTo(31.0827f, 31.419f)
                lineTo(31.2095f, 31.3073f)
                lineTo(31.3734f, 31.1633f)
                lineTo(31.5767f, 30.985f)
                lineTo(31.6805f, 30.8942f)
                lineTo(31.8559f, 30.7409f)
                lineTo(32.0335f, 30.5859f)
                lineTo(32.2122f, 30.4303f)
                lineTo(32.3554f, 30.306f)
                lineTo(32.4981f, 30.1822f)
                lineTo(32.6399f, 30.0596f)
                lineTo(32.7452f, 29.9685f)
                lineTo(32.8841f, 29.8488f)
                lineTo(33.0205f, 29.7315f)
                lineTo(33.1209f, 29.6453f)
                lineTo(33.2195f, 29.5609f)
                lineTo(33.284f, 29.5057f)
                lineTo(33.379f, 29.4247f)
                lineTo(33.441f, 29.372f)
                lineTo(33.5317f, 29.2949f)
                lineTo(33.5907f, 29.245f)
                lineTo(33.6766f, 29.1724f)
                lineTo(33.7322f, 29.1256f)
                lineTo(33.7862f, 29.0803f)
                lineTo(33.8387f, 29.0363f)
                curveTo(34.1836f, 28.7506f, 34.124f, 28.292f, 33.8506f, 27.911f)
                curveTo(33.812f, 27.8574f, 33.7733f, 27.8043f, 33.7345f, 27.7516f)
                lineTo(33.688f, 27.6884f)
                lineTo(33.6647f, 27.657f)
                lineTo(33.5719f, 27.5316f)
                lineTo(33.5257f, 27.4691f)
                lineTo(33.4796f, 27.4067f)
                curveTo(32.8364f, 26.5325f, 32.2576f, 25.6527f, 32.2576f, 23.9871f)
                verticalLineTo(17.3898f)
                curveTo(32.2576f, 17.2781f, 32.2579f, 17.1668f, 32.2584f, 17.0558f)
                lineTo(32.2592f, 16.8897f)
                lineTo(32.2615f, 16.4771f)
                curveTo(32.2735f, 14.0405f, 32.2276f, 11.8195f, 30.3971f, 10.1079f)
                lineTo(30.3481f, 10.0614f)
                close()
                moveTo(20.0422f, 24.8624f)
                curveTo(20.0422f, 21.2541f, 23.2699f, 20.5992f, 26.3254f, 20.5992f)
                lineTo(26.3254f, 21.5655f)
                lineTo(26.3257f, 21.9551f)
                lineTo(26.3257f, 22.051f)
                curveTo(26.324f, 23.4691f, 26.2755f, 24.702f, 25.5348f, 26.0055f)
                curveTo(24.8631f, 27.1965f, 23.799f, 27.9288f, 22.6102f, 27.9288f)
                curveTo(20.9873f, 27.9288f, 20.0422f, 26.6903f, 20.0422f, 24.8624f)
                close()
            }
        }.build()
        return _amazon!!
    }

private var _amazon: ImageVector? = null
