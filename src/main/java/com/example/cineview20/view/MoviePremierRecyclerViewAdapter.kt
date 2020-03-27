package com.example.cineview20.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cineview20.R
import com.example.cineview20.model.data.movie.MovieContainer
import com.example.cineview20.model.data.movie.MoviePojo

class MoviePremierRecyclerViewAdapter(private val itemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<MoviePremierRecyclerViewAdapter.MovieViewHolder>() {
    private var movieList: MutableList<MoviePojo> = ArrayList()

    fun MoviePremierRecyclerView(movie: MovieContainer) {
        movieList = movie.moviesResult
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater =
            LayoutInflater.from(parent.context).inflate(R.layout.premier_movie_cell, parent, false)
        return MovieViewHolder(inflater)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movieList.get(position), itemClickListener)
    }

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageMovie: ImageView = itemView.findViewById(R.id.imagen_celda_busqueda)
        private val movieName: TextView = itemView.findViewById(R.id.titulo_pelicula_celda_busqueda)
        private val movieDate: TextView = itemView.findViewById(R.id.fecha_pelicula_celda_busqueda)


        fun bind(movie: MoviePojo, clickListener: OnItemClickListener) {
            Glide.with(itemView)
                .load(ViewUtils.DETAIL_IMAGE_URL+ movie.posterPath)
                .into(imageMovie)

            movieName.text = movie.title
            movieDate.text = movie.releaseDate
            itemView.setOnClickListener {
                clickListener.onItemClicked(movie)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClicked(movie: MoviePojo)
    }
}