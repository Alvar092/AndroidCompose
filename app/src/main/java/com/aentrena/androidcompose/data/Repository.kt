package com.aentrena.androidcompose.data

import com.aentrena.androidcompose.domain.Hero

interface Repository {

    suspend fun getHeros(): List<Hero>
}