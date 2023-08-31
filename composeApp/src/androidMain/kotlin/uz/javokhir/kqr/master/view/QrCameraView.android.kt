package uz.javokhir.kqr.master.view

import android.annotation.SuppressLint
import androidx.camera.core.*
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.isGranted
import com.google.accompanist.permissions.rememberPermissionState
import uz.javokhir.kqr.master.camera.detector.QrDetector
import uz.javokhir.kqr.master.core.extensions.tryCatch
import uz.javokhir.kqr.master.data.model.mode.GenerateMode
import java.util.*
import java.util.concurrent.Executors
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

private val executor = Executors.newSingleThreadExecutor()

@OptIn(ExperimentalPermissionsApi::class)
@Composable
actual fun QrCameraView(
    modifier: Modifier,
    flashlightOn: Boolean,
    vibrateEnabled: Boolean,
    openWebPagesEnabled: Boolean,
    chromeCustomTabsEnabled: Boolean,
    onResult: (String, String, GenerateMode) -> Unit,
) {
    val cameraPermissionState = rememberPermissionState(
        android.Manifest.permission.CAMERA
    )

    if (cameraPermissionState.status.isGranted) {
        CameraWithGrantedPermission(
            modifier = modifier,
            flashlightOn = flashlightOn,
            vibrateEnabled = vibrateEnabled,
            openWebPagesEnabled = openWebPagesEnabled,
            chromeCustomTabsEnabled = chromeCustomTabsEnabled,
            onResult = onResult
        )
    } else {
        LaunchedEffect(Unit) {
            cameraPermissionState.launchPermissionRequest()
        }
    }
}

@SuppressLint("MissingPermission")
@Composable
private fun CameraWithGrantedPermission(
    modifier: Modifier,
    flashlightOn: Boolean,
    vibrateEnabled: Boolean,
    openWebPagesEnabled: Boolean,
    chromeCustomTabsEnabled: Boolean,
    onResult: (String, String, GenerateMode) -> Unit,
) {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current

    var camera by remember { mutableStateOf<Camera?>(null) }

    val preview = remember {
        Preview.Builder()
            .setTargetAspectRatio(AspectRatio.RATIO_4_3)
            .build()
    }
    val previewView = remember { PreviewView(context) }
    val imageAnalysis = remember {
        ImageAnalysis.Builder()
            .setTargetAspectRatio(AspectRatio.RATIO_4_3)
            .build()
    }
    val cameraSelector = remember {
        CameraSelector.Builder()
            .requireLensFacing(CameraSelector.LENS_FACING_BACK)
            .build()
    }
    val detector = remember {
        QrDetector(
            context = context,
            vibrateEnabled = vibrateEnabled,
            openWebPagesEnabled = openWebPagesEnabled,
            chromeCustomTabsEnabled = chromeCustomTabsEnabled,
            onResult = onResult
        )
    }

    LaunchedEffect(Unit) {
        imageAnalysis.setAnalyzer(ContextCompat.getMainExecutor(context)) {
            tryCatch {
                detector.processImageProxy(it)
            }
        }

        val cameraProvider = suspendCoroutine<ProcessCameraProvider> { continuation ->
            ProcessCameraProvider.getInstance(context).also { cameraProvider ->
                cameraProvider.addListener({
                    continuation.resume(cameraProvider.get())
                }, executor)
            }
        }

        cameraProvider.unbindAll()
        camera = cameraProvider.bindToLifecycle(
            lifecycleOwner,
            cameraSelector,
            preview,
            imageAnalysis
        )

        preview.setSurfaceProvider(previewView.surfaceProvider)
    }

    LaunchedEffect(flashlightOn) {
        camera?.cameraControl?.enableTorch(flashlightOn)
    }

    Box(
        modifier = modifier
    ) {
        AndroidView(
            { previewView },
            modifier = Modifier.fillMaxSize()
        )
    }
}
