package com.richard.app_short_bio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    lateinit var rs: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        rs = findViewById(R.id.TxtRsFormacao)

        rs.text = "Curso em analise e desenvolvimento de sistemas na Fatec de Praia Grande"
    }
}