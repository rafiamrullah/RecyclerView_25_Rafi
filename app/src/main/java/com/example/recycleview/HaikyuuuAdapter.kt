package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HaikyuuuAdapter(private val context: Context, private val haikyuuu: List<Haikyuuu>, val listener: (Haikyuuu) -> Unit)
    : RecyclerView.Adapter<HaikyuuuAdapter.HaikyuuuViewHolder>(){

    class HaikyuuuViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgHaikyuuu = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameHaikyuuu = view.findViewById<TextView>(R.id.tv_item_name)
        val descHaikyuuu = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(haikyuuu: Haikyuuu, listener: (Haikyuuu) -> Unit){
            imgHaikyuuu.setImageResource(haikyuuu.imgHaikyuuu)
            nameHaikyuuu.text = haikyuuu.nameHaikyuuu
            descHaikyuuu.text =  haikyuuu.descHaikyuuu
            itemView.setOnClickListener{
                listener(haikyuuu)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HaikyuuuViewHolder {
        return HaikyuuuViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_haikyuuu, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HaikyuuuViewHolder, position: Int) {
        holder.bindView(haikyuuu[position], listener)
    }

    override fun getItemCount(): Int = haikyuuu.size
    }
