package com.dimiaug.simpleapiconsumer.container

import com.dimiaug.simpleapiconsumer.fictionrepo.CharactersRepo

class RepoContainer(apis: ApiContainer) {

    //    val marvelCharacterRepo = CharactersRepo(marvelApi)
    val starWarsCharacterRepo = CharactersRepo(apis.starWarsApi)

}