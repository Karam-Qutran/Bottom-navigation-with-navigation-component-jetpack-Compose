package com.example.bottomnavnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route : String , val title : String ,val icon : ImageVector){

    object Home : Screen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Account : Screen(
        route = "Account",
        title = "Account",
        icon = Icons.Default.AccountBox
    )
    object Search : Screen(
        route = "Search",
        title = "Search",
        icon = Icons.Default.Search
    )

    object Setting : Screen(
        route = "Setting",
        title = "Setting",
        icon = Icons.Default.Settings
    )
}

