package com.aentrena.androidcompose.data.local.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.aentrena.androidcompose.data.local.model.HeroLocal
import kotlinx.coroutines.flow.Flow

@Dao
interface HeroDAO {
    @Query("Select * from heros")
    fun getHeros(): List<HeroLocal >

    @Query("Select * from heros")
    fun getHerosFlow(): Flow<List<HeroLocal>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertHeros(heros: List<HeroLocal>)
}