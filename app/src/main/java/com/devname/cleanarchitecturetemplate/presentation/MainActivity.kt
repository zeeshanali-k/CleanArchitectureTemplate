package com.devname.cleanarchitecturetemplate.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.devname.cleanarchitecturetemplate.presentation.auth.login.LoginScreen
import com.devname.cleanarchitecturetemplate.presentation.auth.register.RegisterScreen
import com.devname.cleanarchitecturetemplate.presentation.ui.theme.PassPayTheme
import com.devname.cleanarchitecturetemplate.utils.Screen
import com.devname.cleanarchitecturetemplate.utils.navComposable
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            PassPayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = Screen.Login.route//TODO: Change start destination
                    ) {
                        //navComposable is custom composable for easy animations
                        // management across whole app
                        navComposable(
                            Screen.Login.route
                        ) {
                            LoginScreen(navController)
                        }
                        navComposable(
                            Screen.Register.route
                        ) {
                            RegisterScreen(navController)
                        }
                    }
                }
            }
        }
    }
}