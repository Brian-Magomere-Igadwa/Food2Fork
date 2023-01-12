package design.propia.food2fork.feature_dictionary.domain.models

import design.propia.food2fork.feature_dictionary.data.remote.dto.License
import design.propia.food2fork.feature_dictionary.data.remote.dto.MeaningDto
import design.propia.food2fork.feature_dictionary.data.remote.dto.PhoneticDto

data class WordInfo(
    val license: License,
    val meanings: List<Meaning>,
    val phonetic: String,
    val phonetics: List<Phonetic>,
    val sourceUrls: List<String>,
    val word: String
)