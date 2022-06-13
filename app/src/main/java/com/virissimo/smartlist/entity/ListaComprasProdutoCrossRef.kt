package com.virissimo.smartlist.entity

import androidx.room.Entity

@Entity(primaryKeys = ["listaId", "produtoId"])
data class ListaComprasProdutoCrossRef(
    val listaId: Long,
    val produtoId: Long
)
