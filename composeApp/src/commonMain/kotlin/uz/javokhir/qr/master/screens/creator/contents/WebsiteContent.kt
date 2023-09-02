package uz.javokhir.qr.master.screens.creator.contents

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import uz.javokhir.qr.master.domain.creator.website.WebsiteContentEvent
import uz.javokhir.qr.master.domain.creator.website.WebsiteContentState
import uz.javokhir.qr.master.ui.components.AppTextField
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun WebsiteContent(
    state: WebsiteContentState,
    onEvent: (WebsiteContentEvent) -> Unit,
    encoded: String,
    onContent: (Boolean, String, String) -> Unit,
) {
    LaunchedEffect(state) {
        onContent(state.enabled, state.encode(), state.decode())
    }

    LaunchedEffect(encoded) {
        onEvent(WebsiteContentEvent.Encoded(encoded))
    }

    Column {
        AppTextField(
            value = state.website,
            onValueChange = {
                onEvent(WebsiteContentEvent.WebsiteChanged(it))
            },
            placeholder = AppStrings.egPlaceholderWebsite,
            hint = AppStrings.website
        )
    }
}