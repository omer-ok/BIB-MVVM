package com.cristopher.mauratzjarl.ui.homeActivity.fragmentThree

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.cristopher.mauratzjarl.R

class threeFragment : Fragment() {

    companion object {
        fun newInstance() = threeFragment()
    }

    private lateinit var viewModel: ThreeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.three_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ThreeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
