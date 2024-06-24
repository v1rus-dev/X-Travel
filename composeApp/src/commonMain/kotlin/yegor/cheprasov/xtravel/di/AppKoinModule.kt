package yegor.cheprasov.xtravel.di

import org.koin.core.KoinApplication
import yegor.cheprasov.xtravel.data.database.di.databaseModule
import yegor.cheprasov.xtravel.data.ktor.di.ktorModule

fun KoinApplication.connectAppModules() {
    modules(
        ktorModule,
        databaseModule
    )
}