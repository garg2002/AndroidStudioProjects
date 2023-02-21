package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chrome = findViewById<CardView>(R.id.google)
        val cam = findViewById<CardView>(R.id.camera)
        val whatsapp = findViewById<CardView>(R.id.whatsapp)

        chrome.setOnClickListener {
           val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse( "https://www.google.com/")
            startActivity(intent)
        }

        cam.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        whatsapp.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://web.whatsapp.com/")
            startActivity(intent)
        }
    }
}