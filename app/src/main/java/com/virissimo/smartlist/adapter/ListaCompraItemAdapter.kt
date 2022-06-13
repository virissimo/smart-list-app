package com.virissimo.smartlist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.virissimo.smartlist.R
import com.virissimo.smartlist.model.ListaCompra

class ListaCompraItemAdapter(
    private val context: Context,
    private val dataset: List<ListaCompra>
) : RecyclerView.Adapter<ListaCompraItemAdapter.ListaCompraItemViewHolder>() {

    class ListaCompraItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.lista_compra_item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaCompraItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.lista_compra_item, parent, false)
        return ListaCompraItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ListaCompraItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.listaId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}