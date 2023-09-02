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

internal val Github: ImageVector
    get() {
        if (_github != null) {
            return _github!!
        }
        _github = Builder(
            name = "Github",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
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
                moveTo(24.0f, 8.0f)
                curveTo(15.16f, 8.0f, 8.0f, 15.1117f, 8.0f, 23.8921f)
                curveTo(8.0f, 30.9243f, 12.58f, 36.8639f, 18.94f, 38.9696f)
                curveTo(19.74f, 39.1087f, 20.04f, 38.6319f, 20.04f, 38.2148f)
                curveTo(20.04f, 37.8373f, 20.02f, 36.5858f, 20.02f, 35.2549f)
                curveTo(16.0f, 35.9899f, 14.96f, 34.2815f, 14.64f, 33.3876f)
                curveTo(14.46f, 32.9307f, 13.68f, 31.5202f, 13.0f, 31.1428f)
                curveTo(12.44f, 30.8448f, 11.64f, 30.1098f, 12.98f, 30.09f)
                curveTo(14.24f, 30.0701f, 15.14f, 31.2421f, 15.44f, 31.7189f)
                curveTo(16.88f, 34.1226f, 19.18f, 33.4472f, 20.1f, 33.03f)
                curveTo(20.24f, 31.997f, 20.66f, 31.3017f, 21.12f, 30.9044f)
                curveTo(17.56f, 30.5071f, 13.84f, 29.1364f, 13.84f, 23.0577f)
                curveTo(13.84f, 21.3295f, 14.46f, 19.8992f, 15.48f, 18.7867f)
                curveTo(15.32f, 18.3894f, 14.76f, 16.7605f, 15.64f, 14.5753f)
                curveTo(15.64f, 14.5753f, 16.98f, 14.1582f, 20.04f, 16.2043f)
                curveTo(21.32f, 15.8467f, 22.68f, 15.6679f, 24.04f, 15.6679f)
                curveTo(25.4f, 15.6679f, 26.76f, 15.8467f, 28.04f, 16.2043f)
                curveTo(31.1f, 14.1383f, 32.44f, 14.5753f, 32.44f, 14.5753f)
                curveTo(33.32f, 16.7605f, 32.76f, 18.3894f, 32.6f, 18.7867f)
                curveTo(33.62f, 19.8992f, 34.24f, 21.3096f, 34.24f, 23.0577f)
                curveTo(34.24f, 29.1563f, 30.5f, 30.5071f, 26.94f, 30.9044f)
                curveTo(27.52f, 31.401f, 28.02f, 32.3546f, 28.02f, 33.8445f)
                curveTo(28.02f, 35.97f, 28.0f, 37.6784f, 28.0f, 38.2148f)
                curveTo(28.0f, 38.6319f, 28.3f, 39.1286f, 29.1f, 38.9696f)
                curveTo(35.6129f, 36.7858f, 39.9982f, 30.7197f, 40.0f, 23.8921f)
                curveTo(40.0f, 15.1117f, 32.84f, 8.0f, 24.0f, 8.0f)
                close()
            }
        }.build()
        return _github!!
    }

private var _github: ImageVector? = null
