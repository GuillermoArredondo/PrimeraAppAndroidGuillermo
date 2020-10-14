package com.example.primeraappandroidguillermo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu):Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true;
    }

    //LLama a los metodos para abrir cada opcion del menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menuNota -> {
                menuNota()
                true
            }
            R.id.menuMail -> {
                menuCorreo()
                true
            }
            R.id.menuAmigo -> {
                menuAmigo()
                true
            }
            R.id.menuCita -> {
                menuCita()
                true
            }
            R.id.menuAcerca -> {
                menuAcercaDe()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    // Muestra la actividad de Añadir nota
    private fun menuNota() {
        val intent = Intent(this, NotaActivity::class.java)
        startActivity(intent)
    }

    // Muestra la actividad de Mandar Correo
    private fun menuCorreo() {
        val intent = Intent(this, CorreoActivity::class.java)
        startActivity(intent)
    }

    // Muestra la actividad Añadir Amigo
    private fun menuAmigo() {
        val intent = Intent(this, AmigoActivity::class.java)
        startActivity(intent)
    }

    // Muestra la actividad Añadir Cita
    private fun menuCita() {
        val intent = Intent(this, CitaActivity::class.java)
        startActivity(intent)
    }

    // Muestra la actividad Acerca De
    private fun menuAcercaDe() {
        val intent = Intent(this, AcercaDeActivity::class.java)
        startActivity(intent)
    }

}