package com.dimiaug.simpleapiclient.starwars

import com.dimiaug.simpleapiconsumer.model.starwars.StarWarsCharacterModel
import com.google.gson.annotations.SerializedName

data class StarWarsCharacter(

    @SerializedName("eye_color")
    override val eyeColor: String

) : StarWarsCharacterModel()