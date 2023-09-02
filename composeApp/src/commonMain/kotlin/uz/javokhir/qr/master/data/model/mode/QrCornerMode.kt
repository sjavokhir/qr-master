package uz.javokhir.qr.master.data.model.mode

import androidx.compose.ui.graphics.vector.ImageVector
import uz.javokhir.qr.master.ui.icons.AppIcons

enum class QrCornerMode(val icon: ImageVector) {
    Default(AppIcons.cornerSquare),
    Rounded(AppIcons.cornerRounded),
    Circle(AppIcons.cornerCircle),
    Two(AppIcons.cornerTwo),
    Three(AppIcons.cornerThree),
    Dots(AppIcons.cornerDots),
    DotsPadding(AppIcons.cornerDotsPadding),
    Rhombus(AppIcons.cornerRhombus)
}

fun Long.toQrCornerMode(): QrCornerMode {
    return QrCornerMode.entries
        .firstOrNull { it.ordinal.toLong() == this } ?: QrCornerMode.Default
}