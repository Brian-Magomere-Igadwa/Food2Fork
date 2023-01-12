package design.propia.food2fork.feature_dictionary.domain.models

import design.propia.food2fork.feature_dictionary.data.remote.dto.License

data class Phonetic(
    val audio: String,
    val license: License,
    val sourceUrl: String,
    val text: String
)
