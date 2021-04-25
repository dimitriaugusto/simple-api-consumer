package com.dimiaug.simpleapiclient.marvel

import com.dimiaug.simpleapiclient.ApiCallback
import com.dimiaug.simpleapiclient.FictionCharacterApiService

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

internal class MarvelCharacterApiService(private val endpoints: MarvelFictionEndpoints) :
    FictionCharacterApiService<MarvelCharacter>() {

    override fun listCharacters(apiCallback: ApiCallback<List<MarvelCharacter>>) {
        val call: Call<List<MarvelCharacter>> = endpoints.listCharacters()
        call.enqueue(object : Callback<List<MarvelCharacter>> {
            override fun onResponse(
                call: Call<List<MarvelCharacter>>, response: Response<List<MarvelCharacter>>
            ) {
                println("success")
                println(response.body()!!.joinToString(" "))
                apiCallback.onResponse(response.body()!!)
            }

            override fun onFailure(call: Call<List<MarvelCharacter>>, t: Throwable) {
                println("Error: " + t.message)
                apiCallback.onFailure(t)
            }
        })
    }


}