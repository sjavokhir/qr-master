package uz.javokhir.qr.master.screens.creator.contents

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.text.input.KeyboardType
import uz.javokhir.qr.master.domain.creator.phone.PhoneContentEvent
import uz.javokhir.qr.master.domain.creator.phone.PhoneContentState
import uz.javokhir.qr.master.ui.components.AppTextField
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun PhoneContent(
    state: PhoneContentState,
    onEvent: (PhoneContentEvent) -> Unit,
    encoded: String,
    onContent: (Boolean, String, String) -> Unit,
) {
    LaunchedEffect(state) {
        onContent(state.enabled, state.encode(), state.decode())
    }

    LaunchedEffect(encoded) {
        onEvent(PhoneContentEvent.Encoded(encoded))
    }

    Column {
        AppTextField(
            value = state.phone,
            onValueChange = {
                onEvent(PhoneContentEvent.PhoneChanged(it))
            },
            placeholder = AppStrings.egPlaceholderPhone,
            hint = AppStrings.phoneNumber,
            keyboardType = KeyboardType.Phone
        )
    }
}