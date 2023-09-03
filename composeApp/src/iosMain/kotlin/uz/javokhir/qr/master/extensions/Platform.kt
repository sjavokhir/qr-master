package uz.javokhir.qr.master.extensions

import kotlinx.cinterop.BetaInteropApi
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.convert
import kotlinx.cinterop.usePinned
import platform.Foundation.NSData
import platform.Foundation.NSString
import platform.Foundation.NSUTF8StringEncoding
import platform.Foundation.create
import platform.Foundation.data
import platform.Foundation.dataUsingEncoding

@OptIn(ExperimentalForeignApi::class, BetaInteropApi::class)
fun ByteArray?.toNSData(): NSData {
    return if (this != null && isNotEmpty()) {
        usePinned {
            NSData.create(bytes = it.addressOf(0), length = size.convert())
        }
    } else {
        NSData.data()
    }
}

@OptIn(BetaInteropApi::class)
fun String.toNSData(): NSData? =
    NSString.create(string = this).dataUsingEncoding(NSUTF8StringEncoding)