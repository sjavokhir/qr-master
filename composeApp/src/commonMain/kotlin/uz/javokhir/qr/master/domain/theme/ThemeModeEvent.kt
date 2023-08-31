package uz.javokhir.qr.master.domain.theme

import uz.javokhir.qr.master.data.model.mode.ThemeMode

sealed class ThemeModeEvent {
    data class SelectThemeMode(val themeMode: ThemeMode) : ThemeModeEvent()
}