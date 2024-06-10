package com.example.practicalst10446230

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)


val weatherInfo =findViewById<TextView>(R.id.textView)

        val day = intent.getStringExtra("day")
        if (day != null && day.equals("Monday",ignoreCase = true)) {
            val minTemp = 12
            val maxTemp = 25
            val message = "It's Sunny" }
        var maxTemp = "25"
        var minTemp = "12"
        weatherInfo.text = "Day:$day\"nMin Temp: $minTemp°C\nMax Temp: $maxTemp°C\""

        }
    }

