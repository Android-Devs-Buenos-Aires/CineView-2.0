package com.example.cineview20.model.repository

import com.example.cineview20.model.data.youtube.YoutubeContainer
import com.example.cineview20.model.YoutubeServiceBuilder
import com.example.cineview20.model.YoutubeServices
import retrofit2.Call

class YoutubeRepository(apikey: String, part: String, search: String, type: String) {
    private val destinationService: YoutubeServices =
        YoutubeServiceBuilder.buildService(YoutubeServices::class.java)
    val requestCall: Call<YoutubeContainer>

    init {
        requestCall = destinationService.getYoutubeVideo(apikey, part, search, type)
    }
}