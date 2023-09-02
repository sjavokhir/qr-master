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

internal val Behance: ImageVector
    get() {
        if (_behance != null) {
            return _behance!!
        }
        _behance = Builder(
            name = "Behance",
            defaultWidth = 72.0.dp,
            defaultHeight = 72.0.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF5F5F5)),
                stroke = null,
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
                fill = SolidColor(Color(0xFF111111)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(32.5371f, 34.9171f)
                curveTo(32.5371f, 34.9171f, 35.9445f, 34.6582f, 35.9445f, 30.581f)
                curveTo(35.9445f, 26.5072f, 33.6335f, 24.499f, 30.1011f, 24.499f)
                lineTo(18.0001f, 24.4799f)
                verticalLineTo(46.9934f)
                horizontalLineTo(30.3825f)
                curveTo(30.3825f, 46.9934f, 36.5738f, 47.1892f, 36.5738f, 40.2393f)
                curveTo(36.5738f, 40.2393f, 37.0285f, 34.9171f, 32.5371f, 34.9171f)
                close()
                moveTo(22.5028f, 27.8569f)
                horizontalLineTo(28.694f)
                curveTo(28.694f, 27.8569f, 30.8126f, 27.8918f, 30.8126f, 30.6384f)
                curveTo(30.8126f, 33.4853f, 28.694f, 33.4853f, 28.694f, 33.4853f)
                horizontalLineTo(22.5028f)
                verticalLineTo(27.8569f)
                close()
                moveTo(29.2569f, 43.6163f)
                horizontalLineTo(22.5028f)
                verticalLineTo(36.8623f)
                horizontalLineTo(29.2569f)
                curveTo(29.2569f, 36.8623f, 32.6339f, 36.8972f, 32.6339f, 40.2393f)
                curveTo(32.6339f, 43.5815f, 29.7432f, 43.6163f, 29.2569f, 43.6163f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF111111)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(46.1423f, 30.1087f)
                curveTo(37.6851f, 30.1087f, 37.6997f, 38.5513f, 37.6997f, 38.5513f)
                curveTo(37.6997f, 38.5513f, 37.1369f, 46.9939f, 46.1423f, 46.9939f)
                curveTo(46.1423f, 46.9939f, 54.022f, 46.9939f, 54.022f, 40.2398f)
                horizontalLineTo(49.5193f)
                curveTo(49.5193f, 40.2398f, 49.5193f, 43.6168f, 46.1423f, 43.6168f)
                curveTo(46.1423f, 43.6168f, 42.7652f, 43.6168f, 42.7652f, 39.1141f)
                curveTo(42.7652f, 39.1141f, 51.7706f, 39.1141f, 54.022f, 39.1141f)
                curveTo(54.022f, 36.8628f, 54.022f, 30.1087f, 46.1423f, 30.1087f)
                close()
                moveTo(42.7652f, 36.8628f)
                curveTo(42.7652f, 36.8628f, 42.6909f, 33.4858f, 46.1423f, 33.4858f)
                curveTo(49.5925f, 33.4858f, 49.5193f, 36.8628f, 49.5193f, 36.8628f)
                horizontalLineTo(42.7652f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF111111)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(50.6453f, 26.7314f)
                horizontalLineTo(41.6399f)
                verticalLineTo(28.9828f)
                horizontalLineTo(50.6453f)
                verticalLineTo(26.7314f)
                close()
            }
        }.build()
        return _behance!!
    }

private var _behance: ImageVector? = null
