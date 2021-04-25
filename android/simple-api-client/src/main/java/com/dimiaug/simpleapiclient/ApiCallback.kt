package com.dimiaug.simpleapiclient

interface ApiCallback<T> {

    fun onResponse(value: T)

    fun onFailure(t: Throwable)

}
