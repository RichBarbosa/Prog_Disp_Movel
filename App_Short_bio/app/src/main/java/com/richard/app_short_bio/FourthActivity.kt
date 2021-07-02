package com.richard.app_short_bio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FourthActivity : AppCompatActivity() {
    lateinit var rs: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        rs = findViewById(R.id.TxtRsExperiencia)

        rs.text = "Conhecimento básico nas liguagens c++, java, python, php, e Kotlin. Além de um" +
                "pouco de conhecimento em SQL. Também já desenvolvi algumas aplicações " +
                "simples nas respectivas linguagens"
    }
}