package com.natiqhaciyef.noteapp_jetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.natiqhaciyef.noteapp_jetpackcompose.navigation.ScreenID.*
import com.natiqhaciyef.noteapp_jetpackcompose.screen.*

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = HomeScreen.name){
        composable(HomeScreen.name){
            HomeScreen()
        }

        composable(AddScreen.name){
            AddScreen()
        }
    }
}