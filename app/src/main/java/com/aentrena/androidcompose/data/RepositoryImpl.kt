package com.aentrena.androidcompose.data

import com.aentrena.androidcompose.data.local.LocalDataSource
import com.aentrena.androidcompose.data.local.model.toUI
import com.aentrena.androidcompose.data.network.NetworkDataSource
import com.aentrena.androidcompose.data.network.NetworkDataSourceImpl
import com.aentrena.androidcompose.data.network.model.toLocal
import com.aentrena.androidcompose.domain.Hero
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val networkDataSource: NetworkDataSource
): Repository {

    override suspend fun getHeros(): List<Hero> {
        val localHeros = localDataSource.getHeros()

        if (localHeros.isEmpty()) {
            val remoteHeros = networkDataSource.getHeros()
            localDataSource.insertHeros(remoteHeros.toLocal())
        }

        return localDataSource.getHeros().toUI()
    }
}