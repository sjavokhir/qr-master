package uz.javokhir.qr.master.screens.customize

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import uz.javokhir.qr.master.data.model.common.QrCustomizeModel
import uz.javokhir.qr.master.shared.platform.appUrl
import uz.javokhir.qr.master.shared.ui.rememberQrBitmap
import uz.javokhir.qr.master.ui.components.AppFilledButton
import uz.javokhir.qr.master.ui.components.QrImage
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun QrPreviewDialog(
    customize: QrCustomizeModel,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    val qrBitmap = rememberQrBitmap(
        content = appUrl,
    )

    Dialog(
        onDismissRequest = onDismissRequest,
        properties = properties
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.large)
                .background(MaterialTheme.colorScheme.background)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Text(
                    text = AppStrings.preview,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )

                qrBitmap?.let {
                    QrImage(it)

                    AppFilledButton(
                        text = AppStrings.ok,
                        onClick = onDismissRequest
                    )
                }
            }
        }
    }
}