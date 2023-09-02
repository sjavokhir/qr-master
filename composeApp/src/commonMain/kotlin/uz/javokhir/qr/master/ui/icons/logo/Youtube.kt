package uz.javokhir.qr.master.ui.icons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(
            name = "Youtube",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFF0000)),
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
                pathFillType = EvenOdd
            ) {
                moveTo(36.4673f, 13.6648f)
                curveTo(37.8434f, 14.0275f, 38.932f, 15.0952f, 39.3017f, 16.4451f)
                curveTo(39.9795f, 18.9029f, 40.0f, 24.0f, 40.0f, 24.0f)
                curveTo(40.0f, 24.0f, 40.0f, 29.1172f, 39.3222f, 31.5549f)
                curveTo(38.9525f, 32.9048f, 37.8639f, 33.9725f, 36.4878f, 34.3352f)
                curveTo(34.0026f, 35.0f, 24.0f, 35.0f, 24.0f, 35.0f)
                curveTo(24.0f, 35.0f, 13.9974f, 35.0f, 11.5122f, 34.3352f)
                curveTo(10.1361f, 33.9725f, 9.0475f, 32.9048f, 8.6778f, 31.5549f)
                curveTo(8.0f, 29.0971f, 8.0f, 24.0f, 8.0f, 24.0f)
                curveTo(8.0f, 24.0f, 8.0f, 18.9029f, 8.6573f, 16.4652f)
                curveTo(9.027f, 15.1154f, 10.1155f, 14.0476f, 11.4917f, 13.685f)
                curveTo(13.9769f, 13.0201f, 23.9795f, 13.0f, 23.9795f, 13.0f)
                curveTo(23.9795f, 13.0f, 33.982f, 13.0f, 36.4673f, 13.6648f)
                close()
                moveTo(29.0937f, 24.0f)
                lineTo(20.7959f, 28.7143f)
                verticalLineTo(19.2857f)
                lineTo(29.0937f, 24.0f)
                close()
            }
        }.build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
