package com.aentrena.androidcompose.data.network.api

import com.aentrena.androidcompose.data.network.model.HeroRemote
import com.aentrena.androidcompose.data.network.model.HeroRequestBody
import retrofit2.http.Body
import retrofit2.http.POST

interface HeroApi {
    @POST("api/heros/all")
    suspend fun getHeros(@Body heroRequestBody: HeroRequestBody): List<HeroRemote>
}