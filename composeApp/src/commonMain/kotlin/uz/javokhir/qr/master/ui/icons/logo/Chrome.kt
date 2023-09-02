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

internal val Chrome: ImageVector
    get() {
        if (_chrome != null) {
            return _chrome!!
        }
        _chrome = Builder(
            name = "Chrome",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF7F7F7)),
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
                fill = linearGradient(
                    0.0f to Color(0xFFD93025),
                    1.0f to Color(0xFFEA4335),
                    start = Offset(10.1438f, 30.638f),
                    end = Offset(37.8561f, 30.638f)
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(37.8561f, 15.9995f)
                curveTo(34.9975f, 11.0493f, 29.715f, 8.0f, 23.9984f, 8.0f)
                curveTo(18.2817f, 8.0f, 12.9992f, 11.0493f, 10.1406f, 15.9995f)
                lineTo(11.1007f, 33.2799f)
                lineTo(37.8561f, 15.9995f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF1E8E3E),
                    1.0f to Color(0xFF34A853),
                    start = Offset(41.5748f, 33.7497f),
                    end = Offset(33.0388f, 7.98597f)
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0727f, 27.9997f)
                lineTo(10.1439f, 15.9995f)
                curveTo(7.2854f, 20.9499f, 7.2854f, 27.0491f, 10.1438f, 31.9996f)
                curveTo(13.0021f, 36.9501f, 18.2847f, 39.9998f, 24.0016f, 40.0f)
                lineTo(39.6836f, 23.9996f)
                lineTo(17.0727f, 27.9997f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFFCC934),
                    1.0f to Color(0xFFFBBC04),
                    start = Offset(29.6505f, 50.3946f),
                    end = Offset(49.9399f, 34.8078f)
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(30.9303f, 27.9997f)
                lineTo(24.0015f, 40.0f)
                curveTo(29.7178f, 39.9987f, 34.9993f, 36.9485f, 37.8569f, 31.9982f)
                curveTo(40.7145f, 27.048f, 40.7142f, 20.9494f, 37.856f, 15.9995f)
                horizontalLineTo(24.0015f)
                lineTo(30.9303f, 27.9997f)
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
                moveTo(24.0015f, 31.9998f)
                curveTo(26.86f, 31.9998f, 29.5013f, 30.475f, 30.9306f, 27.9997f)
                curveTo(32.3598f, 25.5245f, 32.3598f, 22.4748f, 30.9306f, 19.9995f)
                curveTo(29.5013f, 17.5243f, 26.86f, 15.9995f, 24.0015f, 15.9995f)
                curveTo(19.5827f, 15.9995f, 16.0005f, 19.5813f, 16.0005f, 23.9996f)
                curveTo(16.0005f, 28.418f, 19.5827f, 31.9998f, 24.0015f, 31.9998f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1A73E8)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(24.0018f, 30.3358f)
                curveTo(26.2658f, 30.3358f, 28.3577f, 29.1281f, 29.4897f, 27.1677f)
                curveTo(30.6216f, 25.2073f, 30.6216f, 22.792f, 29.4897f, 20.8316f)
                curveTo(28.3577f, 18.8712f, 26.2658f, 17.6635f, 24.0018f, 17.6635f)
                curveTo(20.5021f, 17.6635f, 17.665f, 20.5003f, 17.665f, 23.9997f)
                curveTo(17.665f, 27.499f, 20.5021f, 30.3358f, 24.0018f, 30.3358f)
                verticalLineTo(30.3358f)
                close()
            }
        }.build()
        return _chrome!!
    }

private var _chrome: ImageVector? = null
