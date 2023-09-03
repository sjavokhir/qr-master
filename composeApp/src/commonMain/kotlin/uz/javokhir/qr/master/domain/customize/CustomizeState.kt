package uz.javokhir.qr.master.domain.customize

import uz.javokhir.qr.master.data.model.common.QrCustomizeModel
import uz.javokhir.qr.master.data.model.mode.QrCornerMode
import uz.javokhir.qr.master.data.model.mode.QrDotMode
import uz.javokhir.qr.master.data.model.mode.QrPatternMode

data class CustomizeState(
    val patterns: List<QrPatternMode> = emptyList(),
    val selectedPattern: QrPatternMode = QrPatternMode.Default,
    val corners: List<QrCornerMode> = emptyList(),
    val selectedCorner: QrCornerMode = QrCornerMode.Default,
    val dots: List<QrDotMode> = emptyList(),
    val selectedDot: QrDotMode = QrDotMode.Default,
    val showColorPicker: Boolean = false,
    val colorPickerMode: ColorPickerMode = ColorPickerMode.PatternDotColor,
    val patternDotHex: String = "FF000000",
    val patternBackgroundHex: String = "FFFFFFFF",
    val frameHex: String = "FF000000",
    val frameDotHex: String = "FF000000",
    val selectedLogo: String = "",
    val showPreview: Boolean = false,
)

fun CustomizeState.toModel(): QrCustomizeModel {
    return QrCustomizeModel(
        selectedPattern = selectedPattern,
        selectedCorner = selectedCorner,
        selectedDot = selectedDot,
        patternDotHex = patternDotHex,
        patternBackgroundHex = patternBackgroundHex,
        frameHex = frameHex,
        frameDotHex = frameDotHex,
        selectedLogo = selectedLogo,
    )
}
