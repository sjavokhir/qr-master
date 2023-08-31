package uz.javokhir.kqr.master.camera.core

import android.annotation.SuppressLint
import android.app.ActivityManager
import android.content.Context
import android.graphics.Bitmap
import androidx.camera.core.ImageProxy
import com.google.android.gms.tasks.Task
import com.google.android.gms.tasks.TaskExecutors
import com.google.mlkit.vision.common.InputImage

/**
 * Abstract base class for ML Kit frame processors. Subclasses need to implement {@link
 * #onSuccess(T, FrameMetadata, GraphicOverlay)} to define what they want to with the detection
 * results and {@link #detectInImage(VisionImage)} to specify the detector object.
 *
 * @param <T> The type of the detected feature.
 */
abstract class VisionProcessorBase<T>(context: Context) : VisionImageProcessor {

    private val activityManager =
        context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager

    private val executor = ScopedExecutor(TaskExecutors.MAIN_THREAD)

    // Whether this processor is already shut down
    private var isShutdown = false

    override fun processBitmap(bitmap: Bitmap) {
        requestDetectInImage(InputImage.fromBitmap(bitmap, 0))
    }

    @SuppressLint("UnsafeOptInUsageError")
    override fun processImageProxy(image: ImageProxy) {
        if (isShutdown) return

        requestDetectInImage(
            InputImage.fromMediaImage(image.image!!, image.imageInfo.rotationDegrees)
        )
            // When the image is from CameraX analysis use case, must call image.close() on received
            // images when finished using them. Otherwise, new images may not be received or the camera
            // may stall.
            .addOnCompleteListener { image.close() }
    }

    private fun requestDetectInImage(image: InputImage): Task<T> {
        return setUpListener(detectInImage(image))
    }

    private fun setUpListener(task: Task<T>): Task<T> {
        return task.addOnSuccessListener(executor) { results: T ->
            this@VisionProcessorBase.onSuccess(results)
        }.addOnFailureListener(executor) { e ->
            this@VisionProcessorBase.onFailure(e)
        }
    }

    override fun stop() {
        executor.shutdown()
        isShutdown = true
    }

    protected abstract fun detectInImage(image: InputImage): Task<T>

    protected abstract fun onSuccess(results: T)

    protected abstract fun onFailure(t: Throwable)
}