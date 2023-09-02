package uz.javokhir.qr.master.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator
import uz.javokhir.qr.master.screens.creator.CreatorScreen
import uz.javokhir.qr.master.screens.history.HistoryScreen
import uz.javokhir.qr.master.screens.scanner.ScannerScreen
import uz.javokhir.qr.master.screens.settings.SettingsScreen
import uz.javokhir.qr.master.screens.settings.theme.ThemeModeScreen
import uz.javokhir.qr.master.ui.components.AppNavigationBar
import uz.javokhir.qr.master.ui.components.AppNavigationBarItem
import uz.javokhir.qr.master.ui.icons.AppIcons
import uz.javokhir.qr.master.ui.localization.AppStrings

@Composable
fun AppBottomBar(
    navigator: Navigator,
) {
    AppNavigationBar(show = navigator.shouldShowBottomBar) {
        bottomBarItems().forEach { item ->
            AppNavigationBarItem(
                icon = item.icon,
                label = item.label,
                onClick = {
                    navigator.replaceAll(item.screen)
                },
                selected = navigator.lastItemOrNull == item.screen
            )
        }
    }
}

@Composable
fun bottomBarItems(): List<BottomBarItem> {
    return listOf(
        BottomBarItem(
            screen = ScannerScreen,
            icon = AppIcons.tabScanner,
            label = AppStrings.scanner
        ),
        BottomBarItem(
            screen = CreatorScreen,
            icon = AppIcons.tabCreator,
            label = AppStrings.creator
        ),
        BottomBarItem(
            screen = HistoryScreen,
            icon = AppIcons.tabHistory,
            label = AppStrings.history
        ),
        BottomBarItem(
            screen = SettingsScreen,
            icon = AppIcons.tabSettings,
            label = AppStrings.settings
        )
    )
}

data class BottomBarItem(
    val screen: Screen,
    val icon: ImageVector,
    val label: String,
)

private val Navigator.shouldShowBottomBar
    get() = when (lastItemOrNull) {
        ScannerScreen,
        CreatorScreen,
        HistoryScreen,
        SettingsScreen,
        ThemeModeScreen,
        -> true

        else -> false
    }