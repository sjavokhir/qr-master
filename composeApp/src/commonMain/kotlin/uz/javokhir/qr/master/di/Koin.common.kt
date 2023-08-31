package uz.javokhir.qr.master.di

import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module
import uz.javokhir.qr.master.data.database.dao.HistoryDao
import uz.javokhir.qr.master.data.store.AppStore

expect fun platformModule(): Module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) =
    startKoin {
        appDeclaration()
        modules(
            storeModule(),
            databaseModule(),
            platformModule()
        )
    }

fun storeModule() = module {
    singleOf(::AppStore)
}

fun databaseModule() = module {
    singleOf(::HistoryDao)
}