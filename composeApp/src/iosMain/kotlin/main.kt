import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController
import uz.javokhir.qr.master.data.store.AppStore
import uz.javokhir.qr.master.di.createSettings
import uz.javokhir.qr.master.di.initKoin
import uz.javokhir.qr.master.screens.App

fun MainViewController(): UIViewController {

    initKoin()

    val appStore = AppStore(createSettings())

    val onBoarding = appStore.isOnBoarding()
    val themeMode = appStore.getSelectedThemeMode()

    return ComposeUIViewController { App(onBoarding, themeMode) }
}
