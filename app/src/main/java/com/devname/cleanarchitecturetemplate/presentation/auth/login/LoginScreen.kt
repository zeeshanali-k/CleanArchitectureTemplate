package com.devname.cleanarchitecturetemplate.presentation.auth.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.devname.cleanarchitecturetemplate.R
import com.devname.cleanarchitecturetemplate.utils.Screen


@Composable
fun LoginScreen(
    navController: NavController,
    loginViewModel: LoginViewModel = hiltViewModel()
) {

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(onClick = {
            loginViewModel.doSomething()
            navController.navigate(Screen.Register.route)
        }) {
            Text(text = stringResource(id = R.string.register))
        }
    }

}