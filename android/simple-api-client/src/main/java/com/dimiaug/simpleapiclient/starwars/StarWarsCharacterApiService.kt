package com.dimiaug.simpleapiclient.starwars

import com.dimiaug.simpleapiclient.ApiCallback
import com.dimiaug.simpleapiclient.FictionCharacterApiService

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

internal class StarWarsCharacterApiService(private val endpoints: StarWarsFictionEndpoints) :
    FictionCharacterApiService<StarWarsCharacter>() {

    override fun listCharacters(apiCallback: ApiCallback<List<StarWarsCharacter>>) {
        val call: Call<StarWarsCharactersList> = endpoints.listPeople()
        call.enqueue(object : Callback<StarWarsCharactersList> {
            override fun onResponse(
                call: Call<StarWarsCharactersList>, response: Response<StarWarsCharactersList>
            ) {
                println("success")
                println(response.body()!!.starWarsCharacters.joinToString(" "))
                apiCallback.onResponse(response.body()!!.starWarsCharacters)
            }

            override fun onFailure(call: Call<StarWarsCharactersList>, t: Throwable) {
                println("Error: " + t.message)
                apiCallback.onFailure(t)
            }
        })
    }

}