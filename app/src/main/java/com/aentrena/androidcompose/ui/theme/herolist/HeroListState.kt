package com.aentrena.androidcompose.ui.theme.herolist

import com.aentrena.androidcompose.domain.Hero

sealed class HeroListState {
    data class Success(val heros: List<Hero>): HeroListState()

    object Loading: HeroListState()

    data class Error(val error: String): HeroListState()
}