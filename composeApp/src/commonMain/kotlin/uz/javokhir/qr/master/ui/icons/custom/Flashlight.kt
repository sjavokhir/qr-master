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

internal val Flashlight: ImageVector
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
                    moveTo(10.443f, 9.49488f)
                    lineTo(3.673f, 16.2649f)
                    curveTo(3.2425f, 16.6961f, 3.0007f, 17.2805f, 3.0007f, 17.8899f)
                    curveTo(3.0007f, 18.4992f, 3.2425f, 19.0837f, 3.673f, 19.5149f)
                    lineTo(4.485f, 20.3269f)
                    curveTo(4.9162f, 20.7574f, 5.5007f, 20.9992f, 6.11f, 20.9992f)
                    curveTo(6.7193f, 20.9992f, 7.3038f, 20.7574f, 7.735f, 20.3269f)
                    lineTo(14.505f, 13.5569f)
                    curveTo(14.8567f, 13.2054f, 15.3128f, 12.9773f, 15.805f, 12.9069f)
                    lineTo(17.132f, 12.7179f)
                    curveTo(17.6242f, 12.6474f, 18.0803f, 12.4194f, 18.432f, 12.0679f)
                    lineTo(20.332f, 10.1679f)
                    curveTo(20.7622f, 9.7367f, 21.0038f, 9.1525f, 21.0038f, 8.5434f)
                    curveTo(21.0038f, 7.9343f, 20.7622f, 7.3501f, 20.332f, 6.9189f)
                    lineTo(17.082f, 3.66888f)
                    curveTo(16.6508f, 3.2387f, 16.0666f, 2.9971f, 15.4575f, 2.9971f)
                    curveTo(14.8484f, 2.9971f, 14.2642f, 3.2387f, 13.833f, 3.6689f)
                    lineTo(11.933f, 5.56888f)
                    curveTo(11.5815f, 5.9206f, 11.3535f, 6.3767f, 11.283f, 6.8689f)
                    lineTo(11.093f, 8.19988f)
                    curveTo(11.0215f, 8.6903f, 10.7935f, 9.1445f, 10.443f, 9.4949f)
                    verticalLineTo(9.49488f)
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
                    moveTo(11f, 13f)
                    lineTo(12.5f, 11.5f)
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
                    moveTo(18.702f, 11.7969f)
                    lineTo(12.203f, 5.29785f)
                }
            }
        }.build()
        return _vector!!
    }