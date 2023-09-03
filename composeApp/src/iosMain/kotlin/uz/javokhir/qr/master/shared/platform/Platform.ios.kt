package uz.javokhir.qr.master.shared.platform

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.coroutines.Dispatchers
import platform.CoreFoundation.CFUUIDCreate
import platform.CoreFoundation.CFUUIDCreateString
import platform.Foundation.CFBridgingRelease
import uz.javokhir.qr.master.shared.platform.Platform

actual val appUrl: String
    get() = "https://play.google.com/store/apps/details?id=uz.javokhir.qr.master"

@OptIn(ExperimentalForeignApi::class)
actual fun randomUUID(): String =
    CFBridgingRelease(CFUUIDCreateString(null, CFUUIDCreate(null))) as String

actual val mainDispatcher = Dispatchers.Main
actual val ioDispatcher = Dispatchers.Default

actual val platform = Platform.IOS