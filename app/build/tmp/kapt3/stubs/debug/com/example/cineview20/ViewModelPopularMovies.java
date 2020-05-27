package com.example.cineview20;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/cineview20/ViewModelPopularMovies;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_backToolBarButtonPressed", "Landroidx/lifecycle/MutableLiveData;", "", "_isMovieLiveData", "Lcom/example/cineview20/model/data/movie/MovieContainer;", "backFromDetailFragment", "getBackFromDetailFragment", "()Z", "setBackFromDetailFragment", "(Z)V", "backToolBarButtonPressed", "Landroidx/lifecycle/LiveData;", "getBackToolBarButtonPressed", "()Landroidx/lifecycle/LiveData;", "movieLiveData", "getMovieLiveData", "movieRepository", "Lcom/example/cineview20/model/repository/MovieRepository;", "getMovieFromService", "Lkotlinx/coroutines/Job;", "setBackToolBarButtonLiveData", "", "state", "setMovieRepository", "app_debug"})
public final class ViewModelPopularMovies extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.cineview20.model.data.movie.MovieContainer> _isMovieLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.cineview20.model.data.movie.MovieContainer> movieLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _backToolBarButtonPressed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> backToolBarButtonPressed = null;
    private com.example.cineview20.model.repository.MovieRepository movieRepository;
    private boolean backFromDetailFragment;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.cineview20.model.data.movie.MovieContainer> getMovieLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getBackToolBarButtonPressed() {
        return null;
    }
    
    public final boolean getBackFromDetailFragment() {
        return false;
    }
    
    public final void setBackFromDetailFragment(boolean p0) {
    }
    
    public final void setBackToolBarButtonLiveData(boolean state) {
    }
    
    public final void setMovieRepository(@org.jetbrains.annotations.NotNull()
    com.example.cineview20.model.repository.MovieRepository movieRepository) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getMovieFromService() {
        return null;
    }
    
    public ViewModelPopularMovies(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}