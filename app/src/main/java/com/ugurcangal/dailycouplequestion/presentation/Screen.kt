package com.ugurcangal.dailycouplequestion.presentation

sealed class Screen(val route: String) {
    object LoginScreen : Screen("login_screen")
}