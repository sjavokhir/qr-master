package uz.javokhir.qr.master.domain.onBoarding

import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.inject
import uz.javokhir.qr.master.data.store.AppStore
import uz.javokhir.qr.master.domain.base.BaseScreenModel

class OnBoardingScreenModel : BaseScreenModel<OnBoardingState, OnBoardingEvent>(OnBoardingState()) {

    private val appStore by inject<AppStore>()

    override fun onEvent(event: OnBoardingEvent) {
        when (event) {
            OnBoardingEvent.Start -> start()
        }
    }

    private fun start() {
        coroutineScope.launch {
            appStore.setOnBoarding(false)

            stateData.update { it.copy(started = true) }
        }
    }
}