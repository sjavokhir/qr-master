package uz.javokhir.kqr.master.shared

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.coroutines.Dispatchers
import platform.CoreFoundation.CFUUIDCreate
import platform.CoreFoundation.CFUUIDCreateString
import platform.Foundation.CFBridgingRelease

@OptIn(ExperimentalForeignApi::class)
actual fun randomUUID(): String =
    CFBridgingRelease(CFUUIDCreateString(null, CFUUIDCreate(null))) as String

actual val mainDispatcher = Dispatchers.Main
actual val ioDispatcher = Dispatchers.Default