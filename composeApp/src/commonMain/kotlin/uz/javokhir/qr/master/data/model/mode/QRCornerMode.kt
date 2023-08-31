package uz.javokhir.qr.master.data.model.mode

enum class QRCornerMode(val icon: String) {
    Default("ic_customize_corner_square"),
    Rounded("ic_customize_corner_rounded"),
    Circle("ic_customize_corner_circle"),
    Two("ic_customize_corner_two"),
    Three("ic_customize_corner_three"),
    Dots("ic_customize_corner_dots"),
    DotsPadding("ic_customize_corner_dots_padding"),
    Rhombus("ic_customize_corner_rhombus")
}

fun Long.toQRCornerMode(): QRCornerMode {
    return QRCornerMode.entries
        .firstOrNull { it.ordinal.toLong() == this } ?: QRCornerMode.Default
}