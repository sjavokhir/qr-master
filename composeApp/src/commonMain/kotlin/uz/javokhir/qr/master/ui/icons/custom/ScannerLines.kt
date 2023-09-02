package uz.javokhir.qr.master.ui.icons.custom

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _vector: ImageVector? = null

internal val ScannerLines: ImageVector
    get() {
        if (_vector != null) {
            return _vector!!
        }
        _vector = ImageVector.Builder(
            name = "vector",
            defaultWidth = 100.dp,
            defaultHeight = 100.dp,
            viewportWidth = 243f,
            viewportHeight = 243f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFFF15C43)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(239f, 71.7543f)
                verticalLineTo(28.7369f)
                curveTo(239f, 15.0697f, 227.93f, 4f, 214.263f, 4f)
                horizontalLineTo(171.246f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFFF15C43)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(71.7543f, 4f)
                horizontalLineTo(28.7369f)
                curveTo(15.0697f, 4f, 4f, 15.0697f, 4f, 28.7369f)
                verticalLineTo(71.7543f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFFF15C43)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4f, 171.246f)
                verticalLineTo(214.263f)
                curveTo(4f, 227.93f, 15.0697f, 239f, 28.7369f, 239f)
                horizontalLineTo(71.7543f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFFF15C43)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(171.246f, 239f)
                horizontalLineTo(214.263f)
                curveTo(227.93f, 239f, 239f, 227.93f, 239f, 214.263f)
                verticalLineTo(171.246f)
            }
        }.build()
        return _vector!!
    }