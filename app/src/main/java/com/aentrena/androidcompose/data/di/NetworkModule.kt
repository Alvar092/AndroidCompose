package com.aentrena.androidcompose.data.di


import com.aentrena.androidcompose.data.network.NetworkDataSource
import com.aentrena.androidcompose.data.network.NetworkDataSourceImpl
import com.aentrena.androidcompose.data.network.api.HeroApi
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun providesOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().addInterceptor { chain ->
            val originalRequest = chain.request()
            val newRequest =
                originalRequest.newBuilder().addHeader("Authorization", "Bearer ${NetworkDataSourceImpl.TOKEN}").build()
            chain.proceed(newRequest)
        }.build()
    }

    @Provides
    fun providesMoshi(): Moshi {
        return Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()
    }

    @Provides
    fun providesRetrofit(okHttpClient: OkHttpClient, moshi: Moshi): Retrofit {
        return Retrofit.Builder().client(okHttpClient).baseUrl("https://dragonball.keepcoding.education/")
            .addConverterFactory(MoshiConverterFactory.create(moshi)).build()
    }

    @Provides
    fun providesDragonBallApi(retrofit: Retrofit): HeroApi {
        return retrofit.create(HeroApi::class.java)
    }


    @Provides
    fun provideNetworkDataSource(networkDataSourceImpl: NetworkDataSourceImpl): NetworkDataSource {
        return networkDataSourceImpl
    }
}