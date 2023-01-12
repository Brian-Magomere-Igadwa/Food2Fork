package design.propia.food2fork.feature_dictionary.data.remote.dto

import design.propia.food2fork.feature_dictionary.domain.models.WordInfo

data class WordInfoDto(
    val license: License,
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            license = this.license,
            meanings=this.meanings.map { it.toMeaning() },
            phonetic=this.phonetic,
            phonetics=this.phonetics.map { it.toPhonetic() },
            sourceUrls=this.sourceUrls,
            word=this.word
            )
    }
}