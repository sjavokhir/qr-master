package uz.javokhir.qr.master.ui.icons.custom

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _vector: ImageVector? = null

internal val Scanner: ImageVector
    get() {
        if (_vector != null) {
            return _vector!!
        }
        _vector = ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = null,
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.8f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(7f, 21f)
                    horizontalLineTo(6f)
                    curveTo(5.2043f, 21f, 4.4413f, 20.6839f, 3.8787f, 20.1213f)
                    curveTo(3.3161f, 19.5587f, 3f, 18.7956f, 3f, 18f)
                    verticalLineTo(17f)
                }
                path(
                    fill = null,
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.8f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(17f, 3f)
                    horizontalLineTo(18f)
                    curveTo(18.7956f, 3f, 19.5587f, 3.3161f, 20.1213f, 3.8787f)
                    curveTo(20.6839f, 4.4413f, 21f, 5.2043f, 21f, 6f)
                    verticalLineTo(7f)
                }
                path(
                    fill = null,
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.8f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(3f, 7f)
                    verticalLineTo(6f)
                    curveTo(3f, 5.2043f, 3.3161f, 4.4413f, 3.8787f, 3.8787f)
                    curveTo(4.4413f, 3.3161f, 5.2043f, 3f, 6f, 3f)
                    horizontalLineTo(7f)
                }
                path(
                    fill = null,
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.8f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(21f, 17f)
                    verticalLineTo(18f)
                    curveTo(21f, 18.7956f, 20.6839f, 19.5587f, 20.1213f, 20.1213f)
                    curveTo(19.5587f, 20.6839f, 18.7956f, 21f, 18f, 21f)
                    horizontalLineTo(17f)
                }
                path(
                    fill = null,
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.8f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(6f, 12f)
                    verticalLineTo(9f)
                    curveTo(6f, 8.2043f, 6.3161f, 7.4413f, 6.8787f, 6.8787f)
                    curveTo(7.4413f, 6.3161f, 8.2043f, 6f, 9f, 6f)
                    horizontalLineTo(15f)
                    curveTo(15.7956f, 6f, 16.5587f, 6.3161f, 17.1213f, 6.8787f)
                    curveTo(17.6839f, 7.4413f, 18f, 8.2043f, 18f, 9f)
                    verticalLineTo(12f)
                }
                path(
                    fill = null,
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.8f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(18f, 15f)
                    curveTo(18f, 15.7956f, 17.6839f, 16.5587f, 17.1213f, 17.1213f)
                    curveTo(16.5587f, 17.6839f, 15.7956f, 18f, 15f, 18f)
                    horizontalLineTo(9f)
                    curveTo(8.2043f, 18f, 7.4413f, 17.6839f, 6.8787f, 17.1213f)
                    curveTo(6.3161f, 16.5587f, 6f, 15.7956f, 6f, 15f)
                }
                path(
                    fill = null,
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.8f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(4f, 12f)
                    horizontalLineTo(21f)
                }
            }
        }.build()
        return _vector!!
    }

