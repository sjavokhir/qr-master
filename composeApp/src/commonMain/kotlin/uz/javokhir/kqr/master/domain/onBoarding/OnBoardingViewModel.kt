package uz.javokhir.kqr.master.domain.onBoarding

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import uz.javokhir.kqr.master.data.store.AppStore

class OnBoardingViewModel : ScreenModel, KoinComponent {

    private val appStore by inject<AppStore>()

    private val stateData = MutableStateFlow(OnBoardingState())
    val state = stateData.asStateFlow()

    fun onEvent(event: OnBoardingEvent) {
        when (event) {
            OnBoardingEvent.Start -> onStart()
            OnBoardingEvent.Idle -> setIdle()
        }
    }

    private fun onStart() {
        coroutineScope.launch {
            appStore.setOnBoarding(false)

            stateData.update { it.copy(started = true) }
        }
    }

    private fun setIdle() {
        stateData.update { it.copy(started = false) }
    }
}