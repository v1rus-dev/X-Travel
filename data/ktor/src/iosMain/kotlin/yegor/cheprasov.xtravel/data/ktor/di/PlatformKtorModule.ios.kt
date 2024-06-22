package yegor.cheprasov.xtravel.data.ktor.di

import io.ktor.client.HttpClient
import io.ktor.client.engine.darwin.Darwin
import org.koin.core.module.Module
import org.koin.core.module.single
import org.koin.dsl.module

actual fun platformKtorModule(): Module = module {
    single<HttpClient> {
        HttpClient(Darwin)
    }
}