package com.dimiaug.simpleapiclient

import com.dimiaug.simpleapiclient.marvel.MarvelCharacterApiService
import com.dimiaug.simpleapiclient.marvel.MarvelCharacter
import com.dimiaug.simpleapiclient.marvel.MarvelFictionEndpoints
import com.dimiaug.simpleapiclient.starwars.StarWarsFictionEndpoints
import com.dimiaug.simpleapiclient.starwars.StarWarsCharacterApiService
import com.dimiaug.simpleapiclient.starwars.StarWarsCharacter
import com.dimiaug.simpleapiconsumer.model.CharacterModel

abstract class FictionCharacterApiService<T : CharacterModel> {

    abstract fun listCharacters(apiCallback: ApiCallback<List<T>>)

    object Builder {
        fun createMarvelApi(): FictionCharacterApiService<MarvelCharacter> {
            return MarvelCharacterApiService(
                ServiceBuilder("https://gateway.marvel.com")
                    .buildService(MarvelFictionEndpoints::class.java)
            )
        }

        fun createStarWarsApi(): FictionCharacterApiService<StarWarsCharacter> {
            return StarWarsCharacterApiService(
                ServiceBuilder("https://swapi.dev/api/")
                    .buildService(StarWarsFictionEndpoints::class.java)
            )
        }
    }

}
