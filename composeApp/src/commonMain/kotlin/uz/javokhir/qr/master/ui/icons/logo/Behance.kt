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

internal val Behance: ImageVector
    get() {
        if (_behance != null) {
            return _behance!!
        }
        _behance = Builder(
            name = "Behance",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0057FF)),
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
                moveTo(8.0f, 34.3888f)
                verticalLineTo(14.0192f)
                curveTo(8.0f, 13.8268f, 8.0635f, 13.7198f, 8.1906f, 13.6984f)
                curveTo(8.5506f, 13.6774f, 9.1013f, 13.6613f, 9.843f, 13.6503f)
                curveTo(10.5842f, 13.6398f, 11.3892f, 13.6291f, 12.2579f, 13.6182f)
                curveTo(13.1263f, 13.6077f, 13.9207f, 13.6024f, 14.6411f, 13.6022f)
                curveTo(16.3779f, 13.6022f, 17.7601f, 13.7947f, 18.7878f, 14.1796f)
                curveTo(19.8151f, 14.5645f, 20.6042f, 15.051f, 21.1551f, 15.6392f)
                curveTo(21.6641f, 16.1574f, 22.0451f, 16.7892f, 22.2673f, 17.4837f)
                curveTo(22.4468f, 18.0547f, 22.5431f, 18.649f, 22.5532f, 19.248f)
                curveTo(22.5645f, 19.888f, 22.4567f, 20.5246f, 22.2355f, 21.1245f)
                curveTo(22.0537f, 21.6165f, 21.7963f, 22.0766f, 21.4728f, 22.4878f)
                curveTo(21.2317f, 22.8002f, 20.942f, 23.0711f, 20.615f, 23.2898f)
                curveTo(21.067f, 23.5317f, 21.4885f, 23.8279f, 21.8701f, 24.1719f)
                curveTo(22.3644f, 24.6193f, 22.7689f, 25.1583f, 23.0617f, 25.7598f)
                curveTo(23.4236f, 26.5305f, 23.5979f, 27.3773f, 23.57f, 28.2298f)
                curveTo(23.5899f, 29.4498f, 23.2163f, 30.6432f, 22.5055f, 31.6301f)
                curveTo(21.7956f, 32.614f, 20.7788f, 33.3785f, 19.4552f, 33.9237f)
                curveTo(18.1309f, 34.469f, 16.5474f, 34.7417f, 14.7046f, 34.7417f)
                horizontalLineTo(12.5915f)
                curveTo(11.9243f, 34.7417f, 11.3099f, 34.7363f, 10.7486f, 34.7256f)
                curveTo(10.187f, 34.7146f, 9.6998f, 34.7039f, 9.2869f, 34.6936f)
                curveTo(8.8738f, 34.6825f, 8.519f, 34.6772f, 8.2224f, 34.6775f)
                curveTo(8.0739f, 34.6564f, 7.9998f, 34.5602f, 8.0f, 34.3888f)
                close()
                moveTo(12.2897f, 17.4195f)
                verticalLineTo(21.8783f)
                horizontalLineTo(14.4504f)
                curveTo(15.0224f, 21.8783f, 15.5838f, 21.889f, 16.1346f, 21.9104f)
                curveTo(16.5297f, 21.9134f, 16.9236f, 21.9564f, 17.3103f, 22.0387f)
                curveTo(17.5908f, 21.7968f, 17.8227f, 21.5028f, 17.9934f, 21.1726f)
                curveTo(18.1859f, 20.7736f, 18.2787f, 20.3331f, 18.2635f, 19.8895f)
                curveTo(18.2856f, 19.3857f, 18.1402f, 18.8889f, 17.8504f, 18.4781f)
                curveTo(17.5425f, 18.092f, 17.1277f, 17.8072f, 16.6589f, 17.6601f)
                curveTo(16.0161f, 17.4605f, 15.3452f, 17.3683f, 14.6729f, 17.3874f)
                horizontalLineTo(13.7513f)
                curveTo(13.4758f, 17.3874f, 13.2269f, 17.3927f, 13.0047f, 17.4034f)
                curveTo(12.7822f, 17.4145f, 12.5439f, 17.4198f, 12.2897f, 17.4195f)
                close()
                moveTo(12.2897f, 30.9564f)
                verticalLineTo(25.6636f)
                lineTo(15.0225f, 25.6636f)
                curveTo(15.41f, 25.6604f, 15.7974f, 25.6818f, 16.1823f, 25.7277f)
                curveTo(16.4763f, 25.7643f, 16.768f, 25.8179f, 17.056f, 25.8881f)
                curveTo(17.7973f, 26.0808f, 18.3058f, 26.3908f, 18.5813f, 26.8184f)
                curveTo(18.8629f, 27.269f, 19.0066f, 27.7934f, 18.9944f, 28.3261f)
                curveTo(19.0116f, 28.8742f, 18.8309f, 29.41f, 18.486f, 29.8337f)
                curveTo(18.0834f, 30.2791f, 17.5575f, 30.592f, 16.9766f, 30.7319f)
                curveTo(16.2256f, 30.9352f, 15.4503f, 31.0324f, 14.6729f, 31.0206f)
                curveTo(14.1643f, 31.0209f, 13.73f, 31.0156f, 13.3701f, 31.0046f)
                curveTo(13.0098f, 30.994f, 12.6496f, 30.978f, 12.2897f, 30.9564f)
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
                moveTo(30.6896f, 29.5611f)
                curveTo(30.3689f, 29.051f, 30.1628f, 28.4761f, 30.0859f, 27.8769f)
                lineTo(39.5521f, 27.8705f)
                curveTo(39.6961f, 27.8653f, 39.8161f, 27.7576f, 39.838f, 27.6138f)
                curveTo(39.8433f, 27.5705f, 39.8512f, 27.5124f, 39.8606f, 27.4436f)
                curveTo(39.8882f, 27.241f, 39.9285f, 26.9453f, 39.9523f, 26.658f)
                curveTo(39.984f, 26.2732f, 39.9999f, 25.8455f, 39.9999f, 25.3749f)
                curveTo(39.9975f, 24.5473f, 39.8689f, 23.725f, 39.6186f, 22.9369f)
                curveTo(39.3615f, 22.1192f, 38.9635f, 21.3536f, 38.4429f, 20.6754f)
                curveTo(37.8914f, 19.9632f, 37.1773f, 19.3964f, 36.3616f, 19.0234f)
                curveTo(35.3963f, 18.5951f, 34.3493f, 18.387f, 33.2952f, 18.4139f)
                curveTo(32.1559f, 18.3858f, 31.0254f, 18.6217f, 29.9905f, 19.1036f)
                curveTo(29.0704f, 19.5538f, 28.2574f, 20.1994f, 27.6073f, 20.9962f)
                curveTo(26.9483f, 21.8025f, 26.4469f, 22.7277f, 26.1298f, 23.7229f)
                curveTo(25.8006f, 24.743f, 25.6343f, 25.8096f, 25.6372f, 26.8825f)
                curveTo(25.637f, 27.8652f, 25.7761f, 28.8428f, 26.0504f, 29.7856f)
                curveTo(26.3273f, 30.7408f, 26.792f, 31.63f, 27.4167f, 32.4f)
                curveTo(28.0856f, 33.2171f, 28.9343f, 33.8652f, 29.8952f, 34.2926f)
                curveTo(30.9117f, 34.7631f, 32.1722f, 34.9983f, 33.6766f, 34.9983f)
                curveTo(34.6143f, 35.0131f, 35.5511f, 34.9325f, 36.4728f, 34.7577f)
                curveTo(37.1866f, 34.6138f, 37.8803f, 34.3822f, 38.5382f, 34.068f)
                curveTo(38.596f, 34.0313f, 38.6449f, 33.982f, 38.6812f, 33.9237f)
                curveTo(38.7177f, 33.8491f, 38.7341f, 33.7661f, 38.7289f, 33.6831f)
                verticalLineTo(30.6357f)
                curveTo(38.7289f, 30.4432f, 38.6758f, 30.3901f, 38.57f, 30.4753f)
                curveTo(37.9735f, 30.733f, 37.3499f, 30.9214f, 36.7112f, 31.0367f)
                curveTo(36.0345f, 31.157f, 35.3486f, 31.216f, 34.6616f, 31.2131f)
                curveTo(33.6234f, 31.2134f, 32.7813f, 31.0637f, 32.1354f, 30.764f)
                curveTo(31.5476f, 30.514f, 31.045f, 30.0958f, 30.6896f, 29.5611f)
                close()
                moveTo(34.2485f, 24.7654f)
                horizontalLineTo(30.0859f)
                curveTo(30.153f, 24.3054f, 30.2982f, 23.8604f, 30.5149f, 23.4502f)
                curveTo(31.0153f, 22.4673f, 32.0437f, 21.8758f, 33.1364f, 21.9425f)
                curveTo(34.3042f, 21.8976f, 35.3578f, 22.6461f, 35.7102f, 23.771f)
                curveTo(35.7881f, 24.0093f, 35.8309f, 24.2578f, 35.8373f, 24.5087f)
                verticalLineTo(24.7012f)
                curveTo(35.6858f, 24.7333f, 35.5314f, 24.7494f, 35.3765f, 24.7493f)
                curveTo(35.1329f, 24.76f, 34.7569f, 24.7654f, 34.2485f, 24.7654f)
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
                moveTo(28.0842f, 13.0f)
                horizontalLineTo(37.5851f)
                curveTo(37.7333f, 13.0f, 37.8078f, 13.0859f, 37.8078f, 13.257f)
                verticalLineTo(15.8593f)
                curveTo(37.8179f, 15.9301f, 37.7943f, 16.0015f, 37.7442f, 16.0521f)
                curveTo(37.6941f, 16.1027f, 37.6234f, 16.1265f, 37.5532f, 16.1163f)
                horizontalLineTo(28.0524f)
                curveTo(27.9037f, 16.1163f, 27.8296f, 16.031f, 27.8296f, 15.8593f)
                verticalLineTo(13.2249f)
                curveTo(27.8296f, 13.0753f, 27.9141f, 13.0f, 28.0842f, 13.0f)
                close()
            }
        }.build()
        return _behance!!
    }

private var _behance: ImageVector? = null
