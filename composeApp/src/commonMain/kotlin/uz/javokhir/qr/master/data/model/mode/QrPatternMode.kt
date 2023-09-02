package uz.javokhir.qr.master.data.model.mode

import androidx.compose.ui.graphics.vector.ImageVector
import uz.javokhir.qr.master.ui.icons.AppIcons

enum class QrPatternMode(val icon: ImageVector) {
    Default(AppIcons.patternSquare),
    Rounded(AppIcons.patternRounded),
    ExtraRounded(AppIcons.patternExtraRounded),
    Circle(AppIcons.patternCircle),
    CirclePadding(AppIcons.patternCirclePadding),
    Horizontal(AppIcons.patternHorizontal),
    Vertical(AppIcons.patternVertical),
    Rhombus(AppIcons.patternRhombus),
    Star(AppIcons.patternStar),
    Classy(AppIcons.patternClassy),
    ClassyRounded(AppIcons.patternClassyRounded)
}

fun Long.toQrPatternMode(): QrPatternMode {
    return QrPatternMode.entries
        .firstOrNull { it.ordinal.toLong() == this } ?: QrPatternMode.Default
}