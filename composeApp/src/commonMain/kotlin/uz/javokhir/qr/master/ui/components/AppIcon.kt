package uz.javokhir.qr.master.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun AppIcon(
    imageVector: ImageVector,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.onSurface,
) {
    Icon(
        imageVector = imageVector,
        contentDescription = null,
        modifier = modifier,
        tint = color
    )
}