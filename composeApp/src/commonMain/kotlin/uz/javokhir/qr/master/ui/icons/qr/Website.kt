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

internal val Website: ImageVector
    get() {
        if (_website != null) {
            return _website!!
        }
        _website = Builder(
            name = "Website",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF2196F3)),
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
                fill = SolidColor(Color(0xFF2196F3)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(36.0f, 56.0f)
                curveTo(33.2f, 56.0f, 30.5833f, 55.475f, 28.15f, 54.425f)
                curveTo(25.7167f, 53.375f, 23.6f, 51.95f, 21.8f, 50.15f)
                curveTo(20.0f, 48.35f, 18.5833f, 46.225f, 17.55f, 43.775f)
                curveTo(16.5167f, 41.325f, 16.0f, 38.7f, 16.0f, 35.9f)
                curveTo(16.0f, 33.1f, 16.5167f, 30.4917f, 17.55f, 28.075f)
                curveTo(18.5833f, 25.6583f, 20.0f, 23.55f, 21.8f, 21.75f)
                curveTo(23.6f, 19.95f, 25.7167f, 18.5417f, 28.15f, 17.525f)
                curveTo(30.5833f, 16.5083f, 33.2f, 16.0f, 36.0f, 16.0f)
                curveTo(38.8f, 16.0f, 41.4167f, 16.5083f, 43.85f, 17.525f)
                curveTo(46.2833f, 18.5417f, 48.4f, 19.95f, 50.2f, 21.75f)
                curveTo(52.0f, 23.55f, 53.4167f, 25.6583f, 54.45f, 28.075f)
                curveTo(55.4833f, 30.4917f, 56.0f, 33.1f, 56.0f, 35.9f)
                curveTo(56.0f, 38.7f, 55.4833f, 41.325f, 54.45f, 43.775f)
                curveTo(53.4167f, 46.225f, 52.0f, 48.35f, 50.2f, 50.15f)
                curveTo(48.4f, 51.95f, 46.2833f, 53.375f, 43.85f, 54.425f)
                curveTo(41.4167f, 55.475f, 38.8f, 56.0f, 36.0f, 56.0f)
                close()
                moveTo(36.0f, 53.1f)
                curveTo(37.1667f, 51.9f, 38.1417f, 50.525f, 38.925f, 48.975f)
                curveTo(39.7083f, 47.425f, 40.35f, 45.5833f, 40.85f, 43.45f)
                horizontalLineTo(31.2f)
                curveTo(31.6667f, 45.45f, 32.2917f, 47.25f, 33.075f, 48.85f)
                curveTo(33.8583f, 50.45f, 34.8333f, 51.8667f, 36.0f, 53.1f)
                close()
                moveTo(31.75f, 52.5f)
                curveTo(30.9167f, 51.2333f, 30.2f, 49.8667f, 29.6f, 48.4f)
                curveTo(29.0f, 46.9333f, 28.5f, 45.2833f, 28.1f, 43.45f)
                horizontalLineTo(20.6f)
                curveTo(21.8667f, 45.8167f, 23.3333f, 47.675f, 25.0f, 49.025f)
                curveTo(26.6667f, 50.375f, 28.9167f, 51.5333f, 31.75f, 52.5f)
                close()
                moveTo(40.3f, 52.45f)
                curveTo(42.7f, 51.6833f, 44.8583f, 50.5333f, 46.775f, 49.0f)
                curveTo(48.6917f, 47.4667f, 50.2333f, 45.6167f, 51.4f, 43.45f)
                horizontalLineTo(43.95f)
                curveTo(43.5167f, 45.25f, 43.0083f, 46.8833f, 42.425f, 48.35f)
                curveTo(41.8417f, 49.8167f, 41.1333f, 51.1833f, 40.3f, 52.45f)
                close()
                moveTo(19.6f, 40.45f)
                horizontalLineTo(27.55f)
                curveTo(27.45f, 39.55f, 27.3917f, 38.7417f, 27.375f, 38.025f)
                curveTo(27.3583f, 37.3083f, 27.35f, 36.6f, 27.35f, 35.9f)
                curveTo(27.35f, 35.0667f, 27.3667f, 34.325f, 27.4f, 33.675f)
                curveTo(27.4333f, 33.025f, 27.5f, 32.3f, 27.6f, 31.5f)
                horizontalLineTo(19.6f)
                curveTo(19.3667f, 32.3f, 19.2083f, 33.0167f, 19.125f, 33.65f)
                curveTo(19.0417f, 34.2833f, 19.0f, 35.0333f, 19.0f, 35.9f)
                curveTo(19.0f, 36.7667f, 19.0417f, 37.5417f, 19.125f, 38.225f)
                curveTo(19.2083f, 38.9083f, 19.3667f, 39.65f, 19.6f, 40.45f)
                close()
                moveTo(30.65f, 40.45f)
                horizontalLineTo(41.4f)
                curveTo(41.5333f, 39.4167f, 41.6167f, 38.575f, 41.65f, 37.925f)
                curveTo(41.6833f, 37.275f, 41.7f, 36.6f, 41.7f, 35.9f)
                curveTo(41.7f, 35.2333f, 41.6833f, 34.5917f, 41.65f, 33.975f)
                curveTo(41.6167f, 33.3583f, 41.5333f, 32.5333f, 41.4f, 31.5f)
                horizontalLineTo(30.65f)
                curveTo(30.5167f, 32.5333f, 30.4333f, 33.3583f, 30.4f, 33.975f)
                curveTo(30.3667f, 34.5917f, 30.35f, 35.2333f, 30.35f, 35.9f)
                curveTo(30.35f, 36.6f, 30.3667f, 37.275f, 30.4f, 37.925f)
                curveTo(30.4333f, 38.575f, 30.5167f, 39.4167f, 30.65f, 40.45f)
                close()
                moveTo(44.4f, 40.45f)
                horizontalLineTo(52.4f)
                curveTo(52.6333f, 39.65f, 52.7917f, 38.9083f, 52.875f, 38.225f)
                curveTo(52.9583f, 37.5417f, 53.0f, 36.7667f, 53.0f, 35.9f)
                curveTo(53.0f, 35.0333f, 52.9583f, 34.2833f, 52.875f, 33.65f)
                curveTo(52.7917f, 33.0167f, 52.6333f, 32.3f, 52.4f, 31.5f)
                horizontalLineTo(44.45f)
                curveTo(44.55f, 32.6667f, 44.6167f, 33.5583f, 44.65f, 34.175f)
                curveTo(44.6833f, 34.7917f, 44.7f, 35.3667f, 44.7f, 35.9f)
                curveTo(44.7f, 36.6333f, 44.675f, 37.325f, 44.625f, 37.975f)
                curveTo(44.575f, 38.625f, 44.5f, 39.45f, 44.4f, 40.45f)
                close()
                moveTo(43.9f, 28.5f)
                horizontalLineTo(51.4f)
                curveTo(50.3f, 26.2f, 48.7917f, 24.2833f, 46.875f, 22.75f)
                curveTo(44.9583f, 21.2167f, 42.75f, 20.1333f, 40.25f, 19.5f)
                curveTo(41.0833f, 20.7333f, 41.7917f, 22.0667f, 42.375f, 23.5f)
                curveTo(42.9583f, 24.9333f, 43.4667f, 26.6f, 43.9f, 28.5f)
                close()
                moveTo(31.2f, 28.5f)
                horizontalLineTo(40.9f)
                curveTo(40.5333f, 26.7333f, 39.9167f, 25.025f, 39.05f, 23.375f)
                curveTo(38.1833f, 21.725f, 37.1667f, 20.2667f, 36.0f, 19.0f)
                curveTo(34.9333f, 19.9f, 34.0333f, 21.0833f, 33.3f, 22.55f)
                curveTo(32.5667f, 24.0167f, 31.8667f, 26.0f, 31.2f, 28.5f)
                close()
                moveTo(20.6f, 28.5f)
                horizontalLineTo(28.15f)
                curveTo(28.5167f, 26.7f, 28.9833f, 25.0917f, 29.55f, 23.675f)
                curveTo(30.1167f, 22.2583f, 30.8333f, 20.8833f, 31.7f, 19.55f)
                curveTo(29.2f, 20.1833f, 27.0167f, 21.25f, 25.15f, 22.75f)
                curveTo(23.2833f, 24.25f, 21.7667f, 26.1667f, 20.6f, 28.5f)
                close()
            }
        }.build()
        return _website!!
    }

private var _website: ImageVector? = null
