package uz.javokhir.qr.master.ui.navigation

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import uz.javokhir.qr.master.screens.creator.CreatorScreen
import uz.javokhir.qr.master.screens.creator.addContent.AddContentScreen
import uz.javokhir.qr.master.screens.customize.CustomizeScreen
import uz.javokhir.qr.master.screens.history.HistoryScreen
import uz.javokhir.qr.master.screens.onBoarding.OnBoardingScreen
import uz.javokhir.qr.master.screens.pickerDateTime.DateTimePickerScreen
import uz.javokhir.qr.master.screens.pickerLocation.LocationPickerScreen
import uz.javokhir.qr.master.screens.qrCode.QrCodeScreen
import uz.javokhir.qr.master.screens.scanner.ScannerScreen
import uz.javokhir.qr.master.screens.settings.SettingsScreen
import uz.javokhir.qr.master.screens.settings.theme.ThemeModeScreen
import uz.javokhir.qr.master.ui.components.AppTopAppBar
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun AppTopBar(
    navigator: Navigator,
) {
    if (navigator.shouldShowTopBar) {
        AppTopAppBar(
            title = navigator.topBarTitle(),
            onNavigateUp = if (navigator.shouldShowNavigateUp) {
                { navigator.pop() }
            } else null
        )
    }
}

@Composable
private fun Navigator.topBarTitle(): String {
    return when (lastItemOrNull) {
        is ScannerScreen -> AppStrings.scanner
        is CreatorScreen -> AppStrings.creator
        is HistoryScreen -> AppStrings.history
        is SettingsScreen -> AppStrings.settings
        is AddContentScreen -> AppStrings.addContent
        is DateTimePickerScreen -> AppStrings.selectDateAndTime
        is LocationPickerScreen -> AppStrings.selectLocation
        is QrCodeScreen -> AppStrings.qrCode
        is CustomizeScreen -> AppStrings.customizeQr
        is ThemeModeScreen -> AppStrings.theme
//        ImageCropperScreen -> AppStrings.scanImage
        else -> ""
    }
}

private val Navigator.shouldShowTopBar
    get() = when (lastItemOrNull) {
        OnBoardingScreen -> false
        else -> true
    }

private val Navigator.shouldShowNavigateUp
    get() = when (lastItemOrNull) {
        OnBoardingScreen,
        ScannerScreen,
        CreatorScreen,
        HistoryScreen,
        SettingsScreen,
        -> false

        else -> true
    }