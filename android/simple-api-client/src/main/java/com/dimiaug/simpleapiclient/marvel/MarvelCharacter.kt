package com.dimiaug.simpleapiclient.marvel

import com.dimiaug.simpleapiconsumer.model.marvel.MarvelCharacterModel
import com.google.gson.annotations.SerializedName

data class MarvelCharacter(

    @SerializedName("name")
    override val name: String,

    @SerializedName("description")
    override val description: String

) : MarvelCharacterModel()