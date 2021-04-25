package com.dimiaug.simpleapiclient.marvel

import retrofit2.Call
import retrofit2.http.GET

interface MarvelFictionEndpoints {

    @GET("v1/public/characters")
    fun listCharacters(): Call<List<MarvelCharacter>>

}