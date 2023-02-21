package com.example.webview

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webview1 = findViewById<WebView>(R.id.webView)
        WebViewSetUp(webview1)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun WebViewSetUp(webview: WebView) {

        webview.webViewClient= WebViewClient()

        webview.apply {
            settings.javaScriptEnabled= true
            settings.safeBrowsingEnabled= true

            loadUrl("https://saumyasingh.netlify.app/")
        }
    }

}