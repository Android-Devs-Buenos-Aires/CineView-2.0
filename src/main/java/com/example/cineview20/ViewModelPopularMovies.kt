package com.example.cineview20

import android.app.Application
import androidx.lifecycle.*
import com.example.cineview20.model.data.movie.MovieContainer
import com.example.cineview20.model.repository.MovieRepository
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response


class ViewModelPopularMovies(application: Application) : AndroidViewModel(application) {

    private val _isMovieLiveData = MutableLiveData<MovieContainer>()
    val movieLiveData : LiveData<MovieContainer> = _isMovieLiveData
    private val _backToolBarButtonPressed = MutableLiveData<Boolean>()
    val backToolBarButtonPressed : LiveData<Boolean> = _backToolBarButtonPressed
    private var movieRepository : MovieRepository = MovieRepository()
    var backFromDetailFragment : Boolean = false

    fun setBackToolBarButtonLiveData (state: Boolean){
        _backToolBarButtonPressed.value = state
    }

    fun getMovieFromService() = viewModelScope.launch{
        movieRepository.requestCall.clone().enqueue(object : retrofit2.Callback<MovieContainer> {
            override fun onFailure(call: Call<MovieContainer>, t: Throwable) {
            }

            override fun onResponse(
                call: Call<MovieContainer>,
                response: Response<MovieContainer>) {
                _isMovieLiveData.value = response.body()
            }
        })
    }

}