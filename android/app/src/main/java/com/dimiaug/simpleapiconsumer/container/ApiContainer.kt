package com.dimiaug.simpleapiconsumer.container

import com.dimiaug.simpleapiclient.FictionCharacterApiService

class ApiContainer {

    //    val marvelApi = FictionApiService.Builder.createMarvelApi()
    val starWarsApi = FictionCharacterApiService.Builder.createStarWarsApi()

}
