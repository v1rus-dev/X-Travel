package yegor.cheprasov.xtravel.data.database.room.utils

import androidx.room.RoomDatabase
import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSFileManager
import platform.Foundation.NSURL
import platform.Foundation.NSUserDomainMask
import androidx.room.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import kotlinx.cinterop.ExperimentalForeignApi
import yegor.cheprasov.xtravel.data.database.room.AppDatabase
import yegor.cheprasov.xtravel.data.database.room.ROOM_FILE_DATABASE_NAME
import yegor.cheprasov.xtravel.data.database.room.instantiateImpl

actual class DatabaseBuilder {
    actual fun createSqlRoomBuilder(): RoomDatabase.Builder<AppDatabase> {
        val dbFilePath = "${fileDirectory()}/$ROOM_FILE_DATABASE_NAME"
        return Room.databaseBuilder<AppDatabase>(
            name = dbFilePath,
            factory = { AppDatabase::class.instantiateImpl() }
        )
            .setDriver(BundledSQLiteDriver())
    }
    
    @OptIn(ExperimentalForeignApi::class)
    private fun fileDirectory(): String {
        val documentDirectory: NSURL? = NSFileManager.defaultManager.URLForDirectory(
            directory = NSDocumentDirectory,
            inDomain = NSUserDomainMask,
            appropriateForURL = null,
            create = false,
            error = null,
        )
        return requireNotNull(documentDirectory).path!!
    }
}