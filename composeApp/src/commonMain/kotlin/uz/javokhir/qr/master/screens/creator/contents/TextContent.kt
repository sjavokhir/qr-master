package uz.javokhir.qr.master.screens.creator.contents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.domain.creator.text.TextContentEvent
import uz.javokhir.qr.master.domain.creator.text.TextContentState
import uz.javokhir.qr.master.ui.components.AppTextField
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun TextContent(
    state: TextContentState,
    onEvent: (TextContentEvent) -> Unit,
    encoded: String,
    onContent: (Boolean, String, String) -> Unit,
) {
    LaunchedEffect(state) {
        onContent(state.enabled, state.encode(), state.decode())
    }

    LaunchedEffect(encoded) {
        onEvent(TextContentEvent.Encoded(encoded))
    }

    Column {
        AppTextField(
            modifier = Modifier.defaultMinSize(minHeight = 120.dp),
            value = state.text,
            onValueChange = {
                onEvent(TextContentEvent.TextChanged(it))
            },
            placeholder = AppStrings.egPlaceholderText,
            hint = AppStrings.text,
        )
    }
}