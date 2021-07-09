package com.richard.listadecompras

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CompraDAO {
    @Query("SELECT * FROM TB_COMPRA")
    suspend fun getCompra(): List<Compra>

    @Insert
    suspend fun addCompra(t: Compra)

    @Delete
    suspend fun deleteCompra(t: Compra)
}
