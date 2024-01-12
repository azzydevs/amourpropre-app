package com.example.amourpropre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val card1 = findViewById<CardView>(R.id.card1)
        card1.setOnClickListener {
            startActivity(Intent(this, Meditation::class.java))
        }
        val card2 = findViewById<CardView>(R.id.card2)
        card2.setOnClickListener {
            startActivity(Intent(this, Exercise::class.java))
        }
        val card3 = findViewById<CardView>(R.id.card3)
        card3.setOnClickListener {
            startActivity(Intent(this, Gratitude::class.java))
        }
        val card4 = findViewById<CardView>(R.id.card4)
        card4.setOnClickListener {
            startActivity(Intent(this, HealthyDiet::class.java))
        }
        val card5 = findViewById<CardView>(R.id.card5)
        card5.setOnClickListener {
            startActivity(Intent(this, Help::class.java))
        }
        val card6 = findViewById<CardView>(R.id.card6)
        card6.setOnClickListener {
            startActivity(Intent(this, Journal::class.java))
        }
    }
}