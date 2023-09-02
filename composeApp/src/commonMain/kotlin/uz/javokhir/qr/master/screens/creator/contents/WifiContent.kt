package uz.javokhir.qr.master.screens.creator.contents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.domain.creator.wifi.WifiContentEvent
import uz.javokhir.qr.master.domain.creator.wifi.WifiContentState
import uz.javokhir.qr.master.ui.components.AppTextField
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun WifiContent(
    state: WifiContentState,
    onEvent: (WifiContentEvent) -> Unit,
    encoded: String,
    onContent: (Boolean, String, String) -> Unit,
) {
    LaunchedEffect(state) {
        onContent(state.enabled, state.encode(), state.decode())
    }

    LaunchedEffect(encoded) {
        onEvent(WifiContentEvent.Encoded(encoded))
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        AppTextField(
            value = state.networkName,
            onValueChange = {
                onEvent(WifiContentEvent.NetworkNameChanged(it))
            },
            placeholder = AppStrings.egPlaceholderWifiName,
            hint = AppStrings.networkName
        )

        AppTextField(
            value = state.password,
            onValueChange = {
                onEvent(WifiContentEvent.PasswordChanged(it))
            },
            placeholder = AppStrings.egPlaceholderWifiPassword,
            hint = AppStrings.password,
        )

        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Switch(
                checked = state.hidden,
                onCheckedChange = {
                    onEvent(WifiContentEvent.HiddenChecked(it))
                },
                modifier = Modifier
                    .width(39.dp)
                    .height(24.dp)
                    .scale(.85f)
            )

            Text(
                text = AppStrings.hidden,
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}