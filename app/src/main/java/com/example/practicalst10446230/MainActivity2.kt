package com.example.practicalst10446230

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity





class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val dayEditText = findViewById<EditText>(R.id.dayeditTextText)
        val submitButton2 =findViewById<Button>(R.id.submitButton2)

        submitButton2.setOnClickListener {

                val day = dayEditText.text.toString().trim()

                if (day.equals("Monday", ignoreCase = true)) {
                    val intent = Intent(this,MainActivity3::class.java)
                    intent.putExtra("day",day)
                    startActivity(intent)
                }
            }
        }
    }

