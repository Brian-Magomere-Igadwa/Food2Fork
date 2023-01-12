package design.propia.food2fork.feature_dictionary.data.remote.dto

import design.propia.food2fork.feature_dictionary.domain.models.Definition

data class DefinitionDto(
    val antonyms: List<String>,
    val definition: String,
    val example: String?,
    val synonyms: List<String>
) {
    /*
     *Mappers-
     *how we map data from the network to the model that is for our application
     */
    fun toDefinition():Definition{
        return Definition(
            antonyms=this.antonyms,
            definition=this.definition,
            example=this.example,
            synonyms=this.synonyms
        )
    }
}