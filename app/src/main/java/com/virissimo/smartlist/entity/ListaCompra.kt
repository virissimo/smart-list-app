package com.virissimo.smartlist.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class ListaCompra(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "listaId")
    val listaId: Long,

    @ColumnInfo(name = "titulo")
    val titulo: String,

    @ColumnInfo(name = "descricao")
    val descricao: String

)