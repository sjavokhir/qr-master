package uz.javokhir.qr.master.domain.theme

import uz.javokhir.qr.master.data.model.mode.ThemeMode

data class ThemeModeState(
    val selectedTheme: ThemeMode = ThemeMode.System,
    val themeModes: List<ThemeMode> = emptyList(),
)
