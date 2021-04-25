package com.dimiaug.simpleapiconsumer.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dimiaug.simpleapiconsumer.container.RepoContainer
import com.dimiaug.simpleapiconsumer.model.CharacterModel

class PageViewModel(private val repos: RepoContainer) : ViewModel() {

    val characters: LiveData<out List<CharacterModel>>
        get() {
            return when (_index.value) {
                1 -> repos.starWarsCharacterRepo.getData()
                2 -> MutableLiveData(listOf(CharacterModel(name = "<not implemented>")))
                else -> MutableLiveData(listOf())
            }
        }

    private val _index = MutableLiveData<Int>()
    fun setIndex(index: Int) {
        _index.value = index
    }


}