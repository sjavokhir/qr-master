package uz.javokhir.qr.master.domain.scanner

data class ScannerState(
    val vibrateEnabled: Boolean = false,
    val openWebPagesEnabled: Boolean = false,
    val chromeCustomTabsEnabled: Boolean = false,
)
