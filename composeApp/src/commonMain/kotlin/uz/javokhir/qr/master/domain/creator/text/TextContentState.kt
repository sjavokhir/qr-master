package uz.javokhir.qr.master.domain.creator.text

import uz.javokhir.qr.master.data.model.common.QrData

data class TextContentState(
    val text: String = "",
    val enabled: Boolean = false,
    val setEncoded: Boolean = false
) : QrData {

    override fun encode(): String = text

    override fun decode(): String = encode()

    override fun isNotBlank(): Boolean = text.isNotEmpty()
}