package com.aentrena.androidcompose.data.local

import com.aentrena.androidcompose.data.local.db.HeroDAO
import com.aentrena.androidcompose.data.local.model.HeroLocal
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

data class LocalDataSourceImpl @Inject constructor(private val dao: HeroDAO): LocalDataSource {
   override suspend fun getHeros(): List<HeroLocal> {
        return dao.getHeros()
    }

    override suspend fun getHerosFlow(): Flow<List<HeroLocal>> {
        return dao.getHerosFlow()
    }

    override suspend fun insertHeros(heros: List<HeroLocal>) {
        dao.insertHeros(heros)
    }
}
