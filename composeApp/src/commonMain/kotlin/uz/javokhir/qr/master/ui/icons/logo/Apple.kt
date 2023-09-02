package uz.javokhir.qr.master.ui.icons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(
            name = "Apple",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
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
                fill = SolidColor(Color(0xFFffffff)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(29.9393f, 8.5741f)
                curveTo(29.9393f, 10.0369f, 29.2932f, 11.4997f, 28.3813f, 12.5552f)
                curveTo(27.4122f, 13.7218f, 25.7403f, 14.5921f, 24.4103f, 14.5923f)
                curveTo(24.2583f, 14.5923f, 24.1062f, 14.5736f, 24.0113f, 14.5551f)
                curveTo(23.9923f, 14.4811f, 23.9542f, 14.2588f, 23.9542f, 14.0366f)
                curveTo(23.9542f, 12.5552f, 24.7333f, 11.0924f, 25.5692f, 10.1665f)
                curveTo(26.6333f, 8.963f, 28.4002f, 8.0556f, 29.8822f, 8.0f)
                curveTo(29.9203f, 8.1667f, 29.9393f, 8.3704f, 29.9393f, 8.5741f)
                close()
                moveTo(35.1661f, 17.7886f)
                curveTo(35.203f, 17.765f, 35.2283f, 17.7488f, 35.2402f, 17.7399f)
                curveTo(33.2642f, 14.981f, 30.2621f, 14.9067f, 29.426f, 14.9066f)
                curveTo(28.1485f, 14.9066f, 27.0051f, 15.3483f, 26.0438f, 15.7197f)
                curveTo(25.3466f, 15.989f, 24.7453f, 16.2213f, 24.2581f, 16.2213f)
                curveTo(23.7207f, 16.2213f, 23.1053f, 15.9789f, 22.4185f, 15.7084f)
                curveTo(21.5515f, 15.3669f, 20.5707f, 14.9806f, 19.4893f, 14.9806f)
                curveTo(15.8415f, 14.9806f, 12.1365f, 17.9249f, 12.1365f, 23.48f)
                curveTo(12.1365f, 26.9426f, 13.5044f, 30.5904f, 15.1954f, 32.9421f)
                curveTo(16.6583f, 34.9419f, 17.9313f, 36.5714f, 19.7553f, 36.5714f)
                curveTo(20.6203f, 36.5714f, 21.2545f, 36.3091f, 21.9215f, 36.0332f)
                curveTo(22.6609f, 35.7273f, 23.4405f, 35.4048f, 24.6193f, 35.4048f)
                curveTo(25.8095f, 35.4048f, 26.5211f, 35.7076f, 27.2074f, 35.9996f)
                curveTo(27.8467f, 36.2716f, 28.4641f, 36.5343f, 29.4262f, 36.5343f)
                curveTo(31.4211f, 36.5343f, 32.7322f, 34.7753f, 33.9861f, 33.0161f)
                curveTo(35.3921f, 31.0164f, 35.9812f, 29.0535f, 36.0001f, 28.961f)
                curveTo(35.8861f, 28.9241f, 32.0672f, 27.4241f, 32.0672f, 23.1838f)
                curveTo(32.0672f, 19.7708f, 34.6686f, 18.1068f, 35.1661f, 17.7886f)
                close()
            }
        }.build()
        return _apple!!
    }

private var _apple: ImageVector? = null
