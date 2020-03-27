package com.example.cineview20.model.data.youtube

import com.example.cineview20.model.data.youtube.YoutubePojo
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class YoutubeContainer(
    @SerializedName("items")
    public var listaYoutube: List<YoutubePojo>? = null
) : Serializable