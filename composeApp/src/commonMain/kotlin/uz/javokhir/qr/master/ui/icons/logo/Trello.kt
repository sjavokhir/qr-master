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

internal val Trello: ImageVector
    get() {
        if (_trello != null) {
            return _trello!!
        }
        _trello = Builder(
            name = "Trello", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
            viewportWidth = 48.0f, viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF026AA7)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(24.0f, 24.0f)
                moveToRelative(-24.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(33.1508f, 12.0f)
                horizontalLineTo(14.853f)
                curveTo(13.2788f, 12.0f, 12.0022f, 13.2758f, 12.0f, 14.8509f)
                verticalLineTo(33.1337f)
                curveTo(11.997f, 33.8928f, 12.2962f, 34.6219f, 12.8316f, 35.1598f)
                curveTo(13.3669f, 35.6977f, 14.0943f, 36.0f, 14.853f, 36.0f)
                horizontalLineTo(33.1508f)
                curveTo(33.9088f, 35.999f, 34.6352f, 35.6962f, 35.1698f, 35.1584f)
                curveTo(35.7043f, 34.6207f, 36.003f, 33.8922f, 35.9999f, 33.1337f)
                verticalLineTo(14.8509f)
                curveTo(35.9978f, 13.2773f, 34.7235f, 12.0021f, 33.1508f, 12.0f)
                close()
                moveTo(22.3505f, 29.2863f)
                curveTo(22.3495f, 29.54f, 22.2475f, 29.7829f, 22.0672f, 29.9612f)
                curveTo(21.8868f, 30.1396f, 21.6428f, 30.2387f, 21.3893f, 30.2366f)
                horizontalLineTo(17.3906f)
                curveTo(16.8676f, 30.2345f, 16.4448f, 29.8097f, 16.4448f, 29.2863f)
                verticalLineTo(17.3786f)
                curveTo(16.4448f, 16.8553f, 16.8676f, 16.4305f, 17.3906f, 16.4283f)
                horizontalLineTo(21.3893f)
                curveTo(21.9129f, 16.4305f, 22.3369f, 16.8547f, 22.339f, 17.3786f)
                lineTo(22.3505f, 29.2863f)
                close()
                moveTo(31.2961f, 24.4953f)
                curveTo(31.4767f, 24.3167f, 31.5783f, 24.0732f, 31.5783f, 23.8192f)
                lineTo(31.5629f, 17.3786f)
                curveTo(31.5629f, 16.8553f, 31.14f, 16.4305f, 30.617f, 16.4283f)
                horizontalLineTo(26.6184f)
                curveTo(26.0947f, 16.4305f, 25.6708f, 16.8547f, 25.6687f, 17.3786f)
                verticalLineTo(23.8192f)
                curveTo(25.6708f, 24.3431f, 26.0947f, 24.7674f, 26.6184f, 24.7695f)
                horizontalLineTo(30.617f)
                curveTo(30.8709f, 24.7726f, 31.1154f, 24.6738f, 31.2961f, 24.4953f)
                close()
            }
        }
            .build()
        return _trello!!
    }

private var _trello: ImageVector? = null
