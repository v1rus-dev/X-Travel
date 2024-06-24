package yegor.cheprasov.xtravel.data.database.di

import org.koin.android.ext.koin.androidApplication
import org.koin.core.module.Module
import org.koin.dsl.module
import yegor.cheprasov.xtravel.data.database.room.AppDatabase
import yegor.cheprasov.xtravel.data.database.room.utils.DatabaseBuilder
import yegor.cheprasov.xtravel.data.database.room.utils.getRoomDatabase

actual val roomModule: Module = module {
    single<DatabaseBuilder> {
        DatabaseBuilder(androidApplication())
    }
    
    single<AppDatabase> {
        getRoomDatabase(get())
    }
}