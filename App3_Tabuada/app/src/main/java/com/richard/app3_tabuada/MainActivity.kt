package com.richard.app3_tabuada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var rstab: TextView
    lateinit var btcalc: Button

    var numtab: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      rstab = findViewById(R.id.txtResultado)
      btcalc = findViewById(R.id.BtnSortear)
      btcalc.setOnClickListener{
          numtab = findViewById<EditText>(R.id.txtNum).text.toString().toIntOrNull()
          CalcularTabuada()
      }
    }
  fun CalcularTabuada(){
      var calculo = 0
      var rs = ""

      numtab?.let {
          for (i in 1..10){
              calculo = it * i
              rs +="$numtab x $i = $calculo \n"
          }
      }
      rstab.text = rs
  }



}