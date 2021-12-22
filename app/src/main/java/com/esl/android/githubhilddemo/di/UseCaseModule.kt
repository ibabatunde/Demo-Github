package com.esl.android.githubhilddemo.di

import com.esl.android.githubhilddemo.repositories.DataRepository
import com.esl.android.githubhilddemo.usecase.DataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object UseCaseModule {

    @Provides
    fun providesUseCase(dataRepository: DataRepository): DataUseCase{
        return DataUseCase(dataRepository)
    }
}