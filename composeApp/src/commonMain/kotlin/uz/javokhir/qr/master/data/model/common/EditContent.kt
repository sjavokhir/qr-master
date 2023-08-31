package uz.javokhir.qr.master.data.model.common

import cafe.adriel.voyager.core.lifecycle.JavaSerializable

data class EditContent(
    val encoded: String,
    val decoded: String,
) : JavaSerializable
