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

internal val Microsoft: ImageVector
    get() {
        if (_microsoft != null) {
            return _microsoft!!
        }
        _microsoft = Builder(
            name = "Microsoft",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0067B8)),
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
                fill = SolidColor(Color(0xFFF25022)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7FBA00)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(25.0f, 10.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00A4EF)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 25.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFB900)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(25.0f, 25.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-13.0f)
                close()
            }
        }.build()
        return _microsoft!!
    }

private var _microsoft: ImageVector? = null
