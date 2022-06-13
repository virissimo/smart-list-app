package com.virissimo.smartlist.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Estabelecimento(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "estabelecimentoId")
    var estabelecimentoId: Int,

    @ColumnInfo(name = "nome")
    var nome: String,

    @ColumnInfo(name = "latitude")
    var latitude: Long,

    @ColumnInfo(name = "longitude")
    var longitude: Long,

    @ColumnInfo(name = "urlImagem")
    var urlImagem: String,
)