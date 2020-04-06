package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_mostrar_resultados.*



class MostrarResultados : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_resultados)

        val objetoIntent : Intent = intent

        var resultado = objetoIntent.getStringExtra("resultado")
        masa.text = "Su masa corporal es de $resultado"
        if (resultado <= 18.5.toString()){
            mensaje.text = "Estas muy delgado, come algo porfis"
            imagenR.setImageResource(R.drawable.images)
        } else if (resultado > 18.5.toString() && resultado < 25.toString()){
            mensaje.text = "Usted esta saludable, crack, siga asi"
            imagenR.setImageResource(R.drawable.maxresdefault)
        }else{
            mensaje.text = "Lamentablemente usted tiene sobrepeso"
            imagenR.setImageResource(R.drawable.hqdefault)
        }
    }
}
