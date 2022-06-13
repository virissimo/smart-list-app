package com.virissimo.smartlist.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import br.virissimo.smartlist.enum.Medida

@Entity
data class Produto(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "produtoId")
    var produtoId: Int,

    @ColumnInfo(name = "titulo")
    var titulo: String,

    @ColumnInfo(name = "descricao")
    var descricao: String,

    @ColumnInfo(name = "peso")
    var peso: Double,

    @ColumnInfo(name = "medida")
    var medida: Medida
)

