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

internal val Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(
            name = "Twitter",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1D9BF0)),
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
                moveTo(36.7239f, 17.4726f)
                curveTo(36.7434f, 17.7547f, 36.7434f, 18.0368f, 36.7434f, 18.3215f)
                curveTo(36.7434f, 26.9958f, 30.1393f, 37.0f, 18.0635f, 37.0f)
                verticalLineTo(36.9948f)
                curveTo(14.4962f, 37.0f, 11.003f, 35.9783f, 8.0f, 34.0518f)
                curveTo(8.5187f, 34.1142f, 9.04f, 34.1454f, 9.5626f, 34.1467f)
                curveTo(12.5189f, 34.1493f, 15.3906f, 33.1574f, 17.7164f, 31.3311f)
                curveTo(14.907f, 31.2778f, 12.4435f, 29.4462f, 11.5829f, 26.7722f)
                curveTo(12.567f, 26.962f, 13.581f, 26.923f, 14.5469f, 26.6592f)
                curveTo(11.4841f, 26.0404f, 9.2805f, 23.3496f, 9.2805f, 20.2246f)
                curveTo(9.2805f, 20.196f, 9.2805f, 20.1687f, 9.2805f, 20.1414f)
                curveTo(10.1931f, 20.6496f, 11.215f, 20.9317f, 12.2602f, 20.9629f)
                curveTo(9.3754f, 19.0351f, 8.4862f, 15.1978f, 10.2282f, 12.1976f)
                curveTo(13.5615f, 16.2988f, 18.4795f, 18.792f, 23.7588f, 19.0559f)
                curveTo(23.2297f, 16.7759f, 23.9525f, 14.3866f, 25.6582f, 12.7838f)
                curveTo(28.3024f, 10.2984f, 32.4612f, 10.4258f, 34.9468f, 13.0685f)
                curveTo(36.4171f, 12.7786f, 37.8264f, 12.2392f, 39.116f, 11.4748f)
                curveTo(38.6259f, 12.9944f, 37.6002f, 14.2852f, 36.2299f, 15.1055f)
                curveTo(37.5313f, 14.9521f, 38.8027f, 14.6037f, 40.0f, 14.072f)
                curveTo(39.1186f, 15.3928f, 38.0084f, 16.5432f, 36.7239f, 17.4726f)
                close()
            }
        }.build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
