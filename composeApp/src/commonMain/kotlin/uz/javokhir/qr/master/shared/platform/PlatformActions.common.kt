package uz.javokhir.qr.master.shared.platform

import androidx.compose.ui.graphics.ImageBitmap

expect fun toast(message: String)

expect fun copyToClipboard(text: String)

expect fun dial(phone: String)

expect fun shareText(text: String)

expect fun openUrl(
    url: String,
    chromeCustomTabsEnabled: Boolean,
)

fun searchGoogle(
    query: String,
    chromeCustomTabsEnabled: Boolean,
) {
    openUrl(
        "https://www.google.com/search?q=$query",
        chromeCustomTabsEnabled
    )
}

expect fun sendMail(
    email: String,
    subject: String = "",
    message: String = "",
)

expect fun sendSms(
    phone: String,
    message: String,
)

expect fun addContact(
    phone: String,
    name: String = "",
    company: String = "",
    job: String = "",
    email: String = "",
    address: String = "",
)

expect fun showLocation(
    latitude: String,
    longitude: String,
)

expect fun showAddress(address: String)

expect fun connectToWifi(
    networkName: String,
    password: String,
    hidden: Boolean,
)

expect fun addToCalendar(
    name: String,
    location: String,
    description: String,
    allDay: Boolean,
    startMillis: Long?,
    endMillis: Long?,
)

expect fun saveQrImage(qrBitmap: ImageBitmap?)

expect fun shareQrImage(qrBitmap: ImageBitmap?)