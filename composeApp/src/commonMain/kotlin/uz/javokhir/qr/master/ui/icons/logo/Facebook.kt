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

internal val Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(
            name = "Facebook",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1877F2)),
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
                moveTo(33.3414f, 30.9368f)
                lineTo(34.4055f, 23.9991f)
                horizontalLineTo(27.7488f)
                verticalLineTo(19.4969f)
                curveTo(27.7488f, 17.5988f, 28.6787f, 15.7488f, 31.6602f, 15.7488f)
                horizontalLineTo(34.6868f)
                verticalLineTo(9.8423f)
                curveTo(34.6868f, 9.8423f, 31.94f, 9.3735f, 29.3141f, 9.3735f)
                curveTo(23.8316f, 9.3735f, 20.2484f, 12.6961f, 20.2484f, 18.7114f)
                verticalLineTo(23.9991f)
                horizontalLineTo(14.1543f)
                verticalLineTo(30.9368f)
                horizontalLineTo(20.2484f)
                verticalLineTo(47.7084f)
                curveTo(21.4704f, 47.9002f, 22.7228f, 48.0f, 23.9986f, 48.0f)
                curveTo(25.2744f, 48.0f, 26.5269f, 47.9002f, 27.7488f, 47.7084f)
                verticalLineTo(30.9368f)
                horizontalLineTo(33.3414f)
            }
        }.build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
