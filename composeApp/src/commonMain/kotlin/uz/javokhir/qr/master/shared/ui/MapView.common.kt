package uz.javokhir.qr.master.shared.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import uz.javokhir.qr.master.data.model.common.GeoPosition

@Composable
expect fun MapView(
    modifier: Modifier = Modifier,
    onMovePosition: (GeoPosition) -> Unit,
)