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

internal val Figma: ImageVector
    get() {
        if (_figma != null) {
            return _figma!!
        }
        _figma = Builder(
            name = "Figma",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF2C2C2C)),
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
                fill = SolidColor(Color(0xFF0ACF83)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 39.0f)
                curveTo(21.76f, 39.0f, 24.0f, 36.76f, 24.0f, 34.0f)
                verticalLineTo(29.0f)
                horizontalLineTo(19.0f)
                curveTo(16.24f, 29.0f, 14.0f, 31.24f, 14.0f, 34.0f)
                curveTo(14.0f, 36.76f, 16.24f, 39.0f, 19.0f, 39.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA259FF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0f, 24.0f)
                curveTo(14.0f, 21.24f, 16.24f, 19.0f, 19.0f, 19.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(29.0f)
                horizontalLineTo(19.0f)
                curveTo(16.24f, 29.0f, 14.0f, 26.76f, 14.0f, 24.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF24E1E)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0f, 14.0f)
                curveTo(14.0f, 11.24f, 16.24f, 9.0f, 19.0f, 9.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                curveTo(16.24f, 19.0f, 14.0f, 16.76f, 14.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFF7262)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(24.0f, 9.0f)
                horizontalLineTo(29.0f)
                curveTo(31.76f, 9.0f, 34.0f, 11.24f, 34.0f, 14.0f)
                curveTo(34.0f, 16.76f, 31.76f, 19.0f, 29.0f, 19.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1ABCFE)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(34.0f, 24.0f)
                curveTo(34.0f, 26.76f, 31.76f, 29.0f, 29.0f, 29.0f)
                curveTo(26.24f, 29.0f, 24.0f, 26.76f, 24.0f, 24.0f)
                curveTo(24.0f, 21.24f, 26.24f, 19.0f, 29.0f, 19.0f)
                curveTo(31.76f, 19.0f, 34.0f, 21.24f, 34.0f, 24.0f)
                close()
            }
        }.build()
        return _figma!!
    }

private var _figma: ImageVector? = null
