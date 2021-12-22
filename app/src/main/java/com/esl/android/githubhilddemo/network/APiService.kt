package com.esl.android.githubhilddemo.network

import com.esl.android.githubhilddemo.model.GithubDataClass
import com.esl.android.githubhilddemo.utility.NetworkConstants.URL_REPOSITORIES
import retrofit2.http.GET

interface ApiService {

    @GET(URL_REPOSITORIES)
    suspend fun getPublicRepositories(): GithubDataClass
}