package uz.javokhir.qr.master.screens.creator.contents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import uz.javokhir.qr.master.domain.creator.event.EventContentEvent
import uz.javokhir.qr.master.domain.creator.event.EventContentState
import uz.javokhir.qr.master.screens.pickerDateTime.DateTimePickerScreen
import uz.javokhir.qr.master.ui.components.AppIcon
import uz.javokhir.qr.master.ui.components.AppTextField
import uz.javokhir.qr.master.ui.extensions.clickableSingle
import uz.javokhir.qr.master.ui.icons.AppIcons
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun EventContent(
    state: EventContentState,
    onEvent: (EventContentEvent) -> Unit,
    onNavigate: (Screen) -> Unit,
    encoded: String,
    onContent: (Boolean, String, String) -> Unit,
) {
    LaunchedEffect(state) {
        onContent(state.enabled, state.encode(), state.decode())
    }

    LaunchedEffect(encoded) {
        onEvent(EventContentEvent.Encoded(encoded))
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        AppTextField(
            value = state.name,
            onValueChange = {
                onEvent(EventContentEvent.NameChanged(it))
            },
            placeholder = AppStrings.egPlaceholderEventName,
            hint = AppStrings.eventName
        )

        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = AppStrings.allDayEvent,
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(modifier = Modifier.weight(1f))

            Switch(
                checked = state.allDay,
                onCheckedChange = {
                    onEvent(EventContentEvent.AllDayChecked(it))
                },
                modifier = Modifier
                    .width(39.dp)
                    .height(24.dp)
                    .scale(.85f)
            )
        }

        AppTextField(
            value = state.startDateTime,
            onValueChange = {},
            placeholder = if (state.allDay) {
                AppStrings.egPlaceholderDate
            } else {
                AppStrings.egPlaceholderDateTime
            },
            hint = if (state.allDay) {
                AppStrings.startDate
            } else {
                AppStrings.startDateTime
            },
            trailingIcon = {
                AppIcon(
                    imageVector = AppIcons.today,
                    color = MaterialTheme.colorScheme.outline
                )
            },
            readOnly = true,
            modifier = Modifier.clickableSingle(
                onClick = {
                    onEvent(EventContentEvent.ShowPicker(true))

                    onNavigate(
                        DateTimePickerScreen(!state.allDay) {
                            onEvent(EventContentEvent.DateTimeChanged(it))
                        }
                    )
                },
                hasIndication = false
            )
        )

        AppTextField(
            value = state.endDateTime,
            onValueChange = {},
            placeholder = if (state.allDay) {
                AppStrings.egPlaceholderDate
            } else {
                AppStrings.egPlaceholderDateTime
            },
            hint = if (state.allDay) {
                AppStrings.endDate
            } else {
                AppStrings.endDateTime
            },
            trailingIcon = {
                AppIcon(
                    imageVector = AppIcons.today,
                    color = MaterialTheme.colorScheme.outline
                )
            },
            readOnly = true,
            modifier = Modifier.clickableSingle(
                onClick = {
                    onEvent(EventContentEvent.ShowPicker(false))
//                    onNavigate(DateTimePickerScreenDestination(!state.allDay))
                },
                hasIndication = false
            )
        )

        AppTextField(
            value = state.location,
            onValueChange = {
                onEvent(EventContentEvent.LocationChanged(it))
            },
            placeholder = AppStrings.egPlaceholderLocation,
            hint = AppStrings.location
        )

        AppTextField(
            modifier = Modifier.defaultMinSize(minHeight = 120.dp),
            value = state.description,
            onValueChange = {
                onEvent(EventContentEvent.DescriptionChanged(it))
            },
            placeholder = AppStrings.egPlaceholderEventDescription,
            hint = AppStrings.description
        )
    }
}