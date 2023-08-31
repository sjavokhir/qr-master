package uz.javokhir.qr.master

import android.app.Application
import org.koin.android.ext.koin.androidContext
import uz.javokhir.qr.master.di.initKoin

class AndroidApp : Application() {

    companion object {
        lateinit var INSTANCE: AndroidApp
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this

        initKoin {
            androidContext(this@AndroidApp)
        }
    }
}