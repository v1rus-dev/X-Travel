package yegor.cheprasov.xtravel.data.database.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import yegor.cheprasov.xtravel.data.database.room.utils.TableNames

@Entity(tableName = TableNames.FAVORITE_TABLE)
data class Favorite(
    @PrimaryKey(autoGenerate = true) val id: Int
)