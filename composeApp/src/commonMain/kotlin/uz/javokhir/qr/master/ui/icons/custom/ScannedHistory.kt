package uz.javokhir.qr.master.ui.icons.custom

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

internal val ScannedHistory: ImageVector
    get() {
        if (_scannerhistory != null) {
            return _scannerhistory!!
        }
        _scannerhistory = Builder(
            name = "Scannerhistory",
            defaultWidth = 290.0.dp,
            defaultHeight = 120.0.dp,
            viewportWidth = 290.0f,
            viewportHeight = 120.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF272727)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(231.0f, 35.0f)
                lineTo(231.0f, 42.0f)
                lineTo(153.5f, 118.0f)
                lineTo(55.0f, 110.0f)
                lineTo(55.0f, 104.0f)
                lineTo(56.0f, 104.0f)
                lineTo(132.0f, 28.0f)
                lineTo(231.0f, 35.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)),
                stroke = SolidColor(Color(0xFF858585)),
                strokeLineWidth = 1.6f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(56.788f, 103.343f)
                lineTo(132.304f, 27.827f)
                lineTo(229.196f, 35.657f)
                lineTo(152.699f, 111.173f)
                lineTo(56.788f, 103.343f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(153.565f, 87.231f)
                lineTo(155.712f, 85.084f)
                lineTo(152.696f, 84.847f)
                lineTo(157.017f, 80.526f)
                lineTo(160.033f, 80.763f)
                lineTo(164.343f, 76.454f)
                lineTo(161.305f, 76.215f)
                lineTo(165.614f, 71.905f)
                lineTo(162.598f, 71.668f)
                lineTo(164.757f, 69.509f)
                lineTo(167.773f, 69.746f)
                lineTo(169.924f, 67.595f)
                lineTo(166.88f, 67.356f)
                lineTo(169.031f, 65.205f)
                lineTo(153.847f, 64.01f)
                lineTo(155.994f, 61.863f)
                lineTo(152.951f, 61.624f)
                lineTo(157.252f, 57.322f)
                lineTo(154.226f, 57.083f)
                lineTo(149.955f, 61.354f)
                lineTo(146.917f, 61.115f)
                lineTo(153.35f, 54.682f)
                lineTo(150.307f, 54.442f)
                lineTo(133.065f, 71.684f)
                lineTo(123.962f, 70.968f)
                lineTo(121.823f, 73.107f)
                lineTo(130.925f, 73.824f)
                lineTo(128.767f, 75.982f)
                lineTo(131.799f, 76.221f)
                curveTo(131.085f, 76.935f, 130.367f, 77.654f, 129.652f, 78.368f)
                lineTo(132.668f, 78.605f)
                lineTo(130.506f, 80.768f)
                lineTo(127.506f, 80.532f)
                lineTo(123.204f, 84.834f)
                lineTo(129.286f, 85.312f)
                lineTo(131.429f, 83.169f)
                lineTo(146.585f, 84.362f)
                lineTo(144.431f, 86.517f)
                lineTo(138.41f, 86.043f)
                lineTo(136.259f, 88.194f)
                lineTo(139.291f, 88.432f)
                lineTo(137.144f, 90.579f)
                lineTo(143.225f, 91.058f)
                lineTo(141.078f, 93.205f)
                lineTo(144.111f, 93.444f)
                lineTo(148.409f, 89.146f)
                lineTo(157.501f, 89.861f)
                lineTo(159.652f, 87.711f)
                lineTo(153.565f, 87.231f)
                close()
                moveTo(160.807f, 66.899f)
                lineTo(163.812f, 67.135f)
                lineTo(161.681f, 69.267f)
                lineTo(158.675f, 69.03f)
                lineTo(160.807f, 66.899f)
                close()
                moveTo(139.649f, 81.479f)
                lineTo(136.644f, 81.243f)
                lineTo(138.775f, 79.111f)
                lineTo(141.781f, 79.348f)
                lineTo(139.649f, 81.479f)
                close()
                moveTo(148.253f, 72.876f)
                lineTo(143.959f, 77.17f)
                lineTo(140.921f, 76.93f)
                lineTo(143.072f, 74.78f)
                lineTo(140.039f, 74.541f)
                lineTo(137.896f, 76.684f)
                lineTo(131.831f, 76.207f)
                lineTo(133.974f, 74.064f)
                lineTo(136.996f, 74.301f)
                lineTo(139.147f, 72.15f)
                lineTo(136.136f, 71.914f)
                lineTo(140.446f, 67.604f)
                lineTo(146.494f, 68.08f)
                lineTo(148.645f, 65.929f)
                lineTo(157.759f, 66.646f)
                lineTo(153.457f, 70.948f)
                lineTo(159.522f, 71.425f)
                lineTo(157.363f, 73.584f)
                lineTo(148.277f, 72.869f)
                lineTo(148.253f, 72.876f)
                close()
                moveTo(147.861f, 79.809f)
                lineTo(144.878f, 79.575f)
                lineTo(147.017f, 77.435f)
                lineTo(150.033f, 77.673f)
                lineTo(147.861f, 79.809f)
                close()
                moveTo(151.773f, 82.433f)
                lineTo(145.741f, 81.959f)
                lineTo(147.881f, 79.819f)
                lineTo(153.929f, 80.295f)
                lineTo(151.773f, 82.433f)
                close()
                moveTo(158.238f, 75.969f)
                lineTo(155.216f, 75.731f)
                lineTo(157.355f, 73.592f)
                lineTo(160.372f, 73.829f)
                lineTo(158.238f, 75.969f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(165.608f, 71.917f)
                curveTo(165.611f, 71.917f, 165.615f, 71.915f, 165.617f, 71.913f)
                curveTo(165.619f, 71.911f, 165.618f, 71.91f, 165.615f, 71.909f)
                curveTo(165.613f, 71.909f, 165.609f, 71.91f, 165.607f, 71.912f)
                curveTo(165.605f, 71.914f, 165.605f, 71.916f, 165.608f, 71.917f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(155.869f, 45.591f)
                lineTo(134.637f, 43.92f)
                lineTo(119.576f, 58.98f)
                lineTo(140.809f, 60.651f)
                lineTo(155.869f, 45.591f)
                close()
                moveTo(139.931f, 58.258f)
                lineTo(124.775f, 57.065f)
                lineTo(135.525f, 46.314f)
                lineTo(150.682f, 47.507f)
                lineTo(139.931f, 58.258f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(198.387f, 48.946f)
                lineTo(177.176f, 47.276f)
                lineTo(162.12f, 62.333f)
                lineTo(183.347f, 64.003f)
                lineTo(198.387f, 48.946f)
                close()
                moveTo(182.458f, 61.609f)
                lineTo(167.302f, 60.416f)
                lineTo(178.052f, 49.665f)
                lineTo(193.209f, 50.858f)
                lineTo(182.458f, 61.609f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(89.419f, 89.144f)
                lineTo(110.651f, 90.815f)
                lineTo(125.712f, 75.754f)
                lineTo(104.479f, 74.083f)
                lineTo(89.419f, 89.144f)
                close()
                moveTo(105.364f, 76.482f)
                lineTo(120.515f, 77.674f)
                lineTo(109.764f, 88.425f)
                lineTo(94.613f, 87.232f)
                lineTo(105.364f, 76.482f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(158.551f, 52.775f)
                lineTo(161.584f, 53.014f)
                lineTo(159.433f, 55.165f)
                lineTo(162.465f, 55.403f)
                lineTo(160.33f, 57.539f)
                lineTo(163.352f, 57.777f)
                lineTo(167.65f, 53.479f)
                lineTo(164.644f, 53.242f)
                lineTo(166.788f, 51.099f)
                lineTo(169.787f, 51.335f)
                lineTo(174.058f, 47.064f)
                lineTo(158.901f, 45.871f)
                lineTo(154.63f, 50.142f)
                lineTo(157.657f, 50.38f)
                lineTo(153.356f, 54.682f)
                lineTo(156.404f, 54.922f)
                lineTo(158.551f, 52.775f)
                close()
                moveTo(162.861f, 48.466f)
                lineTo(165.866f, 48.702f)
                lineTo(163.735f, 50.834f)
                lineTo(160.73f, 50.597f)
                lineTo(162.861f, 48.466f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(124.354f, 64.022f)
                lineTo(117.909f, 70.466f)
                lineTo(111.822f, 69.988f)
                lineTo(113.931f, 67.879f)
                lineTo(110.926f, 67.643f)
                lineTo(106.655f, 71.913f)
                lineTo(118.79f, 72.869f)
                lineTo(123.1f, 68.559f)
                lineTo(132.192f, 69.275f)
                lineTo(134.342f, 67.124f)
                lineTo(128.283f, 66.647f)
                lineTo(130.43f, 64.5f)
                lineTo(124.354f, 64.022f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(113.718f, 91.06f)
                lineTo(122.794f, 91.774f)
                lineTo(124.945f, 89.623f)
                lineTo(121.918f, 89.385f)
                lineTo(124.069f, 87.234f)
                lineTo(121.036f, 86.996f)
                lineTo(123.187f, 84.845f)
                lineTo(120.171f, 84.607f)
                lineTo(113.718f, 91.06f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(117.405f, 61.163f)
                lineTo(113.135f, 65.434f)
                lineTo(116.156f, 65.671f)
                lineTo(118.303f, 63.524f)
                lineTo(124.368f, 64.002f)
                lineTo(126.507f, 61.862f)
                lineTo(117.405f, 61.163f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(174.712f, 72.621f)
                lineTo(181.156f, 66.176f)
                lineTo(175.135f, 65.702f)
                lineTo(172.984f, 67.853f)
                lineTo(176.011f, 68.091f)
                lineTo(171.717f, 72.385f)
                lineTo(174.712f, 72.621f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(130.425f, 64.499f)
                curveTo(130.427f, 64.499f, 130.431f, 64.498f, 130.433f, 64.496f)
                curveTo(130.435f, 64.494f, 130.435f, 64.492f, 130.432f, 64.492f)
                curveTo(130.429f, 64.491f, 130.425f, 64.493f, 130.423f, 64.495f)
                curveTo(130.421f, 64.497f, 130.422f, 64.499f, 130.425f, 64.499f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(138.627f, 62.833f)
                lineTo(132.573f, 62.357f)
                lineTo(130.433f, 64.496f)
                lineTo(136.488f, 64.972f)
                lineTo(138.627f, 62.833f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(169.501f, 74.56f)
                lineTo(166.479f, 74.323f)
                lineTo(164.348f, 76.454f)
                lineTo(167.37f, 76.692f)
                lineTo(169.501f, 74.56f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(168.232f, 79.101f)
                lineTo(165.227f, 78.864f)
                lineTo(163.091f, 81.0f)
                lineTo(166.096f, 81.236f)
                lineTo(168.232f, 79.101f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(161.164f, 59.958f)
                lineTo(158.148f, 59.721f)
                lineTo(156.009f, 61.86f)
                lineTo(159.025f, 62.097f)
                lineTo(161.164f, 59.958f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(126.631f, 78.147f)
                lineTo(124.484f, 80.294f)
                lineTo(127.501f, 80.531f)
                lineTo(129.648f, 78.384f)
                lineTo(126.631f, 78.147f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(127.493f, 80.539f)
                curveTo(127.496f, 80.539f, 127.5f, 80.537f, 127.502f, 80.535f)
                curveTo(127.504f, 80.533f, 127.503f, 80.532f, 127.501f, 80.531f)
                curveTo(127.498f, 80.531f, 127.493f, 80.533f, 127.491f, 80.535f)
                curveTo(127.489f, 80.537f, 127.49f, 80.538f, 127.493f, 80.539f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(160.886f, 83.176f)
                lineTo(157.864f, 82.938f)
                lineTo(155.725f, 85.077f)
                lineTo(158.746f, 85.315f)
                lineTo(160.886f, 83.176f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(167.763f, 69.762f)
                curveTo(167.766f, 69.762f, 167.77f, 69.761f, 167.772f, 69.758f)
                curveTo(167.774f, 69.757f, 167.773f, 69.755f, 167.77f, 69.755f)
                curveTo(167.767f, 69.754f, 167.763f, 69.756f, 167.761f, 69.758f)
                curveTo(167.759f, 69.76f, 167.76f, 69.762f, 167.763f, 69.762f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(168.628f, 72.15f)
                lineTo(170.779f, 70.0f)
                lineTo(167.763f, 69.762f)
                lineTo(165.612f, 71.913f)
                lineTo(168.628f, 72.15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(128.015f, 89.865f)
                lineTo(131.021f, 90.102f)
                lineTo(133.156f, 87.966f)
                lineTo(130.151f, 87.73f)
                lineTo(128.015f, 89.865f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(131.961f, 92.492f)
                lineTo(134.977f, 92.729f)
                lineTo(137.116f, 90.59f)
                lineTo(134.1f, 90.352f)
                lineTo(131.961f, 92.492f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(150.159f, 93.932f)
                lineTo(153.164f, 94.169f)
                lineTo(155.299f, 92.033f)
                lineTo(152.294f, 91.797f)
                lineTo(150.159f, 93.932f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(147.375f, 70.511f)
                lineTo(145.232f, 72.655f)
                lineTo(148.248f, 72.892f)
                lineTo(150.391f, 70.749f)
                lineTo(147.375f, 70.511f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(145.506f, 49.424f)
                lineTo(136.403f, 48.708f)
                lineTo(129.958f, 55.153f)
                lineTo(139.061f, 55.869f)
                lineTo(145.506f, 49.424f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(188.009f, 52.769f)
                lineTo(178.928f, 52.055f)
                lineTo(172.487f, 58.495f)
                lineTo(181.568f, 59.21f)
                lineTo(188.009f, 52.769f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9E9E9)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(99.799f, 85.312f)
                lineTo(108.902f, 86.028f)
                lineTo(115.343f, 79.587f)
                lineTo(106.24f, 78.871f)
                lineTo(99.799f, 85.312f)
                close()
            }
            group {
                path(
                    fill = SolidColor(Color(0xFFE9E9E9)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(184.0f, 32.0f)
                    lineTo(176.0f, 31.5f)
                    lineTo(174.593f, 33.922f)
                    lineTo(182.202f, 34.521f)
                    lineTo(184.0f, 32.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFE9E9E9)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(139.658f, 100.72f)
                    lineTo(88.188f, 96.669f)
                    lineTo(86.006f, 98.851f)
                    lineTo(137.476f, 102.902f)
                    lineTo(139.658f, 100.72f)
                    close()
                }
                path(
                    fill = linearGradient(
                        0.0f to Color(0xFFF15C43),
                        1.0f to Color(0x00F15C43),
                        start = Offset(156.591f, 11.0f),
                        end = Offset(155.091f, 47.5f)
                    ),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(120.591f, 50.0f)
                    lineTo(202.591f, 64.5f)
                    lineTo(218.091f, 48.0f)
                    lineTo(157.091f, 16.5f)
                    lineTo(120.591f, 50.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd
                ) {
                    moveTo(164.1f, 9.791f)
                    curveTo(164.102f, 9.789f, 164.103f, 9.787f, 164.103f, 9.786f)
                    lineTo(164.103f, 6.523f)
                    curveTo(164.103f, 6.068f, 163.615f, 5.787f, 162.83f, 5.791f)
                    lineTo(115.972f, 6.0f)
                    curveTo(115.972f, 6.0f, 115.972f, 6.0f, 115.972f, 6.001f)
                    lineTo(62.632f, 60.082f)
                    curveTo(61.826f, 60.899f, 60.21f, 61.477f, 59.105f, 61.342f)
                    lineTo(58.284f, 61.242f)
                    curveTo(57.483f, 61.144f, 56.302f, 61.768f, 56.302f, 62.289f)
                    lineTo(56.302f, 65.863f)
                    curveTo(56.302f, 66.263f, 56.68f, 66.532f, 57.319f, 66.585f)
                    lineTo(101.434f, 70.291f)
                    curveTo(102.535f, 70.383f, 104.071f, 69.82f, 104.856f, 69.035f)
                    lineTo(164.1f, 9.791f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(58.284f, 61.242f)
                    lineTo(59.501f, 60.119f)
                    lineTo(59.501f, 60.119f)
                    lineTo(58.284f, 61.242f)
                    close()
                    moveTo(56.302f, 62.289f)
                    lineTo(58.257f, 61.736f)
                    lineTo(58.257f, 61.736f)
                    lineTo(56.302f, 62.289f)
                    close()
                    moveTo(101.434f, 70.291f)
                    lineTo(100.292f, 71.422f)
                    lineTo(101.434f, 70.291f)
                    close()
                    moveTo(104.856f, 69.035f)
                    lineTo(106.451f, 69.16f)
                    lineTo(104.856f, 69.035f)
                    close()
                    moveTo(56.302f, 65.863f)
                    lineTo(58.258f, 65.31f)
                    lineTo(56.302f, 65.863f)
                    close()
                    moveTo(57.319f, 66.585f)
                    lineTo(56.176f, 67.716f)
                    lineTo(57.319f, 66.585f)
                    close()
                    moveTo(115.972f, 6.001f)
                    lineTo(114.367f, 5.885f)
                    lineTo(115.972f, 6.001f)
                    close()
                    moveTo(164.103f, 6.523f)
                    lineTo(162.147f, 7.076f)
                    lineTo(164.103f, 6.523f)
                    close()
                    moveTo(62.632f, 60.082f)
                    lineTo(61.027f, 59.967f)
                    lineTo(62.632f, 60.082f)
                    close()
                    moveTo(59.105f, 61.342f)
                    lineTo(60.321f, 60.219f)
                    lineTo(59.105f, 61.342f)
                    close()
                    moveTo(164.103f, 9.786f)
                    lineTo(162.147f, 10.338f)
                    lineTo(164.103f, 9.786f)
                    close()
                    moveTo(162.147f, 7.076f)
                    lineTo(162.147f, 10.338f)
                    lineTo(166.058f, 9.234f)
                    lineTo(166.058f, 5.971f)
                    lineTo(162.147f, 7.076f)
                    close()
                    moveTo(115.035f, 7.139f)
                    lineTo(161.893f, 6.929f)
                    lineTo(163.767f, 4.652f)
                    lineTo(116.909f, 4.862f)
                    lineTo(115.035f, 7.139f)
                    close()
                    moveTo(114.367f, 5.885f)
                    lineTo(61.027f, 59.967f)
                    lineTo(64.237f, 60.198f)
                    lineTo(117.577f, 6.116f)
                    lineTo(114.367f, 5.885f)
                    close()
                    moveTo(57.068f, 62.365f)
                    lineTo(57.889f, 62.465f)
                    lineTo(60.321f, 60.219f)
                    lineTo(59.501f, 60.119f)
                    lineTo(57.068f, 62.365f)
                    close()
                    moveTo(58.257f, 61.736f)
                    curveTo(58.257f, 62.049f, 57.549f, 62.423f, 57.068f, 62.365f)
                    lineTo(59.501f, 60.119f)
                    curveTo(57.418f, 59.865f, 54.346f, 61.487f, 54.346f, 62.841f)
                    lineTo(58.257f, 61.736f)
                    close()
                    moveTo(58.258f, 65.31f)
                    lineTo(58.257f, 61.736f)
                    lineTo(54.346f, 62.841f)
                    lineTo(54.347f, 66.415f)
                    lineTo(58.258f, 65.31f)
                    close()
                    moveTo(56.176f, 67.716f)
                    lineTo(100.292f, 71.422f)
                    lineTo(102.577f, 69.16f)
                    lineTo(58.461f, 65.455f)
                    lineTo(56.176f, 67.716f)
                    close()
                    moveTo(106.451f, 69.16f)
                    lineTo(165.695f, 9.917f)
                    lineTo(162.505f, 9.665f)
                    lineTo(103.261f, 68.909f)
                    lineTo(106.451f, 69.16f)
                    close()
                    moveTo(100.292f, 71.422f)
                    curveTo(102.274f, 71.588f, 105.038f, 70.573f, 106.451f, 69.16f)
                    lineTo(103.261f, 68.909f)
                    curveTo(103.104f, 69.066f, 102.797f, 69.179f, 102.577f, 69.16f)
                    lineTo(100.292f, 71.422f)
                    close()
                    moveTo(54.347f, 66.415f)
                    curveTo(54.347f, 67.135f, 55.028f, 67.619f, 56.176f, 67.716f)
                    lineTo(58.461f, 65.455f)
                    curveTo(58.333f, 65.444f, 58.258f, 65.39f, 58.258f, 65.31f)
                    lineTo(54.347f, 66.415f)
                    close()
                    moveTo(117.104f, 4.869f)
                    curveTo(116.217f, 4.799f, 114.987f, 5.256f, 114.367f, 5.885f)
                    lineTo(117.577f, 6.116f)
                    curveTo(116.956f, 6.745f, 115.727f, 7.201f, 114.841f, 7.132f)
                    lineTo(117.104f, 4.869f)
                    close()
                    moveTo(166.058f, 5.971f)
                    curveTo(166.058f, 5.152f, 165.179f, 4.646f, 163.767f, 4.652f)
                    lineTo(161.893f, 6.929f)
                    curveTo(162.05f, 6.928f, 162.147f, 6.985f, 162.147f, 7.076f)
                    lineTo(166.058f, 5.971f)
                    close()
                    moveTo(61.027f, 59.967f)
                    curveTo(60.865f, 60.131f, 60.542f, 60.246f, 60.321f, 60.219f)
                    lineTo(57.889f, 62.465f)
                    curveTo(59.877f, 62.707f, 62.786f, 61.668f, 64.237f, 60.198f)
                    lineTo(61.027f, 59.967f)
                    close()
                    moveTo(165.635f, 9.974f)
                    curveTo(165.909f, 9.72f, 166.058f, 9.459f, 166.058f, 9.234f)
                    lineTo(162.147f, 10.338f)
                    curveTo(162.147f, 10.116f, 162.294f, 9.859f, 162.564f, 9.608f)
                    lineTo(165.635f, 9.974f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFF15C43)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(162.109f, 5.631f)
                    lineTo(117.966f, 2.157f)
                    curveTo(116.865f, 2.07f, 115.339f, 2.633f, 114.558f, 3.414f)
                    lineTo(56.716f, 61.256f)
                    curveTo(55.935f, 62.037f, 56.194f, 62.741f, 57.296f, 62.827f)
                    lineTo(101.439f, 66.302f)
                    curveTo(102.54f, 66.388f, 104.066f, 65.825f, 104.847f, 65.044f)
                    lineTo(162.689f, 7.202f)
                    curveTo(163.47f, 6.421f, 163.21f, 5.718f, 162.109f, 5.631f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFF272727)),
                    strokeLineWidth = 1.6f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(117.401f, 2.723f)
                    lineTo(161.543f, 6.197f)
                    curveTo(162.204f, 6.249f, 162.36f, 6.671f, 161.891f, 7.139f)
                    lineTo(104.049f, 64.982f)
                    curveTo(103.58f, 65.45f, 102.665f, 65.788f, 102.004f, 65.736f)
                    lineTo(57.861f, 62.262f)
                    curveTo(57.201f, 62.21f, 57.045f, 61.788f, 57.514f, 61.319f)
                    lineTo(115.356f, 3.477f)
                    curveTo(115.824f, 3.008f, 116.74f, 2.671f, 117.401f, 2.723f)
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
                    moveTo(154.61f, 10.172f)
                    lineTo(114.302f, 7.0f)
                    lineTo(68.913f, 52.389f)
                    lineTo(109.221f, 55.561f)
                    lineTo(154.61f, 10.172f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFE9E9E9)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(147.546f, 13.598f)
                    lineTo(113.984f, 10.956f)
                    curveTo(113.433f, 10.913f, 112.67f, 11.194f, 112.28f, 11.585f)
                    lineTo(81.716f, 42.149f)
                    curveTo(81.325f, 42.539f, 81.455f, 42.891f, 82.006f, 42.934f)
                    lineTo(115.568f, 45.576f)
                    curveTo(116.119f, 45.619f, 116.882f, 45.338f, 117.272f, 44.947f)
                    lineTo(147.836f, 14.383f)
                    curveTo(148.227f, 13.993f, 148.097f, 13.641f, 147.546f, 13.598f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF858585)),
                    stroke = SolidColor(Color(0xFF4D4D4D)),
                    strokeLineWidth = 0.153706f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(96.732f, 46.377f)
                    curveTo(96.921f, 46.188f, 97.183f, 46.09f, 97.45f, 46.109f)
                    lineTo(102.902f, 46.499f)
                    curveTo(103.264f, 46.525f, 103.428f, 46.964f, 103.172f, 47.22f)
                    lineTo(99.769f, 50.623f)
                    curveTo(99.579f, 50.812f, 99.317f, 50.91f, 99.05f, 50.891f)
                    lineTo(93.598f, 50.501f)
                    curveTo(93.236f, 50.475f, 93.072f, 50.036f, 93.329f, 49.78f)
                    lineTo(96.732f, 46.377f)
                    close()
                    moveTo(86.732f, 45.377f)
                    curveTo(86.921f, 45.188f, 87.183f, 45.09f, 87.45f, 45.109f)
                    lineTo(92.902f, 45.499f)
                    curveTo(93.264f, 45.525f, 93.428f, 45.964f, 93.172f, 46.22f)
                    lineTo(89.769f, 49.623f)
                    curveTo(89.579f, 49.812f, 89.317f, 49.91f, 89.05f, 49.891f)
                    lineTo(83.598f, 49.501f)
                    curveTo(83.236f, 49.475f, 83.072f, 49.036f, 83.329f, 48.78f)
                    lineTo(86.732f, 45.377f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 0.23056f,
                    strokeLineCap = Round,
                    strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(88.098f, 47.365f)
                    lineTo(86.325f, 48.02f)
                    curveTo(86.212f, 48.061f, 86.111f, 48.122f, 86.045f, 48.188f)
                    curveTo(85.979f, 48.254f, 85.952f, 48.321f, 85.972f, 48.373f)
                    lineTo(86.008f, 48.471f)
                    curveTo(86.027f, 48.523f, 86.09f, 48.556f, 86.184f, 48.563f)
                    curveTo(86.277f, 48.571f, 86.393f, 48.551f, 86.506f, 48.51f)
                    lineTo(88.279f, 47.856f)
                    curveTo(88.371f, 47.822f, 88.466f, 47.803f, 88.549f, 47.801f)
                    lineTo(88.773f, 47.796f)
                    curveTo(88.856f, 47.795f, 88.95f, 47.775f, 89.043f, 47.741f)
                    lineTo(89.54f, 47.558f)
                    curveTo(89.653f, 47.516f, 89.754f, 47.456f, 89.82f, 47.389f)
                    curveTo(89.886f, 47.323f, 89.912f, 47.257f, 89.893f, 47.205f)
                    lineTo(89.748f, 46.812f)
                    curveTo(89.729f, 46.76f, 89.666f, 46.727f, 89.573f, 46.72f)
                    curveTo(89.479f, 46.712f, 89.364f, 46.731f, 89.251f, 46.773f)
                    lineTo(88.753f, 46.957f)
                    curveTo(88.661f, 46.991f, 88.576f, 47.037f, 88.512f, 47.09f)
                    lineTo(88.338f, 47.232f)
                    curveTo(88.274f, 47.285f, 88.19f, 47.332f, 88.098f, 47.365f)
                    verticalLineTo(47.365f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 0.23056f,
                    strokeLineCap = Round,
                    strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(87.802f, 47.753f)
                    lineTo(88.195f, 47.608f)
                }
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 0.23056f,
                    strokeLineCap = Round,
                    strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(89.113f, 47.715f)
                    lineTo(88.824f, 46.931f)
                }
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 0.23056f,
                    strokeLineCap = Round,
                    strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(98.62f, 47.432f)
                    lineTo(98.275f, 47.405f)
                    curveTo(98.085f, 47.39f, 97.821f, 47.487f, 97.686f, 47.622f)
                    lineTo(97.441f, 47.867f)
                }
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 0.23056f,
                    strokeLineCap = Round,
                    strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(96.463f, 48.845f)
                    lineTo(96.218f, 49.089f)
                    curveTo(96.083f, 49.224f, 96.128f, 49.346f, 96.319f, 49.361f)
                    lineTo(96.663f, 49.388f)
                }
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 0.23056f,
                    strokeLineCap = Round,
                    strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(98.042f, 49.496f)
                    lineTo(98.387f, 49.523f)
                    curveTo(98.578f, 49.539f, 98.841f, 49.441f, 98.977f, 49.306f)
                    lineTo(99.221f, 49.062f)
                }
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 0.23056f,
                    strokeLineCap = Round,
                    strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(100.199f, 48.083f)
                    lineTo(100.444f, 47.839f)
                    curveTo(100.579f, 47.704f, 100.534f, 47.582f, 100.344f, 47.567f)
                    lineTo(99.999f, 47.54f)
                }
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 0.23056f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(97.95f, 48.845f)
                    curveTo(97.654f, 48.821f, 97.584f, 48.632f, 97.794f, 48.422f)
                    curveTo(98.0f, 48.216f, 98.422f, 48.06f, 98.712f, 48.083f)
                    curveTo(99.008f, 48.107f, 99.077f, 48.296f, 98.868f, 48.506f)
                    curveTo(98.658f, 48.716f, 98.247f, 48.868f, 97.95f, 48.845f)
                }
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 0.23056f,
                    strokeLineCap = Round,
                    strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(98.98f, 48.225f)
                    lineTo(97.683f, 48.703f)
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    fillAlpha = 0.1f,
                    strokeAlpha = 0.1f,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(82.462f, 61.478f)
                    curveTo(84.275f, 61.62f, 86.787f, 60.694f, 88.073f, 59.408f)
                    curveTo(89.359f, 58.122f, 88.932f, 56.964f, 87.119f, 56.821f)
                    curveTo(85.306f, 56.678f, 82.794f, 57.605f, 81.508f, 58.891f)
                    curveTo(80.222f, 60.177f, 80.649f, 61.335f, 82.462f, 61.478f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(123.594f, 31.359f)
                    lineTo(123.59f, 31.364f)
                    lineTo(123.596f, 31.365f)
                    lineTo(123.594f, 31.359f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(119.883f, 24.862f)
                    lineTo(119.878f, 24.867f)
                    lineTo(119.885f, 24.867f)
                    lineTo(119.883f, 24.862f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(118.801f, 36.152f)
                    lineTo(119.758f, 35.196f)
                    lineTo(118.415f, 35.09f)
                    lineTo(120.335f, 33.17f)
                    lineTo(121.678f, 33.276f)
                    lineTo(123.59f, 31.364f)
                    lineTo(122.237f, 31.257f)
                    lineTo(124.157f, 29.337f)
                    lineTo(122.814f, 29.231f)
                    lineTo(123.774f, 28.271f)
                    lineTo(125.117f, 28.377f)
                    lineTo(126.077f, 27.417f)
                    lineTo(124.723f, 27.31f)
                    lineTo(125.683f, 26.35f)
                    lineTo(118.927f, 25.818f)
                    lineTo(119.879f, 24.866f)
                    lineTo(118.525f, 24.759f)
                    lineTo(120.434f, 22.851f)
                    lineTo(119.085f, 22.745f)
                    lineTo(117.177f, 24.653f)
                    lineTo(115.829f, 24.547f)
                    lineTo(118.705f, 21.671f)
                    lineTo(117.352f, 21.564f)
                    lineTo(109.667f, 29.249f)
                    lineTo(105.623f, 28.931f)
                    lineTo(104.667f, 29.887f)
                    lineTo(108.716f, 30.206f)
                    lineTo(107.756f, 31.166f)
                    lineTo(109.104f, 31.272f)
                    curveTo(108.784f, 31.592f, 108.464f, 31.912f, 108.148f, 32.228f)
                    lineTo(109.491f, 32.334f)
                    lineTo(108.527f, 33.298f)
                    lineTo(107.184f, 33.192f)
                    lineTo(105.272f, 35.104f)
                    lineTo(107.979f, 35.318f)
                    lineTo(108.947f, 34.349f)
                    lineTo(115.693f, 34.88f)
                    lineTo(114.733f, 35.84f)
                    lineTo(112.042f, 35.629f)
                    lineTo(111.066f, 36.605f)
                    lineTo(112.414f, 36.711f)
                    lineTo(111.458f, 37.667f)
                    lineTo(114.165f, 37.88f)
                    lineTo(113.209f, 38.836f)
                    lineTo(114.557f, 38.942f)
                    lineTo(116.478f, 37.022f)
                    lineTo(120.527f, 37.341f)
                    lineTo(121.483f, 36.384f)
                    lineTo(118.801f, 36.152f)
                    close()
                    moveTo(122.025f, 27.106f)
                    lineTo(123.362f, 27.211f)
                    lineTo(122.414f, 28.16f)
                    lineTo(121.077f, 28.054f)
                    lineTo(122.025f, 27.106f)
                    close()
                    moveTo(112.59f, 33.609f)
                    lineTo(111.253f, 33.504f)
                    lineTo(112.201f, 32.556f)
                    lineTo(113.538f, 32.661f)
                    lineTo(112.59f, 33.609f)
                    close()
                    moveTo(116.418f, 29.781f)
                    lineTo(114.506f, 31.693f)
                    lineTo(113.152f, 31.586f)
                    lineTo(114.105f, 30.634f)
                    lineTo(112.757f, 30.528f)
                    lineTo(111.8f, 31.484f)
                    lineTo(109.093f, 31.271f)
                    lineTo(110.049f, 30.315f)
                    lineTo(111.392f, 30.42f)
                    lineTo(112.352f, 29.46f)
                    lineTo(111.015f, 29.355f)
                    lineTo(112.935f, 27.435f)
                    lineTo(115.626f, 27.647f)
                    lineTo(116.582f, 26.691f)
                    lineTo(120.637f, 27.01f)
                    lineTo(118.729f, 28.918f)
                    lineTo(121.436f, 29.131f)
                    lineTo(120.468f, 30.099f)
                    lineTo(116.418f, 29.781f)
                    close()
                    moveTo(116.242f, 32.865f)
                    lineTo(114.9f, 32.759f)
                    lineTo(115.852f, 31.807f)
                    lineTo(117.194f, 31.913f)
                    lineTo(116.242f, 32.865f)
                    close()
                    moveTo(117.982f, 34.033f)
                    lineTo(115.291f, 33.822f)
                    lineTo(116.244f, 32.869f)
                    lineTo(118.934f, 33.081f)
                    lineTo(117.982f, 34.033f)
                    close()
                    moveTo(120.858f, 31.157f)
                    lineTo(119.533f, 31.053f)
                    lineTo(120.485f, 30.101f)
                    lineTo(121.827f, 30.206f)
                    lineTo(120.858f, 31.157f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(116.439f, 29.765f)
                    lineTo(116.446f, 29.766f)
                    lineTo(116.45f, 29.761f)
                    lineTo(116.439f, 29.765f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(118.705f, 21.667f)
                    lineTo(118.7f, 21.671f)
                    lineTo(118.706f, 21.672f)
                    lineTo(118.705f, 21.667f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(105.284f, 35.093f)
                    lineTo(105.289f, 35.088f)
                    lineTo(105.283f, 35.088f)
                    lineTo(105.284f, 35.093f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(108.166f, 32.212f)
                    lineTo(108.159f, 32.211f)
                    lineTo(108.154f, 32.216f)
                    lineTo(108.161f, 32.217f)
                    lineTo(108.166f, 32.212f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(119.825f, 17.625f)
                    lineTo(110.356f, 16.879f)
                    lineTo(103.639f, 23.596f)
                    lineTo(113.109f, 24.341f)
                    lineTo(119.825f, 17.625f)
                    close()
                    moveTo(112.731f, 23.259f)
                    lineTo(105.991f, 22.729f)
                    lineTo(110.775f, 17.944f)
                    lineTo(117.516f, 18.474f)
                    lineTo(112.731f, 23.259f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(138.748f, 19.114f)
                    lineTo(129.279f, 18.369f)
                    lineTo(122.562f, 25.085f)
                    lineTo(132.031f, 25.831f)
                    lineTo(138.748f, 19.114f)
                    close()
                    moveTo(131.659f, 24.749f)
                    lineTo(124.914f, 24.218f)
                    lineTo(129.694f, 19.437f)
                    lineTo(136.44f, 19.968f)
                    lineTo(131.659f, 24.749f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(90.255f, 37.004f)
                    lineTo(99.725f, 37.749f)
                    lineTo(106.442f, 31.032f)
                    lineTo(96.972f, 30.287f)
                    lineTo(90.255f, 37.004f)
                    close()
                    moveTo(97.35f, 31.369f)
                    lineTo(104.096f, 31.9f)
                    lineTo(99.311f, 36.685f)
                    lineTo(92.565f, 36.154f)
                    lineTo(97.35f, 31.369f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(118.705f, 21.667f)
                    lineTo(118.706f, 21.672f)
                    lineTo(118.711f, 21.667f)
                    lineTo(118.705f, 21.667f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(121.015f, 20.821f)
                    lineTo(122.369f, 20.927f)
                    lineTo(121.413f, 21.884f)
                    lineTo(122.761f, 21.99f)
                    lineTo(121.793f, 22.958f)
                    lineTo(123.135f, 23.063f)
                    lineTo(125.067f, 21.131f)
                    lineTo(123.73f, 21.026f)
                    lineTo(124.69f, 20.066f)
                    lineTo(126.027f, 20.171f)
                    lineTo(127.936f, 18.263f)
                    lineTo(121.19f, 17.732f)
                    lineTo(119.278f, 19.644f)
                    lineTo(120.626f, 19.75f)
                    lineTo(118.709f, 21.667f)
                    lineTo(120.063f, 21.773f)
                    lineTo(121.015f, 20.821f)
                    close()
                    moveTo(122.935f, 18.901f)
                    lineTo(124.272f, 19.006f)
                    lineTo(123.324f, 19.954f)
                    lineTo(121.987f, 19.849f)
                    lineTo(122.935f, 18.901f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(105.83f, 25.827f)
                    lineTo(102.962f, 28.695f)
                    lineTo(100.249f, 28.482f)
                    lineTo(101.197f, 27.534f)
                    lineTo(99.86f, 27.428f)
                    lineTo(97.952f, 29.337f)
                    lineTo(103.355f, 29.762f)
                    lineTo(105.271f, 27.846f)
                    lineTo(109.315f, 28.164f)
                    lineTo(110.272f, 27.208f)
                    lineTo(107.548f, 26.994f)
                    lineTo(108.504f, 26.037f)
                    lineTo(105.83f, 25.827f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(105.796f, 25.825f)
                    lineTo(105.803f, 25.826f)
                    lineTo(105.807f, 25.821f)
                    lineTo(105.796f, 25.825f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(101.069f, 37.859f)
                    lineTo(105.108f, 38.177f)
                    lineTo(106.068f, 37.217f)
                    lineTo(104.72f, 37.111f)
                    lineTo(105.676f, 36.155f)
                    lineTo(104.322f, 36.048f)
                    lineTo(105.279f, 35.092f)
                    lineTo(103.942f, 34.987f)
                    lineTo(101.069f, 37.859f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(105.284f, 35.093f)
                    lineTo(105.283f, 35.088f)
                    lineTo(105.278f, 35.092f)
                    lineTo(105.284f, 35.093f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(105.796f, 25.825f)
                    lineTo(105.807f, 25.821f)
                    lineTo(105.801f, 25.82f)
                    lineTo(105.796f, 25.825f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(102.709f, 24.55f)
                    lineTo(100.801f, 26.459f)
                    lineTo(102.149f, 26.565f)
                    lineTo(103.105f, 25.609f)
                    lineTo(105.801f, 25.821f)
                    lineTo(106.753f, 24.869f)
                    lineTo(102.709f, 24.55f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(128.21f, 29.652f)
                    lineTo(131.079f, 26.783f)
                    lineTo(128.394f, 26.572f)
                    lineTo(127.438f, 27.528f)
                    lineTo(128.786f, 27.634f)
                    lineTo(126.874f, 29.546f)
                    lineTo(128.21f, 29.652f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(112.157f, 25.294f)
                    lineTo(109.461f, 25.081f)
                    lineTo(108.508f, 26.034f)
                    lineTo(111.205f, 26.246f)
                    lineTo(112.157f, 25.294f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(123.594f, 31.359f)
                    lineTo(123.596f, 31.365f)
                    lineTo(123.601f, 31.36f)
                    lineTo(123.594f, 31.359f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(125.883f, 30.525f)
                    lineTo(124.54f, 30.419f)
                    lineTo(123.588f, 31.372f)
                    lineTo(124.931f, 31.477f)
                    lineTo(125.883f, 30.525f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(125.327f, 32.536f)
                    lineTo(123.99f, 32.431f)
                    lineTo(123.042f, 33.379f)
                    lineTo(124.379f, 33.484f)
                    lineTo(125.327f, 32.536f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(119.883f, 24.862f)
                    lineTo(119.885f, 24.867f)
                    lineTo(119.889f, 24.862f)
                    lineTo(119.883f, 24.862f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(122.183f, 24.016f)
                    lineTo(120.841f, 23.91f)
                    lineTo(119.889f, 24.862f)
                    lineTo(121.231f, 24.968f)
                    lineTo(122.183f, 24.016f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(106.812f, 32.11f)
                    lineTo(105.856f, 33.066f)
                    lineTo(107.198f, 33.172f)
                    lineTo(108.154f, 32.215f)
                    lineTo(106.812f, 32.11f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(122.058f, 34.35f)
                    lineTo(120.716f, 34.244f)
                    lineTo(119.764f, 35.196f)
                    lineTo(121.106f, 35.302f)
                    lineTo(122.058f, 34.35f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(125.505f, 29.443f)
                    lineTo(126.461f, 28.486f)
                    lineTo(125.119f, 28.381f)
                    lineTo(124.162f, 29.337f)
                    lineTo(125.505f, 29.443f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(107.433f, 37.324f)
                    lineTo(108.77f, 37.429f)
                    lineTo(109.702f, 36.497f)
                    lineTo(108.365f, 36.392f)
                    lineTo(107.433f, 37.324f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(109.178f, 38.493f)
                    lineTo(110.521f, 38.599f)
                    lineTo(111.473f, 37.647f)
                    lineTo(110.13f, 37.541f)
                    lineTo(109.178f, 38.493f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(117.285f, 39.135f)
                    lineTo(118.622f, 39.241f)
                    lineTo(119.57f, 38.292f)
                    lineTo(118.233f, 38.187f)
                    lineTo(117.285f, 39.135f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(116.439f, 29.765f)
                    lineTo(116.45f, 29.761f)
                    lineTo(116.444f, 29.761f)
                    lineTo(116.439f, 29.765f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(116.053f, 28.703f)
                    lineTo(115.082f, 29.675f)
                    lineTo(116.424f, 29.781f)
                    lineTo(117.376f, 28.829f)
                    lineTo(116.053f, 28.703f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(115.202f, 19.328f)
                    lineTo(111.164f, 19.01f)
                    lineTo(108.279f, 21.894f)
                    lineTo(112.318f, 22.212f)
                    lineTo(115.202f, 19.328f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(134.13f, 20.818f)
                    lineTo(130.086f, 20.5f)
                    lineTo(127.202f, 23.384f)
                    lineTo(131.246f, 23.702f)
                    lineTo(134.13f, 20.818f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF272727)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(94.873f, 35.3f)
                    lineTo(98.912f, 35.618f)
                    lineTo(101.78f, 32.75f)
                    lineTo(97.742f, 32.432f)
                    lineTo(94.873f, 35.3f)
                    close()
                }
            }
        }.build()
        return _scannerhistory!!
    }

private var _scannerhistory: ImageVector? = null
