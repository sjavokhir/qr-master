package uz.javokhir.qr.master.ui.icons.custom

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _vector: ImageVector? = null

internal val Settings: ImageVector
    get() {
        if (_vector != null) {
            return _vector!!
        }
        _vector = ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = null,
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.8f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(19.815f, 13.7964f)
                    lineTo(19.8639f, 13.7841f)
                    curveTo(20.1884f, 13.703f, 20.4765f, 13.5157f, 20.6823f, 13.252f)
                    curveTo(20.8882f, 12.9883f, 21f, 12.6634f, 21f, 12.3289f)
                    verticalLineTo(11.6707f)
                    curveTo(21f, 11.3362f, 20.8882f, 11.0113f, 20.6823f, 10.7476f)
                    curveTo(20.4765f, 10.4839f, 20.1884f, 10.2967f, 19.8638f, 10.2155f)
                    lineTo(19.8148f, 10.2032f)
                    curveTo(19.5638f, 10.1403f, 19.331f, 10.0195f, 19.1351f, 9.8504f)
                    curveTo(18.9391f, 9.6814f, 18.7855f, 9.4687f, 18.6865f, 9.2296f)
                    curveTo(18.5876f, 8.9905f, 18.546f, 8.7315f, 18.5651f, 8.4734f)
                    curveTo(18.5843f, 8.2153f, 18.6636f, 7.9653f, 18.7968f, 7.7434f)
                    lineTo(18.8174f, 7.70904f)
                    curveTo(18.9916f, 7.4218f, 19.0646f, 7.0843f, 19.0246f, 6.7507f)
                    curveTo(18.9845f, 6.4171f, 18.8338f, 6.1065f, 18.5966f, 5.8686f)
                    lineTo(18.1311f, 5.4032f)
                    curveTo(17.8946f, 5.1667f, 17.5858f, 5.016f, 17.2538f, 4.9751f)
                    curveTo(16.9218f, 4.9342f, 16.5856f, 5.0055f, 16.2988f, 5.1776f)
                    lineTo(16.2554f, 5.20359f)
                    curveTo(16.0336f, 5.3367f, 15.7836f, 5.416f, 15.5255f, 5.4351f)
                    curveTo(15.2674f, 5.4542f, 15.0085f, 5.4126f, 14.7694f, 5.3135f)
                    curveTo(14.5303f, 5.2145f, 14.3178f, 5.0609f, 14.1488f, 4.8649f)
                    curveTo(13.9798f, 4.6689f, 13.8591f, 4.436f, 13.7963f, 4.185f)
                    lineTo(13.7841f, 4.13613f)
                    curveTo(13.703f, 3.8116f, 13.5157f, 3.5235f, 13.252f, 3.3177f)
                    curveTo(12.9883f, 3.1118f, 12.6634f, 3f, 12.3289f, 3f)
                    horizontalLineTo(11.6707f)
                    curveTo(11.3362f, 3f, 11.0113f, 3.1118f, 10.7476f, 3.3177f)
                    curveTo(10.4839f, 3.5235f, 10.2966f, 3.8116f, 10.2155f, 4.1361f)
                    lineTo(10.2032f, 4.18515f)
                    curveTo(10.1403f, 4.4362f, 10.0195f, 4.669f, 9.8504f, 4.865f)
                    curveTo(9.6814f, 5.0609f, 9.4687f, 5.2145f, 9.2296f, 5.3135f)
                    curveTo(8.9905f, 5.4124f, 8.7315f, 5.454f, 8.4734f, 5.4349f)
                    curveTo(8.2153f, 5.4158f, 7.9653f, 5.3364f, 7.7433f, 5.2033f)
                    lineTo(7.709f, 5.18268f)
                    curveTo(7.4217f, 5.0084f, 7.0843f, 4.9354f, 6.7507f, 4.9755f)
                    curveTo(6.4171f, 5.0155f, 6.1065f, 5.1662f, 5.8686f, 5.4035f)
                    lineTo(5.40318f, 5.86887f)
                    curveTo(5.1666f, 6.1054f, 5.0159f, 6.4142f, 4.975f, 6.7462f)
                    curveTo(4.9341f, 7.0781f, 5.0054f, 7.4143f, 5.1775f, 7.7011f)
                    lineTo(5.20309f, 7.7438f)
                    curveTo(5.3363f, 7.9657f, 5.4156f, 8.2157f, 5.4347f, 8.4738f)
                    curveTo(5.4539f, 8.7319f, 5.4123f, 8.9909f, 5.3133f, 9.2301f)
                    curveTo(5.2143f, 9.4692f, 5.0607f, 9.6818f, 4.8648f, 9.8509f)
                    curveTo(4.6689f, 10.02f, 4.436f, 10.1408f, 4.185f, 10.2037f)
                    lineTo(4.13616f, 10.2159f)
                    curveTo(3.8116f, 10.2971f, 3.5236f, 10.4844f, 3.3177f, 10.748f)
                    curveTo(3.1118f, 11.0117f, 3f, 11.3366f, 3f, 11.6711f)
                    verticalLineTo(12.3294f)
                    curveTo(3f, 12.6638f, 3.1117f, 12.9887f, 3.3175f, 13.2523f)
                    curveTo(3.5233f, 13.516f, 3.8113f, 13.7032f, 4.1358f, 13.7844f)
                    lineTo(4.18431f, 13.7965f)
                    curveTo(4.4354f, 13.8593f, 4.6683f, 13.98f, 4.8643f, 14.1489f)
                    curveTo(5.0603f, 14.3179f, 5.2141f, 14.5304f, 5.3132f, 14.7695f)
                    curveTo(5.4123f, 15.0086f, 5.454f, 15.2675f, 5.435f, 15.5257f)
                    curveTo(5.4161f, 15.7838f, 5.3369f, 16.0338f, 5.2038f, 16.2558f)
                    lineTo(5.1779f, 16.299f)
                    curveTo(5.0058f, 16.5858f, 4.9345f, 16.922f, 4.9754f, 17.254f)
                    curveTo(5.0163f, 17.586f, 5.1669f, 17.8948f, 5.4035f, 18.1313f)
                    lineTo(5.86892f, 18.5968f)
                    curveTo(6.1054f, 18.8334f, 6.4141f, 18.9841f, 6.746f, 19.025f)
                    curveTo(7.078f, 19.0659f, 7.4141f, 18.9946f, 7.7009f, 18.8226f)
                    lineTo(7.74375f, 18.7968f)
                    curveTo(7.9657f, 18.6636f, 8.2157f, 18.5843f, 8.4738f, 18.5652f)
                    curveTo(8.7319f, 18.546f, 8.9909f, 18.5876f, 9.23f, 18.6866f)
                    curveTo(9.4692f, 18.7855f, 9.6818f, 18.9391f, 9.8509f, 19.1351f)
                    curveTo(10.0199f, 19.331f, 10.1408f, 19.5638f, 10.2037f, 19.8149f)
                    lineTo(10.2159f, 19.8638f)
                    curveTo(10.297f, 20.1883f, 10.4843f, 20.4764f, 10.748f, 20.6823f)
                    curveTo(11.0116f, 20.8882f, 11.3365f, 21f, 11.6711f, 21f)
                    horizontalLineTo(12.3293f)
                    curveTo(12.6638f, 21f, 12.9887f, 20.8883f, 13.2523f, 20.6825f)
                    curveTo(13.5159f, 20.4766f, 13.7032f, 20.1886f, 13.7843f, 19.8641f)
                    lineTo(13.7965f, 19.8156f)
                    curveTo(13.8592f, 19.5646f, 13.9799f, 19.3317f, 14.1489f, 19.1356f)
                    curveTo(14.3178f, 18.9396f, 14.5304f, 18.7859f, 14.7695f, 18.6868f)
                    curveTo(15.0085f, 18.5876f, 15.2675f, 18.5459f, 15.5256f, 18.5649f)
                    curveTo(15.7837f, 18.5839f, 16.0338f, 18.6631f, 16.2558f, 18.7962f)
                    lineTo(16.299f, 18.8221f)
                    curveTo(16.5858f, 18.9942f, 16.922f, 19.0655f, 17.254f, 19.0246f)
                    curveTo(17.586f, 18.9837f, 17.8948f, 18.8331f, 18.1313f, 18.5965f)
                    lineTo(18.5968f, 18.1311f)
                    curveTo(18.8333f, 17.8946f, 18.984f, 17.5859f, 19.0249f, 17.2539f)
                    curveTo(19.0658f, 16.922f, 18.9946f, 16.5859f, 18.8225f, 16.2991f)
                    lineTo(18.7968f, 16.2562f)
                    curveTo(18.6637f, 16.0343f, 18.5843f, 15.7843f, 18.5652f, 15.5262f)
                    curveTo(18.5461f, 15.2681f, 18.5877f, 15.0091f, 18.6866f, 14.77f)
                    curveTo(18.7856f, 14.5308f, 18.9392f, 14.3182f, 19.1352f, 14.1491f)
                    curveTo(19.3311f, 13.9801f, 19.564f, 13.8593f, 19.815f, 13.7964f)
                    verticalLineTo(13.7964f)
                    close()
                }
                path(
                    fill = null,
                    fillAlpha = 1.0f,
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.8f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(11.9999f, 14.0772f)
                    curveTo(13.1469f, 14.0772f, 14.0768f, 13.1473f, 14.0768f, 12.0003f)
                    curveTo(14.0768f, 10.8532f, 13.1469f, 9.9233f, 11.9999f, 9.9233f)
                    curveTo(10.8528f, 9.9233f, 9.9229f, 10.8532f, 9.9229f, 12.0003f)
                    curveTo(9.9229f, 13.1473f, 10.8528f, 14.0772f, 11.9999f, 14.0772f)
                    close()
                }
            }
        }.build()
        return _vector!!
    }