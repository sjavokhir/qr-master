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

internal val Gallery: ImageVector
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
                    strokeLineWidth = 1.5f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(3f, 7f)
                    curveTo(3f, 5.9391f, 3.4214f, 4.9217f, 4.1716f, 4.1716f)
                    curveTo(4.9217f, 3.4214f, 5.9391f, 3f, 7f, 3f)
                    horizontalLineTo(17f)
                    curveTo(18.0609f, 3f, 19.0783f, 3.4214f, 19.8284f, 4.1716f)
                    curveTo(20.5786f, 4.9217f, 21f, 5.9391f, 21f, 7f)
                    verticalLineTo(17f)
                    curveTo(21f, 18.0609f, 20.5786f, 19.0783f, 19.8284f, 19.8284f)
                    curveTo(19.0783f, 20.5786f, 18.0609f, 21f, 17f, 21f)
                    horizontalLineTo(7f)
                    curveTo(5.9391f, 21f, 4.9217f, 20.5786f, 4.1716f, 19.8284f)
                    curveTo(3.4214f, 19.0783f, 3f, 18.0609f, 3f, 17f)
                    verticalLineTo(7f)
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
                    moveTo(12f, 16.0002f)
                    lineTo(16.586f, 11.4142f)
                    curveTo(16.9611f, 11.0392f, 17.4697f, 10.8286f, 18f, 10.8286f)
                    curveTo(18.5303f, 10.8286f, 19.0389f, 11.0392f, 19.414f, 11.4142f)
                    lineTo(21f, 13.0002f)
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
                    moveTo(7.5f, 9f)
                    curveTo(8.3284f, 9f, 9f, 8.3284f, 9f, 7.5f)
                    curveTo(9f, 6.6716f, 8.3284f, 6f, 7.5f, 6f)
                    curveTo(6.6716f, 6f, 6f, 6.6716f, 6f, 7.5f)
                    curveTo(6f, 8.3284f, 6.6716f, 9f, 7.5f, 9f)
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
                    moveTo(3.353f, 18.6442f)
                    lineTo(7.583f, 14.4142f)
                    curveTo(7.9581f, 14.0392f, 8.4667f, 13.8286f, 8.997f, 13.8286f)
                    curveTo(9.5273f, 13.8286f, 10.0359f, 14.0392f, 10.411f, 14.4142f)
                    lineTo(16.828f, 20.8312f)
                }
            }
        }.build()
        return _vector!!
    }