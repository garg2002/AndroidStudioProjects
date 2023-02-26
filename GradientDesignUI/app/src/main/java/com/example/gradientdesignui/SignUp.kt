package com.example.gradientdesignui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val btn = findViewById<Button>(R.id.button2)

        btn.setOnClickListener {
            Toast. makeText(applicationContext,"SignUp Successfully", Toast. LENGTH_SHORT).show();
        }
        val btn1 = findViewById<Button>(R.id.button3)

        btn1.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }
    }
}