package com.example.favouriteitems

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class CartoonsAdapter(val context: Context,val cartoons:List<Cartoons>):RecyclerView.Adapter<CartoonsAdapter.MyViewHolder>(){
       override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view=LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cartoons.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val cartoon=cartoons[position]
        holder.setData(cartoon,position)
    }
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){         //implementation of Inner class
        var currentCartoon:Cartoons?=null
        var currentPosition:Int=0
        init{
            itemView.setOnClickListener{
                Toast.makeText(context,currentCartoon!!.title+" Clicked !",Toast.LENGTH_SHORT).show()
                val intent = Intent(context, DetailsActivity::class.java)
                intent.putExtra("url",currentCartoon!!.url)
                context.startActivity(intent)
            }
            itemView.imgShare.setOnClickListener{
                val message:String="I like cartoon "+ currentCartoon!!.title+"\n"+currentCartoon!!.url
                val intent=Intent()
                intent.action=Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,message)
                intent.type="text/plain"
                context.startActivity(Intent.createChooser(intent,"Please selet app"))
            }
        }
        fun setData(cartoon:Cartoons?,pos:Int){
            itemView.txvTitle.text=cartoon!!.title
            this.currentCartoon=cartoon
            this.currentPosition=pos
        }
    }
}