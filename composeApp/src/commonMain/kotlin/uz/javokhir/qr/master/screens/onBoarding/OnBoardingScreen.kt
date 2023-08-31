package uz.javokhir.qr.master.screens.onBoarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import uz.javokhir.qr.master.domain.onBoarding.OnBoardingEvent
import uz.javokhir.qr.master.domain.onBoarding.OnBoardingState
import uz.javokhir.qr.master.ui.components.AppFilledButton
import uz.javokhir.qr.master.ui.components.AppOutlinedButton
import uz.javokhir.qr.master.ui.components.HorizontalPagerIndicator
import uz.javokhir.qr.master.ui.icons.AppIcons
import uz.javokhir.qr.master.ui.localization.AppStrings

//@Composable
//fun OnBoardingScreen() {
//    AppBackground {
//        OnBoardingScreenContent(
//            state = state,
//            onEvent = viewModel::onEvent,
//        )
//    }
//}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun OnBoardingScreenContent(
    state: OnBoardingState,
    onEvent: (OnBoardingEvent) -> Unit,
) {
    val scope = rememberCoroutineScope()
    val pagerState = rememberPagerState { 4 }

    val isStart = remember(pagerState.currentPage) { pagerState.currentPage == 3 }
    val resources = remember(pagerState.currentPage) {
        when (pagerState.currentPage + 1) {
            2 -> AppIcons.OnBoarding2 to (AppStrings.onboardingTitle2 to AppStrings.onboardingDescription2)
            3 -> AppIcons.OnBoarding3 to (AppStrings.onboardingTitle3 to AppStrings.onboardingDescription3)
            4 -> AppIcons.OnBoarding4 to (AppStrings.onboardingTitle4 to AppStrings.onboardingDescription4)
            else -> AppIcons.OnBoarding1 to (AppStrings.onboardingTitle1 to AppStrings.onboardingDescription1)
        }
    }

    LaunchedEffect(state.started) {
        if (state.started) {
            onEvent(OnBoardingEvent.Idle)
        }
    }

    Column(
        modifier = Modifier.padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = AppStrings.appName,
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(32.dp))

        Image(
            imageVector = resources.first,
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primary)
                .padding(32.dp),
            colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.onPrimary)
        )

        Spacer(modifier = Modifier.weight(1f))

        HorizontalPager(
            state = pagerState,
            userScrollEnabled = false
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = resources.second.first,
                    style = MaterialTheme.typography.titleMedium,
                    textAlign = TextAlign.Center
                )

                Text(
                    text = resources.second.second,
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.outline
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        HorizontalPagerIndicator(
            pagerState = pagerState,
            pageCount = 4
        )

        Spacer(modifier = Modifier.weight(1f))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            AppOutlinedButton(
                text = AppStrings.skip,
                onClick = {
                    onEvent(OnBoardingEvent.Start)
                },
                modifier = Modifier.weight(1f)
            )

            AppFilledButton(
                text = if (isStart) AppStrings.start else AppStrings.next,
                onClick = {
                    if (isStart) {
                        onEvent(OnBoardingEvent.Start)
                    } else {
                        scope.launch {
                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
                        }
                    }
                },
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.weight(1f))
    }
}