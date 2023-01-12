package design.propia.food2fork.feature_dictionary.data.local

import androidx.room.TypeConverter
import com.google.gson.reflect.TypeToken
import design.propia.food2fork.feature_dictionary.data.util.JsonParser
import design.propia.food2fork.feature_dictionary.domain.models.Meaning


//stack overflow says the below option is well, optional
//@ProvidedTypeConverter
class Converters(
    private val jsonParser: JsonParser
) {
    @TypeConverter
    fun fromMeaningsJson(json:String):List<Meaning>{
        return jsonParser.fromJson<ArrayList<Meaning>>(
            json,
            object :TypeToken<ArrayList<Meaning>>(){}.type
        )?:emptyList()
    }

    @TypeConverter
    fun toMeaningsJson(meanings: List<Meaning>):String{
        return jsonParser.toJson(
            meanings,
            object :TypeToken<ArrayList<Meaning>>(){}.type
        )?:"[]"
    }
}