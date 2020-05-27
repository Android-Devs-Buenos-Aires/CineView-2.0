package com.example.cineview20.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.cineview20.R

class DetailFragmentDirections private constructor() {
  companion object {
    fun actionMainFragmentDetallesToSecondActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragmentDetalles_to_secondActivity)

    fun actionMainFragmentDetallesToMainFragmentsEstrenos(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragmentDetalles_to_mainFragmentsEstrenos)
  }
}
