package com.richard.appcadastro

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var foto: ImageView
    lateinit var botao: Button
    lateinit var nome: EditText
    lateinit var idade: EditText
    lateinit var fotobotao: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foto = findViewById(R.id.ImgFoto)
        nome = findViewById(R.id.TxtNome)
        idade = findViewById(R.id.TxtIdade)
        botao = findViewById(R.id.BtnSalvar)

        botao.setOnClickListener{
            val intent = Intent(this@MainActivity, SecondActivity::class.java)

            val usuario = Usuario(nome = nome.text.toString(), idade = idade.text.toString().toInt())
            intent.putExtra("USUARIO", usuario)

            startActivity(intent)
        }
        fotobotao = findViewById(R.id.BtnFoto)
        fotobotao.setOnClickListener{
            abrirCamera()
        }
    }
    fun abrirCamera(){
        val intent =Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        if(intent.resolveActivity(packageManager) != null){
            startActivityForResult(intent, 12345)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 12345  && resultCode == RESULT_OK){
            val fotoTirada = data?.extras?.get("data") as Bitmap
            foto.setImageBitmap(fotoTirada)
        }
    }
}