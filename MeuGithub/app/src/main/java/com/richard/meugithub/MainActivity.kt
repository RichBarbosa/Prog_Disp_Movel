package com.richard.meugithub

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.richard.meugithub.domain.GithubService
import com.richard.meugithub.util.Network
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main

class MainActivity : AppCompatActivity() {

    private lateinit var campoUser: EditText
    private lateinit var botaoUser: Button
    private lateinit var respostaUser: TextView
    private lateinit var carregamentoUser : ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campoUser = findViewById(R.id.edtUser)
        botaoUser = findViewById(R.id.btnBuscarUser)
        respostaUser = findViewById(R.id.txtUserResponse)
        carregamentoUser = findViewById(R.id.prgLoading)


        botaoUser.setOnClickListener {
            val git = campoUser.text.toString()
            if(git.isNotEmpty()){
                buscarGithub(git)
            } else {
                campoUser.error = "Digite um Usuário válido"
            }
        }
    }

    fun buscarGithub(github: String){
        val retrofitClient = Network.retrofitConfig("https://api.github.com/users/")
        val servico = retrofitClient.create(GithubService::class.java)

        CoroutineScope(IO).launch {
            try {
                val response = servico.buscarGithub(github)

                withContext(Main){
                    changeLoadingVisibility(isVisibile = true)
                    delay(2000L)
                    if(response.isSuccessful){
                        changeLoadingVisibility(isVisibile = false)
                        respostaUser.text = response.body().toString()
                    }
                }

            } catch (e: Exception){
                withContext(Main){
                    changeLoadingVisibility(isVisibile = false)
                    respostaUser.text = "Não foi possível processar a sua solicitação."
                }
            }
        }
    }



    fun changeLoadingVisibility(isVisibile: Boolean){
        if(isVisibile){
            respostaUser.text = ""
            carregamentoUser.visibility = View.VISIBLE
            botaoUser.visibility = View.INVISIBLE
        } else {
            carregamentoUser.visibility = View.INVISIBLE
            botaoUser.visibility = View.VISIBLE
        }
    }
}