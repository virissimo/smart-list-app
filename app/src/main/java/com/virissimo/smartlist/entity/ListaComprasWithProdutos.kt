package com.virissimo.smartlist.entity

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class ListaComprasWithProdutos(
    @Embedded
    val lista: ListaCompra,

    @Relation(
        parentColumn = "listaId",
        entityColumn = "produtoId",
        associateBy = Junction(ListaComprasProdutoCrossRef::class)
    )
    val produtos: List<Produto>
)