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

internal val Dotrhombus: ImageVector
    get() {
        if (_dotrhombus != null) {
            return _dotrhombus!!
        }
        _dotrhombus = Builder(
            name = "Dotrhombus",
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
                moveTo(12.0711f, 5.0f)
                lineTo(5.0f, 12.071f)
                lineTo(12.0711f, 19.1421f)
                lineTo(19.1421f, 12.071f)
                lineTo(12.0711f, 5.0f)
                close()
            }
        }.build()
        return _dotrhombus!!
    }

private var _dotrhombus: ImageVector? = null
