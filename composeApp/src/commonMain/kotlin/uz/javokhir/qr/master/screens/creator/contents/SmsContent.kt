package uz.javokhir.qr.master.screens.creator.contents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.domain.creator.sms.SmsContentEvent
import uz.javokhir.qr.master.domain.creator.sms.SmsContentState
import uz.javokhir.qr.master.ui.components.AppTextField
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun SmsContent(
    state: SmsContentState,
    onEvent: (SmsContentEvent) -> Unit,
    encoded: String,
    onContent: (Boolean, String, String) -> Unit,
) {
    LaunchedEffect(state) {
        onContent(state.enabled, state.encode(), state.decode())
    }

    LaunchedEffect(encoded) {
        onEvent(SmsContentEvent.Encoded(encoded))
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        AppTextField(
            value = state.phone,
            onValueChange = {
                onEvent(SmsContentEvent.PhoneChanged(it))
            },
            placeholder = AppStrings.egPlaceholderPhone,
            hint = AppStrings.phoneNumber,
            keyboardType = KeyboardType.Phone
        )

        AppTextField(
            modifier = Modifier.defaultMinSize(minHeight = 120.dp),
            value = state.message,
            onValueChange = {
                onEvent(SmsContentEvent.MessageChanged(it))
            },
            placeholder = AppStrings.egPlaceholderSmsMessage,
            hint = AppStrings.message,
        )
    }
}