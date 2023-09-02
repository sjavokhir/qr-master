package uz.javokhir.qr.master.ui.icons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val Pintrest: ImageVector
    get() {
        if (_pintrest != null) {
            return _pintrest!!
        }
        _pintrest = Builder(
            name = "Pintrest",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFE60023)),
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
                moveTo(24.528f, 8.9f)
                curveTo(32.848f, 8.9f, 39.32f, 14.832f, 39.32f, 22.76f)
                curveTo(39.32f, 31.032f, 34.106f, 37.688f, 26.866f, 37.688f)
                curveTo(24.436f, 37.688f, 22.146f, 36.428f, 21.366f, 34.932f)
                lineTo(19.87f, 40.638f)
                verticalLineTo(40.638f)
                curveTo(19.464f, 42.2016f, 18.536f, 44.068f, 17.6856f, 45.5756f)
                lineTo(17.3008f, 46.2435f)
                verticalLineTo(46.2435f)
                lineTo(16.9401f, 46.8459f)
                verticalLineTo(46.8459f)
                curveTo(16.3618f, 46.6475f, 15.7935f, 46.4279f, 15.2372f, 46.1859f)
                lineTo(15.1774f, 45.5918f)
                curveTo(15.007f, 43.7336f, 14.9145f, 41.2787f, 15.338f, 39.464f)
                lineTo(18.15f, 27.534f)
                verticalLineTo(27.534f)
                lineTo(18.0526f, 27.3133f)
                verticalLineTo(27.3133f)
                lineTo(17.9509f, 27.0479f)
                verticalLineTo(27.0479f)
                lineTo(17.8724f, 26.8183f)
                verticalLineTo(26.8183f)
                lineTo(17.79f, 26.549f)
                verticalLineTo(26.549f)
                lineTo(17.7075f, 26.2421f)
                curveTo(17.694f, 26.1879f, 17.6807f, 26.1322f, 17.6676f, 26.0751f)
                lineTo(17.5925f, 25.7156f)
                curveTo(17.4981f, 25.2142f, 17.43f, 24.6263f, 17.43f, 23.974f)
                curveTo(17.43f, 20.634f, 19.366f, 18.144f, 21.774f, 18.144f)
                curveTo(23.822f, 18.144f, 24.81f, 19.68f, 24.81f, 21.524f)
                curveTo(24.81f, 22.4069f, 24.5694f, 23.4771f, 24.2412f, 24.6362f)
                lineTo(24.0111f, 25.4211f)
                verticalLineTo(25.4211f)
                lineTo(23.3884f, 27.456f)
                curveTo(23.1818f, 28.1438f, 22.9849f, 28.8354f, 22.824f, 29.514f)
                curveTo(22.258f, 31.904f, 24.02f, 33.854f, 26.376f, 33.854f)
                curveTo(30.64f, 33.854f, 33.92f, 29.354f, 33.92f, 22.862f)
                curveTo(33.92f, 17.118f, 29.79f, 13.098f, 23.894f, 13.098f)
                curveTo(17.064f, 13.098f, 13.054f, 18.222f, 13.054f, 23.514f)
                curveTo(13.054f, 25.578f, 13.85f, 27.79f, 14.842f, 28.994f)
                curveTo(15.038f, 29.228f, 15.066f, 29.438f, 15.008f, 29.68f)
                lineTo(14.342f, 32.4f)
                verticalLineTo(32.4f)
                curveTo(14.236f, 32.84f, 13.994f, 32.932f, 13.542f, 32.72f)
                curveTo(10.542f, 31.326f, 8.668f, 26.94f, 8.668f, 23.42f)
                curveTo(8.668f, 15.852f, 14.168f, 8.9f, 24.528f, 8.9f)
                close()
            }
        }.build()
        return _pintrest!!
    }

private var _pintrest: ImageVector? = null
