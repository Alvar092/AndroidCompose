package com.aentrena.androidcompose.data.di

import com.aentrena.androidcompose.data.Repository
import com.aentrena.androidcompose.data.RepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun provideRepository(repositoryImpl: RepositoryImpl): Repository {
        return repositoryImpl
    }

    /*
    @Binds
    abstract fun bindRepository(repositoryImpl: RepositoryImpl): Repository
     */
}