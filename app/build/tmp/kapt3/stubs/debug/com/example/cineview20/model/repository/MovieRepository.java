package com.example.cineview20.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/cineview20/model/repository/MovieRepository;", "", "()V", "destinationService", "Lcom/example/cineview20/model/MovieServices;", "requestCall", "Lretrofit2/Call;", "Lcom/example/cineview20/model/data/movie/MovieContainer;", "getRequestCall", "()Lretrofit2/Call;", "setRequestCall", "(Lretrofit2/Call;)V", "app_debug"})
public final class MovieRepository {
    private com.example.cineview20.model.MovieServices destinationService;
    @org.jetbrains.annotations.NotNull()
    private retrofit2.Call<com.example.cineview20.model.data.movie.MovieContainer> requestCall;
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.example.cineview20.model.data.movie.MovieContainer> getRequestCall() {
        return null;
    }
    
    public final void setRequestCall(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<com.example.cineview20.model.data.movie.MovieContainer> p0) {
    }
    
    public MovieRepository() {
        super();
    }
}