package design.propia.food2fork.feature_dictionary.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import design.propia.food2fork.feature_dictionary.data.local.entity.WordInfoEntity

@Dao
interface WordInfoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun inserWordInfos(infos: List<WordInfoEntity>)

    @Query("DELETE FROM wordinfoentity WHERE word IN(:words)")
    suspend fun deleteWOrdInfos(words:List<String>)


    //Did you know-in sql || means concatinate
    @Query("SELECT * FROM wordinfoentity WHERE word LIKE '%'||:word||'%'")
    suspend fun getWordInfos(word:String):List<WordInfoEntity>
}