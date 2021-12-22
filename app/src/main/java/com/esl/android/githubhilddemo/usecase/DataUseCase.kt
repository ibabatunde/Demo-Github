package com.esl.android.githubhilddemo.usecase

import com.esl.android.githubhilddemo.model.GithubDataClass
import com.esl.android.githubhilddemo.model.ResultData
import com.esl.android.githubhilddemo.repositories.DataRepository
import javax.inject.Inject

class DataUseCase @Inject constructor(private val dataRepository: DataRepository) {

    suspend fun getRepositoriesList(): ResultData<GithubDataClass> {
        val publicRepositories = dataRepository.getPublicRepositories()
        return if (!publicRepositories.isNullOrEmpty()) {
            ResultData.Success(publicRepositories)
        } else {
            ResultData.Failed("Something went wrong. Please try again")
        }
    }

}