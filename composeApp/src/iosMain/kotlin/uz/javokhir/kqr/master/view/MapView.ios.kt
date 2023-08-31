package uz.javokhir.kqr.master.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import uz.javokhir.kqr.master.data.model.common.GeoPosition

@Composable
actual fun MapView(
    modifier: Modifier,
    onMovePosition: (GeoPosition) -> Unit,
) {
}