package com.example.material2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar


class ActivityMenuInferior : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_inferior)
        var IVImg:ImageView=findViewById(R.id.IVImg)
var kakashi:ImageView=findViewById(R.id.kakashi)

        Glide
            .with(this)
            .load("https://w7.pngwing.com/pngs/408/640/png-transparent-naruto-anime-ninja-manga-japanese-portrait-drawing-head-face-character-thumbnail.png")
            .into(IVImg)
        Glide
            .with(this)
            .load("https://images8.alphacoders.com/644/644172.jpg")
            .into(kakashi)

        var bnv:BottomNavigationView=findViewById(R.id.menu_inferior)
        bnv.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    Toast.makeText(this, "home", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.favoritos ->{
                    Toast.makeText(this,"favoritos", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.opciones ->{
                    Toast.makeText(this,"opciones", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.karol->{

                    Snackbar.make(bnv, "Karol", Snackbar.LENGTH_SHORT)
                        .show()
                    true
                }
                else -> {
                    false
                }
            }
        }
    }
}