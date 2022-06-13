package com.virissimo.smartlist.entity

import androidx.room.Entity

@Entity(primaryKeys = ["estabelecimentoId", "produtoId"])
data class EstabelecimentoProdutoCrossRef(
    val estabelecimentoId: Long,
    val produtoId: Long
)
