package yegor.cheprasov.xtravel.data.database.room.utils

import android.content.Context
import androidx.room.RoomDatabase
import androidx.room.Room
import kotlinx.coroutines.Dispatchers
import yegor.cheprasov.xtravel.data.database.room.AppDatabase
import yegor.cheprasov.xtravel.data.database.room.ROOM_FILE_DATABASE_NAME

actual class DatabaseBuilder(private val context: Context) {
    actual fun createSqlRoomBuilder(): RoomDatabase.Builder<AppDatabase> {
        val appContext = context.applicationContext
        val dbFile = appContext.getDatabasePath(ROOM_FILE_DATABASE_NAME)
        val builder = Room.databaseBuilder<AppDatabase>(context = appContext, name = dbFile.absolutePath)
        builder.setQueryCoroutineContext(Dispatchers.IO)
        return builder
    }
}