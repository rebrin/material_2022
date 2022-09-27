package com.example.material2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FabActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fab)
        val boton:ExtendedFloatingActionButton=findViewById(R.id.FabNormal)
        boton.setOnClickListener({
            Toast.makeText(this,"evento",Toast.LENGTH_LONG).show()
        })
    }
}