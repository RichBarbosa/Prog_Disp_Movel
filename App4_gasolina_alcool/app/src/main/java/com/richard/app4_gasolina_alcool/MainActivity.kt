package com.richard.app4_gasolina_alcool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var rs: TextView
    lateinit var botao: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rs = findViewById(R.id.txtResultado)
        botao = findViewById(R.id.BtnCalculo)

        botao.setOnClickListener{

            CalcularValor()
        }
    }
    fun CalcularValor(){
        var num: Double = findViewById<EditText>(R.id.txtNumero).text.toString().toDouble()
        var num2: Double = findViewById<EditText>(R.id.txtNum).text.toString().toDouble()
        var calculo:Double = (num2 / num)

        if(calculo < 0.7){
            rs.text = "Melhor usar Álcool"
        }else if(calculo > 0.7){
            rs.text = "Melhor usar Gasolina"
        }

     }



}