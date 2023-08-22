package com.devname.cleanarchitecturetemplate.utils

sealed class Screen(val route: String) {

    object Login : Screen("route_login")
    object Register : Screen("route_register")

    //For arguments

//    object Login : Screen("route_login?{${ArgConstants.ADDRESS_DATA}}") {
//        fun getArgsWithType() =
//            listOf(navArgument(ArgConstants.ADDRESS_DATA) {
//                type = NavType.StringType
//                nullable = true
//                defaultValue = null
//            })
//
//        fun getRouteWithArgument(intentData: String?) = "route_home_screen?$intentData"
//    }

}