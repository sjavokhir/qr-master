package uz.javokhir.qr.master.domain.onBoarding

sealed class OnBoardingEvent {
    data object Start : OnBoardingEvent()
    data object Idle : OnBoardingEvent()
}