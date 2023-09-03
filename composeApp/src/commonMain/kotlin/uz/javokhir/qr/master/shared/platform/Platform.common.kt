package uz.javokhir.qr.master.shared.platform

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.MainCoroutineDispatcher

expect val appUrl: String

expect fun randomUUID(): String

expect val mainDispatcher: MainCoroutineDispatcher
expect val ioDispatcher: CoroutineDispatcher

enum class Platform {
    Android,
    IOS,
    Desktop,
    Web
}

expect val platform: Platform