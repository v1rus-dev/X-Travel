package yegor.cheprasov.xtravel.data.database.room

import androidx.room.Database
import androidx.room.RoomDatabase
import yegor.cheprasov.xtravel.data.database.room.dao.FavoriteDao
import yegor.cheprasov.xtravel.data.database.room.entities.Favorite

@Database(
    entities =[
        Favorite::class
    ],
    version = DATABASE_VERSION_1
)
abstract class AppDatabase : RoomDatabase(), DB {
    
    abstract fun favoriteDao(): FavoriteDao

    override fun clearAllTables() {
        super.clearAllTables()
    }
    
}

interface DB {
    fun clearAllTables() {}
}