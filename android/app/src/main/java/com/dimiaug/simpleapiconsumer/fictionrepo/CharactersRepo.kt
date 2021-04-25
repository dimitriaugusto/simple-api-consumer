package com.dimiaug.simpleapiconsumer.fictionrepo

import android.util.Log
import com.dimiaug.simpleapiclient.ApiCallback
import com.dimiaug.simpleapiclient.FictionCharacterApiService
import com.dimiaug.simpleapiconsumer.TAG
import com.dimiaug.simpleapiconsumer.model.CharacterModel

class CharactersRepo<T : CharacterModel>(
    private val characterApiService: FictionCharacterApiService<T>
) : FictionRepo<List<T>>() {

    init {
        fetchData()
    }

    override fun fetchData() {
        characterApiService.listCharacters(object : ApiCallback<List<T>> {
            override fun onResponse(value: List<T>) {
                data.value = value
            }

            override fun onFailure(t: Throwable) {
                Log.e(TAG, "cannot retrieve characters from api $characterApiService", t)
            }
        })
    }

}
