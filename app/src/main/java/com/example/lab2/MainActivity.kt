package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var altura = findViewById<View>(R.id.altura) as EditText
        var peso = findViewById<View>(R.id.peso) as EditText
        var calcular = findViewById<View>(R.id.calcular) as Button



        calcular.setOnClickListener {
            var resultado =
                ((peso.text.toString().toDouble() * 0.45) / (altura.text.toString().toDouble() / 100)).toString()
            val intent: Intent = Intent(this, MostrarResultados::class.java)
            intent.putExtra("resultado", resultado)
            startActivity(intent)
        }




    }
}
