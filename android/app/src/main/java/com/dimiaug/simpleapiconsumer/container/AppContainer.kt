package com.dimiaug.simpleapiconsumer.container

class AppContainer {

    private val apis = ApiContainer()
    private val repos = RepoContainer(apis)

    val factories = FactoryContainer(repos)

}
