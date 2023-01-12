package design.propia.food2fork.feature_dictionary.data.remote.dto

import design.propia.food2fork.feature_dictionary.domain.models.Meaning

data class MeaningDto(
    val antonyms: List<Any>,
    val definitions: List<DefinitionDto>,
    val partOfSpeech: String,
    val synonyms: List<String>
) {
    fun toMeaning(): Meaning {
        return Meaning(
            antonyms = this.antonyms,
            definitions = this.definitions.map { it.toDefinition() },
            partOfSpeech = this.partOfSpeech,
            synonyms = this.synonyms
        )
    }
}