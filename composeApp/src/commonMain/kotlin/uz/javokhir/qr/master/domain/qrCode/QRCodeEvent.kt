package uz.javokhir.qr.master.domain.qrCode

import uz.javokhir.qr.master.domain.customize.CustomizeState
import uz.javokhir.qr.master.data.model.mode.GenerateMode

sealed class QRCodeEvent {

    data class Insert(
        val id: String,
        val scanned: Boolean,
        val mode: GenerateMode,
        val encoded: String,
        val decoded: String,
        val customize: CustomizeState,
    ) : QRCodeEvent()

    data class Delete(val id: String) : QRCodeEvent()
}
