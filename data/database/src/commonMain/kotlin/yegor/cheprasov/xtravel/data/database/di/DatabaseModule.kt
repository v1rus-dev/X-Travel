package yegor.cheprasov.xtravel.data.database.di

import org.koin.core.module.Module
import org.koin.dsl.module
import yegor.cheprasov.xtravel.data.database.room.AppDatabase
import yegor.cheprasov.xtravel.data.database.room.dao.FavoriteDao

val databaseModule: Module = module {
    includes(roomModule)
    
    single<FavoriteDao> {
        get<AppDatabase>().favoriteDao()
    }
}