package uz.javokhir.qr.master.shared.platform

expect fun toast(message: String)

expect fun copyToClipboard(text: String)

expect fun dial(phone: String)

expect fun vibrate(milliseconds: Long = 300)

expect fun shareText(text: String)

expect fun openUrl(
    url: String,
    chromeCustomTabsEnabled: Boolean,
)

expect fun searchGoogle(
    query: String,
    chromeCustomTabsEnabled: Boolean,
)

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
expect fun saveQrImage()

expect fun shareQrImage()