package com.devname.cleanarchitecturetemplate.data.utils.auth

import com.devname.cleanarchitecturetemplate.data.network.dto.auth.UserDto


/*
Instead of passing string error , pass these objects as it will help in localisation
* */

sealed class LoginResponse {
    object Failed : LoginResponse() //for network errors
    data class Error(val message: String) : LoginResponse() // for server errors
}
