package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener { XlNut() }


    }
    private fun XlNut() {
        Toast.makeText(this, "Chào Đinh Lâm Nghĩa",Toast.LENGTH_SHORT).show()

        val text1: TextView = findViewById(R.id.text1)
        text1.text = "Chào bạn! <3"

        val randomInt = (1..6).random()
        text1.text = randomInt.toString()
    }

}