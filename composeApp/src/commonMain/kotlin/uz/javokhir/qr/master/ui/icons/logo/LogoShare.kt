package uz.javokhir.qr.master.ui.icons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val LogoShare: ImageVector
    get() {
        if (_logoShare != null) {
            return _logoShare!!
        }
        _logoShare = Builder(
            name = "LogoShare",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF00A3FF)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(0.0f, 24.0f)
                    curveTo(0.0f, 17.6348f, 2.5286f, 11.5303f, 7.0294f, 7.0294f)
                    curveTo(11.5303f, 2.5286f, 17.6348f, 0.0f, 24.0f, 0.0f)
                    curveTo(30.3652f, 0.0f, 36.4697f, 2.5286f, 40.9706f, 7.0294f)
                    curveTo(45.4714f, 11.5303f, 48.0f, 17.6348f, 48.0f, 24.0f)
                    curveTo(48.0f, 30.3652f, 45.4714f, 36.4697f, 40.9706f, 40.9706f)
                    curveTo(36.4697f, 45.4714f, 30.3652f, 48.0f, 24.0f, 48.0f)
                    curveTo(17.6348f, 48.0f, 11.5303f, 45.4714f, 7.0294f, 40.9706f)
                    curveTo(2.5286f, 36.4697f, 0.0f, 30.3652f, 0.0f, 24.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFffffff)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(31.208f, 36.0f)
                    curveTo(30.2587f, 36.0f, 29.4533f, 35.664f, 28.7867f, 34.9973f)
                    curveTo(28.12f, 34.3307f, 27.7893f, 33.5253f, 27.7893f, 32.5707f)
                    curveTo(27.7893f, 32.4373f, 27.8053f, 32.272f, 27.8373f, 32.08f)
                    curveTo(27.864f, 31.888f, 27.912f, 31.712f, 27.9707f, 31.5573f)
                    lineTo(18.8827f, 26.2827f)
                    curveTo(18.5787f, 26.6187f, 18.2107f, 26.896f, 17.768f, 27.104f)
                    curveTo(17.3307f, 27.3173f, 16.8827f, 27.4187f, 16.4187f, 27.4187f)
                    curveTo(15.4693f, 27.4187f, 14.664f, 27.088f, 13.9973f, 26.4213f)
                    curveTo(13.3307f, 25.76f, 13.0f, 24.9493f, 13.0f, 24.0f)
                    curveTo(13.0f, 23.0507f, 13.3307f, 22.24f, 13.9973f, 21.5787f)
                    curveTo(14.664f, 20.912f, 15.4693f, 20.5813f, 16.4187f, 20.5813f)
                    curveTo(16.8827f, 20.5813f, 17.32f, 20.672f, 17.7413f, 20.848f)
                    curveTo(18.1573f, 21.0293f, 18.5413f, 21.2907f, 18.8827f, 21.632f)
                    lineTo(27.9707f, 16.4107f)
                    curveTo(27.912f, 16.2667f, 27.864f, 16.112f, 27.8373f, 15.9307f)
                    curveTo(27.8053f, 15.7547f, 27.7893f, 15.584f, 27.7893f, 15.4187f)
                    curveTo(27.7893f, 14.4693f, 28.12f, 13.664f, 28.7867f, 12.9973f)
                    curveTo(29.4533f, 12.3307f, 30.2587f, 12.0f, 31.208f, 12.0f)
                    curveTo(32.1573f, 12.0f, 32.968f, 12.3307f, 33.6347f, 12.9973f)
                    curveTo(34.296f, 13.664f, 34.632f, 14.4693f, 34.632f, 15.4187f)
                    curveTo(34.632f, 16.368f, 34.296f, 17.1787f, 33.6347f, 17.84f)
                    curveTo(32.968f, 18.5067f, 32.1573f, 18.8427f, 31.208f, 18.8427f)
                    curveTo(30.744f, 18.8427f, 30.296f, 18.7627f, 29.8693f, 18.6133f)
                    curveTo(29.4427f, 18.464f, 29.08f, 18.2187f, 28.7813f, 17.8827f)
                    lineTo(19.688f, 22.9173f)
                    curveTo(19.7307f, 23.0827f, 19.7627f, 23.264f, 19.7947f, 23.4773f)
                    curveTo(19.8267f, 23.6853f, 19.8427f, 23.8613f, 19.8427f, 24.0053f)
                    curveTo(19.8427f, 24.1547f, 19.8267f, 24.304f, 19.7947f, 24.4587f)
                    curveTo(19.7627f, 24.6133f, 19.7307f, 24.768f, 19.688f, 24.928f)
                    lineTo(28.7813f, 30.0907f)
                    curveTo(29.08f, 29.808f, 29.432f, 29.584f, 29.832f, 29.4133f)
                    curveTo(30.232f, 29.2427f, 30.6907f, 29.1573f, 31.208f, 29.1573f)
                    curveTo(32.1573f, 29.1573f, 32.968f, 29.4933f, 33.6347f, 30.16f)
                    curveTo(34.296f, 30.8213f, 34.632f, 31.632f, 34.632f, 32.5813f)
                    curveTo(34.632f, 33.5307f, 34.296f, 34.336f, 33.6347f, 35.0027f)
                    curveTo(32.968f, 35.6693f, 32.1573f, 36.0f, 31.208f, 36.0f)
                    close()
                }
            }
        }.build()
        return _logoShare!!
    }

private var _logoShare: ImageVector? = null
