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

internal val Linkedin: ImageVector
    get() {
        if (_linkedin != null) {
            return _linkedin!!
        }
        _linkedin = Builder(
            name = "Linkedin",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF006699)),
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
                fill = SolidColor(Color(0xFF006699)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.5134f, 19.3316f)
                curveTo(16.5134f, 17.776f, 17.8157f, 16.5134f, 19.421f, 16.5134f)
                horizontalLineTo(52.9472f)
                curveTo(54.5531f, 16.5134f, 55.8547f, 17.776f, 55.8547f, 19.3316f)
                verticalLineTo(53.0371f)
                curveTo(55.8547f, 54.593f, 54.5531f, 55.8547f, 52.9472f, 55.8547f)
                horizontalLineTo(19.421f)
                curveTo(17.8158f, 55.8547f, 16.5134f, 54.5932f, 16.5134f, 53.0375f)
                verticalLineTo(19.3311f)
                verticalLineTo(19.3316f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(28.4685f, 49.437f)
                verticalLineTo(31.7255f)
                horizontalLineTo(22.5814f)
                verticalLineTo(49.437f)
                horizontalLineTo(28.4691f)
                horizontalLineTo(28.4685f)
                close()
                moveTo(25.5262f, 29.3077f)
                curveTo(27.5787f, 29.3077f, 28.8565f, 27.9476f, 28.8565f, 26.2479f)
                curveTo(28.8181f, 24.5096f, 27.5787f, 23.1875f, 25.5652f, 23.1875f)
                curveTo(23.5504f, 23.1875f, 22.2344f, 24.5096f, 22.2344f, 26.2478f)
                curveTo(22.2344f, 27.9475f, 23.5118f, 29.3075f, 25.4876f, 29.3075f)
                horizontalLineTo(25.5257f)
                lineTo(25.5262f, 29.3077f)
                close()
                moveTo(31.7271f, 49.437f)
                horizontalLineTo(37.6137f)
                verticalLineTo(39.5471f)
                curveTo(37.6137f, 39.0185f, 37.6521f, 38.4885f, 37.8076f, 38.1109f)
                curveTo(38.233f, 37.0528f, 39.2016f, 35.9576f, 40.8283f, 35.9576f)
                curveTo(42.9579f, 35.9576f, 43.8104f, 37.5816f, 43.8104f, 39.9628f)
                verticalLineTo(49.437f)
                horizontalLineTo(49.6968f)
                verticalLineTo(39.2817f)
                curveTo(49.6968f, 33.8417f, 46.7929f, 31.3102f, 42.9198f, 31.3102f)
                curveTo(39.7444f, 31.3102f, 38.3498f, 33.085f, 37.5749f, 34.2939f)
                horizontalLineTo(37.6141f)
                verticalLineTo(31.7261f)
                horizontalLineTo(31.7274f)
                curveTo(31.8042f, 33.3876f, 31.7269f, 49.4376f, 31.7269f, 49.4376f)
                lineTo(31.7271f, 49.437f)
                close()
            }
        }.build()
        return _linkedin!!
    }

private var _linkedin: ImageVector? = null
