package com.example.cineview20.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/cineview20/model/repository/YoutubeRepository;", "", "apikey", "", "part", "search", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "destinationService", "Lcom/example/cineview20/model/YoutubeServices;", "requestCall", "Lretrofit2/Call;", "Lcom/example/cineview20/model/data/youtube/YoutubeContainer;", "getRequestCall", "()Lretrofit2/Call;", "app_debug"})
public final class YoutubeRepository {
    private final com.example.cineview20.model.YoutubeServices destinationService = null;
    @org.jetbrains.annotations.NotNull()
    private final retrofit2.Call<com.example.cineview20.model.data.youtube.YoutubeContainer> requestCall = null;
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.example.cineview20.model.data.youtube.YoutubeContainer> getRequestCall() {
        return null;
    }
    
    public YoutubeRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String apikey, @org.jetbrains.annotations.NotNull()
    java.lang.String part, @org.jetbrains.annotations.NotNull()
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        super();
    }
}