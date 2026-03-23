package com.aentrena.androidcompose.ui.theme.herolist

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.aentrena.androidcompose.R
import com.aentrena.androidcompose.domain.Hero

@Composable
fun HeroListScreen(heros: List<Hero>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(heros) {
            HeroListItem(hero = it)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HeroListScreen_Preview() {
    HeroListScreen(generateHeros())
}


@Composable
fun HeroListItem(hero: Hero, modifier: Modifier = Modifier) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "Hero Image")
            Text(text = hero.name, style = MaterialTheme.typography.h3)
        }
    }
}

@Preview
@Composable
private fun HeroListItem_Preview() {
    HeroListItem(hero = Hero("id", "maestro roshi", ""))
}

fun generateHeros() = (0 until 10).map { Hero("id$it", "Nombre$it", "Photo$it")}