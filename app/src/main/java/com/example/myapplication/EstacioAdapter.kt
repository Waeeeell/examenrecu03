package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EstacioAdapter (

    private var llista: List <Estacio>,
            private val onClick: (Estacio) -> Unit


    ): RecyclerView.Adapter<EstacioAdapter.ViewHolder>(){

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvNom: TextView = view.findViewById(R.id.tvNom)
        val tvUbicacio: TextView = view.findViewById(R.id.tvUbicacio)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate((R.layout.item_estacio), parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = llista[position]
        holder.tvNom.text = item.nom ?: "Fesconegut"
        holder.tvUbicacio.text = item.ubicacio ?: "Sense dades"

        holder.itemView.setOnClickListener { onClick(item) }
    }
        override fun getItemCount() = llista.size

    fun updateData(novaLlista : List<Estacio>) {
        llista = novaLlista
        notifyDataSetChanged()

    }
    }