package com.richard.cadastropet

import android.graphics.drawable.Drawable

data class Usuario (
    var foto: Drawable? =null,
    var nome: String,
    var idade: Idade,
    var apelido: Apelido
)