package uz.javokhir.kqr.master.data.store

import com.russhwolf.settings.ObservableSettings
import com.russhwolf.settings.set
import uz.javokhir.kqr.master.data.model.mode.ThemeMode
import uz.javokhir.kqr.master.data.utils.Keys

class AppStore(private val settings: ObservableSettings) {

    fun isOnBoarding(): Boolean {
        return settings.getBoolean(Keys.IS_ON_BOARDING, true)
    }

    fun setOnBoarding(isOnBoarding: Boolean) {
        settings[Keys.IS_ON_BOARDING] = isOnBoarding
    }

    fun getSelectedThemeMode(): ThemeMode {
        return try {
            val themeMode = settings.getString(Keys.SELECTED_THEME_MODE, ThemeMode.System.name)
            ThemeMode.valueOf(themeMode)
        } catch (_: Throwable) {
            ThemeMode.System
        }
    }

    fun setSelectedThemeMode(themeMode: ThemeMode) {
        settings[Keys.SELECTED_THEME_MODE] = themeMode.name
    }

    fun isVibrateEnabled(): Boolean {
        return settings.getBoolean(Keys.IS_VIBRATE, true)
    }

    fun setVibrate(isEnabled: Boolean) {
        settings[Keys.IS_VIBRATE] = isEnabled
    }

    fun isOpenWebPagesEnabled(): Boolean {
        return settings.getBoolean(Keys.IS_OPEN_WEB_PAGES, false)
    }

    fun setOpenWebPages(isEnabled: Boolean) {
        settings[Keys.IS_OPEN_WEB_PAGES] = isEnabled
    }

    fun isChromeCustomTabsEnabled(): Boolean {
        return settings.getBoolean(Keys.IS_CHROME_CUSTOM_TABS, false)
    }

    fun setChromeCustomTabs(isEnabled: Boolean) {
        settings[Keys.IS_CHROME_CUSTOM_TABS] = isEnabled
    }

    fun isBatchScanEnabled(): Boolean {
        return settings.getBoolean(Keys.IS_BATCH_SCAN, false)
    }

    fun setBatchScan(isEnabled: Boolean) {
        settings[Keys.IS_BATCH_SCAN] = isEnabled
    }
}