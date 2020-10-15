package com.example.primeraappandroidguillermo

import android.content.Intent
import android.os.Bundle
import android.provider.CalendarContract
import android.provider.ContactsContract
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_amigo.*
import kotlinx.android.synthetic.main.activity_cita.*
import java.util.*


class CitaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cita)
    }


    //fun para añadir una cita al calendario
    fun aniadirCita(view: View){
        val cal: Calendar = Calendar.getInstance()
        val intent = Intent(Intent.ACTION_EDIT)
        intent.type = "vnd.android.cursor.item/event"
        intent.putExtra("beginTime", cal.getTimeInMillis())
        intent.putExtra("allDay", true)
        intent.putExtra("rrule", "FREQ=YEARLY")
        intent.putExtra("endTime", cal.getTimeInMillis() + 60 * 60 * 1000)
        intent.putExtra("location", txtUbicacion.text.toString());
        intent.putExtra("title", txtNombreCita.text.toString())
        intent.putExtra("description", txtDescripcion.text.toString());
        startActivity(intent)
    }


}