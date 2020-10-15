package com.example.primeraappandroidguillermo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView

class AcercaDeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca_de)
    }

    //fun para abrir el enlace a twitter desde el icono
    fun onClickTwitter(view: View){
        val uri = Uri.parse("https://twitter.com/gapacer")
        val intent = Intent(Intent.ACTION_VIEW,uri)
        startActivity(intent)
    }

    //fun para abrir el enlace a GitHub desde el icono
    fun onClickGitHub(view: View){
        val uri = Uri.parse("https://github.com/GuillermoArredondo")
        val intent = Intent(Intent.ACTION_VIEW,uri)
        startActivity(intent)
    }
}