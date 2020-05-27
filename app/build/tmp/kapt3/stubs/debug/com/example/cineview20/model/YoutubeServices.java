package com.example.cineview20.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/cineview20/model/YoutubeServices;", "", "getYoutubeVideo", "Lretrofit2/Call;", "Lcom/example/cineview20/model/data/youtube/YoutubeContainer;", "part", "", "search", "type", "apikey", "app_debug"})
public abstract interface YoutubeServices {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search")
    public abstract retrofit2.Call<com.example.cineview20.model.data.youtube.YoutubeContainer> getYoutubeVideo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "part")
    java.lang.String part, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String apikey);
}