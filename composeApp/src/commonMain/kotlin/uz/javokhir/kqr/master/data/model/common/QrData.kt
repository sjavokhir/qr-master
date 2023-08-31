package uz.javokhir.kqr.master.data.model.common

interface QrData {

    fun encode(): String

    fun decode(): String

    fun isNotBlank(): Boolean
}