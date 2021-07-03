package com.richard.apptarefas20

import android.graphics.Bitmap

data class Tarefas(
    var foto: Bitmap?=null,
    var nome: String,
    var importancia: Importancia,
    var prazo: Prazo,
    var progresso: Boolean
)
