package uz.javokhir.qr.master.screens.history

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import uz.javokhir.qr.master.core.datetime.toDateTime
import uz.javokhir.qr.master.core.datetime.toDefaultDateTime
import uz.javokhir.qr.master.data.database.entity.HistoryEntity
import uz.javokhir.qr.master.data.database.entity.toModel
import uz.javokhir.qr.master.data.model.mode.GenerateMode
import uz.javokhir.qr.master.data.model.mode.toGenerateMode
import uz.javokhir.qr.master.domain.base.UiEvent
import uz.javokhir.qr.master.domain.history.HistoryEvent
import uz.javokhir.qr.master.domain.history.HistoryState
import uz.javokhir.qr.master.screens.creator.CreatorScreen
import uz.javokhir.qr.master.screens.qrCode.QrCodeScreen
import uz.javokhir.qr.master.screens.scanner.ScannerScreen
import uz.javokhir.qr.master.ui.components.AppFilledButton
import uz.javokhir.qr.master.ui.components.AppTextField
import uz.javokhir.qr.master.ui.components.DividerContent
import uz.javokhir.qr.master.ui.extensions.clickableSingle
import uz.javokhir.qr.master.ui.icons.AppIcons
import uz.javokhir.qr.master.ui.localization.AppStrings

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HistoryScreenContent(
    state: HistoryState,
    onEvent: (HistoryEvent) -> Unit,
    onUiEvent: (UiEvent) -> Unit,
) {
    val scope = rememberCoroutineScope()

    val pagerState = rememberPagerState { 2 }
    val pages = remember { listOf(AppStrings.scanned, AppStrings.created) }

    LaunchedEffect(pagerState.currentPage) {
        onEvent(HistoryEvent.PageChanged(pagerState.currentPage))
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(top = 20.dp)
                .padding(horizontal = 20.dp)
                .clip(MaterialTheme.shapes.medium)
                .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.1f))
                .padding(3.dp)
        ) {
            pages.forEachIndexed { index, title ->
                TabContent(
                    title = title,
                    currentPage = pagerState.currentPage == index,
                    onClick = {
                        scope.launch {
                            pagerState.scrollToPage(
                                page = index,
                                pageOffsetFraction = pagerState.currentPageOffsetFraction
                            )
                        }
                    }
                )
            }
        }

        HorizontalPager(pagerState) { page ->
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                if (page == 0) {
                    AppTextField(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        value = state.scannedQuery,
                        onValueChange = {
                            onEvent(HistoryEvent.QueryChanged(true, it))
                        },
                        placeholder = AppStrings.searchQrCode
                    )

                    if (state.scannedHistory.isEmpty()) {
                        HistoryNotFoundContent(true, onUiEvent)
                    } else {
                        HistoryContent(true, state.scannedHistory, onUiEvent)
                    }
                } else {
                    AppTextField(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        value = state.createdQuery,
                        onValueChange = {
                            onEvent(HistoryEvent.QueryChanged(false, it))
                        },
                        placeholder = AppStrings.searchQrCode
                    )

                    if (state.createdHistory.isEmpty()) {
                        HistoryNotFoundContent(false, onUiEvent)
                    } else {
                        HistoryContent(false, state.createdHistory, onUiEvent)
                    }
                }
            }
        }
    }
}

@Composable
private fun HistoryContent(
    scanned: Boolean,
    history: List<HistoryEntity>,
    onUiEvent: (UiEvent) -> Unit,
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        itemsIndexed(history) { index, entity ->
            HistoryContentItem(
                entity = entity,
                mode = entity.generateMode.toGenerateMode(),
                lastItem = index == history.lastIndex,
                onClick = {
                    onUiEvent(
                        UiEvent.Navigate(
                            QrCodeScreen(
                                id = entity.id,
                                dateTime = entity.timestamp.toDefaultDateTime(),
                                scanned = scanned,
                                generateMode = entity.generateMode.toGenerateMode(),
                                encoded = entity.encoded,
                                decoded = entity.decoded,
                                customize = entity.toModel(),
                                editable = true,
                                deletable = true
                            )
                        )
                    )
                }
            )
        }
    }
}

@Composable
private fun HistoryContentItem(
    entity: HistoryEntity,
    mode: GenerateMode,
    lastItem: Boolean,
    onClick: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickableSingle(onClick = onClick)
            .padding(horizontal = 20.dp)
            .padding(top = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                imageVector = mode.icon,
                contentDescription = mode.title,
                modifier = Modifier
                    .size(42.dp)
                    .clip(MaterialTheme.shapes.medium)
            )

            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(3.dp)
            ) {
                Text(
                    text = mode.title,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Medium
                )

                Text(
                    text = entity.decoded,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.outline,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1
                )
            }

            Text(
                text = entity.timestamp.toDateTime().dateTime,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.outline,
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (!lastItem) {
            DividerContent()
        }
    }
}

@Composable
private fun RowScope.TabContent(
    title: String,
    currentPage: Boolean,
    onClick: () -> Unit,
) {
    Text(
        text = title,
        modifier = Modifier
            .weight(1f)
            .clip(MaterialTheme.shapes.medium)
            .background(
                if (currentPage) {
                    MaterialTheme.colorScheme.primary
                } else {
                    Color.Transparent
                }
            )
            .clickableSingle(
                onClick = onClick,
                hasIndication = false
            )
            .padding(vertical = 8.dp),
        style = MaterialTheme.typography.bodyLarge,
        fontWeight = if (currentPage) {
            FontWeight.Medium
        } else {
            FontWeight.Normal
        },
        color = if (currentPage) {
            MaterialTheme.colorScheme.background
        } else {
            MaterialTheme.colorScheme.primary
        },
        textAlign = TextAlign.Center
    )
}

@Composable
private fun HistoryNotFoundContent(
    scanned: Boolean,
    onUiEvent: (UiEvent) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Spacer(modifier = Modifier.weight(1f))

        Image(
            imageVector = if (scanned) AppIcons.scannedHistory else AppIcons.createdHistory,
            contentDescription = null
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = AppStrings.noContentFound,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center
            )

            Text(
                text = if (scanned) {
                    AppStrings.clickScanButton
                } else {
                    AppStrings.clickCreateButton
                },
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.outline,
                textAlign = TextAlign.Center
            )
        }

        AppFilledButton(
            text = if (scanned) AppStrings.scan else AppStrings.create,
            onClick = {
                if (scanned) {
                    onUiEvent(UiEvent.Replace(ScannerScreen))
                } else {
                    onUiEvent(UiEvent.Replace(CreatorScreen))
                }
            }
        )

        Spacer(modifier = Modifier.weight(1f))
    }
}