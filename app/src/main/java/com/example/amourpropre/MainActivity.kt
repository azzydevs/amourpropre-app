package com.example.amourpropre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

public class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.getStarted)
        button.setOnClickListener {
            val Intent = Intent(this, SecondActivity::class.java)
            startActivity(Intent)
        }
    }
}