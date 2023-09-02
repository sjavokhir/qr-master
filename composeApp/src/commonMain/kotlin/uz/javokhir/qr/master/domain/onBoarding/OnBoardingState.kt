package uz.javokhir.qr.master.domain.onBoarding

import uz.javokhir.qr.master.data.model.common.OnBoarding

data class OnBoardingState(
    val onBoardings: List<OnBoarding> = emptyList(),
    val started: Boolean = false,
)
