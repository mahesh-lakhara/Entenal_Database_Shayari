package com.mmm.entenal_database_shayari

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mmm.entenal_database_shayari.databinding.ShayariDesignBinding

class ShayariAdapter : Adapter<ShayariAdapter.ShayariHolder>() {

    lateinit var context: Context

    var shayarilist = ArrayList<ShayriModel>()



    class ShayariHolder(itemView: ShayariDesignBinding) : ViewHolder(itemView.root){


        var binding = itemView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShayariHolder {
        context = parent.context
        var binding = ShayariDesignBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ShayariHolder(binding)


    }

    override fun getItemCount(): Int {

        return shayarilist.size

    }

    override fun onBindViewHolder(holder: ShayariHolder, position: Int) {
        holder.binding.apply {
            shayarilist.get(position).apply {

                txtShayari.text = shayarilist.toString()

            }
        }

    }

    fun setshayari(shayarilist: ArrayList<ShayriModel>) {
        this.shayarilist = shayarilist

    }

}