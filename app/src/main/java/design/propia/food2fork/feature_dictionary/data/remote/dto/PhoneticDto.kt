package design.propia.food2fork.feature_dictionary.data.remote.dto

import design.propia.food2fork.feature_dictionary.domain.models.Phonetic

data class PhoneticDto(
    val audio: String,
    val license: License,
    val sourceUrl: String,
    val text: String
) {
    fun toPhonetic(): Phonetic {
        return Phonetic(
            audio=this.audio, license=this.license, sourceUrl=this.sourceUrl, text=this.text
        )
    }
}