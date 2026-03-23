package com.aentrena.androidcompose.data.network

import com.aentrena.androidcompose.data.network.api.HeroApi
import com.aentrena.androidcompose.data.network.model.HeroRemote
import com.aentrena.androidcompose.data.network.model.HeroRequestBody
import javax.inject.Inject

class NetworkDataSourceImpl @Inject constructor(private val api: HeroApi): NetworkDataSource {
    override suspend fun getHeros(): List<HeroRemote> {
        return api.getHeros(HeroRequestBody() )
    }

    companion object {
        const val TOKEN = ""
    }
}
