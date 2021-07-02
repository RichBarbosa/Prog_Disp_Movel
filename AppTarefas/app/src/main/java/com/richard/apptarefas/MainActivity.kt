package com.richard.apptarefas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvUsuarios)
        val lista = mutableListOf<Tarefas>(
            Tarefas(Titulo= "Tarefa 1", tarefa= "Treinar anatomia humana", importancia =Importancia.ALTA),
            Tarefas(Titulo= "Tarefa 2", tarefa= "Treinar perspectiva com 4 pontos de fuga",
                importancia = Importancia.ALTA),
            Tarefas(Titulo= "Tarefa 3", tarefa= "Treinar tocar a musica hitorigo", importancia =Importancia.MEDIA),
            Tarefas(Titulo= "Tarefa 4", tarefa= "Treinar programação", importancia =Importancia.ALTA),
            Tarefas(Titulo= "Tarefa 5", tarefa= "Desenhar a Madoka", importancia =Importancia.ALTA),
        )
        rv.adapter = UsuarioAdapter(lista)

        rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)


    }
}