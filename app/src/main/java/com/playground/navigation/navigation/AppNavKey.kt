package com.playground.navigation.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface AppScreen : NavKey

sealed interface Screens : AppScreen {
    @Serializable
    object ScreenA : AppScreen

    @Serializable
    object ScreenB : AppScreen

    @Serializable
    object ScreenC : AppScreen

    @Serializable
    object ScreenD : AppScreen

    @Serializable
    object ScreenE : AppScreen

    @Serializable
    object ScreenF : AppScreen
}

sealed interface Main : AppScreen {
    @Serializable
    object MainScreen : AppScreen
    data class DescriptionScreen(val id: String) : AppScreen
}