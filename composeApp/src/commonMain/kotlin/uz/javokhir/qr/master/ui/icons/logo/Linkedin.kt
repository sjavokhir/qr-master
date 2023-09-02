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

internal val Linkedin: ImageVector
    get() {
        if (_linkedin != null) {
            return _linkedin!!
        }
        _linkedin = Builder(
            name = "Linkedin", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
            viewportWidth = 48.0f, viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0A66C2)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(24.0f, 24.0f)
                moveToRelative(-24.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(36.998f, 35.0f)
                horizontalLineTo(32.0288f)
                verticalLineTo(27.2045f)
                curveTo(32.0288f, 25.3455f, 31.9957f, 22.9525f, 29.4444f, 22.9525f)
                curveTo(26.8562f, 22.9525f, 26.4602f, 24.9778f, 26.4602f, 27.0691f)
                verticalLineTo(34.9994f)
                horizontalLineTo(21.4912f)
                verticalLineTo(18.9687f)
                horizontalLineTo(26.2615f)
                verticalLineTo(21.1594f)
                horizontalLineTo(26.3284f)
                curveTo(27.2997f, 19.4958f, 29.1123f, 18.4985f, 31.035f, 18.57f)
                curveTo(36.0714f, 18.57f, 37.0001f, 21.8885f, 37.0001f, 26.2058f)
                lineTo(36.998f, 35.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.8843f, 16.7773f)
                curveTo(15.884f, 16.7773f, 15.8838f, 16.7773f, 15.8837f, 16.7773f)
                curveTo(14.3017f, 16.7773f, 13.0f, 15.4734f, 13.0f, 13.8887f)
                curveTo(13.0f, 12.304f, 14.3017f, 11.0f, 15.8837f, 11.0f)
                curveTo(17.4655f, 11.0f, 18.767f, 12.3037f, 18.7673f, 13.8881f)
                curveTo(18.7673f, 13.8883f, 18.7673f, 13.8884f, 18.7673f, 13.8887f)
                curveTo(18.7673f, 15.4731f, 17.4659f, 16.7772f, 15.8843f, 16.7773f)
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.3688f, 35.0f)
                horizontalLineTo(13.3945f)
                verticalLineTo(18.9686f)
                horizontalLineTo(18.3688f)
                verticalLineTo(35.0f)
                close()
            }
        }
            .build()
        return _linkedin!!
    }

private var _linkedin: ImageVector? = null
