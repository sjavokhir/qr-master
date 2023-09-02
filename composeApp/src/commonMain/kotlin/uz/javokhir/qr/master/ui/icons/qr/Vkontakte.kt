package uz.javokhir.qr.master.ui.icons.qr

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

internal val Vkontakte: ImageVector
    get() {
        if (_vkontakte != null) {
            return _vkontakte!!
        }
        _vkontakte = Builder(
            name = "Vkontakte",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF2787F5)),
                stroke = null,
                fillAlpha = 0.1f,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(-72.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2787F5)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(57.0083f, 25.128f)
                curveTo(57.3126f, 24.177f, 57.0083f, 23.4783f, 55.5602f, 23.4783f)
                horizontalLineTo(50.7717f)
                curveTo(49.5541f, 23.4783f, 48.9928f, 24.0819f, 48.6883f, 24.7475f)
                curveTo(48.6883f, 24.7475f, 46.2532f, 30.3106f, 42.8035f, 33.9241f)
                curveTo(41.6874f, 34.9702f, 41.18f, 35.303f, 40.5713f, 35.303f)
                curveTo(40.2669f, 35.303f, 39.8263f, 34.9702f, 39.8263f, 34.0193f)
                verticalLineTo(25.128f)
                curveTo(39.8263f, 23.9869f, 39.4729f, 23.4783f, 38.4582f, 23.4783f)
                horizontalLineTo(30.9333f)
                curveTo(30.1725f, 23.4783f, 29.7149f, 24.0079f, 29.7149f, 24.5099f)
                curveTo(29.7149f, 25.5916f, 31.4396f, 25.8411f, 31.6174f, 28.8842f)
                verticalLineTo(35.4932f)
                curveTo(31.6174f, 36.9423f, 31.3382f, 37.205f, 30.7294f, 37.205f)
                curveTo(29.1061f, 37.205f, 25.1573f, 31.6171f, 22.8153f, 25.2231f)
                curveTo(22.3563f, 23.9803f, 21.896f, 23.4783f, 20.6721f, 23.4783f)
                horizontalLineTo(15.8836f)
                curveTo(14.5154f, 23.4783f, 14.2418f, 24.0819f, 14.2418f, 24.7475f)
                curveTo(14.2418f, 25.9363f, 15.8652f, 31.8321f, 21.8007f, 39.6298f)
                curveTo(25.7577f, 44.955f, 31.3328f, 47.8417f, 36.406f, 47.8417f)
                curveTo(39.4498f, 47.8417f, 39.8264f, 47.2005f, 39.8264f, 46.0962f)
                verticalLineTo(42.0714f)
                curveTo(39.8264f, 40.7891f, 40.1147f, 40.5332f, 41.0786f, 40.5332f)
                curveTo(41.7888f, 40.5332f, 43.0064f, 40.866f, 45.8474f, 43.4336f)
                curveTo(49.0942f, 46.4766f, 49.6295f, 47.8417f, 51.4557f, 47.8417f)
                horizontalLineTo(56.2443f)
                curveTo(57.6125f, 47.8417f, 58.2965f, 47.2005f, 57.9019f, 45.9353f)
                curveTo(57.4701f, 44.6742f, 55.9199f, 42.8447f, 53.863f, 40.6758f)
                curveTo(52.7468f, 39.4396f, 51.0727f, 38.1084f, 50.5654f, 37.4426f)
                curveTo(49.8551f, 36.5868f, 50.0581f, 36.2064f, 50.5654f, 35.4457f)
                curveTo(50.5654f, 35.4457f, 56.3995f, 27.743f, 57.0083f, 25.128f)
                close()
            }
        }.build()
        return _vkontakte!!
    }

private var _vkontakte: ImageVector? = null
