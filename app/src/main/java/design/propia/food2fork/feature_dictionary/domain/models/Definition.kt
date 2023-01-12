package design.propia.food2fork.feature_dictionary.domain.models

data class Definition(
    val antonyms: List<String>,
    val definition: String,
    val example: String?,
    val synonyms: List<String>
)