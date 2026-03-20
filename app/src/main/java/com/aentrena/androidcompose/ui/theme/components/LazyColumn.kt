package com.aentrena.androidcompose.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


data class Item(
    val text: String,
    val favorito: Boolean
)

@Composable
fun MyLazyColumn() {

    val favorites = (0 until 10).map {Item("Texto $it", favorito = it % 2 == 0 ) }

    LazyColumn  {
        item {
            ItemDeLaLista()
        }
        items(10) { index ->
            ItemDeLaLista(index)
        }

        item {
            Text("Favoritos")
        }

        item {
            LazyRow {
                items(favorites.size){
                    val favorite = favorites[it]
                }

                items(favorites) {
                    FavoriteItem(it)
                }

                itemsIndexed(favorites) { index, item ->

                }
            }
        }
        item {
            Button(onClick = { /*TODO*/}) {
                Text("Cargar mas ")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyLazyColumn_Preview() {
    MyLazyColumn()
}

@Composable
fun ItemDeLaLista(index: Int = 0) {
    Text(text = "Hola: $index")
}

@Preview
@Composable
private fun ItemDeLaLista_Preview() {
    ItemDeLaLista()
}

@Composable
fun FavoriteItem(item: Item) {
    Text(text = item.text, color = if(item.favorito)Color.Red else Color.Black)
}