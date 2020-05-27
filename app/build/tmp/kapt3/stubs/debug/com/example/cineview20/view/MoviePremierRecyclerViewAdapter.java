package com.example.cineview20.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/cineview20/view/MoviePremierRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/cineview20/view/MoviePremierRecyclerViewAdapter$MovieViewHolder;", "itemClickListener", "Lcom/example/cineview20/view/MoviePremierRecyclerViewAdapter$OnItemClickListener;", "(Lcom/example/cineview20/view/MoviePremierRecyclerViewAdapter$OnItemClickListener;)V", "movieList", "", "Lcom/example/cineview20/model/data/movie/MoviePojo;", "MoviePremierRecyclerView", "", "movie", "Lcom/example/cineview20/model/data/movie/MovieContainer;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MovieViewHolder", "OnItemClickListener", "app_debug"})
public final class MoviePremierRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.cineview20.view.MoviePremierRecyclerViewAdapter.MovieViewHolder> {
    private java.util.List<com.example.cineview20.model.data.movie.MoviePojo> movieList;
    private final com.example.cineview20.view.MoviePremierRecyclerViewAdapter.OnItemClickListener itemClickListener = null;
    
    public final void MoviePremierRecyclerView(@org.jetbrains.annotations.NotNull()
    com.example.cineview20.model.data.movie.MovieContainer movie) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.cineview20.view.MoviePremierRecyclerViewAdapter.MovieViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.cineview20.view.MoviePremierRecyclerViewAdapter.MovieViewHolder holder, int position) {
    }
    
    public MoviePremierRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    com.example.cineview20.view.MoviePremierRecyclerViewAdapter.OnItemClickListener itemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/cineview20/view/MoviePremierRecyclerViewAdapter$MovieViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imageMovie", "Landroid/widget/ImageView;", "movieDate", "Landroid/widget/TextView;", "movieName", "bind", "", "movie", "Lcom/example/cineview20/model/data/movie/MoviePojo;", "clickListener", "Lcom/example/cineview20/view/MoviePremierRecyclerViewAdapter$OnItemClickListener;", "app_debug"})
    public static final class MovieViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView imageMovie = null;
        private final android.widget.TextView movieName = null;
        private final android.widget.TextView movieDate = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.cineview20.model.data.movie.MoviePojo movie, @org.jetbrains.annotations.NotNull()
        com.example.cineview20.view.MoviePremierRecyclerViewAdapter.OnItemClickListener clickListener) {
        }
        
        public MovieViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/cineview20/view/MoviePremierRecyclerViewAdapter$OnItemClickListener;", "", "onItemClicked", "", "movie", "Lcom/example/cineview20/model/data/movie/MoviePojo;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        com.example.cineview20.model.data.movie.MoviePojo movie);
    }
}