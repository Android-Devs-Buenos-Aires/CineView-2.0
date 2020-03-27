package com.example.cineview20.view

import android.os.Bundle
import android.widget.Toast
import com.example.cineview20.model.repository.YoutubeRepository
import com.example.cineview20.R
import com.example.cineview20.model.data.youtube.YoutubeContainer
import com.example.cineview20.model.data.youtube.YoutubePojo
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import retrofit2.Call
import retrofit2.Response

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class YoutubeMovieActivity : YouTubeBaseActivity(),YouTubePlayer.OnInitializedListener {
    private lateinit var youtubePlayer : YouTubePlayerView
    private lateinit var youtubeNameMovie: String
    private var videoList : List<YoutubePojo> = ArrayList()

    override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
        p1?.cueVideo(videoList[0].id?.videoId)
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) =
        if (p1?.isUserRecoverableError!!) {
            p1.getErrorDialog(this, 1).show()
        } else {
            Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        youtubePlayer = findViewById(R.id.youtube_player_view)
        youtubeNameMovie = intent.getStringExtra(ViewUtils.YOUTUBE_TRAILER_NAME)
        getMovie(ViewUtils.YOUTUBE_SNIPPET_TYPE,youtubeNameMovie + ViewUtils.YOUTUBE_SEARCH_WORD,ViewUtils.YOUTUBE_PART_TYPE, ViewUtils.YOUTUBE_API_KEY)
    }

    private fun getMovie( apikey : String,  part : String, search : String,  type : String) {
        var requestImplYoutube =
            YoutubeRepository(apikey, part, search, type)
        requestImplYoutube.requestCall.enqueue(object : retrofit2.Callback<YoutubeContainer> {
            override fun onFailure(call: Call<YoutubeContainer>, t: Throwable) {
            }

            override fun onResponse(
                call: Call<YoutubeContainer>, response: Response<YoutubeContainer>) {
                videoList = response.body()?.listaYoutube!!
                youtubePlayer.initialize(ViewUtils.YOUTUBE_API_KEY,this@YoutubeMovieActivity)
            }
        })
    }
}
