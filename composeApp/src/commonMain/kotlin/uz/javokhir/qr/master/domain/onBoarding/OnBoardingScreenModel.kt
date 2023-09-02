package uz.javokhir.qr.master.domain.onBoarding

import kotlinx.coroutines.flow.update
import org.koin.core.component.inject
import uz.javokhir.qr.master.data.model.common.OnBoarding
import uz.javokhir.qr.master.data.store.AppStore
import uz.javokhir.qr.master.domain.base.BaseScreenModel
import uz.javokhir.qr.master.ui.icons.AppIcons
import uz.javokhir.qr.master.ui.localization.AppStrings

class OnBoardingScreenModel :
    BaseScreenModel<OnBoardingState, OnBoardingEvent>(OnBoardingState()) {

    private val appStore by inject<AppStore>()

    init {
        fetchOnBoardings()
    }

    override fun onEvent(event: OnBoardingEvent) {
        when (event) {
            OnBoardingEvent.Start -> start()
        }
    }

    private fun fetchOnBoardings() {
        val onBoardings = listOf(
            OnBoarding(
                icon = AppIcons.onBoarding1,
                title = AppStrings.onboardingTitle1,
                description = AppStrings.onboardingDescription1,
            ),
            OnBoarding(
                icon = AppIcons.onBoarding2,
                title = AppStrings.onboardingTitle2,
                description = AppStrings.onboardingDescription2,
            ),
            OnBoarding(
                icon = AppIcons.onBoarding3,
                title = AppStrings.onboardingTitle3,
                description = AppStrings.onboardingDescription3,
            ),
            OnBoarding(
                icon = AppIcons.onBoarding4,
                title = AppStrings.onboardingTitle4,
                description = AppStrings.onboardingDescription4,
            ),
        )

        stateData.update { it.copy(onBoardings = onBoardings) }
    }

    private fun start() {
        appStore.setOnBoarding(false)

        stateData.update { it.copy(started = true) }
    }
}