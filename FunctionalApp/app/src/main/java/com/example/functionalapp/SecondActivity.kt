package com.example.functionalapp

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat

class SecondActivity : AppCompatActivity() {
    val REQUEST_PHONE_CALL = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener {
            val value = Intent(Intent.ACTION_CALL)
            value.data = Uri.parse("tel:9300253104")
            startActivity(value)
        }


        val i1 = findViewById<CardView>(R.id.card1)
        i1.setOnClickListener {
            val v1 = Intent(Intent.ACTION_VIEW)
            v1.data = Uri.parse("https://en.wikipedia.org/wiki/Android_software_development")
            startActivity(v1)

        }
        val i2 = findViewById<CardView>(R.id.card2)
        i2.setOnClickListener {
            val v1 = Intent(Intent.ACTION_VIEW)
            v1.data = Uri.parse("https://www.w3schools.com/whatis/")
            startActivity(v1)

        }
        val i3 = findViewById<CardView>(R.id.card3)
        i3.setOnClickListener {
            val v1 = Intent(Intent.ACTION_VIEW)
            v1.data =
                Uri.parse("https://aws.amazon.com/what-is/data-science/#:~:text=Data%20science%20is%20the%20study,analyze%20large%20amounts%20of%20data.")
            startActivity(v1)

        }
        val i4 = findViewById<CardView>(R.id.card4)
        i4.setOnClickListener {
            val v1 = Intent(Intent.ACTION_VIEW)
            v1.data = Uri.parse("https://www.ibm.com/in-en/topics/machine-learning")
            startActivity(v1)

        }
        val i5 = findViewById<CardView>(R.id.card5)
        i5.setOnClickListener {
            val v1 = Intent(Intent.ACTION_VIEW)
            v1.data = Uri.parse("https://www.techtarget.com/searchenterpriseai/definition/AI-Artificial-Intelligence#:~:text=Artificial%20intelligence%20is%20the%20simulation,speech%20recognition%20and%20machine%20vision.")
            startActivity(v1)

        }
        val i6 = findViewById<CardView>(R.id.card6)
        i6.setOnClickListener {
            val v1 = Intent(Intent.ACTION_VIEW)
            v1.data = Uri.parse("https://mailchimp.com/marketing-glossary/digital-marketing/#:~:text=Digital%20marketing%2C%20also%20called%20online,messages%20as%20a%20marketing%20channel.")
            startActivity(v1)

        }
    }
}