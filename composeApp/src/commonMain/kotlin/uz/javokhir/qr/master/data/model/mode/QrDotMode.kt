package uz.javokhir.qr.master.data.model.mode

import androidx.compose.ui.graphics.vector.ImageVector
import uz.javokhir.qr.master.ui.icons.AppIcons

enum class QrDotMode(val icon: ImageVector) {
    Default(AppIcons.dotSquare),
    Rounded(AppIcons.dotCorner),
    Circle(AppIcons.dotCircle),
    Rhombus(AppIcons.dotRhombus),
    CornerTwo(AppIcons.dotTwo),
    CornerThree(AppIcons.dotThree),
    Dots(AppIcons.dotDots),
    DotsPadding(AppIcons.dotDotsPadding),
    Horizontal(AppIcons.dotHorizontal),
    Vertical(AppIcons.dotVertical)
}

fun Long.toQrDotMode(): QrDotMode {
    return QrDotMode.entries
        .firstOrNull { it.ordinal.toLong() == this } ?: QrDotMode.Default
}