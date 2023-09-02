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

internal val Wikipedia: ImageVector
    get() {
        if (_wikipedia != null) {
            return _wikipedia!!
        }
        _wikipedia = Builder(
            name = "Wikipedia",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF6F6F6)),
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
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(31.2634f, 16.0f)
                verticalLineTo(16.5335f)
                curveTo(30.5639f, 16.6585f, 30.0347f, 16.8797f, 29.6752f, 17.1968f)
                curveTo(29.1604f, 17.668f, 28.5536f, 18.3888f, 28.1552f, 19.3599f)
                lineTo(20.0532f, 36.0f)
                horizontalLineTo(19.5141f)
                lineTo(11.3804f, 19.1436f)
                curveTo(11.0016f, 18.2783f, 10.4865f, 17.7495f, 10.3311f, 17.5575f)
                curveTo(10.0884f, 17.2594f, 9.7897f, 17.0262f, 9.4352f, 16.858f)
                curveTo(9.0805f, 16.6897f, 8.6021f, 16.5817f, 8.0f, 16.5335f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.9144f)
                verticalLineTo(16.5335f)
                curveTo(15.0014f, 16.6201f, 14.5661f, 16.774f, 14.294f, 16.995f)
                curveTo(14.022f, 17.216f, 13.8862f, 17.4996f, 13.8862f, 17.8458f)
                curveTo(13.8862f, 18.3265f, 14.1095f, 19.0763f, 14.5562f, 20.0952f)
                lineTo(20.5631f, 31.5589f)
                lineTo(26.4359f, 20.2394f)
                curveTo(26.8925f, 19.1244f, 27.2713f, 18.3504f, 27.2713f, 17.9179f)
                curveTo(27.2713f, 17.639f, 27.1305f, 17.3724f, 26.8487f, 17.1175f)
                curveTo(26.5671f, 16.8628f, 26.2483f, 16.6824f, 25.5783f, 16.5767f)
                curveTo(25.5297f, 16.5672f, 25.4471f, 16.5527f, 25.3304f, 16.5335f)
                verticalLineTo(16.0f)
                lineTo(31.2634f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(40.0002f, 16.0f)
                verticalLineTo(16.5335f)
                curveTo(39.3007f, 16.6585f, 38.7715f, 16.8797f, 38.4121f, 17.1968f)
                curveTo(37.8972f, 17.668f, 37.2904f, 18.3888f, 36.8921f, 19.3599f)
                lineTo(28.79f, 36.0f)
                horizontalLineTo(28.2509f)
                lineTo(20.1172f, 19.1436f)
                curveTo(19.7384f, 18.2783f, 19.2233f, 17.7495f, 19.0679f, 17.5575f)
                curveTo(18.8252f, 17.2594f, 18.5265f, 17.0262f, 18.172f, 16.858f)
                curveTo(17.8173f, 16.6897f, 17.3389f, 16.5817f, 16.7368f, 16.5335f)
                verticalLineTo(16.0f)
                horizontalLineTo(24.6512f)
                verticalLineTo(16.5335f)
                curveTo(23.7382f, 16.6201f, 23.3029f, 16.774f, 23.0308f, 16.995f)
                curveTo(22.7588f, 17.216f, 22.623f, 17.4996f, 22.623f, 17.8458f)
                curveTo(22.623f, 18.3265f, 22.8463f, 19.0763f, 23.293f, 20.0952f)
                lineTo(29.2999f, 31.5589f)
                lineTo(35.1727f, 20.2394f)
                curveTo(35.6293f, 19.1244f, 36.0081f, 18.3504f, 36.0081f, 17.9179f)
                curveTo(36.0081f, 17.639f, 35.8673f, 17.3724f, 35.5855f, 17.1175f)
                curveTo(35.3039f, 16.8628f, 34.9851f, 16.6824f, 34.3151f, 16.5767f)
                curveTo(34.2665f, 16.5672f, 34.1839f, 16.5527f, 34.0672f, 16.5335f)
                verticalLineTo(16.0f)
                lineTo(40.0002f, 16.0f)
                close()
            }
        }.build()
        return _wikipedia!!
    }

private var _wikipedia: ImageVector? = null
