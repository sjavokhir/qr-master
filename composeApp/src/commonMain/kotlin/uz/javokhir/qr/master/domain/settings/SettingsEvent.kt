package uz.javokhir.qr.master.domain.settings

sealed class SettingsEvent {
    data class CheckVibrate(val checked: Boolean) : SettingsEvent()
    data class CheckOpenWebPages(val checked: Boolean) : SettingsEvent()
    data class CheckChromeCustomTabs(val checked: Boolean) : SettingsEvent()
}