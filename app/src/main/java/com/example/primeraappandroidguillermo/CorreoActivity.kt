package com.example.primeraappandroidguillermo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_correo.*

class CorreoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correo)
    }

    //fun para mandar un correo
    fun mandarMail(view: View) {
        val email = Intent(Intent.ACTION_SEND)
        email.data = Uri.parse("mailto:")
        email.type = "text/plain"
        val correosDestino = txtMail.text.toString()
        email.putExtra(Intent.EXTRA_EMAIL, correosDestino)
        email.putExtra(Intent.EXTRA_SUBJECT, txtAsunto.text.toString())
        email.putExtra(Intent.EXTRA_TEXT, txtTexto.text.toString())
        startActivity(Intent.createChooser(email, "Send Email"))
    }
}


