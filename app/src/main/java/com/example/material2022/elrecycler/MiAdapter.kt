package com.example.material2022.elrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.material2022.R

class MiAdapter(items:MutableList<Persona>): RecyclerView.Adapter<MiAdapter.ViewHolder>() {
 var ListaN:MutableList<Persona>
    init {
        this.ListaN=items
    }
    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
          var imagen:ImageView?=null
          var nombre:TextView?=null
          var apellido:TextView?=null

         init {
             imagen=view.findViewById(R.id.IVImagen)
             nombre=view.findViewById(R.id.tvNombre)
             apellido=view.findViewById(R.id.tvApellido)
         }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item=LayoutInflater.from(parent.context).
        inflate(R.layout.item_layout,parent, false)
        return ViewHolder(item)
    }


    override fun getItemCount(): Int {
        return ListaN.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=ListaN.get(position)
        holder.nombre!!.text=item.nombre
        holder.apellido!!.text=item.apellido
    }
}