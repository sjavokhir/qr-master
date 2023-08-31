package uz.javokhir.qr.master.screens.picker.colorPicker.pickers

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.screens.picker.colorPicker.extensions.drawTransparentBackground

private const val THUMB_RADIUS = 22f

@Composable
fun ColorSlideBar(
    thumbColor: Color = MaterialTheme.colorScheme.background,
    colors: List<Color>,
    onProgress: (Float) -> Unit,
) {
    var progress by remember { mutableFloatStateOf(1f) }
    var slideBarSize by remember { mutableStateOf(IntSize.Zero) }

    LaunchedEffect(progress) {
        onProgress(progress)
    }

    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(24.dp)
            .onSizeChanged {
                slideBarSize = it
            }
//            .pointerInteropFilter {
//                when (it.action) {
//                    MotionEvent.ACTION_DOWN, MotionEvent.ACTION_MOVE -> {
//                        progress = (it.x / slideBarSize.width).coerceIn(0f, 1f)
//                    }
//                }
//                return@pointerInteropFilter true
//            }
            .clipToBounds()
            .clip(RoundedCornerShape(100))
    ) {
        drawTransparentBackground(3)
        drawRect(
            Brush.horizontalGradient(
                colors = colors,
                startX = size.height / 2,
                endX = size.width - size.height / 2
            )
        )
        drawCircle(
            color = thumbColor,
            radius = THUMB_RADIUS,
            center = Offset(
                THUMB_RADIUS + (size.height / 2 - THUMB_RADIUS) + ((size.width - (THUMB_RADIUS + (size.height / 2 - THUMB_RADIUS)) * 2) * progress),
                size.height / 2
            )
        )
    }
}