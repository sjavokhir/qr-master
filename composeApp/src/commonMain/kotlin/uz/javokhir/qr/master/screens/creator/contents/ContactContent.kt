package uz.javokhir.qr.master.screens.creator.contents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.domain.creator.contact.ContactContentEvent
import uz.javokhir.qr.master.domain.creator.contact.ContactContentState
import uz.javokhir.qr.master.ui.components.AppTextField
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun ContactContent(
    state: ContactContentState,
    onEvent: (ContactContentEvent) -> Unit,
    encoded: String,
    onContent: (Boolean, String, String) -> Unit,
) {
    LaunchedEffect(state) {
        onContent(state.enabled, state.encode(), state.decode())
    }

    LaunchedEffect(encoded) {
        onEvent(ContactContentEvent.Encoded(encoded))
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        AppTextField(
            value = state.name,
            onValueChange = {
                onEvent(ContactContentEvent.NameChanged(it))
            },
            placeholder = AppStrings.egPlaceholderFirstName,
            hint = AppStrings.name
        )

        AppTextField(
            value = state.phone,
            onValueChange = {
                onEvent(ContactContentEvent.PhoneChanged(it))
            },
            placeholder = AppStrings.egPlaceholderPhone,
            hint = AppStrings.phoneNumber,
            keyboardType = KeyboardType.Phone
        )

        AppTextField(
            value = state.email,
            onValueChange = {
                onEvent(ContactContentEvent.EmailChanged(it))
            },
            placeholder = AppStrings.egPlaceholderEmail,
            hint = AppStrings.emailAddress,
            keyboardType = KeyboardType.Email
        )

        AppTextField(
            value = state.address,
            onValueChange = {
                onEvent(ContactContentEvent.AddressChanged(it))
            },
            placeholder = AppStrings.egPlaceholderAddress,
            hint = AppStrings.address
        )
    }
}