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
import com.devname.cleanarchitecturetemplate.R
import com.devname.cleanarchitecturetemplate.presentation.auth.destinations.RegisterScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Composable
@Destination
@RootNavGraph(start = true)
fun LoginScreen(
    navController: DestinationsNavigator,
    loginViewModel: LoginViewModel = hiltViewModel()
) {

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(onClick = {
            loginViewModel.doSomething()
            navController.navigate(RegisterScreenDestination())
        }) {
            Text(text = stringResource(id = R.string.register))
        }
    }

}