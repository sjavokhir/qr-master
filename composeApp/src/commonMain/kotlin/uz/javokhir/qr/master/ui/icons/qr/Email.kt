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

internal val Email: ImageVector
    get() {
        if (_email != null) {
            return _email!!
        }
        _email = Builder(
            name = "Email",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFF4545)),
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
                fill = SolidColor(Color(0xFFFF4545)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 52.0f)
                curveTo(18.2f, 52.0f, 17.5f, 51.7f, 16.9f, 51.1f)
                curveTo(16.3f, 50.5f, 16.0f, 49.8f, 16.0f, 49.0f)
                verticalLineTo(23.0f)
                curveTo(16.0f, 22.2f, 16.3f, 21.5f, 16.9f, 20.9f)
                curveTo(17.5f, 20.3f, 18.2f, 20.0f, 19.0f, 20.0f)
                horizontalLineTo(53.0f)
                curveTo(53.8f, 20.0f, 54.5f, 20.3f, 55.1f, 20.9f)
                curveTo(55.7f, 21.5f, 56.0f, 22.2f, 56.0f, 23.0f)
                verticalLineTo(49.0f)
                curveTo(56.0f, 49.8f, 55.7f, 50.5f, 55.1f, 51.1f)
                curveTo(54.5f, 51.7f, 53.8f, 52.0f, 53.0f, 52.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(36.0f, 36.6f)
                curveTo(36.1667f, 36.6f, 36.3083f, 36.575f, 36.425f, 36.525f)
                curveTo(36.5417f, 36.475f, 36.6667f, 36.4167f, 36.8f, 36.35f)
                lineTo(52.5f, 26.1f)
                curveTo(52.6667f, 26.0f, 52.7917f, 25.8667f, 52.875f, 25.7f)
                curveTo(52.9583f, 25.5333f, 53.0f, 25.35f, 53.0f, 25.15f)
                curveTo(53.0f, 24.7167f, 52.8083f, 24.375f, 52.425f, 24.125f)
                curveTo(52.0417f, 23.875f, 51.65f, 23.8833f, 51.25f, 24.15f)
                lineTo(36.0f, 33.9f)
                lineTo(20.8f, 24.15f)
                curveTo(20.4f, 23.8833f, 20.0f, 23.8667f, 19.6f, 24.1f)
                curveTo(19.2f, 24.3333f, 19.0f, 24.6667f, 19.0f, 25.1f)
                curveTo(19.0f, 25.3f, 19.05f, 25.4917f, 19.15f, 25.675f)
                curveTo(19.25f, 25.8583f, 19.3667f, 26.0f, 19.5f, 26.1f)
                lineTo(35.2f, 36.35f)
                curveTo(35.3333f, 36.4167f, 35.4583f, 36.475f, 35.575f, 36.525f)
                curveTo(35.6917f, 36.575f, 35.8333f, 36.6f, 36.0f, 36.6f)
                close()
            }
        }.build()
        return _email!!
    }

private var _email: ImageVector? = null
