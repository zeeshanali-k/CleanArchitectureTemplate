package com.devname.cleanarchitecturetemplate.presentation.auth.login

import androidx.lifecycle.ViewModel
import com.devname.cleanarchitecturetemplate.domain.repository.AuthDataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(
    private val authDataSource: AuthDataSource
): ViewModel(){
    fun doSomething() {

    }

    //Do something


}