package com.example.cineview20.view


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.bumptech.glide.Glide
import com.example.cineview20.model.data.movie.MoviePojo
import com.example.cineview20.R
import com.example.cineview20.ViewModelPopularMovies
import com.example.cineview20.databinding.FragmentMainFragmentDetallesBinding
import kotlinx.android.synthetic.main.fragment_main_fragment_detalles.*

/**
 * A simple [Fragment] subclass.
 */
class DetailFragment : Fragment() {
    private lateinit var binding: FragmentMainFragmentDetallesBinding
    private lateinit var movieChosen: MoviePojo
    private lateinit var viewModelPopularMovies: ViewModelPopularMovies

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_main_fragment_detalles,
            container,
            false
        )
        viewModelPopularMovies = activity?.let { ViewModelProviders.of(it).get(ViewModelPopularMovies::class.java) }!!
        viewModelPopularMovies.backToolBarButtonPressed.observe(this, Observer {
            if(viewModelPopularMovies.backToolBarButtonPressed.value == true){
                view?.findNavController()?.navigate(R.id.action_mainFragmentDetalles_to_mainFragmentsEstrenos)
                viewModelPopularMovies.backFromDetailFragment = true
            }
        })
        movieChosen = arguments?.getSerializable(ViewUtils.DETAIL_FRAGMENT_KEY) as MoviePojo
        setupView()
        setupToolBar()

        return binding.root
    }

    private fun setupToolBar(){
        (activity as AppCompatActivity).supportActionBar?.title = "Details"
        (activity as AppCompatActivity).supportActionBar?.setHomeButtonEnabled(true)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }


    @SuppressLint("SetTextI18n")
    private fun setupView() {
        this.binding.root?.let {
            Glide.with(it).load(ViewUtils.DETAIL_IMAGE_URL + movieChosen.posterPath)
                .into(binding.image)
        }
        binding.movieOverview.text = movieChosen.overview
        binding.release.text = getString(R.string.detail_fragment_relase_date) + movieChosen.releaseDate
        binding.score.text = getString(R.string.detail_fragment_score) + movieChosen.score
        binding.title.text =getString(R.string.detail_fragment_title)  + movieChosen.title
        binding.image.setOnClickListener {
            var bundle = Bundle()
            bundle.putString(ViewUtils.DETAIL_ACTIVITY_KEY,movieChosen.title)
            view?.findNavController()?.navigate(R.id.action_mainFragmentDetalles_to_secondActivity,bundle)
        }
    }


}

