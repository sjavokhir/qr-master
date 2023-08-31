package uz.javokhir.kqr.master.domain.onBoarding

sealed class OnBoardingEvent {
    data object Start : OnBoardingEvent()
    data object Idle : OnBoardingEvent()
}