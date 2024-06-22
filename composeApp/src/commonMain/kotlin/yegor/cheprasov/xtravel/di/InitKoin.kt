import org.koin.core.context.startKoin
import yegor.cheprasov.xtravel.di.connectAppModules

fun initKoin() {
    startKoin {
        connectAppModules()
    }
}