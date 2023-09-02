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

internal val Instagram: ImageVector
    get() {
        if (_instagram != null) {
            return _instagram!!
        }
        _instagram = Builder(
            name = "Instagram",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFFFD522),
                    0.497382f to Color(0xFFF1000B),
                    1.0f to Color(0xFFB900B3),
                    start = Offset(24.0f, 72.0f),
                    end = Offset(72.0f, 24.0f)
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
                fill = SolidColor(Color(0xFFffffff)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(24.0f, 8.0f)
                curveTo(19.6547f, 8.0f, 19.1098f, 8.0184f, 17.4032f, 8.0963f)
                curveTo(15.7002f, 8.174f, 14.5371f, 8.4445f, 13.5194f, 8.84f)
                curveTo(12.4673f, 9.2488f, 11.575f, 9.7959f, 10.6854f, 10.6854f)
                curveTo(9.7959f, 11.575f, 9.2488f, 12.4673f, 8.84f, 13.5194f)
                curveTo(8.4445f, 14.5371f, 8.174f, 15.7002f, 8.0963f, 17.4032f)
                curveTo(8.0184f, 19.1098f, 8.0f, 19.6547f, 8.0f, 24.0f)
                curveTo(8.0f, 28.3453f, 8.0184f, 28.8902f, 8.0963f, 30.5968f)
                curveTo(8.174f, 32.2998f, 8.4445f, 33.4629f, 8.84f, 34.4806f)
                curveTo(9.2488f, 35.5327f, 9.7959f, 36.425f, 10.6854f, 37.3146f)
                curveTo(11.575f, 38.2041f, 12.4673f, 38.7512f, 13.5194f, 39.1601f)
                curveTo(14.5371f, 39.5555f, 15.7002f, 39.826f, 17.4032f, 39.9037f)
                curveTo(19.1098f, 39.9816f, 19.6547f, 40.0f, 24.0f, 40.0f)
                curveTo(28.3453f, 40.0f, 28.8902f, 39.9816f, 30.5968f, 39.9037f)
                curveTo(32.2998f, 39.826f, 33.4629f, 39.5555f, 34.4806f, 39.1601f)
                curveTo(35.5327f, 38.7512f, 36.425f, 38.2041f, 37.3146f, 37.3146f)
                curveTo(38.2041f, 36.425f, 38.7512f, 35.5327f, 39.1601f, 34.4806f)
                curveTo(39.5555f, 33.4629f, 39.826f, 32.2998f, 39.9037f, 30.5968f)
                curveTo(39.9816f, 28.8902f, 40.0f, 28.3453f, 40.0f, 24.0f)
                curveTo(40.0f, 19.6547f, 39.9816f, 19.1098f, 39.9037f, 17.4032f)
                curveTo(39.826f, 15.7002f, 39.5555f, 14.5371f, 39.1601f, 13.5194f)
                curveTo(38.7512f, 12.4673f, 38.2041f, 11.575f, 37.3146f, 10.6854f)
                curveTo(36.425f, 9.7959f, 35.5327f, 9.2488f, 34.4806f, 8.84f)
                curveTo(33.4629f, 8.4445f, 32.2998f, 8.174f, 30.5968f, 8.0963f)
                curveTo(28.8902f, 8.0184f, 28.3453f, 8.0f, 24.0f, 8.0f)
                close()
                moveTo(24.0f, 10.8829f)
                curveTo(28.2722f, 10.8829f, 28.7782f, 10.8992f, 30.4654f, 10.9762f)
                curveTo(32.0254f, 11.0473f, 32.8725f, 11.308f, 33.4363f, 11.5271f)
                curveTo(34.1832f, 11.8173f, 34.7162f, 12.164f, 35.276f, 12.724f)
                curveTo(35.836f, 13.2838f, 36.1827f, 13.8168f, 36.4729f, 14.5637f)
                curveTo(36.692f, 15.1275f, 36.9527f, 15.9746f, 37.0238f, 17.5346f)
                curveTo(37.1008f, 19.2218f, 37.1171f, 19.7278f, 37.1171f, 24.0f)
                curveTo(37.1171f, 28.2722f, 37.1008f, 28.7782f, 37.0238f, 30.4654f)
                curveTo(36.9527f, 32.0254f, 36.692f, 32.8725f, 36.4729f, 33.4363f)
                curveTo(36.1827f, 34.1832f, 35.836f, 34.7162f, 35.276f, 35.276f)
                curveTo(34.7162f, 35.836f, 34.1832f, 36.1827f, 33.4363f, 36.4729f)
                curveTo(32.8725f, 36.692f, 32.0254f, 36.9527f, 30.4654f, 37.0238f)
                curveTo(28.7785f, 37.1008f, 28.2725f, 37.1171f, 24.0f, 37.1171f)
                curveTo(19.7275f, 37.1171f, 19.2216f, 37.1008f, 17.5346f, 37.0238f)
                curveTo(15.9746f, 36.9527f, 15.1275f, 36.692f, 14.5637f, 36.4729f)
                curveTo(13.8168f, 36.1827f, 13.2838f, 35.836f, 12.724f, 35.276f)
                curveTo(12.1641f, 34.7162f, 11.8173f, 34.1832f, 11.5271f, 33.4363f)
                curveTo(11.308f, 32.8725f, 11.0473f, 32.0254f, 10.9762f, 30.4654f)
                curveTo(10.8992f, 28.7782f, 10.8829f, 28.2722f, 10.8829f, 24.0f)
                curveTo(10.8829f, 19.7278f, 10.8992f, 19.2218f, 10.9762f, 17.5346f)
                curveTo(11.0473f, 15.9746f, 11.308f, 15.1275f, 11.5271f, 14.5637f)
                curveTo(11.8173f, 13.8168f, 12.164f, 13.2838f, 12.724f, 12.724f)
                curveTo(13.2838f, 12.164f, 13.8168f, 11.8173f, 14.5637f, 11.5271f)
                curveTo(15.1275f, 11.308f, 15.9746f, 11.0473f, 17.5346f, 10.9762f)
                curveTo(19.2218f, 10.8992f, 19.7278f, 10.8829f, 24.0f, 10.8829f)
                verticalLineTo(10.8829f)
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
                moveTo(23.9999f, 29.3333f)
                curveTo(21.0544f, 29.3333f, 18.6666f, 26.9455f, 18.6666f, 24.0f)
                curveTo(18.6666f, 21.0545f, 21.0544f, 18.6667f, 23.9999f, 18.6667f)
                curveTo(26.9454f, 18.6667f, 29.3332f, 21.0545f, 29.3332f, 24.0f)
                curveTo(29.3332f, 26.9455f, 26.9454f, 29.3333f, 23.9999f, 29.3333f)
                close()
                moveTo(23.9999f, 15.7838f)
                curveTo(19.4622f, 15.7838f, 15.7837f, 19.4623f, 15.7837f, 24.0f)
                curveTo(15.7837f, 28.5377f, 19.4622f, 32.2162f, 23.9999f, 32.2162f)
                curveTo(28.5376f, 32.2162f, 32.2161f, 28.5377f, 32.2161f, 24.0f)
                curveTo(32.2161f, 19.4623f, 28.5376f, 15.7838f, 23.9999f, 15.7838f)
                verticalLineTo(15.7838f)
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
                moveTo(34.4609f, 15.4592f)
                curveTo(34.4609f, 16.5196f, 33.6012f, 17.3792f, 32.5408f, 17.3792f)
                curveTo(31.4805f, 17.3792f, 30.6208f, 16.5196f, 30.6208f, 15.4592f)
                curveTo(30.6208f, 14.3988f, 31.4805f, 13.5392f, 32.5408f, 13.5392f)
                curveTo(33.6012f, 13.5392f, 34.4609f, 14.3988f, 34.4609f, 15.4592f)
            }
        }.build()
        return _instagram!!
    }

private var _instagram: ImageVector? = null
