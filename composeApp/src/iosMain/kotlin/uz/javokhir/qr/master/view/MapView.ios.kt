package uz.javokhir.qr.master.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import uz.javokhir.qr.master.data.model.common.GeoPosition

@Composable
actual fun MapView(
    modifier: Modifier,
    onMovePosition: (GeoPosition) -> Unit,
) {
}