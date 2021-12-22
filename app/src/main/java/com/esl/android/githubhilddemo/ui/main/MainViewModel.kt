package com.esl.android.githubhilddemo.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.esl.android.githubhilddemo.model.GithubDataClass
import com.esl.android.githubhilddemo.model.ResultData
import com.esl.android.githubhilddemo.usecase.DataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dataUseCase: DataUseCase
) : ViewModel() {

    fun getRepositoriesList(): LiveData<ResultData<GithubDataClass>> {
       return liveData<ResultData<GithubDataClass>> {
            emit(ResultData.Loading())
            emit(dataUseCase.getRepositoriesList())
        }
    }
}