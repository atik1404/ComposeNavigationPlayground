package com.playground.navigation.navigation

import ScreenC
import ScreenD
import androidx.navigation3.runtime.EntryProviderBuilder
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import com.playground.navigation.screens.ScreenA
import com.playground.navigation.screens.ScreenB
import com.playground.navigation.screens.ScreenE
import com.playground.navigation.screens.ScreenF

// --- components/ComponentNavGraph.kt ---
object ScreensNavGraph {
    fun register(
        backStack: NavBackStack,
        builder: EntryProviderBuilder<NavKey>,
    ) = with(builder) {
        entry(Screens.ScreenA) {
            ScreenA(
                onNavigateToScreen = {
                    backStack.add(Screens.ScreenB)
                },
                onNavigateBack = { backStack.removeLastOrNull() }
            )
        }
        entry(Screens.ScreenB) {
            ScreenB(
                onNavigateToScreen = {
                    backStack.add(Screens.ScreenD)
                },
                onNavigateBack = { backStack.removeLastOrNull() }
            )
        }
        entry(Screens.ScreenC) {
            ScreenC(
                onNavigationToSecondaryScreen = { id ->
                    backStack.removeLastOrNull()// Remove ScreenC from backstack
                    backStack.add(Main.SecondaryScreen(id))// Add SecondaryScreen to backstack
                },
                onNavigateBack = { backStack.removeLastOrNull() }
            )
        }
        entry(Screens.ScreenD) {
            ScreenD(
                onNavigateToScreen = {
                    backStack.removeAll { true }
                    backStack.add(Main.MainScreen)
                },
                onNavigateBack = { backStack.removeLastOrNull() }
            )
        }
        entry<Screens.ScreenE> { key ->
            ScreenE(
                data = key.data
            ) {
                backStack.removeLastOrNull()
            }
        }
    }
}