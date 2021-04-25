package com.dimiaug.simpleapiconsumer.fictionrepo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

abstract class FictionRepo<T> {

    protected val data: MutableLiveData<T> = MutableLiveData<T>()

    fun getData(): LiveData<T> {
        return data
    }

    abstract fun fetchData()

}