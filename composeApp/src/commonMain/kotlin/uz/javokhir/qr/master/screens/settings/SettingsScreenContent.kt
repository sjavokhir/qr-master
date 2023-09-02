package uz.javokhir.qr.master.screens.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.javokhir.qr.master.domain.base.UiEvent
import uz.javokhir.qr.master.domain.settings.SettingsEvent
import uz.javokhir.qr.master.domain.settings.SettingsState
import uz.javokhir.qr.master.screens.settings.theme.ThemeModeScreen
import uz.javokhir.qr.master.shared.platform.appUrl
import uz.javokhir.qr.master.shared.platform.openUrl
import uz.javokhir.qr.master.shared.platform.shareText
import uz.javokhir.qr.master.ui.components.AppIcon
import uz.javokhir.qr.master.ui.extensions.clickableSingle
import uz.javokhir.qr.master.ui.icons.AppIcons
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun SettingsScreenContent(
    state: SettingsState,
    onEvent: (SettingsEvent) -> Unit,
    onUiEvent: (UiEvent) -> Unit,
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.outline.copy(alpha = 0.05f)),
        contentPadding = PaddingValues(20.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        item { GeneralContent(onUiEvent) }
        item { ScanControlsContent(state, onEvent) }
        item { OthersContent(state.chromeCustomTabsChecked) }
    }
}

@Composable
private fun GeneralContent(
    onUiEvent: (UiEvent) -> Unit,
) {
    HeaderContent(title = AppStrings.general) {
        NavigateContent(title = AppStrings.theme) {
            onUiEvent(UiEvent.Navigate(ThemeModeScreen))
        }
    }
}

@Composable
private fun ScanControlsContent(
    state: SettingsState,
    onEvent: (SettingsEvent) -> Unit,
) {
    HeaderContent(title = AppStrings.scanControls) {
        SwitchContent(
            title = AppStrings.vibrate,
            checked = state.vibrateChecked,
            onCheckedChange = {
                onEvent(SettingsEvent.CheckVibrate(it))
            }
        )

        DividerContent()

        SwitchContent(
            title = AppStrings.openWebPages,
            checked = state.openWebPagesChecked,
            onCheckedChange = {
                onEvent(SettingsEvent.CheckOpenWebPages(it))
            }
        )

        DividerContent()

        SwitchContent(
            title = AppStrings.chromeCustomTabs,
            checked = state.chromeCustomTabsChecked,
            onCheckedChange = {
                onEvent(SettingsEvent.CheckChromeCustomTabs(it))
            }
        )
    }
}

@Composable
private fun OthersContent(
    chromeCustomTabsEnabled: Boolean
) {
    HeaderContent(title = AppStrings.others) {
        NavigateContent(title = AppStrings.rateUs) {
            openUrl(appUrl, chromeCustomTabsEnabled)
        }

        DividerContent()

        NavigateContent(title = AppStrings.tellFriends) {
            shareText(AppStrings.shareDescription)
        }
    }
}

@Composable
private fun HeaderContent(
    title: String,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.SemiBold,
            fontSize = 15.sp
        )

        Column(
            modifier = Modifier
                .clip(MaterialTheme.shapes.medium)
                .border(
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.outline.copy(alpha = 0.2f),
                    shape = MaterialTheme.shapes.medium
                )
                .background(MaterialTheme.colorScheme.background)
        ) {
            content()
        }
    }
}

@Composable
private fun NavigateContent(
    title: String,
    onClick: () -> Unit,
) {
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
            modifier = Modifier.weight(1f),
        )

        AppIcon(
            imageVector = AppIcons.chevronRight,
            color = MaterialTheme.colorScheme.outline
        )
    }
}

@Composable
private fun SwitchContent(
    title: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.weight(1f),
        )

        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = Modifier
                .width(39.dp)
                .height(24.dp)
                .scale(.85f)
        )
    }
}

@Composable
private fun DividerContent() {
    Divider(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .padding(horizontal = 16.dp),
        color = MaterialTheme.colorScheme.outline.copy(alpha = 0.2f)
    )
}