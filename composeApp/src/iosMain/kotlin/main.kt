import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController
import uz.javokhir.kqr.master.di.initKoin
import uz.javokhir.kqr.master.screens.App

fun MainViewController(): UIViewController {

    initKoin()

    return ComposeUIViewController { App() }
}
