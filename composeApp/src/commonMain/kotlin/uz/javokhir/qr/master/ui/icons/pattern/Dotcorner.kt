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

internal val Dotcorner: ImageVector
    get() {
        if (_dotcorner != null) {
            return _dotcorner!!
        }
        _dotcorner = Builder(
            name = "Dotcorner",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
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
                moveTo(14.0f, 6.0f)
                horizontalLineTo(10.0f)
                curveTo(7.7909f, 6.0f, 6.0f, 7.7909f, 6.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(6.0f, 16.2091f, 7.7909f, 18.0f, 10.0f, 18.0f)
                horizontalLineTo(14.0f)
                curveTo(16.2091f, 18.0f, 18.0f, 16.2091f, 18.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(18.0f, 7.7909f, 16.2091f, 6.0f, 14.0f, 6.0f)
                close()
            }
        }.build()
        return _dotcorner!!
    }

private var _dotcorner: ImageVector? = null
