package com.devname.cleanarchitecturetemplate.domain.repository

import com.devname.cleanarchitecturetemplate.data.network.dto.auth.UserDto
import com.devname.cleanarchitecturetemplate.data.utils.auth.LoginResponse
import com.devname.cleanarchitecturetemplate.domain.model.DataResponse
import com.devname.cleanarchitecturetemplate.domain.model.User
import kotlinx.coroutines.flow.Flow

interface AuthDataSource {

    suspend fun loginUser(user: User): Flow<DataResponse<UserDto, LoginResponse>>

}