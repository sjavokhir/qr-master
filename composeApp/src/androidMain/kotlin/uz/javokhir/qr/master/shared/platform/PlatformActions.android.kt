package uz.javokhir.qr.master.shared.platform

import android.content.BroadcastReceiver
import android.content.ClipData
import android.content.ClipboardManager
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Bitmap
import android.media.MediaScannerConnection
import android.net.Uri
import android.net.wifi.WifiConfiguration
import android.net.wifi.WifiManager
import android.net.wifi.WifiNetworkSuggestion
import android.os.Build
import android.os.Environment
import android.os.StrictMode
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.provider.CalendarContract
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Toast
import androidx.browser.customtabs.CustomTabsIntent
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asAndroidBitmap
import uz.javokhir.qr.master.AndroidApp
import uz.javokhir.qr.master.core.datetime.toCalendarTimestamp
import uz.javokhir.qr.master.core.extensions.tryCatch
import uz.javokhir.qr.master.ui.localization.AppStrings
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream

actual fun toast(message: String) {
    tryCatch {
        Toast.makeText(AndroidApp.INSTANCE, message, Toast.LENGTH_LONG).show()
    }
}

actual fun copyToClipboard(text: String) {
    tryCatch {
        val clipboard =
            AndroidApp.INSTANCE.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText(AppStrings.copiedText, text)
        clipboard.setPrimaryClip(clip)

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) {
            toast(AppStrings.copiedToClipboard)
        }
    }
}

actual fun dial(phone: String) {
    tryCatch {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phone")
        }
        AndroidApp.INSTANCE.startActivity(intent)
    }
}

actual fun shareText(text: String) {
    tryCatch {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, text)
        }
        AndroidApp.INSTANCE.startActivity(Intent.createChooser(intent, null))
    }
}

actual fun openUrl(
    url: String,
    chromeCustomTabsEnabled: Boolean,
) {
    tryCatch {
        val uri = if (url.startsWith("http://") || url.startsWith("https://")) {
            Uri.parse(url)
        } else {
            Uri.parse("https://$url")
        }

        if (chromeCustomTabsEnabled) {
            val intent = CustomTabsIntent.Builder().build()
            intent.launchUrl(AndroidApp.INSTANCE, uri)
        } else {
            val intent = Intent(Intent.ACTION_VIEW).apply { data = uri }
            AndroidApp.INSTANCE.startActivity(intent)
        }
    }
}

actual fun sendMail(
    email: String,
    subject: String,
    message: String,
) {
    tryCatch {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "message/rfc822"
            putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            putExtra(Intent.EXTRA_SUBJECT, subject)
            putExtra(Intent.EXTRA_TEXT, message)
        }
        AndroidApp.INSTANCE.startActivity(
            Intent.createChooser(intent, AppStrings.sendEmail)
        )
    }
}

actual fun sendSms(
    phone: String,
    message: String,
) {
    tryCatch {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("smsto:$phone")
            putExtra("sms_body", message)
        }
        AndroidApp.INSTANCE.startActivity(intent)
    }
}

actual fun addContact(
    phone: String,
    name: String,
    company: String,
    job: String,
    email: String,
    address: String,
) {
    tryCatch {
        val intent = Intent(ContactsContract.Intents.Insert.ACTION).apply {
            type = ContactsContract.RawContacts.CONTENT_TYPE
            putExtra(ContactsContract.Intents.Insert.NAME, name)
            putExtra(ContactsContract.Intents.Insert.PHONE, phone)

            if (company.isNotEmpty()) {
                putExtra(ContactsContract.Intents.Insert.COMPANY, company)
            }
            if (job.isNotEmpty()) {
                putExtra(ContactsContract.Intents.Insert.JOB_TITLE, job)
            }
            if (email.isNotEmpty()) {
                putExtra(ContactsContract.Intents.Insert.EMAIL, email)
            }
            if (address.isNotEmpty()) {
                putExtra(ContactsContract.Intents.Insert.NOTES, address)
            }
        }
        AndroidApp.INSTANCE.startActivity(intent)
    }
}

actual fun showLocation(
    latitude: String,
    longitude: String,
) {
    tryCatch {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("geo:$latitude,$longitude")
        }
        AndroidApp.INSTANCE.startActivity(intent)
    }
}

actual fun showAddress(address: String) {
    tryCatch {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("geo:0,0?q=$address")
        }
        AndroidApp.INSTANCE.startActivity(intent)
    }
}

