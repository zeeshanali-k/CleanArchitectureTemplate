package com.devname.cleanarchitecturetemplate.di

import com.devname.cleanarchitecturetemplate.data.repository.AuthDataSourceImpl
import com.devname.cleanarchitecturetemplate.domain.repository.AuthDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@InstallIn(ViewModelComponent::class)
@Module
abstract class DataSourceModule {

    @Binds
    abstract fun provideAuthRepository(authDataSourceImpl: AuthDataSourceImpl): AuthDataSource

}