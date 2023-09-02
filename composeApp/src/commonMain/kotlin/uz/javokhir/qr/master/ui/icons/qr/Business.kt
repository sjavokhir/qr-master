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

internal val Business: ImageVector
    get() {
        if (_business != null) {
            return _business!!
        }
        _business = Builder(
            name = "Business",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF35465C)),
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
                fill = SolidColor(Color(0xFF35465C)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.0f, 54.0f)
                curveTo(20.175f, 54.0f, 19.4688f, 53.7062f, 18.8813f, 53.1188f)
                curveTo(18.2938f, 52.5312f, 18.0f, 51.825f, 18.0f, 51.0f)
                verticalLineTo(29.25f)
                curveTo(18.0f, 28.425f, 18.2938f, 27.7188f, 18.8813f, 27.1313f)
                curveTo(19.4688f, 26.5437f, 20.175f, 26.25f, 21.0f, 26.25f)
                horizontalLineTo(26.25f)
                verticalLineTo(21.0f)
                curveTo(26.25f, 20.175f, 26.5437f, 19.4688f, 27.1313f, 18.8813f)
                curveTo(27.7188f, 18.2938f, 28.425f, 18.0f, 29.25f, 18.0f)
                horizontalLineTo(42.75f)
                curveTo(43.575f, 18.0f, 44.2812f, 18.2938f, 44.8687f, 18.8813f)
                curveTo(45.4563f, 19.4688f, 45.75f, 20.175f, 45.75f, 21.0f)
                verticalLineTo(34.5f)
                horizontalLineTo(51.0f)
                curveTo(51.825f, 34.5f, 52.5312f, 34.7938f, 53.1188f, 35.3813f)
                curveTo(53.7062f, 35.9688f, 54.0f, 36.675f, 54.0f, 37.5f)
                verticalLineTo(51.0f)
                curveTo(54.0f, 51.825f, 53.7062f, 52.5312f, 53.1188f, 53.1188f)
                curveTo(52.5312f, 53.7062f, 51.825f, 54.0f, 51.0f, 54.0f)
                horizontalLineTo(38.65f)
                verticalLineTo(45.75f)
                horizontalLineTo(33.35f)
                verticalLineTo(54.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.0f, 51.0f)
                horizontalLineTo(26.25f)
                verticalLineTo(45.75f)
                horizontalLineTo(21.0f)
                verticalLineTo(51.0f)
                close()
                moveTo(21.0f, 42.75f)
                horizontalLineTo(26.25f)
                verticalLineTo(37.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(42.75f)
                close()
                moveTo(21.0f, 34.5f)
                horizontalLineTo(26.25f)
                verticalLineTo(29.25f)
                horizontalLineTo(21.0f)
                verticalLineTo(34.5f)
                close()
                moveTo(29.25f, 42.75f)
                horizontalLineTo(34.5f)
                verticalLineTo(37.5f)
                horizontalLineTo(29.25f)
                verticalLineTo(42.75f)
                close()
                moveTo(29.25f, 34.5f)
                horizontalLineTo(34.5f)
                verticalLineTo(29.25f)
                horizontalLineTo(29.25f)
                verticalLineTo(34.5f)
                close()
                moveTo(29.25f, 26.25f)
                horizontalLineTo(34.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(29.25f)
                verticalLineTo(26.25f)
                close()
                moveTo(37.5f, 42.75f)
                horizontalLineTo(42.75f)
                verticalLineTo(37.5f)
                horizontalLineTo(37.5f)
                verticalLineTo(42.75f)
                close()
                moveTo(37.5f, 34.5f)
                horizontalLineTo(42.75f)
                verticalLineTo(29.25f)
                horizontalLineTo(37.5f)
                verticalLineTo(34.5f)
                close()
                moveTo(37.5f, 26.25f)
                horizontalLineTo(42.75f)
                verticalLineTo(21.0f)
                horizontalLineTo(37.5f)
                verticalLineTo(26.25f)
                close()
                moveTo(45.75f, 51.0f)
                horizontalLineTo(51.0f)
                verticalLineTo(45.75f)
                horizontalLineTo(45.75f)
                verticalLineTo(51.0f)
                close()
                moveTo(45.75f, 42.75f)
                horizontalLineTo(51.0f)
                verticalLineTo(37.5f)
                horizontalLineTo(45.75f)
                verticalLineTo(42.75f)
                close()
            }
        }.build()
        return _business!!
    }

private var _business: ImageVector? = null
