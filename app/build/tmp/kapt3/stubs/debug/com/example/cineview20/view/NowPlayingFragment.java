package com.example.cineview20.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/cineview20/view/NowPlayingFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/cineview20/view/MoviePremierRecyclerViewAdapter$OnItemClickListener;", "()V", "binding", "Lcom/example/cineview20/databinding/FragmentMainFragmentsEstrenosBinding;", "recyclerAdapterAdapter", "Lcom/example/cineview20/view/MoviePremierRecyclerViewAdapter;", "viewModelPopularMovies", "Lcom/example/cineview20/ViewModelPopularMovies;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "", "movie", "Lcom/example/cineview20/model/data/movie/MoviePojo;", "setUpToolBar", "setupView", "app_debug"})
public final class NowPlayingFragment extends androidx.fragment.app.Fragment implements com.example.cineview20.view.MoviePremierRecyclerViewAdapter.OnItemClickListener {
    private com.example.cineview20.databinding.FragmentMainFragmentsEstrenosBinding binding;
    private com.example.cineview20.ViewModelPopularMovies viewModelPopularMovies;
    private com.example.cineview20.view.MoviePremierRecyclerViewAdapter recyclerAdapterAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setUpToolBar() {
    }
    
    private final void setupView() {
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.NotNull()
    com.example.cineview20.model.data.movie.MoviePojo movie) {
    }
    
    public NowPlayingFragment() {
        super();
    }
}