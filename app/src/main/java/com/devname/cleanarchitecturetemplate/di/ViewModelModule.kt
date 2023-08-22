package com.devname.cleanarchitecturetemplate.di

import com.devname.cleanarchitecturetemplate.data.db.CleanAppDB
import com.devname.cleanarchitecturetemplate.data.db.dao.UsersDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped


@Module
@InstallIn(ViewModelComponent::class)
object ViewModelModule {

    @Provides
    @ViewModelScoped
    fun provideUsersDao(
        cleanAppDB: CleanAppDB
    ): UsersDao {
        return cleanAppDB.userDao()
    }

}