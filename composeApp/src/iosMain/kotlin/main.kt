import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController
import uz.javokhir.qr.master.data.model.mode.ThemeMode
import uz.javokhir.qr.master.data.store.AppStore
import uz.javokhir.qr.master.di.createSettings
import uz.javokhir.qr.master.di.initKoin
import uz.javokhir.qr.master.ui.navigation.App

fun MainViewController(): UIViewController {

    initKoin()

    val appStore = AppStore(createSettings())
    val onBoarding = appStore.isOnBoarding()

    return ComposeUIViewController { App(onBoarding, ThemeMode.Dark) }
}
