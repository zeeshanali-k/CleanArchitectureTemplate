package com.devname.cleanarchitecturetemplate.data.repository

import com.devname.cleanarchitecturetemplate.data.network.AuthClient
import com.devname.cleanarchitecturetemplate.data.network.dto.auth.UserDto
import com.devname.cleanarchitecturetemplate.data.utils.auth.LoginResponse
import com.devname.cleanarchitecturetemplate.domain.model.DataResponse
import com.devname.cleanarchitecturetemplate.domain.model.User
import com.devname.cleanarchitecturetemplate.domain.repository.AuthDataSource
import com.devname.cleanarchitecturetemplate.utils.logAll
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AuthDataSourceImpl @Inject constructor(
    private val authClient: AuthClient
) : AuthDataSource {

    private val TAG = "AuthDataSourceImpl"

    override suspend fun loginUser(user: User): Flow<DataResponse<UserDto, LoginResponse>> = flow {
        try {
            emit(DataResponse.Loading())
            val response = authClient.login()
            if (response) {
                emit(
                    DataResponse.Success(
                        UserDto(
                            user.id, user.name
                        )
                    )
                )
            } else {
                emit(DataResponse.Error(error = LoginResponse.Error("error message from server")))
            }
        } catch (e: Exception) {
            e logAll TAG
            emit(DataResponse.Error(LoginResponse.Failed))
        }
    }
}