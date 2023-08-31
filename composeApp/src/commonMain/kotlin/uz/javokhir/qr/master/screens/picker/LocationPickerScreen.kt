package uz.javokhir.qr.master.screens.picker

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.core.extensions.roundLast5
import uz.javokhir.qr.master.data.model.common.GeoPosition
import uz.javokhir.qr.master.ui.components.AppBackground
import uz.javokhir.qr.master.ui.components.AppFilledButton
import uz.javokhir.qr.master.ui.components.AppIcon
import uz.javokhir.qr.master.ui.components.DividerContent
import uz.javokhir.qr.master.ui.icons.AppIcons
import uz.javokhir.qr.master.ui.localization.AppStrings
import uz.javokhir.qr.master.view.MapView

@Composable
fun LocationPickerScreen() {
    var currentPosition by remember { mutableStateOf(GeoPosition()) }

    AppBackground {
        Column {
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ) {
                MapView {
                    currentPosition = it
                }

                AppIcon(
                    imageVector = AppIcons.SelectLocation,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.size(40.dp)
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.background)
            ) {
                DividerContent()

                AppFilledButton(
                    text = AppStrings.select,
                    onClick = {
                        "${currentPosition.latitude.roundLast5()},${currentPosition.longitude.roundLast5()}"
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