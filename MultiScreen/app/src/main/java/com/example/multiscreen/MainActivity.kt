package com.example.multiscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val T1 = findViewById<EditText>(R.id.edT1)
        val T2 = findViewById<EditText>(R.id.edT2)
        val T3 = findViewById<EditText>(R.id.edT3)
        val T4 = findViewById<EditText>(R.id.edT4)
        val buttonOrder = findViewById<Button>(R.id.btnOrder)

        buttonOrder.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(T1.text.toString())
            bundle.putString(T2.text.toString())
            bundle.putString(T3.text.toString())
            bundle.putString(T4.text.toString())


            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }


    }

    companion object {
        val key: String?
    }
}

private fun Bundle.putString(toString: String) {

}
