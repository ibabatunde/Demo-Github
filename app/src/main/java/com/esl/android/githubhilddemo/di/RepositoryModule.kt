package com.esl.android.githubhilddemo.di

import com.esl.android.githubhilddemo.network.ApiService
import com.esl.android.githubhilddemo.repositories.DataRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
class RepositoryModule {

    @Provides
    fun providesDataRepositories(apiService: ApiService): DataRepository {
        return DataRepository(apiService)
    }
}