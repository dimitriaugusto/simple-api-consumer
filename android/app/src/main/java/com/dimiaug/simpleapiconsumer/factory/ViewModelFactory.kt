package com.dimiaug.simpleapiconsumer.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dimiaug.simpleapiconsumer.container.RepoContainer
import com.dimiaug.simpleapiconsumer.ui.main.PageViewModel

class ViewModelFactory(private val repoContainer: RepoContainer) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PageViewModel(repoContainer) as T
    }
}
