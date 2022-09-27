package com.example.material2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.material2022.elrecycler.MiAdapter
import com.example.material2022.elrecycler.Persona

class MiRecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val list:MutableList<Persona>  = mutableListOf(
            Persona("gallar", "duino",R.drawable.media),
            Persona("gallar", "duino",R.drawable.media),
            Persona("gallar", "duino",R.drawable.media),
            Persona("gallar", "duino",R.drawable.media),
            Persona("gallar", "duino",R.drawable.media)
        )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mi_recycler)

        var recycler= findViewById<RecyclerView>(R.id.VRecycler)

        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=MiAdapter(list)
    }
}