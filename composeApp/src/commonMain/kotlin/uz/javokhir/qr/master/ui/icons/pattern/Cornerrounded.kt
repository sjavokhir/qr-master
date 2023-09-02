package uz.javokhir.qr.master.ui.icons.pattern

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val Cornerrounded: ImageVector
    get() {
        if (_cornerrounded != null) {
            return _cornerrounded!!
        }
        _cornerrounded = Builder(
            name = "Cornerrounded",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(18.0f, 0.0f)
                    horizontalLineTo(6.0f)
                    curveTo(4.4087f, 0.0f, 2.8826f, 0.6321f, 1.7574f, 1.7574f)
                    curveTo(0.6321f, 2.8826f, 0.0f, 4.4087f, 0.0f, 6.0f)
                    lineTo(0.0f, 18.0f)
                    curveTo(0.0f, 19.5913f, 0.6321f, 21.1174f, 1.7574f, 22.2426f)
                    curveTo(2.8826f, 23.3679f, 4.4087f, 24.0f, 6.0f, 24.0f)
                    horizontalLineTo(18.0f)
                    curveTo(19.5913f, 24.0f, 21.1174f, 23.3679f, 22.2426f, 22.2426f)
                    curveTo(23.3679f, 21.1174f, 24.0f, 19.5913f, 24.0f, 18.0f)
                    verticalLineTo(6.0f)
                    curveTo(24.0f, 4.4087f, 23.3679f, 2.8826f, 22.2426f, 1.7574f)
                    curveTo(21.1174f, 0.6321f, 19.5913f, 0.0f, 18.0f, 0.0f)
                    close()
                    moveTo(20.0f, 18.0f)
                    curveTo(20.0f, 18.5304f, 19.7893f, 19.0391f, 19.4142f, 19.4142f)
                    curveTo(19.0391f, 19.7893f, 18.5304f, 20.0f, 18.0f, 20.0f)
                    horizontalLineTo(6.0f)
                    curveTo(5.4696f, 20.0f, 4.9609f, 19.7893f, 4.5858f, 19.4142f)
                    curveTo(4.2107f, 19.0391f, 4.0f, 18.5304f, 4.0f, 18.0f)
                    verticalLineTo(6.0f)
                    curveTo(4.0f, 5.4696f, 4.2107f, 4.9609f, 4.5858f, 4.5858f)
                    curveTo(4.9609f, 4.2107f, 5.4696f, 4.0f, 6.0f, 4.0f)
                    horizontalLineTo(18.0f)
                    curveTo(18.5304f, 4.0f, 19.0391f, 4.2107f, 19.4142f, 4.5858f)
                    curveTo(19.7893f, 4.9609f, 20.0f, 5.4696f, 20.0f, 6.0f)
                    verticalLineTo(18.0f)
                    close()
                }
            }
        }.build()
        return _cornerrounded!!
    }

private var _cornerrounded: ImageVector? = null
