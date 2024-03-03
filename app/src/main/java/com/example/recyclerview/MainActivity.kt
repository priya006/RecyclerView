package com.example.recyclerview

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TodoAdapter
    private lateinit var edittext: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Initialize the recycler view
        recyclerView = findViewById(R.id.recycler_view)
//        var dataList = mutableListOf(
//            TodoData(
//                "Eat the curry",
//                true
//            ),
//            TodoData("Complete Recycler View", false)
//        )
        //Initialize the Adapter
        adapter = TodoAdapter(mutableListOf("Some of the curry"))
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter


        //Handle button click
        var button = findViewById<Button>(R.id.button)
        edittext = findViewById<Button>(R.id.edit_text)

        button.setOnClickListener {
        var text = edittext.text.toString()
        //set text to textView
           // edittext.text = text
         adapter.addText(text)
        }
    }
}