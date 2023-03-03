package com.example.databaseuidesign

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.databaseuidesign.R.id.button
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
   private  lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etfullname = findViewById<TextInputEditText>(R.id.etFullname)
        val etmail = findViewById<TextInputEditText>(R.id.etEmail)
        val etusername = findViewById<TextInputEditText>(R.id.etUsername)
        val etpass = findViewById<TextInputEditText>(R.id.etPass)
        val etbtn = findViewById<Button>(R.id.button)

        etbtn.setOnClickListener {
            val fullname = etfullname.text.toString()
            val email = etmail.text.toString()
            val username = etusername.text.toString()
            val pass = etpass.text.toString()

            val user = User(fullname, email, pass, username)

            database = FirebaseDatabase.getInstance().getReference("user")
            database.child(username).setValue(user).addOnSuccessListener {
                Toast.makeText(this, "User Registered", Toast.LENGTH_SHORT).show()
            }.addOnCanceledListener {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }
        }

        val textview = findViewById<TextView>(R.id.textView3)
        textview.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}