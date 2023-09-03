package uz.javokhir.qr.master

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.core.view.WindowCompat
import org.koin.android.ext.android.inject
import uz.javokhir.qr.master.data.store.AppStore
import uz.javokhir.qr.master.shared.platform.Event
import uz.javokhir.qr.master.shared.platform.EventChannel
import uz.javokhir.qr.master.ui.navigation.App

class AppActivity : ComponentActivity() {

    private val appStore by inject<AppStore>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        val onBoarding = appStore.isOnBoarding()
        val themeMode = appStore.getSelectedThemeMode()

        setContent {
            val event = EventChannel.receiveEvent().collectAsState(Event.Idle).value

            var currentThemeMode by remember { mutableStateOf(themeMode) }

            when (event) {
                is Event.ThemeModeChanged -> currentThemeMode = event.themeMode
                is Event.Idle -> {}
            }

            App(onBoarding, currentThemeMode)
        }
    }
}