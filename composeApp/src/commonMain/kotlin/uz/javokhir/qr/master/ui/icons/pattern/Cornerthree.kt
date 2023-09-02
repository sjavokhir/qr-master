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

internal val Cornerthree: ImageVector
    get() {
        if (_cornerthree != null) {
            return _cornerthree!!
        }
        _cornerthree = Builder(
            name = "Cornerthree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 3.5f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 8.0f)
                curveTo(2.0f, 4.6863f, 4.6863f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(19.3137f, 2.0f, 22.0f, 4.6863f, 22.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 19.3137f, 19.3137f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                close()
            }
        }.build()
        return _cornerthree!!
    }

private var _cornerthree: ImageVector? = null
