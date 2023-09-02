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

internal val GoogleDrive: ImageVector
    get() {
        if (_drive != null) {
            return _drive!!
        }
        _drive = Builder(
            name = "Drive",
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
                fill = SolidColor(Color(0xFF0066DA)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.4192f, 33.8545f)
                lineTo(11.8305f, 36.3269f)
                curveTo(12.1237f, 36.8474f, 12.5452f, 37.2564f, 13.0401f, 37.5539f)
                lineTo(18.0802f, 28.7051f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 29.2814f, 8.1466f, 29.8577f, 8.4399f, 30.3782f)
                lineTo(10.4192f, 33.8545f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00AC47)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(24.0f, 18.2949f)
                lineTo(18.9599f, 9.4462f)
                curveTo(18.4651f, 9.7436f, 18.0435f, 10.1526f, 17.7503f, 10.6731f)
                lineTo(8.4399f, 27.0321f)
                curveTo(8.152f, 27.5414f, 8.0004f, 28.1181f, 8.0f, 28.7051f)
                horizontalLineTo(18.0802f)
                lineTo(24.0f, 18.2949f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEA4335)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(34.96f, 37.5539f)
                curveTo(35.4549f, 37.2564f, 35.8764f, 36.8474f, 36.1696f, 36.3269f)
                lineTo(36.7561f, 35.3045f)
                lineTo(39.5602f, 30.3782f)
                curveTo(39.8535f, 29.8577f, 40.0001f, 29.2814f, 40.0001f, 28.7051f)
                horizontalLineTo(29.9192f)
                lineTo(32.0643f, 32.9808f)
                lineTo(34.96f, 37.5539f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00832D)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(24.0001f, 18.2949f)
                lineTo(29.0401f, 9.4461f)
                curveTo(28.5453f, 9.1487f, 27.9771f, 9.0f, 27.3907f, 9.0f)
                horizontalLineTo(20.6094f)
                curveTo(20.023f, 9.0f, 19.4548f, 9.1673f, 18.96f, 9.4461f)
                lineTo(24.0001f, 18.2949f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2684FC)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(29.9198f, 28.7051f)
                horizontalLineTo(18.0801f)
                lineTo(13.04f, 37.5539f)
                curveTo(13.5349f, 37.8513f, 14.103f, 38.0f, 14.6895f, 38.0f)
                horizontalLineTo(33.3104f)
                curveTo(33.8969f, 38.0f, 34.465f, 37.8327f, 34.9599f, 37.5539f)
                lineTo(29.9198f, 28.7051f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFBA00)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(34.9049f, 18.8526f)
                lineTo(30.2497f, 10.6731f)
                curveTo(29.9565f, 10.1526f, 29.5349f, 9.7436f, 29.0401f, 9.4462f)
                lineTo(24.0f, 18.2949f)
                lineTo(29.9198f, 28.7051f)
                horizontalLineTo(39.9817f)
                curveTo(39.9817f, 28.1289f, 39.8351f, 27.5526f, 39.5418f, 27.0321f)
                lineTo(34.9049f, 18.8526f)
                close()
            }
        }.build()
        return _drive!!
    }

private var _drive: ImageVector? = null
