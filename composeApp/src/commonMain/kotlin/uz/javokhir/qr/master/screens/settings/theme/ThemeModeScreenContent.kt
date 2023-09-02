package uz.javokhir.qr.master.screens.settings.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.data.model.mode.ThemeMode
import uz.javokhir.qr.master.domain.theme.ThemeModeEvent
import uz.javokhir.qr.master.domain.theme.ThemeModeState
import uz.javokhir.qr.master.shared.platform.Event
import uz.javokhir.qr.master.shared.platform.EventChannel
import uz.javokhir.qr.master.ui.components.AppIcon
import uz.javokhir.qr.master.ui.components.DividerContent
import uz.javokhir.qr.master.ui.extensions.clickableSingle
import uz.javokhir.qr.master.ui.icons.AppIcons
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun ThemeModeScreenContent(
    state: ThemeModeState,
    onEvent: (ThemeModeEvent) -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.outline.copy(alpha = 0.05f)),
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(20.dp)
                .clip(MaterialTheme.shapes.medium)
                .border(
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.outline.copy(alpha = 0.2f),
                    shape = MaterialTheme.shapes.medium
                )
                .background(MaterialTheme.colorScheme.background)
        ) {
            itemsIndexed(state.themeModes) { index, mode ->
                ThemeModeItem(
                    title = when (mode) {
                        ThemeMode.System -> AppStrings.systemDefault
                        ThemeMode.Light -> AppStrings.light
                        ThemeMode.Dark -> AppStrings.dark
                    },
                    themeMode = mode,
                    selectedThemeMode = state.selectedTheme,
                    hasDivider = index != state.themeModes.lastIndex,
                    onClick = {
                        onEvent(ThemeModeEvent.SelectThemeMode(mode))

                        EventChannel.sendEvent(Event.ThemeModeChanged(mode))
                    }
                )
            }
        }
    }
}

@Composable
private fun ThemeModeItem(
    title: String,
    themeMode: ThemeMode,
    selectedThemeMode: ThemeMode,
    hasDivider: Boolean,
    onClick: () -> Unit,
) {
    val isSelected = remember(selectedThemeMode) { themeMode == selectedThemeMode }

    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickableSingle(onClick = onClick)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.bodyLarge,
                color = if (isSelected) {
                    MaterialTheme.colorScheme.primary
                } else {
                    MaterialTheme.colorScheme.onBackground
                },
                fontWeight = if (isSelected) {
                    FontWeight.SemiBold
                } else {
                    FontWeight.Normal
                },
                modifier = Modifier.weight(1f)
            )

            AppIcon(
                imageVector = AppIcons.checkCircle,
                color = if (isSelected) {
                    MaterialTheme.colorScheme.primary
                } else {
                    Color.Transparent
                }
            )
        }

        if (hasDivider) {
            DividerContent(
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
    }
}