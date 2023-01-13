package design.propia.food2fork.feature_dictionary.domain.repository

import design.propia.food2fork.core.util.Resource
import design.propia.food2fork.feature_dictionary.domain.models.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {
    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}