package uz.javokhir.qr.master.ui.icons.logo

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

internal val Whatsapp: ImageVector
    get() {
        if (_whatsapp != null) {
            return _whatsapp!!
        }
        _whatsapp = Builder(
            name = "Whatsapp",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF20B038),
                    1.0f to Color(0xFF60D66A),
                    start = Offset(48.0f, 48.0f),
                    end = Offset(48.0f, 0.0f)
                ),
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
                fill = linearGradient(
                    0.0f to Color(0xFFF9F9F9),
                    1.0f to Color(0xFFFFFFFF),
                    start = Offset(40.0f, 40.0f),
                    end = Offset(40.0f, 8.0f)
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.2604f, 31.7833f)
                lineTo(8.0f, 40.0f)
                lineTo(16.4466f, 37.7954f)
                curveTo(18.7827f, 39.0619f, 21.4003f, 39.7255f, 24.0603f, 39.7257f)
                horizontalLineTo(24.0671f)
                curveTo(32.8481f, 39.7257f, 39.9963f, 32.6112f, 40.0f, 23.8687f)
                curveTo(40.0017f, 19.6607f, 38.3238f, 15.6244f, 35.3356f, 12.6483f)
                curveTo(32.3474f, 9.6721f, 28.2937f, 8.0f, 24.0668f, 8.0f)
                curveTo(15.2842f, 8.0f, 8.1373f, 15.113f, 8.1338f, 23.8559f)
                curveTo(8.1304f, 26.6386f, 8.8639f, 29.3729f, 10.2604f, 31.7833f)
                close()
                moveTo(17.3217f, 35.21f)
                lineTo(16.8379f, 34.9245f)
                lineTo(11.8258f, 36.2327f)
                lineTo(13.1638f, 31.3694f)
                lineTo(12.8485f, 30.8708f)
                curveTo(11.5223f, 28.7699f, 10.8204f, 26.3382f, 10.8241f, 23.8569f)
                curveTo(10.827f, 16.5901f, 16.7674f, 10.6783f, 24.0721f, 10.6783f)
                curveTo(31.3859f, 10.6812f, 37.3126f, 16.5862f, 37.3097f, 23.8674f)
                curveTo(37.3067f, 31.1347f, 31.366f, 37.0473f, 24.0671f, 37.0473f)
                horizontalLineTo(24.062f)
                curveTo(21.6904f, 37.0475f, 19.3624f, 36.4129f, 17.3217f, 35.21f)
                close()
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
                moveTo(20.0849f, 17.2272f)
                curveTo(19.787f, 16.5673f, 19.4727f, 16.554f, 19.1891f, 16.5428f)
                curveTo(18.957f, 16.5329f, 18.6914f, 16.5335f, 18.4261f, 16.5335f)
                curveTo(18.0182f, 16.5441f, 17.6333f, 16.7238f, 17.3643f, 17.0293f)
                curveTo(16.9993f, 17.426f, 15.9707f, 18.3847f, 15.9707f, 20.3346f)
                curveTo(15.9707f, 22.2845f, 17.3974f, 24.1689f, 17.5963f, 24.4338f)
                curveTo(17.7953f, 24.6987f, 20.3505f, 28.8275f, 24.3969f, 30.4161f)
                curveTo(27.7598f, 31.7363f, 28.4442f, 31.4737f, 29.1742f, 31.4077f)
                curveTo(29.9042f, 31.3417f, 31.5295f, 30.4495f, 31.8613f, 29.5237f)
                curveTo(32.1932f, 28.5979f, 32.1931f, 27.8049f, 32.0935f, 27.6394f)
                curveTo(31.994f, 27.4739f, 31.7285f, 27.3752f, 31.3304f, 27.177f)
                curveTo(30.9322f, 26.9788f, 28.9751f, 26.0198f, 28.6101f, 25.8877f)
                curveTo(28.2451f, 25.7555f, 27.9797f, 25.6895f, 27.7142f, 26.0863f)
                curveTo(27.4488f, 26.4832f, 26.6863f, 27.3752f, 26.4537f, 27.6394f)
                curveTo(26.2212f, 27.9036f, 25.9892f, 27.9373f, 25.591f, 27.7391f)
                curveTo(25.1929f, 27.5409f, 23.9104f, 27.1222f, 22.3896f, 25.7721f)
                curveTo(21.2062f, 24.7216f, 20.4072f, 23.4243f, 20.1749f, 23.0275f)
                curveTo(19.9427f, 22.6308f, 20.15f, 22.4165f, 20.3497f, 22.2189f)
                curveTo(20.5285f, 22.0414f, 20.7479f, 21.7563f, 20.9469f, 21.5248f)
                curveTo(21.146f, 21.2934f, 21.212f, 21.1282f, 21.3447f, 20.8639f)
                curveTo(21.4775f, 20.5996f, 21.411f, 20.3678f, 21.3115f, 20.1696f)
                curveTo(21.212f, 19.9714f, 20.4389f, 18.011f, 20.0849f, 17.2272f)
                close()
            }
        }.build()
        return _whatsapp!!
    }

private var _whatsapp: ImageVector? = null
