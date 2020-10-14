package com.example.primeraappandroidguillermo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    //Metodo del boton entrar
    fun entrar(view: View) {
        val intent = Intent(this,Menu::class.java)
        startActivity(intent)
    }
}