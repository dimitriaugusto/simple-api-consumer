package com.dimiaug.simpleapiclient.starwars

import retrofit2.Call
import retrofit2.http.GET

interface StarWarsFictionEndpoints {

    @GET("people")
    fun listPeople(): Call<StarWarsCharactersList>

}