import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController
import uz.javokhir.qr.master.di.initKoin
import uz.javokhir.qr.master.screens.App

fun MainViewController(): UIViewController {

    initKoin()

    return ComposeUIViewController { App() }
}
