package com.richard.meugithub.data.model

import com.google.gson.annotations.SerializedName

class Github(@SerializedName("login") val login: String,
          @SerializedName("html_url")val url: String,
          @SerializedName("public_repos")val repositorio: String,
          @SerializedName("followers")val seguidores: String,
          @SerializedName("following")val seguindo: String) {


        //Sobrecarga de método
    override fun toString() : String {
        return "Usuário: $login\nlink: $url\nrepositórios : $repositorio\nseguidores: $seguidores\nseguindo: $seguindo"
    }

}