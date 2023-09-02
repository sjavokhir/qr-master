package uz.javokhir.qr.master.ui.icons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val StackOverflow: ImageVector
    get() {
        if (_logoStackOverflow != null) {
            return _logoStackOverflow!!
        }
        _logoStackOverflow = Builder(
            name = "LogoStackOverflow",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            group {}
            group {
                path(
                    fill = SolidColor(Color(0xFFffffff)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(24.0f, 0.0f)
                    curveTo(30.3652f, 0.0f, 36.4697f, 2.5286f, 40.9706f, 7.0294f)
                    curveTo(45.4714f, 11.5303f, 48.0f, 17.6348f, 48.0f, 24.0f)
                    curveTo(48.0f, 30.3652f, 45.4714f, 36.4697f, 40.9706f, 40.9706f)
                    curveTo(36.4697f, 45.4714f, 30.3652f, 48.0f, 24.0f, 48.0f)
                    curveTo(17.6348f, 48.0f, 11.5303f, 45.4714f, 7.0294f, 40.9706f)
                    curveTo(2.5286f, 36.4697f, 0.0f, 30.3652f, 0.0f, 24.0f)
                    curveTo(0.0f, 17.6348f, 2.5286f, 11.5303f, 7.0294f, 7.0294f)
                    curveTo(11.5303f, 2.5286f, 17.6348f, 0.0f, 24.0f, 0.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFF48023)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd
                ) {
                    moveTo(48.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(48.0f)
                    horizontalLineTo(48.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(28.8864f, 29.016f)
                    lineTo(18.408f, 26.8272f)
                    lineTo(18.8544f, 24.72f)
                    lineTo(29.328f, 26.9088f)
                    lineTo(28.8864f, 29.016f)
                    close()
                    moveTo(29.496f, 26.3568f)
                    lineTo(19.7952f, 21.84f)
                    lineTo(20.6832f, 19.872f)
                    lineTo(30.384f, 24.4176f)
                    lineTo(29.496f, 26.3568f)
                    close()
                    moveTo(30.7152f, 23.9184f)
                    lineTo(22.4832f, 17.0736f)
                    lineTo(23.8416f, 15.4368f)
                    lineTo(32.0736f, 22.2816f)
                    lineTo(30.7152f, 23.9184f)
                    close()
                    moveTo(26.088f, 13.2768f)
                    lineTo(27.8064f, 12.0f)
                    lineTo(34.1808f, 20.592f)
                    lineTo(32.4624f, 21.864f)
                    lineTo(26.088f, 13.2768f)
                    close()
                    moveTo(28.8864f, 31.704f)
                    horizontalLineTo(18.1872f)
                    verticalLineTo(29.5728f)
                    horizontalLineTo(28.8864f)
                    verticalLineTo(31.704f)
                    close()
                    moveTo(31.0464f, 27.4368f)
                    verticalLineTo(33.864f)
                    horizontalLineTo(16.056f)
                    verticalLineTo(27.4368f)
                    horizontalLineTo(13.92f)
                    verticalLineTo(36.0f)
                    horizontalLineTo(33.1824f)
                    verticalLineTo(27.4368f)
                    horizontalLineTo(31.0464f)
                    close()
                }
            }
        }.build()
        return _logoStackOverflow!!
    }

private var _logoStackOverflow: ImageVector? = null
