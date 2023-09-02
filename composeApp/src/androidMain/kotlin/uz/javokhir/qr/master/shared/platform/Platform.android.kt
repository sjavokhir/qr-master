package uz.javokhir.qr.master.shared.platform

import kotlinx.coroutines.Dispatchers
import java.util.UUID

actual val appUrl: String
    get() = "https://play.google.com/store/apps/details?id=uz.javokhir.qr.master"

actual fun randomUUID() = UUID.randomUUID().toString()

actual val mainDispatcher = Dispatchers.Main
actual val ioDispatcher = Dispatchers.IO