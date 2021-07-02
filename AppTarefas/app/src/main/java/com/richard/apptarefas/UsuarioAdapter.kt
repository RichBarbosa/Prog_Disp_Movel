package com.richard.apptarefas

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_tarefa.*
import java.net.URI

class UsuarioAdapter(var listaTarefa: MutableList<Tarefas>):RecyclerView.Adapter<UsuarioAdapter.ItemViewHolder>() {

    // Responsável por encontrar os componentes dentro do layout (item_usuario) e indicar que o
    //  layout será replicado na Recycler View
    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val txtNome: TextView = view.findViewById(R.id.TxtNome)
        val txtTarefa: TextView = view.findViewById(R.id.TxtTarefa)
        val txtImportancia: TextView = view.findViewById(R.id.TxtImportancia)

    }

    // Responsável por inflar (fazer aparecer) o layout por exemplo na activity ou fragment ou dialog (tudo que extends View Group)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tarefa, parent, false)
        return ItemViewHolder(view)
    }

    // Vincula os componentes do layout (item_usuario) a um dado/propriedade/atributo da lista
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        holder.txtNome.text = listaTarefa[position].Titulo
        holder.txtTarefa.text = listaTarefa[position].tarefa
        holder.txtImportancia.text = listaTarefa[position].importancia.nome

    }

    // Indica quantos registros/itens a lista possui
    override fun getItemCount(): Int {
        return listaTarefa.size
    }
}