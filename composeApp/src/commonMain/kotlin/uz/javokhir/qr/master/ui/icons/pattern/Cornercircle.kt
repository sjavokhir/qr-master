package uz.javokhir.qr.master.ui.icons.pattern

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

internal val Cornercircle: ImageVector
    get() {
        if (_cornercircle != null) {
            return _cornercircle!!
        }
        _cornercircle = Builder(
            name = "Cornercircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(12.0f, 0.0f)
                    curveTo(9.6266f, 0.0f, 7.3066f, 0.7038f, 5.3332f, 2.0224f)
                    curveTo(3.3598f, 3.3409f, 1.8217f, 5.2151f, 0.9135f, 7.4078f)
                    curveTo(0.0052f, 9.6005f, -0.2324f, 12.0133f, 0.2306f, 14.3411f)
                    curveTo(0.6936f, 16.6689f, 1.8365f, 18.8071f, 3.5147f, 20.4853f)
                    curveTo(5.1929f, 22.1635f, 7.3312f, 23.3064f, 9.6589f, 23.7694f)
                    curveTo(11.9867f, 24.2324f, 14.3995f, 23.9948f, 16.5922f, 23.0866f)
                    curveTo(18.7849f, 22.1783f, 20.6591f, 20.6402f, 21.9776f, 18.6668f)
                    curveTo(23.2962f, 16.6935f, 24.0f, 14.3734f, 24.0f, 12.0f)
                    curveTo(24.0f, 8.8174f, 22.7357f, 5.7652f, 20.4853f, 3.5147f)
                    curveTo(18.2349f, 1.2643f, 15.1826f, 0.0f, 12.0f, 0.0f)
                    close()
                    moveTo(12.0f, 20.0f)
                    curveTo(10.4178f, 20.0f, 8.871f, 19.5308f, 7.5554f, 18.6518f)
                    curveTo(6.2399f, 17.7727f, 5.2145f, 16.5233f, 4.609f, 15.0615f)
                    curveTo(4.0035f, 13.5997f, 3.845f, 11.9911f, 4.1537f, 10.4393f)
                    curveTo(4.4624f, 8.8874f, 5.2243f, 7.462f, 6.3432f, 6.3432f)
                    curveTo(7.462f, 5.2243f, 8.8874f, 4.4624f, 10.4393f, 4.1537f)
                    curveTo(11.9911f, 3.845f, 13.5997f, 4.0035f, 15.0615f, 4.609f)
                    curveTo(16.5233f, 5.2145f, 17.7727f, 6.2398f, 18.6518f, 7.5554f)
                    curveTo(19.5308f, 8.871f, 20.0f, 10.4177f, 20.0f, 12.0f)
                    curveTo(20.0f, 14.1217f, 19.1572f, 16.1566f, 17.6569f, 17.6569f)
                    curveTo(16.1566f, 19.1571f, 14.1217f, 20.0f, 12.0f, 20.0f)
                    close()
                }
            }
        }.build()
        return _cornercircle!!
    }

private var _cornercircle: ImageVector? = null
