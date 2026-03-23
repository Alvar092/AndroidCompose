package com.aentrena.androidcompose.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.aentrena.androidcompose.domain.Hero

@Entity(tableName = "heros")
class HeroLocal(
    @PrimaryKey val id: String,
    val name: String,
    val photo: String
)

fun List<HeroLocal>.toUI(): List<Hero> = this.map{ it.toUI() }

fun HeroLocal.toUI() = with(this) {
    Hero(id, name, photo)
}