package com.example.multiscreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multiscreen.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object {
        const val KEY = "com.example.multiscreen.MianActivity"
    }
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
            setContentView(view)

        binding.btnOrder.setOnClickListener {
            val msg = binding.edT1.text.toString() + "" + binding.edT2.text.toString() + "" + binding.edT3.text.toString() + "" + binding.edT4.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(KEY, msg)
            startActivity(intent)
        }


    }

}

