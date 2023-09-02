package uz.javokhir.qr.master.screens.onBoarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
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
import uz.javokhir.qr.master.data.model.common.OnBoarding
import uz.javokhir.qr.master.domain.base.UiEvent
import uz.javokhir.qr.master.domain.onBoarding.OnBoardingEvent
import uz.javokhir.qr.master.domain.onBoarding.OnBoardingState
import uz.javokhir.qr.master.screens.scanner.ScannerScreen
import uz.javokhir.qr.master.ui.components.AppFilledButton
import uz.javokhir.qr.master.ui.components.AppOutlinedButton
import uz.javokhir.qr.master.ui.components.HorizontalPagerIndicator
import uz.javokhir.qr.master.ui.localization.AppStrings

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreenContent(
    state: OnBoardingState,
    onEvent: (OnBoardingEvent) -> Unit,
    onUiEvent: (UiEvent) -> Unit,
) {
    val scope = rememberCoroutineScope()
    val pagerState = rememberPagerState { state.onBoardings.size }

    val started = remember(pagerState.currentPage) {
        pagerState.currentPage == state.onBoardings.lastIndex
    }

    LaunchedEffect(state.started) {
        if (state.started) {
            onUiEvent(UiEvent.Replace(ScannerScreen))
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.systemBars)
            .windowInsetsPadding(WindowInsets.statusBars),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.weight(1f),
        ) {
            PagerContent(state.onBoardings.getOrNull(it))
        }

        HorizontalPagerIndicator(
            pagerState = pagerState,
            pageCount = state.onBoardings.size
        )

        Row(
            modifier = Modifier.padding(
                horizontal = 20.dp,
                vertical = 40.dp
            ),
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
                text = if (started) AppStrings.start else AppStrings.next,
                onClick = {
                    if (started) {
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
    }
}

@Composable
private fun PagerContent(
    onBoarding: OnBoarding?,
) {
    if (onBoarding != null) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            Image(
                imageVector = onBoarding.icon,
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(32.dp),
                colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.onPrimary)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    text = onBoarding.title,
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center
                )

                Text(
                    text = onBoarding.description,
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.outline,
                    minLines = 3,
                    maxLines = 3,
                )
            }
        }
    }
}
