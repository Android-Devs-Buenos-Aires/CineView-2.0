package com.example.cineview20.model.data.movie

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MoviePojo(
    @SerializedName("poster_path")
    val posterPath: String? = "",
    @SerializedName("id")
    var id: Int? = null,
    @SerializedName("title")
    var title: String? = null,
    @SerializedName("overview")
    var overview: String? = null,
    @SerializedName("vote_average")
    var score: String? = null,
    @SerializedName("release_date")
    var releaseDate: String? = null,
    @SerializedName("genre_ids")
    var genres: List<Int>? = null
) : Serializable
