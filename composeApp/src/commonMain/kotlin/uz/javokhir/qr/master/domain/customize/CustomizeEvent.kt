package uz.javokhir.qr.master.domain.customize

import uz.javokhir.qr.master.data.model.common.QrCustomizeModel
import uz.javokhir.qr.master.data.model.common.QrLogo
import uz.javokhir.qr.master.data.model.mode.QrCornerMode
import uz.javokhir.qr.master.data.model.mode.QrDotMode
import uz.javokhir.qr.master.data.model.mode.QrPatternMode

sealed class CustomizeEvent {
    data class Customize(val customize: QrCustomizeModel) : CustomizeEvent()
    data class SelectPattern(val pattern: QrPatternMode) : CustomizeEvent()
    data class SelectCorner(val corner: QrCornerMode) : CustomizeEvent()
    data class SelectDot(val dot: QrDotMode) : CustomizeEvent()
    data class SelectColor(val hex: String) : CustomizeEvent()
    data class SelectLogo(val logo: QrLogo) : CustomizeEvent()

    data class ShowColorPicker(val mode: ColorPickerMode) : CustomizeEvent()
    data object DismissColorPicker : CustomizeEvent()

    data class ShowHidePreview(val show: Boolean) : CustomizeEvent()
}

enum class ColorPickerMode {
    PatternDotColor,
    PatternBackgroundColor,
    FrameColor,
    FrameDotColor
}