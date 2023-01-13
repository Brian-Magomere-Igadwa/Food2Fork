package design.propia.food2fork.feature_dictionary.data.repository

import design.propia.food2fork.core.util.Resource
import design.propia.food2fork.feature_dictionary.data.local.WordInfoDao
import design.propia.food2fork.feature_dictionary.data.remote.DictionaryApi
import design.propia.food2fork.feature_dictionary.domain.models.WordInfo
import design.propia.food2fork.feature_dictionary.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class WordInfoRepositoryImpl(
    private val api: DictionaryApi,
    private val dao: WordInfoDao

) : WordInfoRepository() {
    override fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>> = flow {
        emit(Resource.Loading())
        val wordInfos = dao.getWordInfos(word).map{it.toWordInfo()}
        emit(Resource.Loading(data=wordInfos))

        try {
            val remoteWordInfos=api.getWordInfo(word)
            dao.deleteWOrdInfos(remoteWordInfos.map{it.word})
            dao.inserWordInfos(remoteWordInfos.map{it.toWordInfoEntity()})
        }catch (e:HttpException){
            emit(Resource.Error("Ooops, something went wrong!",data=wordInfos))

        }catch (e: IOException){
            emit(Resource.Error("Couldn't reach server, check your internet connection.",data=wordInfos))
        }

        val newWordInfos=dao.getWordInfos(word).map{it.toWordInfo()}
        emit(Resource.Success(newWordInfos))
    }
}