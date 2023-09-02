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

internal val Customize: ImageVector
    get() {
        if (_vector != null) {
            return _vector!!
        }
        _vector = ImageVector.Builder(
            name = "vector",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            group {
                path(
                    fill = null,
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.5f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(6.04829f, 13.6819f)
                    lineTo(2.92996f, 10.5635f)
                    curveTo(2.2408f, 9.8744f, 2.2408f, 8.7577f, 2.93f, 8.0685f)
                    lineTo(7.62496f, 3.37354f)
                    lineTo(13.2383f, 8.98687f)
                    lineTo(8.54329f, 13.6819f)
                    curveTo(7.8541f, 14.3702f, 6.7366f, 14.3702f, 6.0483f, 13.6819f)
                    verticalLineTo(13.6819f)
                    close()
                }
                path(
                    fill = null,
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.5f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(15.7358f, 11.4785f)
                    curveTo(15.7358f, 11.4785f, 13.9717f, 13.3927f, 13.9717f, 14.566f)
                    curveTo(13.9717f, 15.536f, 14.7658f, 16.3302f, 15.7358f, 16.3302f)
                    curveTo(16.7058f, 16.3302f, 17.5f, 15.536f, 17.5f, 14.5652f)
                    curveTo(17.5f, 13.3927f, 15.7358f, 11.4785f, 15.7358f, 11.4785f)
                    close()
                }
                path(
                    fill = null,
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.5f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(7.62489f, 3.3752f)
                    lineTo(6.71655f, 2.4502f)
                }
                path(
                    fill = null,
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.5f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(13.2417f, 8.9834f)
                    horizontalLineTo(2.44165f)
                }
                path(
                    fill = null,
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.5f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(2.84985f, 17.8667f)
                    horizontalLineTo(9.99985f)
                }
            }
        }.build()
        return _vector!!
    }