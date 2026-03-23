package com.aentrena.androidcompose.data.di

import android.content.Context
import androidx.room.Room
import com.aentrena.androidcompose.data.local.db.HeroDAO
import com.aentrena.androidcompose.data.local.LocalDataSource
import com.aentrena.androidcompose.data.local.LocalDataSourceImpl
import com.aentrena.androidcompose.data.local.db.HeroDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Provides
    fun providesHeroDatabase(@ApplicationContext context: Context): HeroDataBase {
        return Room.databaseBuilder(
            context,
            HeroDataBase::class.java, "hero-database"
        ).build()
    }

    @Provides
    fun providesHeroDao(db: HeroDataBase): HeroDAO {
        return db.heroDAO()
    }

    @Provides
    fun provideLocalDataSource(localDataSourceImpl: LocalDataSourceImpl): LocalDataSource {
        return localDataSourceImpl
    }
}