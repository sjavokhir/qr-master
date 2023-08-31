package uz.javokhir.qr.master.shared

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.widget.Toast
import uz.javokhir.qr.master.AndroidApp
import uz.javokhir.qr.master.core.extensions.tryCatch
import uz.javokhir.qr.master.ui.localization.AppStrings

actual fun toast(message: String) {
    tryCatch {
        Toast.makeText(AndroidApp.INSTANCE, message, Toast.LENGTH_LONG).show()
    }
}

actual fun openUrl(url: String) {
    tryCatch {
        val intent = Intent().apply {
            action = Intent.ACTION_VIEW
            data = Uri.parse(url)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        AndroidApp.INSTANCE.startActivity(intent)
    }
}

actual fun shareText(text: String) {
    tryCatch {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, text)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        val shareIntent = Intent.createChooser(intent, null).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        AndroidApp.INSTANCE.startActivity(shareIntent)
    }
}

actual fun copyText(text: String) {
    tryCatch {
        val clipboard =
            AndroidApp.INSTANCE.getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager
        val clip = ClipData.newPlainText(AppStrings.appName, text)
        clipboard?.setPrimaryClip(clip)

        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.S_V2) {
            toast(AppStrings.copiedText)
        }
    }
}