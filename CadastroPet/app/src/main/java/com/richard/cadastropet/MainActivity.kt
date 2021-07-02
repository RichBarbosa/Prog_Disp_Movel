package com.richard.cadastropet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvUsuarios)
        val lista = mutableListOf<Usuario>(
            Usuario(nome= "Flocos", idade = Idade.ENTRE5E10,
                apelido = Apelido.GORDO, foto=resources.getDrawable(R.drawable.gordo)),
            Usuario(nome= "Preto", idade =Idade.ATE5,
                apelido = Apelido.BLACK, foto=resources.getDrawable(R.drawable.gatopreto))
        )
        rv.adapter = UsuarioAdapter(lista)

        rv.layoutManager = LinearLayoutManager(this)
    }
}