package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(
    var dataList: MutableList<String>
) : RecyclerView.Adapter<TodoAdapter.MyViewHolder>() {

    //Create MyViewHolder Class
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.tvTitle)
        //val checkBox : CheckBox = itemView.findViewById(R.id.cbDone)

    }


    //Inflates the row layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)


        //return MyViewHolder object
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        //Return the size of the TodoList of data
        return dataList.siz
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //Bind the data in the dataList to the Views inside View Holder
        val item = dataList[position]
        holder.textView.text = item

        //TODO Set Click on listner implement
    }


    fun addText(text: String) {
        dataList.add(text)
        notifyItemInserted(dataList.size-1)
    }
}