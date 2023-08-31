package uz.javokhir.kqr.master.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import uz.javokhir.kqr.master.data.model.common.GeoPosition

@Composable
expect fun MapView(
    modifier: Modifier = Modifier,
    onMovePosition: (GeoPosition) -> Unit,
)