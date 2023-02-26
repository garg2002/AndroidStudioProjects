package com.example.multiscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val order = intent.getStringExtra(MainActivity.KEY)
        val v1 = findViewById<TextView>(R.id.textView1)

        v1.text ="You ordered $order"
    }
}