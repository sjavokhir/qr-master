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

internal val Dribbble: ImageVector
    get() {
        if (_dribbble != null) {
            return _dribbble!!
        }
        _dribbble = Builder(
            name = "Dribbble 2",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFEA4C89)),
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
                moveTo(24.0f, 8.0f)
                curveTo(15.167f, 8.0f, 8.0f, 15.167f, 8.0f, 24.0f)
                curveTo(8.0f, 32.833f, 15.167f, 40.0f, 24.0f, 40.0f)
                curveTo(32.8156f, 40.0f, 40.0f, 32.833f, 40.0f, 24.0f)
                curveTo(40.0f, 15.167f, 32.8156f, 8.0f, 24.0f, 8.0f)
                close()
                moveTo(34.5683f, 15.3753f)
                curveTo(36.4772f, 17.7006f, 37.6226f, 20.6681f, 37.6573f, 23.8785f)
                curveTo(37.2061f, 23.7917f, 32.6941f, 22.872f, 28.1475f, 23.4447f)
                curveTo(28.0434f, 23.2191f, 27.9566f, 22.9761f, 27.8525f, 22.7332f)
                curveTo(27.5748f, 22.0738f, 27.2625f, 21.397f, 26.9501f, 20.7549f)
                curveTo(31.9827f, 18.7072f, 34.2733f, 15.7571f, 34.5683f, 15.3753f)
                close()
                moveTo(24.0f, 10.3601f)
                curveTo(27.4707f, 10.3601f, 30.6464f, 11.6616f, 33.0586f, 13.7961f)
                curveTo(32.8156f, 14.1432f, 30.7505f, 16.9024f, 25.8916f, 18.7245f)
                curveTo(23.6529f, 14.6117f, 21.1714f, 11.2451f, 20.7896f, 10.7245f)
                curveTo(21.8134f, 10.4816f, 22.8894f, 10.3601f, 24.0f, 10.3601f)
                close()
                moveTo(18.1866f, 11.6443f)
                curveTo(18.551f, 12.1301f, 20.9805f, 15.5141f, 23.2538f, 19.5401f)
                curveTo(16.8677f, 21.2408f, 11.2278f, 21.2061f, 10.6204f, 21.2061f)
                curveTo(11.5054f, 16.9718f, 14.3688f, 13.449f, 18.1866f, 11.6443f)
                close()
                moveTo(10.3254f, 24.0173f)
                curveTo(10.3254f, 23.8785f, 10.3254f, 23.7397f, 10.3254f, 23.6009f)
                curveTo(10.9154f, 23.6182f, 17.5445f, 23.705f, 24.3644f, 21.6573f)
                curveTo(24.7636f, 22.4208f, 25.128f, 23.2017f, 25.475f, 23.9827f)
                curveTo(25.3015f, 24.0347f, 25.1106f, 24.0868f, 24.9371f, 24.1388f)
                curveTo(17.8916f, 26.4122f, 14.1432f, 32.6247f, 13.8308f, 33.1453f)
                curveTo(11.6616f, 30.7332f, 10.3254f, 27.5228f, 10.3254f, 24.0173f)
                close()
                moveTo(24.0f, 37.6746f)
                curveTo(20.8417f, 37.6746f, 17.9262f, 36.5987f, 15.6182f, 34.7939f)
                curveTo(15.8612f, 34.2907f, 18.6378f, 28.9458f, 26.3427f, 26.256f)
                curveTo(26.3774f, 26.2386f, 26.3948f, 26.2386f, 26.4295f, 26.2212f)
                curveTo(28.3557f, 31.2017f, 29.1367f, 35.3839f, 29.3449f, 36.5813f)
                curveTo(27.6963f, 37.2928f, 25.8916f, 37.6746f, 24.0f, 37.6746f)
                close()
                moveTo(31.6182f, 35.3319f)
                curveTo(31.4794f, 34.4989f, 30.7506f, 30.5076f, 28.9631f, 25.5965f)
                curveTo(33.2495f, 24.9197f, 36.9978f, 26.0304f, 37.4664f, 26.1866f)
                curveTo(36.8764f, 29.987f, 34.6898f, 33.2668f, 31.6182f, 35.3319f)
                close()
            }
        }.build()
        return _dribbble!!
    }

private var _dribbble: ImageVector? = null
