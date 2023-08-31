package uz.javokhir.qr.master.di

import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.russhwolf.settings.NSUserDefaultsSettings
import com.russhwolf.settings.ObservableSettings
import org.koin.dsl.module
import platform.Foundation.NSUserDefaults
import uz.javokhir.qr.master.data.utils.Keys
import uz.javokhir.qr.master.db.AppDatabase

actual fun platformModule() = module {
    single { createSettings() }
    single { AppDatabase(NativeSqliteDriver(AppDatabase.Schema, Keys.APP_DATABASE)) }
}

fun createSettings(): ObservableSettings {
    val delegate = NSUserDefaults.standardUserDefaults
    return NSUserDefaultsSettings(delegate = delegate)
}