package uz.javokhir.qr.master.screens.pickerDateTime

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DisplayMode
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TimePicker
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.core.datetime.actualDateMillis
import uz.javokhir.qr.master.core.datetime.currentTimestamp
import uz.javokhir.qr.master.ui.components.AppBackground
import uz.javokhir.qr.master.ui.components.AppFilledButton
import uz.javokhir.qr.master.ui.components.DividerContent
import uz.javokhir.qr.master.ui.localization.AppStrings

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DateTimePickerScreenContent(
    showTime: Boolean,
    onSelectTimestamp: (Long) -> Unit,
) {
    val datePickerState = rememberDatePickerState(
        initialSelectedDateMillis = currentTimestamp(),
        initialDisplayMode = if (showTime) {
            DisplayMode.Input
        } else {
            DisplayMode.Picker
        }
    )
    val timePickerState = rememberTimePickerState(
        initialHour = if (showTime) 9 else 0,
        is24Hour = true
    )

    AppBackground {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            LazyColumn {
                item {
                    DatePicker(
                        state = datePickerState,
                        title = {
                            Text(
                                text = AppStrings.selectDate,
                                style = MaterialTheme.typography.titleMedium,
                                color = MaterialTheme.colorScheme.onBackground,
                                modifier = Modifier.padding(
                                    PaddingValues(
                                        start = 24.dp,
                                        end = 24.dp,
                                        top = 20.dp
                                    )
                                )
                            )
                        }
                    )
                }

                if (showTime) {
                    item {
                        Text(
                            text = AppStrings.selectTime,
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onBackground,
                            modifier = Modifier.padding(
                                horizontal = 24.dp,
                                vertical = 20.dp
                            )
                        )
                    }
                    item {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            TimePicker(state = timePickerState)
                        }
                    }
                    item {
                        Spacer(modifier = Modifier.height(72.dp))
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.background)
                    .align(Alignment.BottomCenter),
            ) {
                DividerContent()

                AppFilledButton(
                    text = AppStrings.select,
                    onClick = {
                        val actualDateMillis = datePickerState.selectedDateMillis.actualDateMillis(
                            hour = timePickerState.hour,
                            minute = timePickerState.minute
                        )
                        onSelectTimestamp(actualDateMillis)
                    },
                    modifier = Modifier.padding(
                        horizontal = 20.dp,
                        vertical = 16.dp
                    )
                )
            }
        }

    }
}