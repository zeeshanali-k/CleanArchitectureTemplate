package com.devname.cleanarchitecturetemplate.presentation.ui.theme

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.tween
import androidx.navigation.NavBackStackEntry

val enterTransition : AnimatedContentTransitionScope<NavBackStackEntry>.() -> EnterTransition? = {
    slideIntoContainer(
        towards = AnimatedContentTransitionScope.SlideDirection.Companion.Left,
        animationSpec = tween(700)
    )
}

val exitTransition : AnimatedContentTransitionScope<NavBackStackEntry>.() -> ExitTransition? = {
    slideOutOfContainer(
        towards = AnimatedContentTransitionScope.SlideDirection.Companion.Left,
        animationSpec = tween(700)
    )
}

val popEnterTransition : AnimatedContentTransitionScope<NavBackStackEntry>.() -> EnterTransition?= {
    slideIntoContainer(
        towards = AnimatedContentTransitionScope.SlideDirection.Companion.Right,
        animationSpec = tween(700)
    )
}

val popExitTransition : AnimatedContentTransitionScope<NavBackStackEntry>.() -> ExitTransition? = {
    slideOutOfContainer(
        towards = AnimatedContentTransitionScope.SlideDirection.Companion.Right,
        animationSpec = tween(700)
    )
}