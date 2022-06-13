package com.virissimo.smartlist.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import br.virissimo.smartlist.enum.Medida

@Entity
data class Produto(
    @PrimaryKey
    @ColumnInfo(name = "produtoId")
    val produtoId: Long,

    @ColumnInfo(name = "titulo")
    val titulo: String,

    @ColumnInfo(name = "descricao")
    val descricao: String,

    @ColumnInfo(name = "peso")
    val peso: Double,

    @ColumnInfo(name = "medida")
    val medida: Medida
)

