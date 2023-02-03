package com.natiqhaciyef.noteapp_jetpackcompose.navigation

enum class ScreenID {
    HomeScreen,
    AddScreen;


    fun fromRoute(route: String?) = when(route){
        HomeScreen.name -> HomeScreen
        AddScreen.name -> AddScreen
        null -> HomeScreen
        else -> throw IllegalArgumentException("Route $route is not legal")
    }
}