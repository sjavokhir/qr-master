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

internal val LogoWifi: ImageVector
    get() {
        if (_logoWifi != null) {
            return _logoWifi!!
        }
        _logoWifi = Builder(
            name = "LogoWifi",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF678FCC)),
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
                    moveTo(15.4232f, 26.2448f)
                    curveTo(15.1653f, 25.9868f, 15.0335f, 25.674f, 15.0226f, 25.3063f)
                    curveTo(15.0116f, 24.9385f, 15.1488f, 24.6367f, 15.4232f, 24.4007f)
                    curveTo(16.6746f, 23.3085f, 17.9808f, 22.4962f, 19.3475f, 21.9473f)
                    curveTo(20.7141f, 21.404f, 22.1686f, 21.1295f, 23.7163f, 21.1295f)
                    curveTo(25.2586f, 21.1295f, 26.7185f, 21.404f, 28.0851f, 21.9473f)
                    curveTo(29.4518f, 22.4962f, 30.758f, 23.3085f, 32.0039f, 24.4007f)
                    curveTo(32.2838f, 24.6367f, 32.421f, 24.933f, 32.421f, 25.2898f)
                    curveTo(32.421f, 25.6465f, 32.2838f, 25.9649f, 32.0039f, 26.2448f)
                    curveTo(31.7459f, 26.5027f, 31.4386f, 26.629f, 31.0818f, 26.629f)
                    curveTo(30.7251f, 26.629f, 30.4122f, 26.5082f, 30.1323f, 26.2722f)
                    curveTo(29.0621f, 25.3831f, 27.9973f, 24.7464f, 26.938f, 24.3732f)
                    curveTo(25.8788f, 23.9945f, 24.803f, 23.8079f, 23.7163f, 23.8079f)
                    curveTo(22.6241f, 23.8079f, 21.5484f, 23.9945f, 20.4891f, 24.3732f)
                    curveTo(19.4298f, 24.7464f, 18.365f, 25.3831f, 17.2948f, 26.2722f)
                    curveTo(17.0204f, 26.5082f, 16.702f, 26.629f, 16.3453f, 26.629f)
                    curveTo(15.9885f, 26.629f, 15.6812f, 26.5027f, 15.4232f, 26.2448f)
                    close()
                    moveTo(10.4013f, 21.2228f)
                    curveTo(10.1433f, 20.9649f, 10.0116f, 20.6465f, 10.0006f, 20.2678f)
                    curveTo(9.9896f, 19.8946f, 10.1268f, 19.5873f, 10.4013f, 19.3513f)
                    curveTo(12.207f, 17.7267f, 14.2377f, 16.4259f, 16.5099f, 15.4544f)
                    curveTo(18.7767f, 14.483f, 21.1806f, 14.0f, 23.7163f, 14.0f)
                    curveTo(26.252f, 14.0f, 28.6504f, 14.483f, 30.9227f, 15.4544f)
                    curveTo(33.1894f, 16.4259f, 35.2256f, 17.7267f, 37.0259f, 19.3513f)
                    curveTo(37.3058f, 19.5873f, 37.443f, 19.8891f, 37.443f, 20.2569f)
                    curveTo(37.443f, 20.6191f, 37.3058f, 20.9429f, 37.0259f, 21.2228f)
                    curveTo(36.7679f, 21.4808f, 36.4551f, 21.607f, 36.0928f, 21.607f)
                    curveTo(35.7251f, 21.607f, 35.4013f, 21.4863f, 35.1268f, 21.2503f)
                    curveTo(33.4803f, 19.8452f, 31.7075f, 18.7311f, 29.8085f, 17.9078f)
                    curveTo(27.904f, 17.0845f, 25.8733f, 16.6729f, 23.7163f, 16.6729f)
                    curveTo(21.5538f, 16.6729f, 19.5231f, 17.0845f, 17.6241f, 17.9078f)
                    curveTo(15.7196f, 18.7311f, 13.9468f, 19.8452f, 12.3058f, 21.2503f)
                    curveTo(12.0259f, 21.4863f, 11.702f, 21.607f, 11.3398f, 21.607f)
                    curveTo(10.9721f, 21.607f, 10.6592f, 21.4808f, 10.4013f, 21.2228f)
                    close()
                    moveTo(23.7163f, 34.0f)
                    curveTo(23.0028f, 34.0f, 22.3771f, 33.7311f, 21.8447f, 33.1932f)
                    curveTo(21.3069f, 32.6608f, 21.0379f, 32.0351f, 21.0379f, 31.3216f)
                    curveTo(21.0379f, 30.6081f, 21.3069f, 29.9879f, 21.8447f, 29.4501f)
                    curveTo(22.3771f, 28.9177f, 23.0028f, 28.6487f, 23.7163f, 28.6487f)
                    curveTo(24.4298f, 28.6487f, 25.05f, 28.9177f, 25.5879f, 29.4501f)
                    curveTo(26.1203f, 29.9879f, 26.3892f, 30.6081f, 26.3892f, 31.3216f)
                    curveTo(26.3892f, 32.0351f, 26.1203f, 32.6608f, 25.5879f, 33.1932f)
                    curveTo(25.05f, 33.7311f, 24.4298f, 34.0f, 23.7163f, 34.0f)
                    close()
                }
            }
        }.build()
        return _logoWifi!!
    }

private var _logoWifi: ImageVector? = null
