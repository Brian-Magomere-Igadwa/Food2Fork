package design.propia.food2fork.presentation.ui.recipe_list

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun RecipeListScreen() {
    Box() {
        Column(modifier = Modifier.fillMaxSize()) {


            Surface(content = {


                Surface(content = {
                    Text(text = "Rain")
                })
                Surface(content = {
                    Text(text = "Rain")
                })
                Surface(content = {
                    Text(text = "Rain")
                })
            })

            Text(text = "Rain")
        }
    }

}

