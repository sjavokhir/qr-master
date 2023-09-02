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

internal val Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi = Builder(
            name = "Wifi",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9C27B0)),
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
                fill = SolidColor(Color(0xFF9C27B0)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.05f, 40.6f)
                curveTo(21.6167f, 40.1667f, 21.3917f, 39.6417f, 21.375f, 39.025f)
                curveTo(21.3583f, 38.4083f, 21.5833f, 37.9f, 22.05f, 37.5f)
                curveTo(24.15f, 35.6667f, 26.35f, 34.2917f, 28.65f, 33.375f)
                curveTo(30.95f, 32.4583f, 33.4f, 32.0f, 36.0f, 32.0f)
                curveTo(38.6f, 32.0f, 41.05f, 32.4583f, 43.35f, 33.375f)
                curveTo(45.65f, 34.2917f, 47.85f, 35.6667f, 49.95f, 37.5f)
                curveTo(50.4167f, 37.9f, 50.65f, 38.4f, 50.65f, 39.0f)
                curveTo(50.65f, 39.6f, 50.4167f, 40.1333f, 49.95f, 40.6f)
                curveTo(49.5167f, 41.0333f, 49.0f, 41.25f, 48.4f, 41.25f)
                curveTo(47.8f, 41.25f, 47.2667f, 41.05f, 46.8f, 40.65f)
                curveTo(45.0f, 39.15f, 43.2083f, 38.0833f, 41.425f, 37.45f)
                curveTo(39.6417f, 36.8167f, 37.8333f, 36.5f, 36.0f, 36.5f)
                curveTo(34.1667f, 36.5f, 32.3583f, 36.8167f, 30.575f, 37.45f)
                curveTo(28.7917f, 38.0833f, 27.0f, 39.15f, 25.2f, 40.65f)
                curveTo(24.7333f, 41.05f, 24.2f, 41.25f, 23.6f, 41.25f)
                curveTo(23.0f, 41.25f, 22.4833f, 41.0333f, 22.05f, 40.6f)
                close()
                moveTo(13.6f, 32.15f)
                curveTo(13.1667f, 31.7167f, 12.9417f, 31.1833f, 12.925f, 30.55f)
                curveTo(12.9083f, 29.9167f, 13.1333f, 29.4f, 13.6f, 29.0f)
                curveTo(16.6333f, 26.2667f, 20.0583f, 24.0833f, 23.875f, 22.45f)
                curveTo(27.6917f, 20.8167f, 31.7333f, 20.0f, 36.0f, 20.0f)
                curveTo(40.2667f, 20.0f, 44.3083f, 20.8167f, 48.125f, 22.45f)
                curveTo(51.9417f, 24.0833f, 55.3667f, 26.2667f, 58.4f, 29.0f)
                curveTo(58.8667f, 29.4f, 59.1f, 29.9083f, 59.1f, 30.525f)
                curveTo(59.1f, 31.1417f, 58.8667f, 31.6833f, 58.4f, 32.15f)
                curveTo(57.9667f, 32.5833f, 57.4417f, 32.8f, 56.825f, 32.8f)
                curveTo(56.2083f, 32.8f, 55.6667f, 32.6f, 55.2f, 32.2f)
                curveTo(52.4333f, 29.8333f, 49.45f, 27.9583f, 46.25f, 26.575f)
                curveTo(43.05f, 25.1917f, 39.6333f, 24.5f, 36.0f, 24.5f)
                curveTo(32.3667f, 24.5f, 28.95f, 25.1917f, 25.75f, 26.575f)
                curveTo(22.55f, 27.9583f, 19.5667f, 29.8333f, 16.8f, 32.2f)
                curveTo(16.3333f, 32.6f, 15.7917f, 32.8f, 15.175f, 32.8f)
                curveTo(14.5583f, 32.8f, 14.0333f, 32.5833f, 13.6f, 32.15f)
                close()
                moveTo(36.0f, 53.65f)
                curveTo(34.8f, 53.65f, 33.75f, 53.2f, 32.85f, 52.3f)
                curveTo(31.95f, 51.4f, 31.5f, 50.35f, 31.5f, 49.15f)
                curveTo(31.5f, 47.95f, 31.95f, 46.9f, 32.85f, 46.0f)
                curveTo(33.75f, 45.1f, 34.8f, 44.65f, 36.0f, 44.65f)
                curveTo(37.2f, 44.65f, 38.25f, 45.1f, 39.15f, 46.0f)
                curveTo(40.05f, 46.9f, 40.5f, 47.95f, 40.5f, 49.15f)
                curveTo(40.5f, 50.35f, 40.05f, 51.4f, 39.15f, 52.3f)
                curveTo(38.25f, 53.2f, 37.2f, 53.65f, 36.0f, 53.65f)
                close()
            }
        }.build()
        return _wifi!!
    }

private var _wifi: ImageVector? = null
