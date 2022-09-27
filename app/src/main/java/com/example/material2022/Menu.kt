package com.example.material2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    lateinit var bcard:Button
lateinit var axa:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        bcard=findViewById(R.id.bopcion)
        bcard.setOnClickListener({
            val intent=Intent(this,CardActivity::class.java)
            startActivity(intent)
        })
    axa=findViewById(R.id.gallarduino)
        axa.setOnClickListener({
            val intent=Intent(this,FabActivity::class.java)
            startActivity(intent)
        })
    }
}