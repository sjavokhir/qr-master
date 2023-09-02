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

internal val Notion: ImageVector
    get() {
        if (_notion != null) {
            return _notion!!
        }
        _notion = Builder(
            name = "Notion",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFEFC)),
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
                pathFillType = NonZero
            ) {
                moveTo(11.6973f, 11.2079f)
                lineTo(27.3064f, 10.0637f)
                curveTo(29.2237f, 9.9003f, 29.7164f, 10.0105f, 30.9219f, 10.8803f)
                lineTo(35.9045f, 14.3644f)
                curveTo(36.7264f, 14.9636f, 37.0f, 15.1269f, 37.0f, 15.7793f)
                verticalLineTo(34.8872f)
                curveTo(37.0f, 36.0847f, 36.5618f, 36.7931f, 35.0282f, 36.9013f)
                lineTo(16.9019f, 37.9905f)
                curveTo(15.7509f, 38.0447f, 15.2027f, 37.8813f, 14.6f, 37.1188f)
                lineTo(10.9309f, 32.3831f)
                curveTo(10.2727f, 31.5114f, 10.0f, 30.859f, 10.0f, 30.0965f)
                verticalLineTo(13.1119f)
                curveTo(10.0f, 12.1328f, 10.4382f, 11.3162f, 11.6973f, 11.2079f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(27.3064f, 10.0637f)
                lineTo(11.6973f, 11.2079f)
                curveTo(10.4382f, 11.3162f, 10.0f, 12.1328f, 10.0f, 13.1119f)
                verticalLineTo(30.0965f)
                curveTo(10.0f, 30.859f, 10.2727f, 31.5114f, 10.9309f, 32.3831f)
                lineTo(14.6f, 37.1188f)
                curveTo(15.2027f, 37.8813f, 15.7509f, 38.0447f, 16.9019f, 37.9905f)
                lineTo(35.0282f, 36.9013f)
                curveTo(36.5609f, 36.7931f, 37.0f, 36.0847f, 37.0f, 34.8872f)
                verticalLineTo(15.7793f)
                curveTo(37.0f, 15.1605f, 36.7536f, 14.9823f, 36.0287f, 14.454f)
                curveTo(35.9869f, 14.4242f, 35.9453f, 14.3943f, 35.9036f, 14.3644f)
                lineTo(30.9219f, 10.8803f)
                curveTo(29.7164f, 10.0105f, 29.2237f, 9.9003f, 27.3064f, 10.0637f)
                close()
                moveTo(17.3118f, 15.4667f)
                curveTo(15.8318f, 15.5656f, 15.4961f, 15.588f, 14.6555f, 14.9095f)
                lineTo(12.5181f, 13.222f)
                curveTo(12.3009f, 13.0036f, 12.41f, 12.7311f, 12.9573f, 12.677f)
                lineTo(27.9627f, 11.5887f)
                curveTo(29.2227f, 11.4795f, 29.879f, 11.9154f, 30.3718f, 12.2962f)
                lineTo(32.9454f, 14.1469f)
                curveTo(33.0554f, 14.202f, 33.329f, 14.5277f, 32.9999f, 14.5277f)
                lineTo(17.5037f, 15.4536f)
                lineTo(17.3118f, 15.4667f)
                close()
                moveTo(15.5864f, 34.7239f)
                verticalLineTo(18.5028f)
                curveTo(15.5864f, 17.7944f, 15.8055f, 17.4677f, 16.4618f, 17.4126f)
                lineTo(34.2599f, 16.3785f)
                curveTo(34.8636f, 16.3244f, 35.1363f, 16.7052f, 35.1363f, 17.4126f)
                verticalLineTo(33.5255f)
                curveTo(35.1363f, 34.2339f, 35.0263f, 34.8331f, 34.0409f, 34.8872f)
                lineTo(17.0091f, 35.8672f)
                curveTo(16.0236f, 35.9214f, 15.5864f, 35.5956f, 15.5864f, 34.7239f)
                close()
                moveTo(32.3991f, 19.3726f)
                curveTo(32.5081f, 19.8626f, 32.3991f, 20.3526f, 31.9054f, 20.4086f)
                lineTo(31.0845f, 20.5701f)
                verticalLineTo(32.5465f)
                curveTo(30.3718f, 32.9273f, 29.7154f, 33.1447f, 29.1672f, 33.1447f)
                curveTo(28.2909f, 33.1447f, 28.0718f, 32.8722f, 27.4154f, 32.0565f)
                lineTo(22.0472f, 23.6734f)
                verticalLineTo(31.7839f)
                lineTo(23.7454f, 32.1657f)
                curveTo(23.7454f, 32.1657f, 23.7454f, 33.1457f, 22.3754f, 33.1457f)
                lineTo(18.5982f, 33.3631f)
                curveTo(18.4882f, 33.1447f, 18.5982f, 32.6006f, 18.9809f, 32.4923f)
                lineTo(19.9673f, 32.2207f)
                verticalLineTo(21.4969f)
                lineTo(18.5982f, 21.3867f)
                curveTo(18.4882f, 20.8967f, 18.7618f, 20.1893f, 19.5291f, 20.1342f)
                lineTo(23.5818f, 19.8635f)
                lineTo(29.1672f, 28.3549f)
                verticalLineTo(20.8426f)
                lineTo(27.7436f, 20.6802f)
                curveTo(27.6336f, 20.0801f, 28.0718f, 19.6442f, 28.619f, 19.591f)
                lineTo(32.3991f, 19.3726f)
                verticalLineTo(19.3726f)
                close()
            }
        }.build()
        return _notion!!
    }

private var _notion: ImageVector? = null
