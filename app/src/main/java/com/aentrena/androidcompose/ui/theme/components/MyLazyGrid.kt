package com.aentrena.androidcompose.ui.theme.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AdsClick
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyLazyGrid() {
    val favorites = (0 until 100).map { Item( "Text $it", it % 2 == 0)}

    LazyVerticalGrid(columns = GridCells.Adaptive(80.dp), ) {
        items(favorites) {
            FavoriteItem(item = it)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyLazyGrid_Preview() {
    MyLazyGrid()
}





