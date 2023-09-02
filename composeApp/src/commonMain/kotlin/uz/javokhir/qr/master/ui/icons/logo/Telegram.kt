package uz.javokhir.qr.master.ui.icons.logo

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val Telegram: ImageVector
    get() {
        if (_telegram != null) {
            return _telegram!!
        }
        _telegram = Builder(
            name = "Telegram",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF2AABEE),
                    1.0f to Color(0xFF229ED9),
                    start = Offset(0.177999f, 0.0f),
                    end = Offset(0.177999f, 47.644f)
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
                pathFillType = NonZero
            ) {
                moveTo(10.7874f, 24.0404f)
                curveTo(17.7667f, 21.0768f, 22.4206f, 19.123f, 24.7493f, 18.179f)
                curveTo(31.3979f, 15.4838f, 32.7795f, 15.0156f, 33.68f, 15.0002f)
                curveTo(33.878f, 14.9968f, 34.3208f, 15.0446f, 34.6077f, 15.2714f)
                curveTo(34.8499f, 15.463f, 34.9165f, 15.7217f, 34.9484f, 15.9033f)
                curveTo(34.9803f, 16.0849f, 35.02f, 16.4986f, 34.9884f, 16.8219f)
                curveTo(34.6281f, 20.5114f, 33.0692f, 29.465f, 32.276f, 33.5974f)
                curveTo(31.9404f, 35.3459f, 31.2796f, 35.9322f, 30.6399f, 35.9896f)
                curveTo(29.2496f, 36.1143f, 28.1938f, 35.0941f, 26.8473f, 34.2338f)
                curveTo(24.7401f, 32.8876f, 23.5498f, 32.0496f, 21.5044f, 30.736f)
                curveTo(19.1407f, 29.2179f, 20.673f, 28.3835f, 22.0201f, 27.0199f)
                curveTo(22.3726f, 26.663f, 28.4983f, 21.2326f, 28.6169f, 20.74f)
                curveTo(28.6317f, 20.6784f, 28.6455f, 20.4488f, 28.5055f, 20.3275f)
                curveTo(28.3655f, 20.2062f, 28.1589f, 20.2477f, 28.0098f, 20.2807f)
                curveTo(27.7985f, 20.3274f, 24.4323f, 22.4958f, 17.9113f, 26.786f)
                curveTo(16.9558f, 27.4254f, 16.0904f, 27.737f, 15.315f, 27.7206f)
                curveTo(14.4602f, 27.7026f, 12.8159f, 27.2496f, 11.5935f, 26.8623f)
                curveTo(10.0942f, 26.3873f, 8.9025f, 26.1362f, 9.0063f, 25.3295f)
                curveTo(9.0604f, 24.9093f, 9.654f, 24.4796f, 10.7874f, 24.0404f)
                close()
            }
        }.build()
        return _telegram!!
    }

private var _telegram: ImageVector? = null
