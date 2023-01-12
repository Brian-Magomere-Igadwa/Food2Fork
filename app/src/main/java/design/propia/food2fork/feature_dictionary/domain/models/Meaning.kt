package design.propia.food2fork.feature_dictionary.domain.models

import design.propia.food2fork.feature_dictionary.data.remote.dto.DefinitionDto

data class Meaning(
    val antonyms: List<Any>,
    val definitions: List<Definition>,
    val partOfSpeech: String,
    val synonyms: List<String>
)
