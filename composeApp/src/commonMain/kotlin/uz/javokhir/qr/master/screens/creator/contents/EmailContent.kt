package uz.javokhir.qr.master.screens.creator.contents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.domain.creator.email.EmailContentEvent
import uz.javokhir.qr.master.domain.creator.email.EmailContentState
import uz.javokhir.qr.master.ui.components.AppTextField
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun EmailContent(
    state: EmailContentState,
    onEvent: (EmailContentEvent) -> Unit,
    encoded: String,
    onContent: (Boolean, String, String) -> Unit,
) {
    LaunchedEffect(state) {
        onContent(state.enabled, state.encode(), state.decode())
    }

    LaunchedEffect(encoded) {
        onEvent(EmailContentEvent.Encoded(encoded))
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        AppTextField(
            value = state.email,
            onValueChange = {
                onEvent(EmailContentEvent.EmailChanged(it))
            },
            placeholder = AppStrings.egPlaceholderEmail,
            hint = AppStrings.emailAddress,
            keyboardType = KeyboardType.Email
        )

        AppTextField(
            value = state.subject,
            onValueChange = {
                onEvent(EmailContentEvent.SubjectChanged(it))
            },
            placeholder = AppStrings.egPlaceholderSubject,
            hint = AppStrings.subject
        )

        AppTextField(
            modifier = Modifier.defaultMinSize(minHeight = 120.dp),
            value = state.message,
            onValueChange = {
                onEvent(EmailContentEvent.MessageChanged(it))
            },
            placeholder = AppStrings.egPlaceholderSmsMessage,
            hint = AppStrings.message,
        )
    }
}