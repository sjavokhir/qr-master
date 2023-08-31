package uz.javokhir.kqr.master.data.model.mode

enum class QRDotMode(val icon: String) {
    Default("ic_customize_dot_square"),
    Rounded("ic_customize_dot_rounded"),
    Circle("ic_customize_dot_circle"),
    Rhombus("ic_customize_dot_rhombus"),
    CornerTwo("ic_customize_dot_two"),
    CornerThree("ic_customize_dot_three"),
    Dots("ic_customize_dot_dots"),
    DotsPadding("ic_customize_dot_dots_padding"),
    Horizontal("ic_customize_dot_horizontal"),
    Vertical("ic_customize_dot_vertical")
}

fun Long.toQRDotMode(): QRDotMode {
    return QRDotMode.entries
        .firstOrNull { it.ordinal.toLong() == this } ?: QRDotMode.Default
}