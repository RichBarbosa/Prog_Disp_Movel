package com.richard.tarefasverapi

import com.richard.tarefasverapi.data.model.Tarefa

interface TarefaAdapterListener {
    fun excluirTarefa(tarefa: Tarefa)
}
