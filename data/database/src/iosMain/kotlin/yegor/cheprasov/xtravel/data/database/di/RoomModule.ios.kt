package yegor.cheprasov.xtravel.data.database.di

import org.koin.dsl.module
import yegor.cheprasov.xtravel.data.database.room.AppDatabase
import yegor.cheprasov.xtravel.data.database.room.utils.DatabaseBuilder
import yegor.cheprasov.xtravel.data.database.room.utils.getRoomDatabase

actual val roomModule: org.koin.core.module.Module = module {
    single<DatabaseBuilder> {
        DatabaseBuilder()
    }
    
    single<AppDatabase> {
        getRoomDatabase(get())
    }
}