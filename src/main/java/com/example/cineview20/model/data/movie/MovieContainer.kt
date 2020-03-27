package com.example.cineview20.model.data.movie

import com.google.gson.annotations.SerializedName

data class MovieContainer(
    @SerializedName("results")
    val moviesResult: MutableList<MoviePojo>
)