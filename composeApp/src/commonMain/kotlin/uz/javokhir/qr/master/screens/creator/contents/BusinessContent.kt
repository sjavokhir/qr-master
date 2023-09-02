package uz.javokhir.qr.master.screens.creator.contents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.domain.creator.business.BusinessContentEvent
import uz.javokhir.qr.master.domain.creator.business.BusinessContentState
import uz.javokhir.qr.master.ui.components.AppTextField
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun BusinessContent(
    state: BusinessContentState,
    onEvent: (BusinessContentEvent) -> Unit,
    encoded: String,
    onContent: (Boolean, String, String) -> Unit,
) {
    LaunchedEffect(state) {
        onContent(state.enabled, state.encode(), state.decode())
    }

    LaunchedEffect(encoded) {
        onEvent(BusinessContentEvent.Encoded(encoded))
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        AppTextField(
            value = state.name,
            onValueChange = {
                onEvent(BusinessContentEvent.NameChanged(it))
            },
            placeholder = AppStrings.egPlaceholderCompanyName,
            hint = AppStrings.companyName
        )

        AppTextField(
            value = state.industry,
            onValueChange = {
                onEvent(BusinessContentEvent.IndustryChanged(it))
            },
            placeholder = AppStrings.egPlaceholderIndustry,
            hint = AppStrings.industry
        )

        AppTextField(
            value = state.phone,
            onValueChange = {
                onEvent(BusinessContentEvent.PhoneChanged(it))
            },
            placeholder = AppStrings.egPlaceholderPhone,
            hint = AppStrings.phoneNumber,
            keyboardType = KeyboardType.Phone
        )

        AppTextField(
            value = state.email,
            onValueChange = {
                onEvent(BusinessContentEvent.EmailChanged(it))
            },
            placeholder = AppStrings.egPlaceholderEmail,
            hint = AppStrings.emailAddress,
            keyboardType = KeyboardType.Email
        )

        AppTextField(
            value = state.website,
            onValueChange = {
                onEvent(BusinessContentEvent.WebsiteChanged(it))
            },
            placeholder = AppStrings.egPlaceholderWebsite,
            hint = AppStrings.website
        )

        AppTextField(
            value = state.address,
            onValueChange = {
                onEvent(BusinessContentEvent.AddressChanged(it))
            },
            placeholder = AppStrings.egPlaceholderAddress,
            hint = AppStrings.address
        )
    }
}