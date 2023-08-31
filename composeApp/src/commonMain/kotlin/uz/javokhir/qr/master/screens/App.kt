package uz.javokhir.qr.master.screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import uz.javokhir.qr.master.data.model.mode.ThemeMode
import uz.javokhir.qr.master.screens.onBoarding.OnBoardingScreen
import uz.javokhir.qr.master.ui.theme.AppTheme

@Composable
fun App(
    onBoarding: Boolean,
    themeMode: ThemeMode,
) {
    AppTheme(themeMode) {
        Navigator(if (onBoarding) OnBoardingScreen else OnBoardingScreen) {
            Scaffold { CurrentScreen() }
        }
    }
}