package uz.javokhir.qr.master.ui.icons.qr

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val Contact: ImageVector
    get() {
        if (_contact != null) {
            return _contact!!
        }
        _contact = Builder(
            name = "Contact",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFC107)),
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
                fill = SolidColor(Color(0xFFFFC107)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.7f, 58.0f)
                curveTo(20.2667f, 58.0f, 19.9083f, 57.8583f, 19.625f, 57.575f)
                curveTo(19.3417f, 57.2917f, 19.2f, 56.9333f, 19.2f, 56.5f)
                curveTo(19.2f, 56.0667f, 19.3417f, 55.7083f, 19.625f, 55.425f)
                curveTo(19.9083f, 55.1417f, 20.2667f, 55.0f, 20.7f, 55.0f)
                horizontalLineTo(51.3f)
                curveTo(51.7333f, 55.0f, 52.0917f, 55.1417f, 52.375f, 55.425f)
                curveTo(52.6583f, 55.7083f, 52.8f, 56.0667f, 52.8f, 56.5f)
                curveTo(52.8f, 56.9333f, 52.6583f, 57.2917f, 52.375f, 57.575f)
                curveTo(52.0917f, 57.8583f, 51.7333f, 58.0f, 51.3f, 58.0f)
                horizontalLineTo(20.7f)
                close()
                moveTo(20.7f, 17.0f)
                curveTo(20.2667f, 17.0f, 19.9083f, 16.8583f, 19.625f, 16.575f)
                curveTo(19.3417f, 16.2917f, 19.2f, 15.9333f, 19.2f, 15.5f)
                curveTo(19.2f, 15.0667f, 19.3417f, 14.7083f, 19.625f, 14.425f)
                curveTo(19.9083f, 14.1417f, 20.2667f, 14.0f, 20.7f, 14.0f)
                horizontalLineTo(51.3f)
                curveTo(51.7333f, 14.0f, 52.0917f, 14.1417f, 52.375f, 14.425f)
                curveTo(52.6583f, 14.7083f, 52.8f, 15.0667f, 52.8f, 15.5f)
                curveTo(52.8f, 15.9333f, 52.6583f, 16.2917f, 52.375f, 16.575f)
                curveTo(52.0917f, 16.8583f, 51.7333f, 17.0f, 51.3f, 17.0f)
                horizontalLineTo(20.7f)
                close()
                moveTo(36.0f, 37.8f)
                curveTo(37.6667f, 37.8f, 39.0667f, 37.2333f, 40.2f, 36.1f)
                curveTo(41.3333f, 34.9667f, 41.9f, 33.5667f, 41.9f, 31.9f)
                curveTo(41.9f, 30.2333f, 41.3333f, 28.8333f, 40.2f, 27.7f)
                curveTo(39.0667f, 26.5667f, 37.6667f, 26.0f, 36.0f, 26.0f)
                curveTo(34.3333f, 26.0f, 32.9333f, 26.5667f, 31.8f, 27.7f)
                curveTo(30.6667f, 28.8333f, 30.1f, 30.2333f, 30.1f, 31.9f)
                curveTo(30.1f, 33.5667f, 30.6667f, 34.9667f, 31.8f, 36.1f)
                curveTo(32.9333f, 37.2333f, 34.3333f, 37.8f, 36.0f, 37.8f)
                close()
                moveTo(18.6f, 52.0f)
                curveTo(17.8f, 52.0f, 17.1f, 51.7f, 16.5f, 51.1f)
                curveTo(15.9f, 50.5f, 15.6f, 49.8f, 15.6f, 49.0f)
                verticalLineTo(23.0f)
                curveTo(15.6f, 22.1333f, 15.9f, 21.4167f, 16.5f, 20.85f)
                curveTo(17.1f, 20.2833f, 17.8f, 20.0f, 18.6f, 20.0f)
                horizontalLineTo(53.4f)
                curveTo(54.2f, 20.0f, 54.9f, 20.3f, 55.5f, 20.9f)
                curveTo(56.1f, 21.5f, 56.4f, 22.2f, 56.4f, 23.0f)
                verticalLineTo(49.0f)
                curveTo(56.4f, 49.8f, 56.1f, 50.5f, 55.5f, 51.1f)
                curveTo(54.9f, 51.7f, 54.2f, 52.0f, 53.4f, 52.0f)
                horizontalLineTo(18.6f)
                close()
                moveTo(23.0f, 49.0f)
                horizontalLineTo(49.0f)
                curveTo(47.3667f, 46.9f, 45.3583f, 45.325f, 42.975f, 44.275f)
                curveTo(40.5917f, 43.225f, 38.2667f, 42.7f, 36.0f, 42.7f)
                curveTo(33.7f, 42.7f, 31.3833f, 43.225f, 29.05f, 44.275f)
                curveTo(26.7167f, 45.325f, 24.7f, 46.9f, 23.0f, 49.0f)
                close()
            }
        }.build()
        return _contact!!
    }

private var _contact: ImageVector? = null
