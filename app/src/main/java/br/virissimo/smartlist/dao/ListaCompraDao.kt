package br.virissimo.smartlist.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.virissimo.smartlist.entity.ListaCompra

@Dao
interface ListaCompraDao {

    @Insert
    fun insertListaCompra(listaCompra: ListaCompra)

    @Insert
    fun updateListaCompra(listaCompra: ListaCompra)

    @Delete
    fun deleteListaCompra(listaCompra: ListaCompra)

    @Query("SELECT * FROM ListaCompra")
    fun findAll(): List<ListaCompra>
}