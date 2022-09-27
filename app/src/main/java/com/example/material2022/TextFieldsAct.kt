package com.example.material2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class TextFieldsAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_fields)
        val boton:Button=findViewById(R.id.botons)
        val tf=findViewById<EditText>(R.id.tfpower)
        boton.setOnClickListener({
            Toast.makeText(this,tf.text.toString(),Toast.LENGTH_SHORT).show()
        })
    }
}