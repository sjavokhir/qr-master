package uz.javokhir.qr.master.domain.customize

import uz.javokhir.qr.master.data.model.mode.QRCornerMode
import uz.javokhir.qr.master.data.model.mode.QRDotMode
import uz.javokhir.qr.master.data.model.mode.QRPatternMode

sealed class CustomizeEvent {
    data class Customize(val state: CustomizeState) : CustomizeEvent()
    data class SelectPattern(val pattern: QRPatternMode) : CustomizeEvent()
    data class SelectCorner(val corner: QRCornerMode) : CustomizeEvent()
    data class SelectDot(val dot: QRDotMode) : CustomizeEvent()
    data class SelectColor(val hex: String) : CustomizeEvent()
    data class SelectLogo(val logo: String) : CustomizeEvent()

    data class ShowColorPicker(val colorPickerType: ColorPickerType) : CustomizeEvent()
    data object DismissColorPicker : CustomizeEvent()

    data class ShowHidePreview(val show: Boolean) : CustomizeEvent()
}

enum class ColorPickerType {
    PatternDotColor,
    PatternBackgroundColor,
    FrameColor,
    FrameDotColor
}