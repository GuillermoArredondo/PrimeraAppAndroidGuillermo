package com.example.primeraappandroidguillermo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.actions.NoteIntents
import kotlinx.android.synthetic.main.activity_nota.*


class NotaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nota)
    }

    fun nuevaNota(view: View){
        val titulo = "Titulo"
        val texto = txtNota.toString()
        val intent = Intent()

        intent.setAction(NoteIntents.ACTION_CREATE_NOTE)
            .putExtra(NoteIntents.EXTRA_NAME, titulo)
            .putExtra(NoteIntents.EXTRA_TEXT, texto)

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "Ninguna aplicacion disponible..", Toast.LENGTH_SHORT).show()
        }
    }
}