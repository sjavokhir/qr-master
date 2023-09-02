package uz.javokhir.qr.master.screens.scanner

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import uz.javokhir.qr.master.domain.scanner.ScannerState
import uz.javokhir.qr.master.shared.ui.QrCameraView
import uz.javokhir.qr.master.ui.components.AppIcon
import uz.javokhir.qr.master.ui.extensions.clickableSingle
import uz.javokhir.qr.master.ui.icons.AppIcons
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun ScannerScreenContent(
    state: ScannerState,
) {
    var flashlightOn by remember { mutableStateOf(false) }

//    val photoPicker = rememberLauncherForActivityResult(
//        ActivityResultContracts.GetMultipleContents()
//    ) { uris ->
//        val uri = uris.firstOrNull() ?: return@rememberLauncherForActivityResult
//
//        onNavigate(
//            ImageCropperScreenDestination(
//                imageUri = uri.toString(),
//                isVibrateEnabled = state.isVibrateEnabled,
//                isOpenWebPagesEnabled = state.isOpenWebPagesEnabled,
//                isChromeCustomTabsEnabled = state.isChromeCustomTabsEnabled
//            )
//        )
//    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        QrCameraView(
            modifier = Modifier.fillMaxSize(),
            flashlightOn = flashlightOn,
            vibrateEnabled = state.vibrateEnabled,
            openWebPagesEnabled = state.openWebPagesEnabled,
            chromeCustomTabsEnabled = state.chromeCustomTabsEnabled
        ) { encoded, decoded, mode ->
//            onNavigate(
//                QRCodeScreenDestination(
//                    id = randomUUID(),
//                    dateTime = defaultDateTime(),
//                    isScanned = true,
//                    generateMode = mode,
//                    encoded = encoded,
//                    decoded = decoded,
//                    customize = QRCustomizeModel(),
//                    isEditable = false,
//                    isDeletable = false
//                )
//            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Text(
                text = AppStrings.alignQrCode,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .clip(MaterialTheme.shapes.small)
                    .background(Color.Black.copy(alpha = .25f))
                    .padding(
                        vertical = 4.dp,
                        horizontal = 8.dp
                    )
            )

            Image(
                imageVector = AppIcons.scannerLines,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(horizontal = 32.dp)
            )

            ScannerActionsContent(
                onGalleryClick = {
//                    photoPicker.launch("image/*")
                },
                onFlashlightClick = {
                    flashlightOn = !flashlightOn
                },
            )
        }
    }
}

@Composable
private fun ScannerActionsContent(
    onGalleryClick: () -> Unit,
    onFlashlightClick: () -> Unit,
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(
            space = 20.dp,
            alignment = Alignment.CenterHorizontally
        )
    ) {
        Box(
            modifier = Modifier
                .size(56.dp)
                .clip(MaterialTheme.shapes.medium)
                .border(
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.outline,
                    shape = MaterialTheme.shapes.medium
                )
                .background(Color.Black.copy(alpha = 0.1f))
                .clickableSingle(onClick = onGalleryClick),
            contentAlignment = Alignment.Center
        ) {
            AppIcon(
                imageVector = AppIcons.gallery,
                color = Color.White
            )
        }

        Box(
            modifier = Modifier
                .size(56.dp)
                .clip(MaterialTheme.shapes.medium)
                .border(
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.outline,
                    shape = MaterialTheme.shapes.medium
                )
                .background(Color.Black.copy(alpha = 0.25f))
                .clickableSingle(onClick = onFlashlightClick),
            contentAlignment = Alignment.Center
        ) {
            AppIcon(
                imageVector = AppIcons.flashlight,
                color = Color.White
            )
        }
    }
}