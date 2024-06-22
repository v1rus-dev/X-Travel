package yegor.cheprasov.xtravel.data.ktor.di

import org.koin.dsl.module
import yegor.cheprasov.xtravel.data.ktor.KtorEngine

val ktorModule = module {
    includes(platformKtorModule())

    single {
        KtorEngine(
            httpClient = get()
        )
    }
}