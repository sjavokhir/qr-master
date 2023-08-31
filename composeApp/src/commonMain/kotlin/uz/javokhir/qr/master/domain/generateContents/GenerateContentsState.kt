package uz.javokhir.qr.master.domain.generateContents

import uz.javokhir.qr.master.data.model.mode.GenerateHeader
import uz.javokhir.qr.master.data.model.mode.GenerateMode

data class GenerateContentsState(
    val contents: Map<GenerateHeader, List<GenerateMode>> = emptyMap(),
)