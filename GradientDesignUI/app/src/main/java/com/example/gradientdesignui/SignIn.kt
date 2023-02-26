package com.example.gradientdesignui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val btn = findViewById<Button>(R.id.button2)
        btn.setOnClickListener {
            Toast.makeText(applicationContext, "SignIn process completed successfully", Toast.LENGTH_SHORT).show()
        }
    }
}