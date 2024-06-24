package yegor.cheprasov.xtravel.data.database.room.utils

import androidx.room.RoomDatabase
import yegor.cheprasov.xtravel.data.database.room.AppDatabase

expect class DatabaseBuilder {
    fun createSqlRoomBuilder(): RoomDatabase.Builder<AppDatabase>
}

fun getRoomDatabase(builder: DatabaseBuilder): AppDatabase {
    return builder.createSqlRoomBuilder()
        .fallbackToDestructiveMigrationOnDowngrade(true)
        .build()
}