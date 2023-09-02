package uz.javokhir.qr.master.ui.icons.qr

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

internal val Github: ImageVector
    get() {
        if (_github != null) {
            return _github!!
        }
        _github = Builder(
            name = "Github",
            defaultWidth = 73.0.dp,
            defaultHeight = 73.0.dp,
            viewportWidth = 73.0f,
            viewportHeight = 73.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF5F5F5)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(0.9028f, 0.0544f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(-72.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1B1F23)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(36.8845f, 16.5678f)
                curveTo(25.6938f, 16.5678f, 16.6299f, 25.5877f, 16.6299f, 36.7239f)
                curveTo(16.6299f, 45.643f, 22.4278f, 53.1763f, 30.479f, 55.847f)
                curveTo(31.4917f, 56.0234f, 31.8715f, 55.4187f, 31.8715f, 54.8896f)
                curveTo(31.8715f, 54.4109f, 31.8461f, 52.8236f, 31.8461f, 51.1355f)
                curveTo(26.7572f, 52.0677f, 25.4406f, 49.901f, 25.0355f, 48.7672f)
                curveTo(24.8077f, 48.1877f, 23.8203f, 46.3988f, 22.9595f, 45.9201f)
                curveTo(22.2505f, 45.5422f, 21.2378f, 44.61f, 22.9341f, 44.5848f)
                curveTo(24.5292f, 44.5596f, 25.6685f, 46.0461f, 26.0483f, 46.6508f)
                curveTo(27.8712f, 49.6994f, 30.7828f, 48.8428f, 31.9474f, 48.3137f)
                curveTo(32.1246f, 47.0035f, 32.6563f, 46.1217f, 33.2386f, 45.6178f)
                curveTo(28.732f, 45.1139f, 24.0228f, 43.3754f, 24.0228f, 35.6657f)
                curveTo(24.0228f, 33.4737f, 24.8077f, 31.6597f, 26.0989f, 30.2488f)
                curveTo(25.8964f, 29.7449f, 25.1875f, 27.6789f, 26.3015f, 24.9074f)
                curveTo(26.3015f, 24.9074f, 27.9978f, 24.3783f, 31.8715f, 26.9734f)
                curveTo(33.4918f, 26.5199f, 35.2135f, 26.2931f, 36.9351f, 26.2931f)
                curveTo(38.6567f, 26.2931f, 40.3784f, 26.5199f, 41.9988f, 26.9734f)
                curveTo(45.8724f, 24.3531f, 47.5688f, 24.9074f, 47.5688f, 24.9074f)
                curveTo(48.6828f, 27.6789f, 47.9739f, 29.7449f, 47.7713f, 30.2488f)
                curveTo(49.0625f, 31.6597f, 49.8474f, 33.4485f, 49.8474f, 35.6657f)
                curveTo(49.8474f, 43.4006f, 45.1129f, 45.1139f, 40.6062f, 45.6178f)
                curveTo(41.3405f, 46.2477f, 41.9734f, 47.457f, 41.9734f, 49.3467f)
                curveTo(41.9734f, 52.0425f, 41.9481f, 54.2093f, 41.9481f, 54.8896f)
                curveTo(41.9481f, 55.4187f, 42.3279f, 56.0486f, 43.3406f, 55.847f)
                curveTo(51.3412f, 53.1763f, 57.139f, 45.6178f, 57.139f, 36.7239f)
                curveTo(57.139f, 25.5877f, 48.0751f, 16.5678f, 36.8845f, 16.5678f)
                close()
            }
        }.build()
        return _github!!
    }

private var _github: ImageVector? = null
