package uz.javokhir.qr.master.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import uz.javokhir.qr.master.data.model.mode.ThemeMode
import uz.javokhir.qr.master.screens.onBoarding.OnBoardingScreen
import uz.javokhir.qr.master.screens.scanner.ScannerScreen
import uz.javokhir.qr.master.ui.theme.AppTheme

@Composable
fun App(
    onBoarding: Boolean,
    themeMode: ThemeMode,
) {
    AppTheme(themeMode) {
        Navigator(if (onBoarding) OnBoardingScreen else ScannerScreen) {
            Scaffold(
                topBar = {
                    AppTopBar(it)
                },
                bottomBar = {
                    AppBottomBar(it)
                },
                containerColor = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.onBackground,
            ) {
                Box(
                    modifier = Modifier
                        .padding(it)
                        .fillMaxSize()
                ) {
                    CurrentScreen()
                }
            }
        }
    }
}