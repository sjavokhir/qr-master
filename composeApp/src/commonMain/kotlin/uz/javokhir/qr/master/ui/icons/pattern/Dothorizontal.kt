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

internal val Dothorizontal: ImageVector
    get() {
        if (_dothorizontal != null) {
            return _dothorizontal!!
        }
        _dothorizontal = Builder(
            name = "Dothorizontal",
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
                moveTo(7.5f, 6.0f)
                lineTo(16.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 7.5f)
                lineTo(18.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 9.0f)
                lineTo(7.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 7.5f)
                lineTo(6.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 6.0f)
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
                moveTo(7.5f, 10.5f)
                lineTo(16.5f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 12.0f)
                lineTo(18.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 13.5f)
                lineTo(7.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 10.5f)
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
                moveTo(7.5f, 15.0f)
                lineTo(16.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 16.5f)
                lineTo(18.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 18.0f)
                lineTo(7.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 16.5f)
                lineTo(6.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 15.0f)
                close()
            }
        }.build()
        return _dothorizontal!!
    }

private var _dothorizontal: ImageVector? = null
