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

internal val Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(
            name = "Twitter",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF33CCFF)),
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
                fill = SolidColor(Color(0xFF33CCFF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(53.8696f, 24.5192f)
                curveTo(52.6807f, 25.0308f, 51.4309f, 25.3871f, 50.151f, 25.5792f)
                curveTo(50.7494f, 25.4766f, 51.6299f, 24.3995f, 51.9804f, 23.9635f)
                curveTo(52.5128f, 23.3059f, 52.9186f, 22.5552f, 53.1772f, 21.7495f)
                curveTo(53.1772f, 21.6896f, 53.237f, 21.6042f, 53.1772f, 21.5614f)
                curveTo(53.147f, 21.545f, 53.1132f, 21.5363f, 53.0788f, 21.5363f)
                curveTo(53.0445f, 21.5363f, 53.0107f, 21.545f, 52.9805f, 21.5614f)
                curveTo(51.5907f, 22.314f, 50.1116f, 22.8885f, 48.5781f, 23.2711f)
                curveTo(48.5247f, 23.2874f, 48.4678f, 23.2889f, 48.4136f, 23.2753f)
                curveTo(48.3593f, 23.2618f, 48.3098f, 23.2337f, 48.2704f, 23.1942f)
                curveTo(48.151f, 23.052f, 48.0225f, 22.9178f, 47.8857f, 22.7924f)
                curveTo(47.2602f, 22.232f, 46.5506f, 21.7733f, 45.7828f, 21.4332f)
                curveTo(44.7463f, 21.008f, 43.6268f, 20.8238f, 42.5087f, 20.8946f)
                curveTo(41.4239f, 20.9632f, 40.3647f, 21.2541f, 39.3971f, 21.7495f)
                curveTo(38.4443f, 22.2717f, 37.6069f, 22.9812f, 36.9352f, 23.8353f)
                curveTo(36.2286f, 24.7144f, 35.7185f, 25.7346f, 35.4392f, 26.8272f)
                curveTo(35.2089f, 27.8666f, 35.1827f, 28.9408f, 35.3623f, 29.9902f)
                curveTo(35.3623f, 30.1697f, 35.3623f, 30.1953f, 35.2084f, 30.1697f)
                curveTo(29.1134f, 29.2721f, 24.1125f, 27.1093f, 20.0264f, 22.4676f)
                curveTo(19.8469f, 22.2624f, 19.7529f, 22.2624f, 19.6075f, 22.4676f)
                curveTo(17.8295f, 25.1688f, 18.6929f, 29.4431f, 20.9154f, 31.5545f)
                curveTo(21.2146f, 31.8366f, 21.5224f, 32.1102f, 21.8472f, 32.3666f)
                curveTo(20.8282f, 32.2943f, 19.834f, 32.0181f, 18.9237f, 31.5545f)
                curveTo(18.7527f, 31.4434f, 18.6587f, 31.5032f, 18.6501f, 31.7084f)
                curveTo(18.6259f, 31.9928f, 18.6259f, 32.2788f, 18.6501f, 32.5632f)
                curveTo(18.8285f, 33.9264f, 19.3657f, 35.2177f, 20.2068f, 36.3051f)
                curveTo(21.0479f, 37.3925f, 22.1627f, 38.237f, 23.4372f, 38.7523f)
                curveTo(23.7479f, 38.8854f, 24.0717f, 38.9856f, 24.4032f, 39.0515f)
                curveTo(23.4598f, 39.2372f, 22.4923f, 39.2661f, 21.5395f, 39.137f)
                curveTo(21.3343f, 39.0942f, 21.2574f, 39.2053f, 21.3343f, 39.402f)
                curveTo(22.5909f, 42.8213f, 25.3179f, 43.8642f, 27.3182f, 44.4455f)
                curveTo(27.5918f, 44.4883f, 27.8653f, 44.4883f, 28.173f, 44.5567f)
                curveTo(28.173f, 44.5567f, 28.173f, 44.5567f, 28.1218f, 44.6079f)
                curveTo(27.5319f, 45.685f, 25.1469f, 46.4117f, 24.0527f, 46.7878f)
                curveTo(22.0555f, 47.5052f, 19.9261f, 47.7794f, 17.8124f, 47.5913f)
                curveTo(17.479f, 47.54f, 17.402f, 47.5486f, 17.3166f, 47.5913f)
                curveTo(17.2311f, 47.6341f, 17.3166f, 47.7281f, 17.4106f, 47.8136f)
                curveTo(17.838f, 48.0957f, 18.2654f, 48.3436f, 18.7099f, 48.583f)
                curveTo(20.0333f, 49.3047f, 21.4323f, 49.8781f, 22.8816f, 50.2926f)
                curveTo(30.3871f, 52.3614f, 38.8329f, 50.8397f, 44.4663f, 45.2405f)
                curveTo(48.8944f, 40.8466f, 50.4502f, 34.7858f, 50.4502f, 28.7164f)
                curveTo(50.4502f, 28.4856f, 50.7323f, 28.3489f, 50.8947f, 28.2292f)
                curveTo(52.015f, 27.3563f, 53.0027f, 26.3254f, 53.8268f, 25.1688f)
                curveTo(53.9696f, 24.9964f, 54.0427f, 24.7769f, 54.032f, 24.5534f)
                curveTo(54.032f, 24.4251f, 54.032f, 24.4508f, 53.8696f, 24.5192f)
                close()
            }
        }.build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
