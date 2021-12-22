package com.esl.android.githubhilddemo.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.esl.android.githubhilddemo.R
import com.esl.android.githubhilddemo.model.ResultData
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val repositoriesList = mainViewModel.getRepositoriesList()
        repositoriesList.observe(viewLifecycleOwner, Observer {
            resultData ->  when(resultData) {
                is ResultData.Loading -> {

                }
                is ResultData.Success -> {

                }
                is ResultData.Failed -> {

                }
                is ResultData.Exception -> {

                }
            }

        })
    }
}