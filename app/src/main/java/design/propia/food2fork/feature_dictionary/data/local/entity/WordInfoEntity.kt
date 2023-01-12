package design.propia.food2fork.feature_dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import design.propia.food2fork.feature_dictionary.data.remote.dto.License
import design.propia.food2fork.feature_dictionary.domain.models.Meaning
import design.propia.food2fork.feature_dictionary.domain.models.Phonetic
import design.propia.food2fork.feature_dictionary.domain.models.WordInfo

@Entity
data class WordInfoEntity(
    val license: License,
    val meanings: List<Meaning>,
    val phonetic: String,
    val phonetics: List<Phonetic>,
    val sourceUrls: List<String>,
    val word: String,
    @PrimaryKey val id:Int?=null

){
    fun toWordInfo(): WordInfo {
        return WordInfo(
            license = this.license,
            meanings=this.meanings,
            phonetic=this.phonetic,
            phonetics=this.phonetics,
            sourceUrls=this.sourceUrls,
            word=this.word
        )
    }
}