package com.dimiaug.simpleapiconsumer.container

import com.dimiaug.simpleapiconsumer.factory.ViewModelFactory

class FactoryContainer(repos: RepoContainer) {

    val viewModelFactory = ViewModelFactory(repos)
}
