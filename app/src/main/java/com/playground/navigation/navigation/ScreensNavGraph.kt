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
            ScreenA {
                backStack.removeLastOrNull()
            }
        }
        entry(Screens.ScreenB) {
            ScreenB {
                backStack.removeLastOrNull()
            }
        }
        entry(Screens.ScreenC) {
            ScreenC {
                backStack.removeLastOrNull()
            }
        }
        entry(Screens.ScreenD) {
            ScreenD {
                backStack.removeLastOrNull()
            }
        }
        entry(Screens.ScreenE) {
            ScreenE {
                backStack.removeLastOrNull()
            }
        }
        entry(Screens.ScreenF) {
            ScreenF {
                backStack.removeLastOrNull()
            }
        }
    }
}