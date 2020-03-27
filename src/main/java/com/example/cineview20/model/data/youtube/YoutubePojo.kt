package com.example.cineview20.model.data.youtube

import java.io.Serializable

data class YoutubePojo(
    val videoId: String? = "",
    val id: YoutubeIdPojo? = null
) : Serializable