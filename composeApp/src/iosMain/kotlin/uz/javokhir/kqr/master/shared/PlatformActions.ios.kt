package uz.javokhir.kqr.master.shared

import platform.Foundation.NSURL
import platform.UIKit.UIActivityViewController
import platform.UIKit.UIAlertAction
import platform.UIKit.UIAlertActionStyleDefault
import platform.UIKit.UIAlertController
import platform.UIKit.UIAlertControllerStyleAlert
import platform.UIKit.UIApplication
import platform.UIKit.UIPasteboard
import platform.UIKit.UIWindow
import uz.javokhir.kqr.master.ui.localization.AppStrings

actual fun toast(message: String) {
    val window = UIApplication.sharedApplication.windows.last() as? UIWindow
    val currentViewController = window?.rootViewController
    val alert = UIAlertController.alertControllerWithTitle(
        title = null,
        message = message,
        preferredStyle = UIAlertControllerStyleAlert
    )
    alert.addAction(
        UIAlertAction.actionWithTitle(
            title = AppStrings.ok,
            style = UIAlertActionStyleDefault,
            handler = null
        )
    )
    currentViewController?.presentViewController(
        viewControllerToPresent = alert,
        animated = true,
        completion = null,
    )
}

actual fun openUrl(url: String) {
    val nsUrl = NSURL.URLWithString(url) ?: return
    UIApplication.sharedApplication.openURL(nsUrl)
}

actual fun shareText(text: String) {
    val window = UIApplication.sharedApplication.windows.last() as? UIWindow
    val currentViewController = window?.rootViewController
    val activityViewController = UIActivityViewController(
        activityItems = listOf(text),
        applicationActivities = null
    )
    currentViewController?.presentViewController(
        viewControllerToPresent = activityViewController,
        animated = true,
        completion = null,
    )
}

actual fun copyText(text: String) {
    UIPasteboard.generalPasteboard.setString(text)
    toast(AppStrings.copiedToClipboard)
}