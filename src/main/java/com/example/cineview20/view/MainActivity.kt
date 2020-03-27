package com.example.cineview20.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.lifecycle.ViewModelProviders
import com.example.cineview20.R
import com.example.cineview20.ViewModelPopularMovies
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModelPopularMovies: ViewModelPopularMovies
    private lateinit var toolbar : androidx.appcompat.widget.Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.main_tool)
        viewModelPopularMovies = ViewModelProviders.of(this).get(ViewModelPopularMovies::class.java)
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            viewModelPopularMovies.setBackToolBarButtonLiveData(true)
        }
    }
}
