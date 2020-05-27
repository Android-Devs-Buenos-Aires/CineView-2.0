package com.example.cineview20.view;

import java.lang.System;

@kotlin.Suppress(names = {"NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u001c\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/cineview20/view/YoutubeMovieActivity;", "Lcom/google/android/youtube/player/YouTubeBaseActivity;", "Lcom/google/android/youtube/player/YouTubePlayer$OnInitializedListener;", "()V", "videoList", "", "Lcom/example/cineview20/model/data/youtube/YoutubePojo;", "youtubeNameMovie", "", "youtubePlayer", "Lcom/google/android/youtube/player/YouTubePlayerView;", "getMovie", "", "apikey", "part", "search", "type", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInitializationFailure", "p0", "Lcom/google/android/youtube/player/YouTubePlayer$Provider;", "p1", "Lcom/google/android/youtube/player/YouTubeInitializationResult;", "onInitializationSuccess", "Lcom/google/android/youtube/player/YouTubePlayer;", "p2", "", "app_debug"})
public final class YoutubeMovieActivity extends com.google.android.youtube.player.YouTubeBaseActivity implements com.google.android.youtube.player.YouTubePlayer.OnInitializedListener {
    private com.google.android.youtube.player.YouTubePlayerView youtubePlayer;
    private java.lang.String youtubeNameMovie;
    private java.util.List<com.example.cineview20.model.data.youtube.YoutubePojo> videoList;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onInitializationSuccess(@org.jetbrains.annotations.Nullable()
    com.google.android.youtube.player.YouTubePlayer.Provider p0, @org.jetbrains.annotations.Nullable()
    com.google.android.youtube.player.YouTubePlayer p1, boolean p2) {
    }
    
    @java.lang.Override()
    public void onInitializationFailure(@org.jetbrains.annotations.Nullable()
    com.google.android.youtube.player.YouTubePlayer.Provider p0, @org.jetbrains.annotations.Nullable()
    com.google.android.youtube.player.YouTubeInitializationResult p1) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getMovie(java.lang.String apikey, java.lang.String part, java.lang.String search, java.lang.String type) {
    }
    
    public YoutubeMovieActivity() {
        super();
    }
}