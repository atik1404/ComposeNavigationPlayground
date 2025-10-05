package com.playground.navigation.navigation

import androidx.navigation3.runtime.EntryProviderBuilder
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import com.playground.navigation.screens.MainScreen

object MainNavGraph {
    fun register(
        backStack: NavBackStack,
        builder: EntryProviderBuilder<NavKey>
    ) = with(builder) {
        entry(Main.MainScreen) {
            MainScreen(
                onNavigateToScreenA = { backStack.add(Screens.ScreenA) },
                onNavigateToScreenB = { backStack.add(Screens.ScreenB) },
                onNavigateToScreenC = { backStack.add(Screens.ScreenC) },
                onNavigateToScreenD = { backStack.add(Screens.ScreenD) },
                onNavigateToScreenE = { backStack.add(Screens.ScreenE) },
            )
        }
    }
}
