package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var appCompatImageViewDice: AppCompatImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appCompatButtonRoll = findViewById<AppCompatButton>(R.id.appCompatButtonRoll)
        appCompatButtonRoll.setOnClickListener {
            rollDice()
        }

        appCompatImageViewDice = findViewById(R.id.appCompatImageViewDice)
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        appCompatImageViewDice.setImageResource(drawableResource)
    }
}
