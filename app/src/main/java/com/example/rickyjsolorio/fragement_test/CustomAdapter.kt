package com.example.rickyjsolorio.fragement_test

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class CustomAdapter(val context: Context, val animal: List<Animal>): RecyclerView.Adapter<CustomAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cutsomrow,parent, false)
        return  MyViewHolder(view)

    }

    override fun getItemCount(): Int {
       return animal.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val animals = animal[position]





    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    fun setData(animals: Animal??, pos: Int){



    }



}
