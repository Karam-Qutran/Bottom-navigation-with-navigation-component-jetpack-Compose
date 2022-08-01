package com.example.bottomnavnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavnavigation.screen.AccountScreen
import com.example.bottomnavnavigation.screen.HomeScreen
import com.example.bottomnavnavigation.screen.SearchScreen
import com.example.bottomnavnavigation.screen.SettingScreen

@Composable
fun Nav(navController : NavHostController) {

    NavHost(navController = navController, startDestination = Screen.Home.route ){

        composable(Screen.Home.route){
            HomeScreen()
        }
        composable(Screen.Account.route){
            AccountScreen()
        }
        composable(Screen.Search.route){
            SearchScreen()
        }
        composable(Screen.Setting.route){
            SettingScreen()
        }
    }
}