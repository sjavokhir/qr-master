package uz.javokhir.kqr.master.shared

import kotlinx.coroutines.Dispatchers
import java.util.UUID

actual fun randomUUID() = UUID.randomUUID().toString()

actual val mainDispatcher = Dispatchers.Main
actual val ioDispatcher = Dispatchers.IO