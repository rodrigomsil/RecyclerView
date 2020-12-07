package com.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContatoAdapter : RecyclerView.Adapter<ContatoHolder>{

    var dados : List<Contato>? = null
    var geradorDeView : LayoutInflater? = null

    constructor(dados:List<Contato>?, contexto:Context?){
        this.dados = dados
        geradorDeView = LayoutInflater.from(contexto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoHolder {
        return ContatoHolder(geradorDeView!!.inflate(R.layout.iten_layout, parent,false))
    }

    override fun onBindViewHolder(holder: ContatoHolder, position: Int) {
        holder.contador!!.text = (1+position).toString()
        holder.email!!.text = dados!![position].email
        holder.nome!!.text = dados!![position].nome
    }

    override fun getItemCount() = dados?.size!!
}