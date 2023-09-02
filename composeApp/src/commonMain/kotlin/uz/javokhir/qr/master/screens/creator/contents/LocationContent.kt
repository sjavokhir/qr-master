package uz.javokhir.qr.master.screens.creator.contents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import uz.javokhir.qr.master.domain.creator.location.LocationContentEvent
import uz.javokhir.qr.master.domain.creator.location.LocationContentState
import uz.javokhir.qr.master.screens.pickerLocation.LocationPickerScreen
import uz.javokhir.qr.master.ui.components.AppOutlinedButton
import uz.javokhir.qr.master.ui.components.AppTextField
import uz.javokhir.qr.master.ui.icons.AppIcons
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun LocationContent(
    state: LocationContentState,
    onEvent: (LocationContentEvent) -> Unit,
    onNavigate: (Screen) -> Unit,
    encoded: String,
    onContent: (Boolean, String, String) -> Unit,
) {
    LaunchedEffect(state) {
        onContent(state.enabled, state.encode(), state.decode())
    }

    LaunchedEffect(encoded) {
        onEvent(LocationContentEvent.Encoded(encoded))
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        AppTextField(
            value = state.latitude,
            onValueChange = {
                onEvent(LocationContentEvent.LatitudeChanged(it))
            },
            placeholder = AppStrings.egPlaceholderLatitude,
            hint = AppStrings.latitude,
            keyboardType = KeyboardType.Decimal
        )

        AppTextField(
            value = state.longitude,
            onValueChange = {
                onEvent(LocationContentEvent.LongitudeChanged(it))
            },
            placeholder = AppStrings.egPlaceholderLongitude,
            hint = AppStrings.longitude,
            keyboardType = KeyboardType.Decimal
        )

        AppOutlinedButton(
            text = AppStrings.selectLocation,
            onClick = {
                onNavigate(
                    LocationPickerScreen {
                        onEvent(LocationContentEvent.LocationChanged(it))
                    }
                )
            },
            leadingIcon = AppIcons.selectLocation
        )
    }
}