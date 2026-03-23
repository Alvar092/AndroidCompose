package com.aentrena.androidcompose.data.network.model

import com.aentrena.androidcompose.data.local.model.HeroLocal

data class HeroRemote(
    val id: String,
    val name: String,
    val photo: String
)


fun List<HeroRemote>.toLocal(): List<HeroLocal> = this.map{ it.toLocal() }



fun HeroRemote.toLocal() = with(this) {
    HeroLocal(id, name, photo)
}