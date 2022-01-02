package com.example.animatestartactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn)

        button.setOnClickListener {
            toSecondConstructor()
        }

    }

    private fun toSecondConstructor() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_in_right,
            R.anim.slide_out_left)
    }
}