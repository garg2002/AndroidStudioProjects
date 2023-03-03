package com.example.databaseuidesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val name = intent.getStringExtra(MainActivity2.KEY2)
        val email= intent.getStringExtra(MainActivity2.KEY1)
        val username = intent.getStringExtra(MainActivity2.KEY3)

        val text = findViewById<TextView>(R.id.textView)
        val mail = findViewById<TextView>(R.id.btn1)
        val uname = findViewById<TextView>(R.id.btn2)
        text.text = "Welcome $name"
        mail.text  ="Email : $email"
        uname.text = "Username : $username"
    }
}