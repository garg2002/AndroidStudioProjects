package com.example.databaseuidesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity2 : AppCompatActivity() {

   private lateinit var database :DatabaseReference
   companion object{
       const val KEY1 = "com.example.databaseuidesign.MainActivity2.mail"
       const val KEY2 = "com.example.databaseuidesign.MainActivity2.name"
       const val KEY3 = "com.example.databaseuidesign.MainActivity2.username"
   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn = findViewById<Button>(R.id.button)
        val username = findViewById<TextInputEditText>(R.id.etUsername)

        btn.setOnClickListener {
            val username = username.text.toString()
            if (username.isNotEmpty()){
                readData(username)
            }
            else{
                Toast.makeText(this,"Please enter user name", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun readData(username: String) {
        database = FirebaseDatabase.getInstance().getReference("user")
        database.child(username).get().addOnSuccessListener {
            if (it.exists())
            {
                val email = it.child("email").value
                val name = it.child("name").value
                val username = it.child("username").value

                val intent = Intent(this,Welcome::class.java)
                intent.putExtra(KEY1,email.toString())
                intent.putExtra(KEY2,name.toString())
                intent.putExtra(KEY3,username.toString())

                startActivity(intent)

            }
            else
            {
                Toast.makeText(this,"User does not exist", Toast.LENGTH_SHORT).show()
            }

        }.addOnCanceledListener {
            Toast.makeText(this,"User does not exist, please first sign up", Toast.LENGTH_SHORT).show()
        }
    }
}

