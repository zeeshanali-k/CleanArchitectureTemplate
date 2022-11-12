package com.devname.cleanarchitecturetemplate.data.network

import retrofit2.http.POST

interface AuthClient {


    @POST("login")
    suspend fun login(): Boolean
}