package com.richard.appcadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    lateinit var rs: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        rs = findViewById(R.id.TxtResultado)

        val usuario = intent.extras?.get("USUARIO") as Usuario

        listaUsuario.add(usuario)

        rs.text = listaUsuario.toString()

        Toast.makeText(this, usuario.nome, Toast.LENGTH_LONG).show()
    }

    companion object{
        val listaUsuario = mutableListOf<Usuario>()
    }
}
