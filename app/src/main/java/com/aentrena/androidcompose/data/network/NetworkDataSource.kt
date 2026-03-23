package com.aentrena.androidcompose.data.network

import com.aentrena.androidcompose.data.network.model.HeroRemote
interface NetworkDataSource {
    suspend fun getHeros(): List<HeroRemote>
}