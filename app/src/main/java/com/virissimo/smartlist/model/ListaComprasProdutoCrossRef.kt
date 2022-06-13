package com.virissimo.smartlist.model

import androidx.room.Entity

@Entity(primaryKeys = ["listaId", "produtoId"])
data class ListaComprasProdutoCrossRef(
    val listaId: Int,
    val produtoId: Int
)
