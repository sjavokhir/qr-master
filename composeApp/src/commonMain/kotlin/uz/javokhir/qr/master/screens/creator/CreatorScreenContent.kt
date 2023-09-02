package uz.javokhir.qr.master.screens.creator

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.data.model.mode.GenerateHeader
import uz.javokhir.qr.master.data.model.mode.GenerateMode
import uz.javokhir.qr.master.domain.base.UiEvent
import uz.javokhir.qr.master.domain.generateContents.GenerateContentsState
import uz.javokhir.qr.master.screens.creator.addContent.AddContentScreen
import uz.javokhir.qr.master.shared.platform.randomUUID
import uz.javokhir.qr.master.ui.components.DividerContent
import uz.javokhir.qr.master.ui.extensions.clickableSingle
import uz.javokhir.qr.master.ui.icons.AppIcons
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun CreatorScreenContent(
    state: GenerateContentsState,
    onUiEvent: (UiEvent) -> Unit,
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
    ) {
        state.contents.forEach { content ->
            item {
                Text(
                    text = content.key.headerTitle(),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(top = 16.dp)
                        .padding(bottom = 8.dp)
                )
            }
            itemsIndexed(content.value) { index, mode ->
                GenerateContentItem(
                    mode = mode,
                    lastItem = index == content.value.lastIndex
                ) {
                    onUiEvent(
                        UiEvent.Navigate(
                            AddContentScreen(
                                id = randomUUID(),
                                generateMode = mode
                            )
                        )
                    )
                }
            }
        }
    }
}

@Composable
private fun GenerateContentItem(
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
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                imageVector = mode.icon,
                contentDescription = mode.title,
                modifier = Modifier
                    .size(42.dp)
                    .clip(MaterialTheme.shapes.medium)
            )

            Text(
                text = mode.title,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.weight(1f)
            )

            Image(
                imageVector = AppIcons.chevronRight,
                contentDescription = null,
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.outline)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (!lastItem) {
            DividerContent()
        }
    }
}

@Composable
private fun GenerateHeader.headerTitle(): String {
    return when (this) {
        GenerateHeader.Web -> AppStrings.web
        GenerateHeader.Communication -> AppStrings.communication
        GenerateHeader.Other -> AppStrings.other
        GenerateHeader.SocialMedia -> AppStrings.socialMedia
    }
}