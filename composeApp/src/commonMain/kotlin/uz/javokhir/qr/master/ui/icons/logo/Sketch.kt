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

internal val Sketch: ImageVector
    get() {
        if (_sketch != null) {
            return _sketch!!
        }
        _sketch = Builder(
            name = "Sketch",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF9F9F9)),
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
                fill = SolidColor(Color(0xFFFDB300)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.9818f, 10.9548f)
                lineTo(24.0f, 10.0f)
                lineTo(33.0182f, 10.9548f)
                lineTo(40.0f, 20.341f)
                lineTo(24.0f, 39.0f)
                lineTo(8.0f, 20.341f)
                lineTo(14.9818f, 10.9548f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEA6C00)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.4808f, 20.3409f)
                lineTo(24.0f, 39.0f)
                lineTo(8.0f, 20.3409f)
                horizontalLineTo(14.4808f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEA6C00)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(33.5192f, 20.3409f)
                lineTo(24.0f, 39.0f)
                lineTo(40.0f, 20.3409f)
                horizontalLineTo(33.5192f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDAD00)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.481f, 20.3409f)
                horizontalLineTo(33.5194f)
                lineTo(24.0002f, 39.0f)
                lineTo(14.481f, 20.3409f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDD231)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(24.0002f, 10.0f)
                lineTo(14.9819f, 10.9548f)
                lineTo(14.481f, 20.341f)
                lineTo(24.0002f, 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDD231)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(23.9998f, 10.0f)
                lineTo(33.0181f, 10.9548f)
                lineTo(33.519f, 20.341f)
                lineTo(23.9998f, 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDAD00)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(40.0f, 20.3409f)
                lineTo(33.0181f, 10.9548f)
                lineTo(33.5192f, 20.3409f)
                horizontalLineTo(40.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDAD00)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 20.3409f)
                lineTo(14.9818f, 10.9548f)
                lineTo(14.4808f, 20.3409f)
                horizontalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEEEB7)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(24.0002f, 10.0f)
                lineTo(14.481f, 20.341f)
                horizontalLineTo(33.5194f)
                lineTo(24.0002f, 10.0f)
                close()
            }
        }.build()
        return _sketch!!
    }

private var _sketch: ImageVector? = null
