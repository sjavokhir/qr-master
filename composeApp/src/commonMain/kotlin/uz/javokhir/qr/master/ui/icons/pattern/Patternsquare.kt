package uz.javokhir.qr.master.ui.icons.pattern

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val Patternsquare: ImageVector
    get() {
        if (_patternsquare != null) {
            return _patternsquare!!
        }
        _patternsquare = Builder(
            name = "Patternsquare",
            defaultWidth = 64.0.dp,
            defaultHeight = 64.0.dp,
            viewportWidth = 64.0f,
            viewportHeight = 64.0f
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
                moveTo(38.4f, 25.6f)
                verticalLineTo(12.8f)
                horizontalLineTo(32.0f)
                verticalLineTo(19.2f)
                horizontalLineTo(25.6f)
                verticalLineTo(25.6f)
                horizontalLineTo(32.0f)
                verticalLineTo(32.0f)
                horizontalLineTo(38.4f)
                verticalLineTo(38.4f)
                horizontalLineTo(44.8f)
                verticalLineTo(44.8f)
                horizontalLineTo(38.4f)
                verticalLineTo(51.2f)
                horizontalLineTo(51.2f)
                verticalLineTo(25.6f)
                horizontalLineTo(38.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(51.2f, 12.8f)
                horizontalLineTo(44.8f)
                verticalLineTo(19.2f)
                horizontalLineTo(51.2f)
                verticalLineTo(12.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(25.6f, 19.2f)
                verticalLineTo(12.8f)
                horizontalLineTo(12.8f)
                verticalLineTo(25.6f)
                horizontalLineTo(19.2f)
                verticalLineTo(19.2f)
                horizontalLineTo(25.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(32.0f, 38.4f)
                verticalLineTo(32.0f)
                horizontalLineTo(25.6f)
                verticalLineTo(25.6f)
                horizontalLineTo(19.2f)
                verticalLineTo(32.0f)
                horizontalLineTo(12.8f)
                verticalLineTo(51.2f)
                horizontalLineTo(32.0f)
                verticalLineTo(44.8f)
                horizontalLineTo(38.4f)
                verticalLineTo(38.4f)
                horizontalLineTo(32.0f)
                close()
                moveTo(25.6f, 44.8f)
                horizontalLineTo(19.2f)
                verticalLineTo(38.4f)
                horizontalLineTo(25.6f)
                verticalLineTo(44.8f)
                close()
            }
        }.build()
        return _patternsquare!!
    }

private var _patternsquare: ImageVector? = null
