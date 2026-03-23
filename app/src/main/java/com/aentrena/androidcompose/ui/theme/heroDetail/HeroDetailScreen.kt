package com.aentrena.androidcompose.ui.theme.heroDetail

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import com.aentrena.androidcompose.domain.Hero
import com.aentrena.androidcompose.ui.theme.herolist.HeroListItem
import androidx.compose.ui.Modifier


@Composable
fun HeroDetailScreen(id: String, name: String, photo: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        HeroListItem(hero = Hero(id, name, photo))
    }
}

@Preview
@Composable
private fun HeroDetailScreen_Preview() {
    HeroDetailScreen("", "", "")
}

