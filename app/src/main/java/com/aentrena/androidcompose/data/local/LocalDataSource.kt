package com.aentrena.androidcompose.data.local

import com.aentrena.androidcompose.data.local.model.HeroLocal
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {
    suspend fun getHeros(): List<HeroLocal>
    suspend fun getHerosFlow(): Flow<List<HeroLocal>>
    suspend fun insertHeros(heros: List<HeroLocal>)
}