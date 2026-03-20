package com.aentrena.androidcompose

import android.content.Context
import androidx.room.Room
import com.aentrena.androidcompose.data.local.LocalDataSource
import com.aentrena.androidcompose.data.local.LocalDataSourceImpl
import com.aentrena.androidcompose.data.local.db.HeroDAO
import com.aentrena.androidcompose.data.local.db.HeroDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    // INSTRUCCIÓN 1: Cómo crear la base de datos y el DAO
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): HeroDataBase {
        return Room.databaseBuilder(
            context,
            HeroDataBase::class.java, "hero_db"
        ).build()
    }

    @Provides
    fun provideHeroDao(db: HeroDataBase): HeroDAO {
        return db.heroDAO()
    }

    // INSTRUCCIÓN 2: Decirle que LocalDataSource es LocalDataSourceImpl
    // (Puedes usar @Provides en un object o @Binds en una clase abstracta)
    @Provides
    @Singleton
    fun provideLocalDataSource(dao: HeroDAO): LocalDataSource {
        return LocalDataSourceImpl(dao)
    }
}