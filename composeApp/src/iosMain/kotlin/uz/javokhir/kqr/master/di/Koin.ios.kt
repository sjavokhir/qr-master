package uz.javokhir.kqr.master.di

import com.russhwolf.settings.NSUserDefaultsSettings
import com.russhwolf.settings.ObservableSettings
import org.koin.dsl.module
import platform.Foundation.NSUserDefaults

actual fun platformModule() = module {
    single { createSettings() }
//    single { AppDatabase(NativeSqliteDriver(AppDatabase.Schema, Keys.APP_DATABASE)) }
}

private fun createSettings(): ObservableSettings {
    val delegate = NSUserDefaults.standardUserDefaults
    return NSUserDefaultsSettings(delegate = delegate)
}