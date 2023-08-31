package uz.javokhir.qr.master.domain.base

import cafe.adriel.voyager.core.screen.Screen

sealed interface UiEvent {
    data class Message(val message: String) : UiEvent

    data class ReplaceTo(
        val navigationMode: BottomNavigationMode,
        val currentNavigationMode: BottomNavigationMode,
    ) : UiEvent

    data class Navigate(val screen: Screen) : UiEvent
    data object NavigateUp : UiEvent
}

enum class BottomNavigationMode {
    Scanner,
    Creator,
    History,
    Settings
}