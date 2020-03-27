package com.example.cineview20.model

import com.example.cineview20.model.data.movie.MovieContainer
import com.example.cineview20.model.data.youtube.YoutubeContainer
import retrofit2.http.GET
import retrofit2.http.Query


interface MovieServices {
    @GET("movie/popular")
    fun getMovies(@Query("api_key") key: String): retrofit2.Call<MovieContainer>

    @GET("search")
    fun getYoutubeVideo(
        @Query("part") part: String,
        @Query("q") search: String,
        @Query("type") type: String,
        @Query("key") apikey: String
    ): retrofit2.Call<YoutubeContainer>
}

