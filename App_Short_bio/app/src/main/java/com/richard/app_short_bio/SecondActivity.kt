package com.richard.app_short_bio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var rs: TextView
    lateinit var rs2: TextView
    lateinit var rs3: TextView
    lateinit var botao: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        rs = findViewById(R.id.TxtRsNome)
        rs2 = findViewById(R.id.TxtRsIdade)
        rs3 = findViewById(R.id.TxtRsHobby)

        /*era um botão para voltar para a MainActivity só que depois eu percebi que era redundante
         então acabei não fazendo nas outras mas resolvi deixa esse por questões didaticas.
         */
        botao = findViewById(R.id.BtnVoltar)
        botao.setOnClickListener{
            val intent = Intent(this@SecondActivity,MainActivity::class.java)
            startActivity(intent)
        }
        rs.text = "Richard Barbosa dos Santos Silva."
        rs2.text = "20 anos."
        rs3.text = "Desenhar, jogar, assistir animes, tocar música, ler mangas, e algumas outras coisas."

    }

}