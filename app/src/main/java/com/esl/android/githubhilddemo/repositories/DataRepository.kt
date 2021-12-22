package com.esl.android.githubhilddemo.repositories

import com.esl.android.githubhilddemo.model.GithubDataClass
import com.esl.android.githubhilddemo.network.ApiService
import javax.inject.Inject

class DataRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getPublicRepositories(): GithubDataClass {
        return apiService.getPublicRepositories()
    }
}