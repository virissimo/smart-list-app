package com.virissimo.smartlist.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Estabelecimento(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "estabelecimentoId")
    val estabelecimentoId: Int,

    @ColumnInfo(name = "nome")
    val nome: String,

    @ColumnInfo(name = "latitude")
    val latitude: Long,

    @ColumnInfo(name = "longitude")
    val longitude: Long,

    @ColumnInfo(name = "urlImagem")
    val urlImagem: String,
)