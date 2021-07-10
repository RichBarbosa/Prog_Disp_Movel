package com.richard.meugithub.domain

import com.richard.meugithub.data.model.Github
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

//Responsável por montar a URL final
//ex. apiexemplo.com/v1/ é minha base url
//para eu acessar uma lista de usuarios é a url apiexemplo.com/v1/getUsuarios
//então o service vai juntar o getUsuario (final da url) com a minha base
interface GithubService {

    //POST
    //Requisições HTTP

    //viacep.com.br/ws/11060002/json/
    @GET("{githubInserido}")
    suspend fun buscarGithub(
        @Path("githubInserido") github: String
    ) : Response<Github>
}