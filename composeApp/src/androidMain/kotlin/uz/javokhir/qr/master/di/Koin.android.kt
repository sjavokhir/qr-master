package uz.javokhir.qr.master.di

import android.content.Context
import com.russhwolf.settings.ObservableSettings
import com.russhwolf.settings.SharedPreferencesSettings
import org.koin.dsl.module
import uz.javokhir.qr.master.data.utils.Keys

actual fun platformModule() = module {
    single { createSettings(get()) }
//    single { AppDatabase(AndroidSqliteDriver(AppDatabase.Schema, get(), Keys.APP_DATABASE)) }
}

private fun createSettings(context: Context): ObservableSettings {
    val delegate = context.getSharedPreferences(Keys.SHARED_PREFS_NAME, Context.MODE_PRIVATE)
    return SharedPreferencesSettings(delegate = delegate)
}