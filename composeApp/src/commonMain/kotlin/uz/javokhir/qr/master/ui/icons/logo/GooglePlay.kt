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

internal val GooglePlay: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(
            name = "Play",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF7F7F7)),
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
                    0.0f to Color(0xFF00A0FF),
                    0.00657f to Color(0xFF00A1FF),
                    0.2601f to Color(0xFF00BEFF),
                    0.5122f to Color(0xFF00D2FF),
                    0.7604f to Color(0xFF00DFFF),
                    1.0f to Color(0xFF00E3FF),
                    start = Offset(21.4111f, -10.2844f),
                    end = Offset(-3.48942f, -3.58619f)
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.5734f, 8.4846f)
                curveTo(12.2099f, 8.8725f, 12.0f, 9.4651f, 12.0f, 10.2408f)
                verticalLineTo(37.753f)
                curveTo(12.0f, 38.5287f, 12.2099f, 39.1213f, 12.5859f, 39.4936f)
                lineTo(12.683f, 39.5774f)
                lineTo(28.2487f, 24.1629f)
                verticalLineTo(23.8185f)
                lineTo(12.6705f, 8.4009f)
                lineTo(12.5734f, 8.4846f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFFFE000),
                    0.4087f to Color(0xFFFFBD00),
                    0.7754f to Color(0xFFFFA500),
                    1.0f to Color(0xFFFF9C00),
                    start = Offset(41.9738f, 11.3211f),
                    end = Offset(11.5727f, 11.3211f)
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(33.4278f, 29.3165f)
                lineTo(28.2361f, 24.1753f)
                verticalLineTo(23.8153f)
                lineTo(33.4278f, 18.6741f)
                lineTo(33.5406f, 18.7423f)
                lineTo(39.6816f, 22.1988f)
                curveTo(41.4393f, 23.1793f, 41.4393f, 24.7989f, 39.6816f, 25.7918f)
                lineTo(33.5406f, 29.2483f)
                lineTo(33.4278f, 29.3165f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFFF3A44),
                    1.0f to Color(0xFFC31162),
                    start = Offset(12.1086f, 15.9407f),
                    end = Offset(-7.62033f, 49.4721f)
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(33.5408f, 29.2483f)
                lineTo(28.2363f, 23.9953f)
                lineTo(12.5735f, 39.506f)
                curveTo(13.1469f, 40.1141f, 14.1087f, 40.1824f, 15.1834f, 39.5898f)
                lineTo(33.5408f, 29.2483f)
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF32A071),
                    0.0685f to Color(0xFF2DA771),
                    0.4762f to Color(0xFF15CF74),
                    0.8009f to Color(0xFF06E775),
                    1.0f to Color(0xFF00F076),
                    start = Offset(0.342077f, 4.20387f),
                    end = Offset(9.14289f, 19.1797f)
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(33.5408f, 18.7424f)
                lineTo(15.1834f, 8.4164f)
                curveTo(14.1087f, 7.8082f, 13.1437f, 7.892f, 12.5735f, 8.5001f)
                lineTo(28.2363f, 23.9953f)
                lineTo(33.5408f, 18.7424f)
                close()
            }
        }.build()
        return _play!!
    }

private var _play: ImageVector? = null
