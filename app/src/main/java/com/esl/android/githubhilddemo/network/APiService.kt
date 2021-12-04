package com.esl.android.githubhilddemo.network

import retrofit2.http.GET

interface APiService {

    @GET
    fun getData()
}