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

internal val Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(
            name = "Google",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF7F7F7)),
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
                fill = SolidColor(Color(0xFF4285F4)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(38.9999f, 24.36f)
                curveTo(38.9999f, 23.3066f, 38.9075f, 22.3066f, 38.7492f, 21.3333f)
                horizontalLineTo(23.8364f)
                verticalLineTo(27.3466f)
                horizontalLineTo(32.375f)
                curveTo(31.9922f, 29.32f, 30.8705f, 30.9866f, 29.2076f, 32.12f)
                verticalLineTo(36.12f)
                horizontalLineTo(34.3017f)
                curveTo(37.2843f, 33.3333f, 38.9999f, 29.2266f, 38.9999f, 24.36f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF34A853)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(23.8365f, 40.0f)
                curveTo(28.1124f, 40.0f, 31.6888f, 38.56f, 34.3018f, 36.12f)
                lineTo(29.2077f, 32.12f)
                curveTo(27.7824f, 33.08f, 25.9744f, 33.6667f, 23.8365f, 33.6667f)
                curveTo(19.7058f, 33.6667f, 16.2086f, 30.8533f, 14.9548f, 27.0533f)
                horizontalLineTo(9.7024f)
                verticalLineTo(31.1733f)
                curveTo(12.3022f, 36.4f, 17.6471f, 40.0f, 23.8365f, 40.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBBC05)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.9549f, 27.0533f)
                curveTo(14.6249f, 26.0933f, 14.4534f, 25.0667f, 14.4534f, 24.0f)
                curveTo(14.4534f, 22.9333f, 14.6381f, 21.9067f, 14.9549f, 20.9467f)
                verticalLineTo(16.8267f)
                horizontalLineTo(9.7024f)
                curveTo(8.6203f, 18.9867f, 8.0f, 21.4133f, 8.0f, 24.0f)
                curveTo(8.0f, 26.5867f, 8.6203f, 29.0133f, 9.7024f, 31.1733f)
                lineTo(14.9549f, 27.0533f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEA4335)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(23.8365f, 14.3333f)
                curveTo(26.1724f, 14.3333f, 28.2575f, 15.1467f, 29.9072f, 16.7333f)
                lineTo(34.4206f, 12.1733f)
                curveTo(31.6888f, 9.5867f, 28.1124f, 8.0f, 23.8365f, 8.0f)
                curveTo(17.6471f, 8.0f, 12.3022f, 11.6f, 9.7024f, 16.8267f)
                lineTo(14.9548f, 20.9467f)
                curveTo(16.2086f, 17.1467f, 19.7058f, 14.3333f, 23.8365f, 14.3333f)
                close()
            }
        }.build()
        return _google!!
    }

private var _google: ImageVector? = null
