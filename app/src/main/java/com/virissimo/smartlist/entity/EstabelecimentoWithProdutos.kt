package com.virissimo.smartlist.entity

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class EstabelecimentoWithProdutos(
    @Embedded
    val estabelecimento: Estabelecimento,

    @Relation(
        parentColumn = "estabelecimentoId",
        entityColumn = "produtoId",
        associateBy = Junction(EstabelecimentoProdutoCrossRef::class)
    )
    val produtos: List<Produto>
)