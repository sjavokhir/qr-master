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

internal val Slack: ImageVector
    get() {
        if (_slack != null) {
            return _slack!!
        }
        _slack = Builder(
            name = "Slack",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF4A154B)),
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
                fill = SolidColor(Color(0xFF097EFF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.5333f, 11.1999f)
                curveTo(16.5333f, 9.4329f, 17.9658f, 8.0f, 19.7331f, 8.0f)
                curveTo(21.5021f, 8.0018f, 22.9349f, 9.4343f, 22.9334f, 11.1999f)
                verticalLineTo(14.3998f)
                horizontalLineTo(19.7331f)
                curveTo(18.8836f, 14.3989f, 18.0692f, 14.0613f, 17.4692f, 13.4612f)
                curveTo(16.8691f, 12.8611f, 16.5324f, 12.0477f, 16.5333f, 11.1999f)
                close()
                moveTo(11.1998f, 16.533f)
                horizontalLineTo(19.7331f)
                curveTo(21.5004f, 16.533f, 22.9334f, 17.9659f, 22.9334f, 19.7335f)
                curveTo(22.9334f, 21.5005f, 21.5004f, 22.9334f, 19.7336f, 22.9334f)
                horizontalLineTo(11.1998f)
                curveTo(9.4325f, 22.9334f, 8.0f, 21.5005f, 8.0f, 19.7335f)
                curveTo(8.0f, 17.9659f, 9.4325f, 16.533f, 11.1998f, 16.533f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF097EFF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(31.4665f, 11.1999f)
                verticalLineTo(19.7335f)
                verticalLineTo(19.734f)
                curveTo(31.468f, 21.4996f, 30.0352f, 22.9321f, 28.2662f, 22.9339f)
                curveTo(26.4989f, 22.9339f, 25.0664f, 21.501f, 25.0664f, 19.7329f)
                verticalLineTo(11.1999f)
                curveTo(25.0664f, 9.4329f, 26.4989f, 8.0f, 28.2662f, 8.0f)
                curveTo(30.0352f, 8.0018f, 31.468f, 9.4343f, 31.4665f, 11.1999f)
                close()
                moveTo(36.7995f, 16.533f)
                curveTo(38.5668f, 16.533f, 39.9998f, 17.9659f, 39.9998f, 19.7335f)
                curveTo(40.0013f, 21.499f, 38.5685f, 22.9316f, 36.7995f, 22.9334f)
                horizontalLineTo(33.5997f)
                verticalLineTo(19.7335f)
                curveTo(33.5997f, 17.9659f, 35.0322f, 16.533f, 36.7995f, 16.533f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFECB12F)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(36.8f, 31.4669f)
                horizontalLineTo(28.2662f)
                verticalLineTo(31.4664f)
                curveTo(27.4167f, 31.4656f, 26.6023f, 31.1279f, 26.0023f, 30.5279f)
                curveTo(25.4022f, 29.9278f, 25.0656f, 29.1143f, 25.0664f, 28.2665f)
                curveTo(25.0664f, 26.4995f, 26.4989f, 25.0666f, 28.2662f, 25.0666f)
                horizontalLineTo(36.7995f)
                curveTo(38.5685f, 25.0684f, 40.0013f, 26.5009f, 39.9998f, 28.2665f)
                curveTo(39.9998f, 30.0341f, 38.5668f, 31.4669f, 36.8f, 31.4669f)
                close()
                moveTo(31.4665f, 36.8001f)
                curveTo(31.468f, 38.5657f, 30.0352f, 39.9982f, 28.2662f, 40.0f)
                curveTo(26.4989f, 40.0f, 25.0664f, 38.5671f, 25.0664f, 36.8001f)
                verticalLineTo(33.6002f)
                horizontalLineTo(28.2662f)
                curveTo(30.0352f, 33.602f, 31.468f, 35.0345f, 31.4665f, 36.8001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFECB12F)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.9359f, 30.5279f)
                curveTo(8.3358f, 29.9278f, 7.9991f, 29.1143f, 8.0f, 28.2665f)
                curveTo(8.0f, 26.4995f, 9.4325f, 25.0666f, 11.1998f, 25.0666f)
                horizontalLineTo(14.4001f)
                verticalLineTo(28.2665f)
                curveTo(14.4016f, 30.0321f, 12.9688f, 31.4646f, 11.1998f, 31.4664f)
                curveTo(10.3503f, 31.4656f, 9.5359f, 31.1279f, 8.9359f, 30.5279f)
                close()
                moveTo(16.5333f, 36.7996f)
                verticalLineTo(28.2665f)
                curveTo(16.5333f, 26.4995f, 17.9658f, 25.0666f, 19.7331f, 25.0666f)
                curveTo(20.5827f, 25.0673f, 21.3972f, 25.4049f, 21.9974f, 26.005f)
                curveTo(22.5975f, 26.6051f, 22.9343f, 27.4186f, 22.9334f, 28.2665f)
                verticalLineTo(36.8001f)
                curveTo(22.9349f, 38.5657f, 21.5021f, 39.9982f, 19.7331f, 40.0f)
                curveTo(17.9658f, 40.0f, 16.5333f, 38.5671f, 16.5333f, 36.7996f)
                close()
            }
        }.build()
        return _slack!!
    }

private var _slack: ImageVector? = null
