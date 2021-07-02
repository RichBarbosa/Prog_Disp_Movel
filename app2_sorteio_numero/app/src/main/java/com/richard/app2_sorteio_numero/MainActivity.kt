package com.richard.app2_sorteio_numero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun SortearNumero(view: view){
        var texto = findViewById<TextView>(R.id.txtNumero)

        var num = Random().nextInt(11)
    }

}