package com.devname.cleanarchitecturetemplate.utils

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.devname.cleanarchitecturetemplate.presentation.ui.theme.enterTransition
import com.devname.cleanarchitecturetemplate.presentation.ui.theme.exitTransition
import com.devname.cleanarchitecturetemplate.presentation.ui.theme.popEnterTransition
import com.devname.cleanarchitecturetemplate.presentation.ui.theme.popExitTransition

infix fun Exception.logAll(TAG: String) {
    Log.d(TAG, "message: $message")
    Log.d(TAG, "localizedMessage: $localizedMessage")
    Log.d(TAG, "exception: $this")
    Log.d(TAG, "cause: $cause")
}


fun NavGraphBuilder.navComposable(
    route: String,
    arguments: List<NamedNavArgument> = emptyList(),
    screen: @Composable (() -> Unit)
) {
    composable(
        route, arguments = arguments, enterTransition = enterTransition,
        exitTransition = exitTransition,
        popEnterTransition = popEnterTransition,
        popExitTransition = popExitTransition,
    ) {
        screen()
    }
}