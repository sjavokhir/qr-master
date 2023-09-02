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

internal val Reddit: ImageVector
    get() {
        if (_reddit != null) {
            return _reddit!!
        }
        _reddit = Builder(
            name = "Reddit",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFF4500)),
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
                moveTo(37.8108f, 21.1346f)
                curveTo(39.092f, 21.6454f, 39.9491f, 22.8495f, 39.9996f, 24.2096f)
                curveTo(40.0205f, 25.5398f, 39.2636f, 26.7635f, 38.0537f, 27.3556f)
                curveTo(38.0808f, 27.702f, 38.0808f, 28.05f, 38.0537f, 28.3964f)
                curveTo(38.0537f, 33.6949f, 31.7838f, 38.0f, 24.0484f, 38.0f)
                curveTo(16.313f, 38.0f, 10.0431f, 33.6949f, 10.0431f, 28.3964f)
                curveTo(10.016f, 28.05f, 10.016f, 27.702f, 10.0431f, 27.3556f)
                curveTo(8.7804f, 26.7844f, 7.9793f, 25.5331f, 8.0004f, 24.165f)
                curveTo(8.0215f, 22.797f, 8.8608f, 21.5702f, 10.1404f, 21.037f)
                curveTo(11.4201f, 20.5038f, 12.8988f, 20.7647f, 13.9108f, 21.7022f)
                curveTo(16.6789f, 19.8537f, 19.9354f, 18.8424f, 23.2797f, 18.7928f)
                lineTo(25.0574f, 10.5847f)
                curveTo(25.0977f, 10.3928f, 25.2144f, 10.2248f, 25.3814f, 10.1181f)
                curveTo(25.5484f, 10.0114f, 25.7518f, 9.975f, 25.9462f, 10.017f)
                lineTo(31.8318f, 11.1761f)
                curveTo(32.4256f, 10.1716f, 33.6724f, 9.7407f, 34.7735f, 10.1594f)
                curveTo(35.8745f, 10.5781f, 36.5036f, 11.7224f, 36.2575f, 12.859f)
                curveTo(36.0115f, 13.9957f, 34.9633f, 14.788f, 33.7846f, 14.7283f)
                curveTo(32.6058f, 14.6686f, 31.6458f, 13.7745f, 31.5195f, 12.619f)
                lineTo(26.3786f, 11.5546f)
                lineTo(24.8171f, 18.9347f)
                curveTo(28.1208f, 19.0045f, 31.3331f, 20.015f, 34.0659f, 21.8442f)
                curveTo(35.0632f, 20.9017f, 36.5296f, 20.6239f, 37.8108f, 21.1346f)
                close()
                moveTo(18.379f, 24.2096f)
                curveTo(17.0523f, 24.2096f, 15.9767f, 25.2686f, 15.9767f, 26.575f)
                curveTo(15.9767f, 27.2024f, 16.2298f, 27.804f, 16.6803f, 28.2476f)
                curveTo(17.1309f, 28.6912f, 17.7419f, 28.9404f, 18.379f, 28.9404f)
                curveTo(19.7058f, 28.9404f, 20.7813f, 27.8814f, 20.7813f, 26.575f)
                curveTo(20.7813f, 25.2686f, 19.7058f, 24.2096f, 18.379f, 24.2096f)
                close()
                moveTo(29.934f, 33.0799f)
                curveTo(28.2296f, 34.3446f, 26.1327f, 34.9883f, 24.0004f, 34.9013f)
                curveTo(21.8681f, 34.9883f, 19.7711f, 34.3446f, 18.0667f, 33.0799f)
                curveTo(17.8551f, 32.826f, 17.8736f, 32.4554f, 18.1095f, 32.2231f)
                curveTo(18.3453f, 31.9909f, 18.7217f, 31.9727f, 18.9796f, 32.1811f)
                curveTo(20.4239f, 33.2242f, 22.1869f, 33.75f, 23.9763f, 33.6713f)
                curveTo(25.768f, 33.7672f, 27.5392f, 33.2582f, 28.9971f, 32.2284f)
                curveTo(29.1688f, 32.0636f, 29.4167f, 32.0015f, 29.6474f, 32.0654f)
                curveTo(29.8782f, 32.1294f, 30.0568f, 32.3098f, 30.1159f, 32.5385f)
                curveTo(30.175f, 32.7673f, 30.1057f, 33.0097f, 29.934f, 33.1745f)
                verticalLineTo(33.0799f)
                close()
                moveTo(27.0993f, 26.6696f)
                curveTo(27.0993f, 27.976f, 28.1748f, 29.035f, 29.5016f, 29.035f)
                lineTo(29.4776f, 29.1297f)
                curveTo(30.1359f, 29.1367f, 30.7682f, 28.8773f, 31.2269f, 28.4123f)
                curveTo(31.6855f, 27.9473f, 31.9303f, 27.3173f, 31.9039f, 26.6696f)
                curveTo(31.9039f, 25.3632f, 30.8283f, 24.3042f, 29.5016f, 24.3042f)
                curveTo(28.1748f, 24.3042f, 27.0993f, 25.3632f, 27.0993f, 26.6696f)
                close()
            }
        }.build()
        return _reddit!!
    }

private var _reddit: ImageVector? = null
