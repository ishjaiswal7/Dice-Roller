package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btn: Button
    private lateinit var imgDice: ImageView
    //private lateinit var textDice: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById((R.id.btnRoll)) // initialize btn
        imgDice = findViewById((R.id.imgDiceOutput)) // initialize imgDice
        //textDice = findViewById((R.id.diceRollOutput)) // initialize textDice
        btn.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        //textDice.text = dice.roll().toString()   //for text/num

        //for img
        imgDice.setImageDrawable(getDrawable(dice.roll()))
        //OR
        //val imgRes = dice.roll()
        //imgDice.setImageResource(imgRes) // set image on ImageView
    }
}


class Dice(private val numSides: Int) {
    fun roll(): Int {
        //return (1..numSides).random()
        return  when ((1..numSides).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}