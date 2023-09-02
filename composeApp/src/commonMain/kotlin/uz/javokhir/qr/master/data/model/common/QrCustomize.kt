package uz.javokhir.qr.master.data.model.common

import androidx.compose.ui.graphics.vector.ImageVector
import cafe.adriel.voyager.core.lifecycle.JavaSerializable
import uz.javokhir.qr.master.data.model.mode.QrCornerMode
import uz.javokhir.qr.master.data.model.mode.QrDotMode
import uz.javokhir.qr.master.data.model.mode.QrPatternMode

data class QrCustomizeModel(
    val selectedPattern: QrPatternMode = QrPatternMode.Default,
    val selectedCorner: QrCornerMode = QrCornerMode.Default,
    val selectedDot: QrDotMode = QrDotMode.Default,
    val patternDotHex: String = "FF000000",
    val patternBackgroundHex: String = "FFFFFFFF",
    val frameHex: String = "FF000000",
    val frameDotHex: String = "FF000000",
    val selectedLogo: ImageVector? = null,
) : JavaSerializable