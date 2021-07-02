package com.richard.cadastrodev

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
            Usuario(nome= "Richard", email="richbarbosa2608@gmail.com", stack = Stack.BACKEND,
                senioridade = Senioridade.JUNIOR, foto=resources.getDrawable(R.drawable.madokami)),
            Usuario(nome= "Josia", email="Josiafurry@gmail.com", stack = Stack.FRONTEND,
                senioridade = Senioridade.PLENO)
        )
        rv.adapter = UsuarioAdapter(lista)

        rv.layoutManager = LinearLayoutManager(this)
    }
}