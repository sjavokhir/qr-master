package uz.javokhir.qr.master.domain.settings

data class SettingsState(
    val vibrateChecked: Boolean = false,
    val openWebPagesChecked: Boolean = false,
    val chromeCustomTabsChecked: Boolean = false,
)
