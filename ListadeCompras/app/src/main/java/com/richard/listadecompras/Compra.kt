package com.richard.listadecompras

import androidx.room.*

@Entity(tableName = "TB_COMPRA")
data class Compra(
    @PrimaryKey(autoGenerate = true)
    var id: Int=0,
    @ColumnInfo(name="Nome")
    val nome: String,
)