@Suppress("DEPRECATION")
actual fun connectToWifi(
    networkName: String,
    password: String,
    hidden: Boolean,
) {
    tryCatch {
        val wifiManager = AndroidApp.INSTANCE.getSystemService(Context.WIFI_SERVICE) as WifiManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            val suggestion = WifiNetworkSuggestion.Builder()
                .setSsid(networkName)
                .setIsHiddenSsid(hidden)
                .setWpa2Passphrase(password)

            val suggestions = listOf(suggestion.build())
            wifiManager.addNetworkSuggestions(suggestions)

            val intentFilter =
                IntentFilter(WifiManager.ACTION_WIFI_NETWORK_SUGGESTION_POST_CONNECTION)

            val broadcastReceiver = object : BroadcastReceiver() {
                override fun onReceive(context: Context, intent: Intent) {
                    if (!intent.action.equals(WifiManager.ACTION_WIFI_NETWORK_SUGGESTION_POST_CONNECTION)) {
                        return
                    }
                }
            }
            AndroidApp.INSTANCE.registerReceiver(broadcastReceiver, intentFilter)
        } else {
            val wifiConfig = WifiConfiguration()
            wifiConfig.SSID = "\"$networkName\""
            wifiConfig.status = WifiConfiguration.Status.ENABLED
            wifiConfig.hiddenSSID = hidden
            wifiConfig.allowedKeyManagement.set(WifiConfiguration.KeyMgmt.WPA_PSK)
            wifiConfig.preSharedKey = "\"$password\""

            if (!wifiManager.isWifiEnabled) {
                wifiManager.isWifiEnabled = true
            }

            val networkId = wifiManager.addNetwork(wifiConfig)
            wifiManager.disconnect()
            wifiManager.enableNetwork(networkId, true)
            wifiManager.reconnect()
        }
    }
}

actual fun addToCalendar(
    name: String,
    location: String,
    description: String,
    allDay: Boolean,
    startMillis: Long?,
    endMillis: Long?,
) {
    tryCatch {
        val intent = Intent(Intent.ACTION_INSERT).apply {
            data = CalendarContract.Events.CONTENT_URI

            putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, allDay)

            if (startMillis != null && startMillis != 0L) {
                putExtra(
                    CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                    startMillis.toCalendarTimestamp()
                )
            }

            if (endMillis != null && endMillis != 0L) {
                putExtra(
                    CalendarContract.EXTRA_EVENT_END_TIME,
                    endMillis.toCalendarTimestamp()
                )
            }

            putExtra(CalendarContract.Events.TITLE, name)

            if (description.isNotEmpty()) {
                putExtra(CalendarContract.Events.DESCRIPTION, description)
            }

            if (location.isNotEmpty()) {
                putExtra(CalendarContract.Events.EVENT_LOCATION, location)
            }
        }
        AndroidApp.INSTANCE.startActivity(intent)
    }
}

actual fun saveQrImage(qrBitmap: ImageBitmap?) {
    val bitmap = qrBitmap?.asAndroidBitmap() ?: return
    saveBitmapToGallery(AndroidApp.INSTANCE, bitmap)
}

actual fun shareQrImage(qrBitmap: ImageBitmap?) {
    val bitmap = qrBitmap?.asAndroidBitmap() ?: return
    val uri = saveBitmapToGallery(AndroidApp.INSTANCE, bitmap)

    tryCatch {
        // Grant temporary permissions to access the file URI
        StrictMode.setVmPolicy(StrictMode.VmPolicy.Builder().build())

        val shareIntent = Intent(Intent.ACTION_SEND).apply {
            type = "image/jpeg"
            putExtra(Intent.EXTRA_STREAM, uri)
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        }
        AndroidApp.INSTANCE.startActivity(Intent.createChooser(shareIntent, "Share QR"))
    }
}

private fun saveBitmapToGallery(
    context: Context,
    bitmap: Bitmap,
): Uri {
    val title = "QR_${System.currentTimeMillis()}"

    // Get the image's directory
    val imageDirectory = Environment.getExternalStoragePublicDirectory(
        Environment.DIRECTORY_PICTURES
    )
    val imageFile = File(imageDirectory, "$title.jpg")

    val contentValues = ContentValues().apply {
        put(MediaStore.Images.Media.DISPLAY_NAME, title)
        put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg")
        put(MediaStore.Images.Media.DATA, imageFile.absolutePath)
    }

    var outputStream: OutputStream? = null
    try {
        outputStream = FileOutputStream(imageFile)
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
        outputStream.flush()

        // Insert image into the MediaStore
        context.contentResolver.apply {
            insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
        }

        // Notify the gallery about the new image
        MediaScannerConnection.scanFile(
            context,
            arrayOf(imageFile.absolutePath),
            null,
            null
        )

        toast(AppStrings.photoSaved)
    } catch (t: Throwable) {
        t.printStackTrace()
    } finally {
        outputStream?.close()
    }

    return Uri.fromFile(imageFile)
}