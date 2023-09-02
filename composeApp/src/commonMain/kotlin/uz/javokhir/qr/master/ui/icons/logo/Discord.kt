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

internal val Discord: ImageVector
    get() {
        if (_discord != null) {
            return _discord!!
        }
        _discord = Builder(
            name = "Discord",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF5865F2)),
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
                moveTo(35.107f, 14.0937f)
                curveTo(33.0356f, 13.1156f, 30.8208f, 12.4048f, 28.5052f, 12.0f)
                curveTo(28.2208f, 12.5189f, 27.8886f, 13.2168f, 27.6595f, 13.772f)
                curveTo(25.198f, 13.3984f, 22.7591f, 13.3984f, 20.3429f, 13.772f)
                curveTo(20.1139f, 13.2168f, 19.7741f, 12.5189f, 19.4871f, 12.0f)
                curveTo(17.1691f, 12.4048f, 14.9517f, 13.1182f, 12.8803f, 14.0989f)
                curveTo(8.7022f, 20.4709f, 7.5696f, 26.6845f, 8.1359f, 32.81f)
                curveTo(10.907f, 34.8985f, 13.5925f, 36.1672f, 16.2328f, 36.9974f)
                curveTo(16.8847f, 36.092f, 17.466f, 35.1294f, 17.9669f, 34.115f)
                curveTo(17.013f, 33.7492f, 16.0994f, 33.2978f, 15.2361f, 32.7737f)
                curveTo(15.4651f, 32.6024f, 15.6891f, 32.4234f, 15.9056f, 32.2392f)
                curveTo(21.1709f, 34.7247f, 26.8919f, 34.7247f, 32.0943f, 32.2392f)
                curveTo(32.3133f, 32.4234f, 32.5373f, 32.6024f, 32.7638f, 32.7737f)
                curveTo(31.898f, 33.3003f, 30.9818f, 33.7518f, 30.0279f, 34.1176f)
                curveTo(30.5288f, 35.1294f, 31.1077f, 36.0946f, 31.7621f, 37.0f)
                curveTo(34.4048f, 36.1698f, 37.0929f, 34.9011f, 39.864f, 32.81f)
                curveTo(40.5285f, 25.709f, 38.7289f, 19.5524f, 35.107f, 14.0937f)
                close()
                moveTo(18.6842f, 29.0429f)
                curveTo(17.1036f, 29.0429f, 15.8074f, 27.5537f, 15.8074f, 25.7402f)
                curveTo(15.8074f, 23.9266f, 17.0759f, 22.4349f, 18.6842f, 22.4349f)
                curveTo(20.2926f, 22.4349f, 21.5887f, 23.924f, 21.5611f, 25.7402f)
                curveTo(21.5636f, 27.5537f, 20.2926f, 29.0429f, 18.6842f, 29.0429f)
                close()
                moveTo(26.4388f, 25.7402f)
                curveTo(26.4388f, 27.5537f, 27.7351f, 29.0429f, 29.3157f, 29.0429f)
                curveTo(30.9239f, 29.0429f, 32.1925f, 27.5537f, 32.1925f, 25.7402f)
                curveTo(32.2202f, 23.924f, 30.9239f, 22.4349f, 29.3157f, 22.4349f)
                curveTo(27.7073f, 22.4349f, 26.4388f, 23.9266f, 26.4388f, 25.7402f)
                close()
            }
        }.build()
        return _discord!!
    }

private var _discord: ImageVector? = null
