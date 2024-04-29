package com.example.praktikum.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.praktikum.ui.screens.Screens

data class NavItem(
    val label: String,
    val icon: ImageVector,
    val route: String
)

val listOfNavItems: List<NavItem> = listOf(
    NavItem(
        label = "Home",
        icon = Icons.Default.Home,
        route = Screens.Home.name
    ),
    NavItem(
        label = "Settings",
        icon = Icons.Default.Settings,
        route = Screens.Settings.name
    )
)
