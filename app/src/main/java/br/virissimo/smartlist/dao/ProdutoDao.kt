package br.virissimo.smartlist.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface ProdutoDao {

    @Insert
    fun insertProduto(produtoDao: ProdutoDao)

    @Update
    fun updateProduto(produtoDao: ProdutoDao)

    @Delete
    fun deleteProduto(produtoDao: ProdutoDao)


}