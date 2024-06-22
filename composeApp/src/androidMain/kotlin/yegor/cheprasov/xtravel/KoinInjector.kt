package yegor.cheprasov.xtravel

import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import yegor.cheprasov.xtravel.di.connectAppModules

object KoinInjector {

    fun inject(app: AndroidApp) {
        startKoin {
            androidLogger()
            connectAppModules()
        }.androidContext(app)
    }

}