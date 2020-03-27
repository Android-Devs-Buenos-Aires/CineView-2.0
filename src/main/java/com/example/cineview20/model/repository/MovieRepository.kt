package com.example.cineview20.model.repository

import com.example.cineview20.model.ModelUtil
import com.example.cineview20.model.MovieServices
import com.example.cineview20.model.MovieServiceBuilder
import com.example.cineview20.model.data.movie.MovieContainer
import retrofit2.Call

class MovieRepository {
    private var destinationService: MovieServices = MovieServiceBuilder.buildService(MovieServices::class.java)
    var requestCall: Call<MovieContainer>
    init {
        requestCall = destinationService.getMovies(ModelUtil.MOVIE_API_KEY)
    }
}