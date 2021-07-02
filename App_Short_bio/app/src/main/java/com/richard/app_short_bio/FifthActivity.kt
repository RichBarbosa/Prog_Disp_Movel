package com.richard.app_short_bio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FifthActivity : AppCompatActivity() {
    lateinit var rs: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        rs = findViewById(R.id.TxtRsObjetivo)

        rs.text = "Conseguir estabilidade finaceira trabalho na area de QA para depois ir atrás do" +
                "meu verdadeiro objetivo que é se torna um artista de comissions ou trabalhar " +
                "em um estúdio como animador ou ilustrador"
    }
}