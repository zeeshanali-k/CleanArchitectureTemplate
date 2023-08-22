package com.devname.cleanarchitecturetemplate.presentation.auth.register

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.devname.cleanarchitecturetemplate.R


@Composable
fun RegisterScreen(
    navController: NavController
) {

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(onClick = {
            navController.navigateUp()
        }) {
            Text(text = stringResource(id = R.string.login))
        }
    }

}