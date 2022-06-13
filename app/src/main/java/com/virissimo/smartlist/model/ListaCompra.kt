package com.virissimo.smartlist.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class ListaCompra(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "listaId")
    var listaId: Int,

    @ColumnInfo(name = "titulo")
    var titulo: String,

    @ColumnInfo(name = "descricao")
    var descricao: String

)