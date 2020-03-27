package com.example.cineview20.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cineview20.*
import com.example.cineview20.databinding.FragmentMainFragmentsEstrenosBinding
import com.example.cineview20.model.data.movie.MovieContainer
import com.example.cineview20.model.data.movie.MoviePojo

class NowPlayingFragment : Fragment(), MoviePremierRecyclerViewAdapter.OnItemClickListener {

    private lateinit var binding: FragmentMainFragmentsEstrenosBinding
    private lateinit var viewModelPopularMovies: ViewModelPopularMovies
    private lateinit var recyclerAdapterAdapter: MoviePremierRecyclerViewAdapter

    override fun onCreateView (

        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_main_fragments_estrenos,
            container,
            false
        )
        viewModelPopularMovies = activity?.let { ViewModelProviders.of(it).get(ViewModelPopularMovies::class.java) }!!
        val nameObserver = Observer<MovieContainer> { newName ->
            recyclerAdapterAdapter.MoviePremierRecyclerView(newName)
        }
        viewModelPopularMovies.movieLiveData.observe(this, nameObserver)
        viewModelPopularMovies.backToolBarButtonPressed.observe(this, Observer {
            if(viewModelPopularMovies.backToolBarButtonPressed.value?.equals(true)!! && viewModelPopularMovies.backFromDetailFragment){
                viewModelPopularMovies.setBackToolBarButtonLiveData(false)
            }
        })
        setupView()
        setUpToolBar()
        return binding.root
    }

    private fun setUpToolBar(){
        (activity as AppCompatActivity).supportActionBar?.title = "Now Playing"
        (activity as AppCompatActivity).supportActionBar?.setHomeButtonEnabled(false)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)
    }


    private fun setupView(){
        binding.moviePremierRecycler.setHasFixedSize(true)
        binding.moviePremierRecycler.layoutManager = GridLayoutManager(context, 2)
        recyclerAdapterAdapter = MoviePremierRecyclerViewAdapter(this)
        binding.moviePremierRecycler.adapter = recyclerAdapterAdapter
        viewModelPopularMovies.getMovieFromService()
    }

    override fun onItemClicked(movie: MoviePojo) {
        var bundle = Bundle()
        bundle.putSerializable(ViewUtils.DETAIL_FRAGMENT_KEY,movie)
        view?.findNavController()?.navigate(R.id.action_mainFragmentsEstrenos_to_mainFragmentDetalles, bundle)
    }


}




