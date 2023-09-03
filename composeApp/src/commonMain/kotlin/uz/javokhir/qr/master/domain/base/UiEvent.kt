package uz.javokhir.qr.master.domain.base

import cafe.adriel.voyager.core.screen.Screen

sealed interface UiEvent {
    data class Message(val message: String) : UiEvent
    data class Navigate(val screen: Screen) : UiEvent
    data class Replace(val screen: Screen) : UiEvent
    data class ReplaceAll(val screen: Screen) : UiEvent
    data object NavigateUp : UiEvent
}