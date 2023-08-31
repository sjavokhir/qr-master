package uz.javokhir.kqr.master.camera.core

import android.graphics.Bitmap
import androidx.camera.core.ImageProxy

/**
 * An interface to process the images with different vision detectors and custom image models.
 */
interface VisionImageProcessor {
    /**
     * Processes a bitmap image.
     */
    fun processBitmap(bitmap: Bitmap)

    /**
     * Processes ImageProxy image data, e.g. used for CameraX live preview case.
     */
    fun processImageProxy(image: ImageProxy)

    /**
     * Stops the underlying machine learning model and release resources.
     */
    fun stop()
}