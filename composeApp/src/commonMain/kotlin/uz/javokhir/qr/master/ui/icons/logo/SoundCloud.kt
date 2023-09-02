package uz.javokhir.qr.master.ui.icons.logo

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

internal val SoundCloud: ImageVector
    get() {
        if (_sound_cloud != null) {
            return _sound_cloud!!
        }
        _sound_cloud = Builder(
            name = "Sound cloud",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFFF7700),
                    1.0f to Color(0xFFFF3300),
                    start = Offset(0.0f, 0.0f),
                    end = Offset(0.0f, 48.0f)
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
                pathFillType = EvenOdd
            ) {
                moveTo(37.0345f, 22.4f)
                curveTo(36.4136f, 22.4f, 35.8199f, 22.5111f, 35.2721f, 22.7123f)
                curveTo(34.6348f, 18.9063f, 31.2205f, 16.0f, 27.1034f, 16.0f)
                curveTo(27.1034f, 16.0f, 23.3793f, 16.0f, 23.3793f, 18.0f)
                verticalLineTo(30.7989f)
                curveTo(23.3793f, 31.4609f, 23.9353f, 32.0f, 24.6213f, 32.0f)
                horizontalLineTo(37.0345f)
                curveTo(39.7768f, 32.0f, 42.0f, 29.8509f, 42.0f, 27.2f)
                curveTo(42.0f, 24.5491f, 39.7768f, 22.4f, 37.0345f, 22.4f)
                close()
                moveTo(20.8966f, 27.6f)
                lineTo(21.1034f, 31.4f)
                curveTo(21.1034f, 31.7312f, 21.3815f, 32.0f, 21.7241f, 32.0f)
                curveTo(22.0668f, 32.0f, 22.3448f, 31.7312f, 22.3448f, 31.4f)
                lineTo(22.5517f, 27.6f)
                lineTo(22.3448f, 18.2f)
                curveTo(22.3448f, 17.8688f, 22.0668f, 17.6f, 21.7241f, 17.6f)
                curveTo(21.3815f, 17.6f, 21.1034f, 17.8688f, 21.1034f, 18.2f)
                lineTo(20.8966f, 27.6f)
                close()
                moveTo(18.4138f, 27.6f)
                lineTo(18.6207f, 31.4f)
                curveTo(18.6207f, 31.7312f, 18.8988f, 32.0f, 19.2414f, 32.0f)
                curveTo(19.584f, 32.0f, 19.8621f, 31.7312f, 19.8621f, 31.4f)
                lineTo(20.069f, 27.6f)
                lineTo(19.8621f, 20.6f)
                curveTo(19.8621f, 20.2688f, 19.584f, 20.0f, 19.2414f, 20.0f)
                curveTo(18.8988f, 20.0f, 18.6207f, 20.2688f, 18.6207f, 20.6f)
                lineTo(18.4138f, 27.6f)
                close()
                moveTo(16.1379f, 31.4f)
                lineTo(15.931f, 27.6f)
                lineTo(16.1379f, 19.8f)
                curveTo(16.1379f, 19.4688f, 16.416f, 19.2f, 16.7586f, 19.2f)
                curveTo(17.1012f, 19.2f, 17.3793f, 19.4688f, 17.3793f, 19.8f)
                lineTo(17.5862f, 27.6f)
                lineTo(17.3793f, 31.4f)
                curveTo(17.3793f, 31.7312f, 17.1012f, 32.0f, 16.7586f, 32.0f)
                curveTo(16.416f, 32.0f, 16.1379f, 31.7312f, 16.1379f, 31.4f)
                close()
                moveTo(13.4483f, 27.6f)
                lineTo(13.6552f, 31.4f)
                curveTo(13.6552f, 31.7312f, 13.9332f, 32.0f, 14.2759f, 32.0f)
                curveTo(14.6185f, 32.0f, 14.8966f, 31.7312f, 14.8966f, 31.4f)
                lineTo(15.1034f, 27.6f)
                lineTo(14.8966f, 21.4f)
                curveTo(14.8966f, 21.0688f, 14.6185f, 20.8f, 14.2759f, 20.8f)
                curveTo(13.9332f, 20.8f, 13.6552f, 21.0688f, 13.6552f, 21.4f)
                lineTo(13.4483f, 27.6f)
                close()
                moveTo(11.1724f, 31.4f)
                lineTo(10.9655f, 27.6f)
                lineTo(11.1724f, 24.6f)
                curveTo(11.1724f, 24.2688f, 11.4505f, 24.0f, 11.7931f, 24.0f)
                curveTo(12.1357f, 24.0f, 12.4138f, 24.2688f, 12.4138f, 24.6f)
                lineTo(12.6207f, 27.6f)
                lineTo(12.4138f, 31.4f)
                curveTo(12.4138f, 31.7312f, 12.1357f, 32.0f, 11.7931f, 32.0f)
                curveTo(11.4505f, 32.0f, 11.1724f, 31.7312f, 11.1724f, 31.4f)
                close()
                moveTo(8.4828f, 27.6f)
                lineTo(8.6897f, 31.4f)
                curveTo(8.6897f, 31.7312f, 8.9677f, 32.0f, 9.3103f, 32.0f)
                curveTo(9.653f, 32.0f, 9.931f, 31.7312f, 9.931f, 31.4f)
                lineTo(10.1379f, 27.6f)
                lineTo(9.931f, 23.8f)
                curveTo(9.931f, 23.4688f, 9.653f, 23.2f, 9.3103f, 23.2f)
                curveTo(8.9677f, 23.2f, 8.6897f, 23.4688f, 8.6897f, 23.8f)
                lineTo(8.4828f, 27.6f)
                close()
                moveTo(6.2069f, 29.8f)
                lineTo(6.0f, 27.6f)
                lineTo(6.2069f, 25.4f)
                curveTo(6.2069f, 25.0688f, 6.485f, 24.8f, 6.8276f, 24.8f)
                curveTo(7.1702f, 24.8f, 7.4483f, 25.0688f, 7.4483f, 25.4f)
                lineTo(7.6552f, 27.6f)
                lineTo(7.4483f, 29.8f)
                curveTo(7.4483f, 30.1312f, 7.1702f, 30.4f, 6.8276f, 30.4f)
                curveTo(6.485f, 30.4f, 6.2069f, 30.1312f, 6.2069f, 29.8f)
                close()
            }
        }.build()
        return _sound_cloud!!
    }

private var _sound_cloud: ImageVector? = null
