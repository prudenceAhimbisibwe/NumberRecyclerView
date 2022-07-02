package com.prudence.numberapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumberRecyclerAdaptor(var numberList:List<Int>):
    RecyclerView.Adapter<NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_item
        ,parent,false)
        return NumberViewHolder(itemView)

    }
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNumber.text=numberList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numberList.size
    }
}
class NumberViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvNumber=itemView.findViewById<TextView>(R.id.rvNumber)

}