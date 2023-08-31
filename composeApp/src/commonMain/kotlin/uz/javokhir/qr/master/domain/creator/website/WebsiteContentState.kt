package uz.javokhir.qr.master.domain.creator.website

import uz.javokhir.qr.master.data.model.common.QrData

data class WebsiteContentState(
    val website: String = "",
    val enabled: Boolean = false,
    val setEncoded: Boolean = false
) : QrData {

    override fun encode(): String = website

    override fun decode(): String = encode()

    override fun isNotBlank(): Boolean = website.isNotEmpty()
}
