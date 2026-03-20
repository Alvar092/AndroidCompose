package com.aentrena.androidcompose.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "heros")
class HeroLocal(
    @PrimaryKey val id: String,
    val name: String,
    val photo: String
)