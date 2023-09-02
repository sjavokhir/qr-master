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

internal val Sms: ImageVector
    get() {
        if (_sms != null) {
            return _sms!!
        }
        _sms = Builder(
            name = "Sms",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF00BCD4)),
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
                fill = SolidColor(Color(0xFF00BCD4)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(27.3f, 33.85f)
                curveTo(27.8667f, 33.85f, 28.3417f, 33.6583f, 28.725f, 33.275f)
                curveTo(29.1083f, 32.8917f, 29.3f, 32.4167f, 29.3f, 31.85f)
                curveTo(29.3f, 31.2833f, 29.1083f, 30.8083f, 28.725f, 30.425f)
                curveTo(28.3417f, 30.0417f, 27.8667f, 29.85f, 27.3f, 29.85f)
                curveTo(26.7333f, 29.85f, 26.2583f, 30.0417f, 25.875f, 30.425f)
                curveTo(25.4917f, 30.8083f, 25.3f, 31.2833f, 25.3f, 31.85f)
                curveTo(25.3f, 32.4167f, 25.4917f, 32.8917f, 25.875f, 33.275f)
                curveTo(26.2583f, 33.6583f, 26.7333f, 33.85f, 27.3f, 33.85f)
                close()
                moveTo(36.15f, 33.85f)
                curveTo(36.7167f, 33.85f, 37.1917f, 33.6583f, 37.575f, 33.275f)
                curveTo(37.9583f, 32.8917f, 38.15f, 32.4167f, 38.15f, 31.85f)
                curveTo(38.15f, 31.2833f, 37.9583f, 30.8083f, 37.575f, 30.425f)
                curveTo(37.1917f, 30.0417f, 36.7167f, 29.85f, 36.15f, 29.85f)
                curveTo(35.5833f, 29.85f, 35.1083f, 30.0417f, 34.725f, 30.425f)
                curveTo(34.3417f, 30.8083f, 34.15f, 31.2833f, 34.15f, 31.85f)
                curveTo(34.15f, 32.4167f, 34.3417f, 32.8917f, 34.725f, 33.275f)
                curveTo(35.1083f, 33.6583f, 35.5833f, 33.85f, 36.15f, 33.85f)
                close()
                moveTo(44.65f, 33.85f)
                curveTo(45.2167f, 33.85f, 45.6917f, 33.6583f, 46.075f, 33.275f)
                curveTo(46.4583f, 32.8917f, 46.65f, 32.4167f, 46.65f, 31.85f)
                curveTo(46.65f, 31.2833f, 46.4583f, 30.8083f, 46.075f, 30.425f)
                curveTo(45.6917f, 30.0417f, 45.2167f, 29.85f, 44.65f, 29.85f)
                curveTo(44.0833f, 29.85f, 43.6083f, 30.0417f, 43.225f, 30.425f)
                curveTo(42.8417f, 30.8083f, 42.65f, 31.2833f, 42.65f, 31.85f)
                curveTo(42.65f, 32.4167f, 42.8417f, 32.8917f, 43.225f, 33.275f)
                curveTo(43.6083f, 33.6583f, 44.0833f, 33.85f, 44.65f, 33.85f)
                close()
                moveTo(24.0f, 48.0f)
                lineTo(18.55f, 53.45f)
                curveTo(18.0833f, 53.9167f, 17.5417f, 54.0224f, 16.925f, 53.7672f)
                curveTo(16.3083f, 53.512f, 16.0f, 53.0563f, 16.0f, 52.4f)
                verticalLineTo(19.0f)
                curveTo(16.0f, 18.2f, 16.3f, 17.5f, 16.9f, 16.9f)
                curveTo(17.5f, 16.3f, 18.2f, 16.0f, 19.0f, 16.0f)
                horizontalLineTo(53.0f)
                curveTo(53.8f, 16.0f, 54.5f, 16.3f, 55.1f, 16.9f)
                curveTo(55.7f, 17.5f, 56.0f, 18.2f, 56.0f, 19.0f)
                verticalLineTo(45.0f)
                curveTo(56.0f, 45.8f, 55.7f, 46.5f, 55.1f, 47.1f)
                curveTo(54.5f, 47.7f, 53.8f, 48.0f, 53.0f, 48.0f)
                horizontalLineTo(24.0f)
                close()
            }
        }.build()
        return _sms!!
    }

private var _sms: ImageVector? = null
