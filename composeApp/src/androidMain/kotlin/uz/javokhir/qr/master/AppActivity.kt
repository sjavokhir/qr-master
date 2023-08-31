package uz.javokhir.qr.master

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import org.koin.android.ext.android.inject
import uz.javokhir.qr.master.data.store.AppStore
import uz.javokhir.qr.master.screens.App

class AppActivity : ComponentActivity() {

    private val appStore by inject<AppStore>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        val onBoarding = appStore.isOnBoarding()
        val themeMode = appStore.getSelectedThemeMode()

        setContent { App(onBoarding, themeMode) }
    }
}