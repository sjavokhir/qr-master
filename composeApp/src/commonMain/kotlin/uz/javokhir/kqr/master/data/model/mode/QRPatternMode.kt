package uz.javokhir.kqr.master.data.model.mode

enum class QRPatternMode(val icon: String) {
    Default("ic_customize_pattern_square"),
    Rounded("ic_customize_pattern_rounded"),
    ExtraRounded("ic_customize_pattern_extra_rounded"),
    Circle("ic_customize_pattern_circle"),
    CirclePadding("ic_customize_pattern_circle_padding"),
    Horizontal("ic_customize_pattern_horizontal"),
    Vertical("ic_customize_pattern_vertical"),
    Rhombus("ic_customize_pattern_rhombus"),
    Star("ic_customize_pattern_star"),
    Classy("ic_customize_pattern_classy"),
    ClassyRounded("ic_customize_pattern_classy_rounded")
}

fun Long.toQRPatternMode(): QRPatternMode {
    return QRPatternMode.entries
        .firstOrNull { it.ordinal.toLong() == this } ?: QRPatternMode.Default
}