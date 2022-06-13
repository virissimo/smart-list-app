package com.virissimo.smartlist.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Estabelecimento(
    @PrimaryKey
    @ColumnInfo(name = "estabelecimentoId")
    val estabelecimentoId: Long,

    @ColumnInfo(name = "nome")
    val nome: String,

    @ColumnInfo(name = "latitude")
    val latitude: Long,

    @ColumnInfo(name = "longitude")
    val longitude: Long,

    @ColumnInfo(name = "urlImagem")
    val urlImagem: String,
)