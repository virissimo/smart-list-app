package com.virissimo.smartlist.model

import androidx.room.Entity

@Entity(primaryKeys = ["estabelecimentoId", "produtoId"])
data class EstabelecimentoProdutoCrossRef(
    val estabelecimentoId: Int,
    val produtoId: Int
)
