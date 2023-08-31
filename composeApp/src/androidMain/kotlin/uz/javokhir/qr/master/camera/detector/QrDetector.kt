package uz.javokhir.qr.master.camera.detector

import android.content.Context
import com.google.android.gms.tasks.Task
import com.google.mlkit.vision.barcode.BarcodeScannerOptions
import com.google.mlkit.vision.barcode.BarcodeScanning
import com.google.mlkit.vision.barcode.common.Barcode
import com.google.mlkit.vision.common.InputImage
import uz.javokhir.qr.master.camera.core.VisionProcessorBase
import uz.javokhir.qr.master.core.extensions.tryCatch
import uz.javokhir.qr.master.data.model.mode.GenerateMode

class QrDetector(
    private val context: Context,
    private val vibrateEnabled: Boolean,
    private val openWebPagesEnabled: Boolean,
    private val chromeCustomTabsEnabled: Boolean,
    private val onResult: (String, String, GenerateMode) -> Unit,
) : VisionProcessorBase<MutableList<Barcode>>(context) {

    private var qrCodeDetected: Boolean = false

    init {
        qrCodeDetected = false
    }

    private val scanner = BarcodeScanning.getClient(
        BarcodeScannerOptions
            .Builder()
            .setBarcodeFormats(Barcode.FORMAT_ALL_FORMATS)
            .enableAllPotentialBarcodes()
            .build()
    )

    override fun stop() {
        super.stop()
        scanner.close()
    }

    override fun detectInImage(image: InputImage): Task<MutableList<Barcode>> {
        return scanner.process(image)
    }

    override fun onSuccess(results: MutableList<Barcode>) {
        if (!qrCodeDetected) {
            tryCatch {
                filterResults(results)?.let { onBarcodeParser(it) }
            }
        }
    }

    override fun onFailure(t: Throwable) {}

    private fun filterResults(results: List<Barcode>): Barcode? {
        return results.filter { it.boundingBox != null && !it.rawValue.isNullOrEmpty() }
            .maxByOrNull { it.boundingBox!!.width() * it.boundingBox!!.height() }
    }

    private fun onBarcodeParser(code: Barcode) {
        tryCatch {
            val generateMode: GenerateMode
            val encoded: String
            val decoded: String
            val isNotBlank: Boolean
            var isUrl = false
        }
    }
}