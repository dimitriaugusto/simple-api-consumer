package com.dimiaug.simpleapiclient.starwars

import com.google.gson.annotations.SerializedName

data class StarWarsCharactersList(

    @SerializedName("results")
    val starWarsCharacters: List<StarWarsCharacter>

)
