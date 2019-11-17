package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button =findViewById<Button>(R.id.dice_button)
        rollButton.setOnClickListener {
          //  Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
       rolldice()
        }
    }
    private fun rolldice(){

        val diceImage=findViewById<ImageView>(R.id.dice_Image)
        val diceImageInt:TextView=findViewById(R.id.dice_text)

        val randomInt= Random.nextInt(6)+1
        val image=when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 ->  R.drawable.dice_4
            5 ->  R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImageInt.text=randomInt.toString()
        diceImage.setImageResource(image)
    }
}
