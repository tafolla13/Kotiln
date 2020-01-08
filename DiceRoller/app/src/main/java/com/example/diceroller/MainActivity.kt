package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {//Admite todas las funciones modernas de Android, la app estara disponible para la mayor cantidad de dispositivos

    override fun onCreate(savedInstanceState: Bundle?) { //OnCreate es un método de ciclo de vida
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//El metodo setContentView hace referencia al diseño que se esta utilizando
        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button =findViewById(R.id.countup_button)
        rollButton.setOnClickListener{
            rollDice()
        }
        countButton.setOnClickListener{
            countUp()
        }
    }

    private fun rollDice(){
        //Toast.makeText(this,"No me toques, ando chido!", Toast.LENGTH_LONG).show()
        val randomInt = Random().nextInt(6)+1
        val resultTxt: TextView = findViewById(R.id.result_txt)
        //resultTxt.text = "Dice Rolled!"
        resultTxt.text = randomInt.toString()
    }

    private fun countUp(){
        val resultText : TextView = findViewById(R.id.result_txt)

        if(resultText.text == "Hello World!"){
            resultText.text = " 1 "
        }
        else {
            var resultInt = resultText.text.toString().toInt()

            if(resultInt<6){
                resultInt ++
                resultText.text = resultInt.toString()
            }
        }
    }
}
