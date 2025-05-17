package com.ugurcangal.dailycouplequestion.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ugurcangal.dailycouplequestion.presentation.login.views.LoginScreen
import com.ugurcangal.dailycouplequestion.presentation.ui.theme.DailyCoupleQuestionTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DailyCoupleQuestionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { it
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Screen.LoginScreen.route){
                        composable(route = Screen.LoginScreen.route){
                            LoginScreen()
                        }

                    }
                }

            }
        }
    }
}
