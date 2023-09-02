package uz.javokhir.qr.master.screens.cropper

//import android.graphics.ImageDecoder
//import android.net.Uri
//import android.os.Build
//import android.provider.MediaStore
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.asAndroidBitmap
//import androidx.compose.ui.graphics.asImageBitmap
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.platform.LocalDensity
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//
//@Composable
//fun ImageCropperScreen(
//    imageUri: String,
//    isVibrateEnabled: Boolean,
//    isOpenWebPagesEnabled: Boolean,
//    isChromeCustomTabsEnabled: Boolean,
//    navigator: DestinationsNavigator
//) {
//    AppBackground {
//        ImageCropperScreenContent(
//            imageUri = imageUri,
//            isVibrateEnabled = isVibrateEnabled,
//            isOpenWebPagesEnabled = isOpenWebPagesEnabled,
//            isChromeCustomTabsEnabled = isChromeCustomTabsEnabled,
//            onNavigate = {
//                navigator.popBackStack()
//                navigator.navigate(it)
//            }
//        )
//    }
//}
//
//@Composable
//private fun ImageCropperScreenContent(
//    imageUri: String,
//    isVibrateEnabled: Boolean,
//    isOpenWebPagesEnabled: Boolean,
//    isChromeCustomTabsEnabled: Boolean,
//    onNavigate: (Direction) -> Unit
//) {
//    val context = LocalContext.current
//    val strings = LocalStrings.current
//
//    val detector = remember {
//        QRDetector(
//            context = context,
//            isVibrateEnabled = isVibrateEnabled,
//            isOpenWebPagesEnabled = isOpenWebPagesEnabled,
//            isChromeCustomTabsEnabled = isChromeCustomTabsEnabled,
//            onResult = { encoded, decoded, mode ->
//                onNavigate(
//                    QRCodeScreenDestination(
//                        id = randomUUID(),
//                        dateTime = defaultDateTime(),
//                        isScanned = true,
//                        generateMode = mode,
//                        encoded = encoded,
//                        decoded = decoded,
//                        customize = QRCustomizeModel(),
//                        isDeletable = false,
//                        isEditable = false
//                    )
//                )
//            }
//        )
//    }
//
//    val handleSize = LocalDensity.current.run { 20.dp.toPx() }
//    val cropProperties by remember {
//        mutableStateOf(
//            CropDefaults.properties(
//                cropOutlineProperty = CropOutlineProperty(
//                    OutlineType.Rect,
//                    RectCropShape(0, "Rect")
//                ),
//                handleSize = handleSize
//            )
//        )
//    }
//    var crop by remember { mutableStateOf(false) }
//
//    val imageBitmap by remember {
//        val bitmap = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
//            ImageDecoder.decodeBitmap(
//                ImageDecoder.createSource(context.contentResolver, Uri.parse(imageUri))
//            ) { decoder, _, _ ->
//                decoder.allocator = ImageDecoder.ALLOCATOR_SOFTWARE
//                decoder.isMutableRequired = true
//            }
//        } else {
//            @Suppress("DEPRECATION")
//            MediaStore.Images.Media.getBitmap(context.contentResolver, Uri.parse(imageUri))
//        }
//
//        mutableStateOf(bitmap.asImageBitmap())
//    }
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.spacedBy(24.dp)
//    ) {
//        Text(
//            text = AppStrings.dragMarkers,
//            style = MaterialTheme.typography.bodyLarge,
//            fontWeight = FontWeight.Medium,
//            textAlign = TextAlign.Center,
//            modifier = Modifier.padding(20.dp)
//        )
//
//        ImageCropper(
//            modifier = Modifier
//                .fillMaxWidth()
//                .weight(1f)
//                .background(MaterialTheme.colorScheme.background)
//                .clip(MaterialTheme.shapes.small),
//            imageBitmap = imageBitmap,
//            contentDescription = "Image Cropper",
//            cropStyle = CropDefaults.style(
//                overlayColor = MaterialTheme.colorScheme.outline,
//                handleColor = MaterialTheme.colorScheme.primary,
//            ),
//            cropProperties = cropProperties,
//            crop = crop,
//            onCropStart = {},
//            onCropSuccess = {
//                detector.processBitmap(it.asAndroidBitmap())
//            },
//        )
//
//        QRFilledButton(
//            text = AppStrings.scan,
//            modifier = Modifier.padding(20.dp),
//            onClick = { crop = true }
//        )
//    }
//}