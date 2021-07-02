package com.richard.app_short_bio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var botao: Button
    lateinit var botao2: Button
    lateinit var botao3: Button
    lateinit var botao4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botao = findViewById(R.id.BtnSobre)
        botao2 = findViewById(R.id.BtnFormacao)
        botao3 = findViewById(R.id.BtnExperiencia)
        botao4 = findViewById(R.id.BtnObjetivo)

        botao.setOnClickListener{
            val intent = Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(intent)
        }

        botao2.setOnClickListener{
            val intent2 = Intent(this@MainActivity,ThirdActivity::class.java)
            startActivity(intent2)
        }

        botao3.setOnClickListener{
            val intent3 = Intent(this@MainActivity,FourthActivity::class.java)
            startActivity(intent3)
        }
        botao4.setOnClickListener{
            val intent4 = Intent(this@MainActivity,FifthActivity::class.java)
            startActivity(intent4)
        }
    }
}