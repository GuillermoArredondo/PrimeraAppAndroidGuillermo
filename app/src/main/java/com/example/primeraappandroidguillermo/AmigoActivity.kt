package com.example.primeraappandroidguillermo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import kotlinx.android.synthetic.main.activity_amigo.*

class AmigoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amigo)
    }

    //fun para añadir un contacto
    fun aniadirContacto(view: View) {

        val nombre = txtNombre.text.toString()
        val numero = txtNumero.text.toString()
        val correo = txtCorreo.text.toString()

        val intent = Intent(Intent.ACTION_INSERT).apply {
            type = ContactsContract.Contacts.CONTENT_TYPE
            putExtra(ContactsContract.Intents.Insert.NAME, nombre)
            putExtra(ContactsContract.Intents.Insert.EMAIL, correo)
            putExtra(ContactsContract.Intents.Insert.PHONE, numero)
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}