package com.aentrena.androidcompose.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aentrena.androidcompose.data.local.model.HeroLocal

@Database(entities = [HeroLocal::class], version = 1)
abstract class HeroDataBase: RoomDatabase() {
    abstract fun heroDAO(): HeroDAO
}