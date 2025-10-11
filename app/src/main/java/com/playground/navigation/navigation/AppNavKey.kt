package com.playground.navigation.navigation

import androidx.navigation3.runtime.NavKey
import com.playground.navigation.model.CustomData
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
    data class ScreenE(val data: CustomData) : AppScreen
}

sealed interface Main : AppScreen {
    @Serializable
    object MainScreen : AppScreen

    @Serializable
    data class SecondaryScreen(val id: String) : AppScreen
}