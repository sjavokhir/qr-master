package uz.javokhir.qr.master.ui.icons.qr

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(
            name = "Phone",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF009688)),
                stroke = null,
                fillAlpha = 0.1f,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(-72.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF009688)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(51.75f, 54.0f)
                curveTo(47.6833f, 54.0f, 43.6417f, 53.0f, 39.625f, 51.0f)
                curveTo(35.6083f, 49.0f, 32.0f, 46.4f, 28.8f, 43.2f)
                curveTo(25.6f, 40.0f, 23.0f, 36.3917f, 21.0f, 32.375f)
                curveTo(19.0f, 28.3583f, 18.0f, 24.3167f, 18.0f, 20.25f)
                curveTo(18.0f, 19.6167f, 18.2167f, 19.0833f, 18.65f, 18.65f)
                curveTo(19.0833f, 18.2167f, 19.6167f, 18.0f, 20.25f, 18.0f)
                horizontalLineTo(27.25f)
                curveTo(27.7167f, 18.0f, 28.125f, 18.1583f, 28.475f, 18.475f)
                curveTo(28.825f, 18.7917f, 29.05f, 19.2167f, 29.15f, 19.75f)
                lineTo(30.5f, 26.05f)
                curveTo(30.5667f, 26.5167f, 30.5583f, 26.9417f, 30.475f, 27.325f)
                curveTo(30.3917f, 27.7083f, 30.2167f, 28.0333f, 29.95f, 28.3f)
                lineTo(24.95f, 33.35f)
                curveTo(26.8167f, 36.45f, 28.9083f, 39.15f, 31.225f, 41.45f)
                curveTo(33.5417f, 43.75f, 36.1667f, 45.7f, 39.1f, 47.3f)
                lineTo(43.85f, 42.4f)
                curveTo(44.1833f, 42.0333f, 44.5667f, 41.775f, 45.0f, 41.625f)
                curveTo(45.4333f, 41.475f, 45.8667f, 41.45f, 46.3f, 41.55f)
                lineTo(52.25f, 42.85f)
                curveTo(52.75f, 42.95f, 53.1667f, 43.2f, 53.5f, 43.6f)
                curveTo(53.8333f, 44.0f, 54.0f, 44.4667f, 54.0f, 45.0f)
                verticalLineTo(51.75f)
                curveTo(54.0f, 52.3833f, 53.7833f, 52.9167f, 53.35f, 53.35f)
                curveTo(52.9167f, 53.7833f, 52.3833f, 54.0f, 51.75f, 54.0f)
                close()
            }
        }.build()
        return _phone!!
    }

private var _phone: ImageVector? = null
