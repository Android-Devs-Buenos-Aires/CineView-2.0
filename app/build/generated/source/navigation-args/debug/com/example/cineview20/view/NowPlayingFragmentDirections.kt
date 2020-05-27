package com.example.cineview20.view

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.cineview20.R
import com.example.cineview20.model.data.movie.MoviePojo
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class NowPlayingFragmentDirections private constructor() {
  private data class ActionMainFragmentsEstrenosToMainFragmentDetalles(
    val movies: MoviePojo
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_mainFragmentsEstrenos_to_mainFragmentDetalles

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(MoviePojo::class.java)) {
        result.putParcelable("movies", this.movies as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(MoviePojo::class.java)) {
        result.putSerializable("movies", this.movies as Serializable)
      } else {
        throw UnsupportedOperationException(MoviePojo::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun actionMainFragmentsEstrenosToMainFragmentDetalles(movies: MoviePojo): NavDirections =
        ActionMainFragmentsEstrenosToMainFragmentDetalles(movies)
  }
}
