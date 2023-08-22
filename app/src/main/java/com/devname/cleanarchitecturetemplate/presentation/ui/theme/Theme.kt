package com.devname.cleanarchitecturetemplate.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import com.devname.cleanarchitecturetemplate.R
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun PassPayTheme(isDark: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val systemUiController = rememberSystemUiController()
    //TODO: Change color
    if(isDark){
        systemUiController.setSystemBarsColor(
            color = colorResource(id = R.color.black),
            darkIcons = false
        )
    }else{
        systemUiController.setSystemBarsColor(
            color = colorResource(id = R.color.white),
            darkIcons = true
        )
    }
    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}