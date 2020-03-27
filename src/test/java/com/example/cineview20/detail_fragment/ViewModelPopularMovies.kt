package com.example.cineview20.detail_fragment

import com.example.cineview20.ViewModelPopularMovies
import com.example.cineview20.model.data.movie.MovieContainer
import com.example.cineview20.model.repository.MovieRepository
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.junit.Rule
import org.mockito.Mockito.mock


@RunWith(JUnit4::class)
class ViewModelPopularMoviesTest {


    lateinit var viewModelPopularMovies: ViewModelPopularMovies




    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun getMoviesTest(){
        // Mock API response
        val movieRepository = mock(MovieRepository::class.java)
        Mockito.`when`(movieRepository.requestCall.clone().enqueue(ArgumentMatchers.any())).thenAnswer {
            return@thenAnswer (ArgumentMatchers.anyList<MovieContainer>())
        }
    }

}