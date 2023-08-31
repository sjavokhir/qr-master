package uz.javokhir.qr.master.data.model.common

import cafe.adriel.voyager.core.lifecycle.JavaSerializable
import uz.javokhir.qr.master.data.database.entity.HistoryEntity
import uz.javokhir.qr.master.data.model.mode.QRCornerMode
import uz.javokhir.qr.master.data.model.mode.QRDotMode
import uz.javokhir.qr.master.data.model.mode.QRPatternMode
import uz.javokhir.qr.master.data.model.mode.toQRCornerMode
import uz.javokhir.qr.master.data.model.mode.toQRDotMode
import uz.javokhir.qr.master.data.model.mode.toQRPatternMode
import uz.javokhir.qr.master.domain.customize.CustomizeState

data class QRCustomizeModel(
    val selectedPattern: QRPatternMode = QRPatternMode.Default,
    val selectedCorner: QRCornerMode = QRCornerMode.Default,
    val selectedDot: QRDotMode = QRDotMode.Default,
    val patternDotHex: String = "FF000000",
    val patternBackgroundHex: String = "FFFFFFFF",
    val frameHex: String = "FF000000",
    val frameDotHex: String = "FF000000",
    val selectedLogo: String = "",
) : JavaSerializable

fun CustomizeState.toModel(): QRCustomizeModel {
    return QRCustomizeModel(
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

fun HistoryEntity.toModel(): QRCustomizeModel {
    return QRCustomizeModel(
        selectedPattern = selectedPattern.toQRPatternMode(),
        selectedCorner = selectedCorner.toQRCornerMode(),
        selectedDot = selectedDot.toQRDotMode(),
        patternDotHex = patternDotHex,
        patternBackgroundHex = patternBackgroundHex,
        frameHex = frameHex,
        frameDotHex = frameDotHex,
        selectedLogo = selectedLogo,
    )
}

fun QRCustomizeModel.toState(): CustomizeState {
    return CustomizeState(
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