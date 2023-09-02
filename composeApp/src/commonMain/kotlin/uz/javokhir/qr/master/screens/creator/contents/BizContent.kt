package uz.javokhir.qr.master.screens.creator.contents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.domain.creator.biz.BizContentEvent
import uz.javokhir.qr.master.domain.creator.biz.BizContentState
import uz.javokhir.qr.master.ui.components.AppTextField
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun BizContent(
    state: BizContentState,
    onEvent: (BizContentEvent) -> Unit,
    encoded: String,
    onContent: (Boolean, String, String) -> Unit,
) {
    LaunchedEffect(state) {
        onContent(state.enabled, state.encode(), state.decode())
    }

    LaunchedEffect(encoded) {
        onEvent(BizContentEvent.Encoded(encoded))
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        AppTextField(
            value = state.firstName,
            onValueChange = {
                onEvent(BizContentEvent.FirstNameChanged(it))
            },
            placeholder = AppStrings.egPlaceholderFirstName,
            hint = AppStrings.name
        )

        AppTextField(
            value = state.lastName,
            onValueChange = {
                onEvent(BizContentEvent.LastNameChanged(it))
            },
            placeholder = AppStrings.egPlaceholderLastName,
            hint = AppStrings.lastName
        )

        AppTextField(
            value = state.company,
            onValueChange = {
                onEvent(BizContentEvent.CompanyChanged(it))
            },
            placeholder = AppStrings.egPlaceholderCompanyName,
            hint = AppStrings.companyName
        )

        AppTextField(
            value = state.job,
            onValueChange = {
                onEvent(BizContentEvent.JobChanged(it))
            },
            placeholder = AppStrings.egPlaceholderJob,
            hint = AppStrings.job
        )

        AppTextField(
            value = state.phone,
            onValueChange = {
                onEvent(BizContentEvent.PhoneChanged(it))
            },
            placeholder = AppStrings.egPlaceholderPhone,
            hint = AppStrings.phoneNumber,
            keyboardType = KeyboardType.Phone
        )

        AppTextField(
            value = state.email,
            onValueChange = {
                onEvent(BizContentEvent.EmailChanged(it))
            },
            placeholder = AppStrings.egPlaceholderEmail,
            hint = AppStrings.emailAddress,
            keyboardType = KeyboardType.Email
        )

        AppTextField(
            value = state.website,
            onValueChange = {
                onEvent(BizContentEvent.WebsiteChanged(it))
            },
            placeholder = AppStrings.egPlaceholderWebsite,
            hint = AppStrings.website
        )

        AppTextField(
            value = state.address,
            onValueChange = {
                onEvent(BizContentEvent.AddressChanged(it))
            },
            placeholder = AppStrings.egPlaceholderAddress,
            hint = AppStrings.address
        )
    }
}