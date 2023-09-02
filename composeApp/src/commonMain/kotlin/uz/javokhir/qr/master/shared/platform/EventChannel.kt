package uz.javokhir.qr.master.shared.platform

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.receiveAsFlow
import uz.javokhir.qr.master.data.model.mode.ThemeMode
import kotlin.native.concurrent.ThreadLocal

@ThreadLocal
object EventChannel {

    private val channel = Channel<Event>()

    fun sendEvent(event: Event) {
        channel.trySend(event)
    }

    fun receiveEvent(): Flow<Event> {
        return channel.receiveAsFlow()
    }
}

sealed class Event {
    data class ThemeModeChanged(val themeMode: ThemeMode) : Event()
    data object Idle : Event()
}