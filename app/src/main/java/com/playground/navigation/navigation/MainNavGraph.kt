package com.playground.navigation.navigation

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.EntryProviderBuilder
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import com.playground.navigation.model.CustomData
import com.playground.navigation.screens.MainScreen
import com.playground.navigation.screens.SecondaryScreen
import timber.log.Timber

object MainNavGraph {
    fun register(
        backStack: NavBackStack,
        builder: EntryProviderBuilder<NavKey>
    ) = with(builder) {
        entry(Main.MainScreen) {
            val navResult = LocalNavResultManager.current
            val secondaryScreenResult = remember {
                mutableStateOf<String?>(null)
            }
            LaunchedEffect(backStack.size) {
                // If Secondary posted something, we get it now
                navResult.takeOnceOrNull<String>(NavigationResultKey.SECONDARY_SCREEN_RESULT)
                    ?.let { value ->
                        // handle it (update state, toast, log, etc.)
                        secondaryScreenResult.value = value
                        Timber.e("Got Secondary result: $value")
                        // takeOnceOrNull already removed the channel
                    }
            }
            val customData = CustomData(
                id = "123",
                name = "Atik Faysal",
            )

            MainScreen(
                secondaryScreenResult = secondaryScreenResult.value,
                onNavigateToScreenA = { backStack.add(Screens.ScreenA) },
                onNavigateToScreenB = {
                    backStack.add(
                        Screens.ScreenB
                    )
                },
                onNavigateToScreenC = { backStack.add(Screens.ScreenC) },
                onNavigateToScreenD = { backStack.add(Screens.ScreenD) },
                onNavigateToScreenE = { data ->
                    backStack.add(Screens.ScreenE(data))
                },
                onNavigateToSecondaryScreen = {
                    backStack.add(Main.SecondaryScreen("1233235"))
                },
            )
        }

        entry<Main.SecondaryScreen> { key ->
            val navResult = LocalNavResultManager.current
            SecondaryScreen(
                detailsId = key.id,
                onNavigateBack = {
                    navResult.trySet(
                        NavigationResultKey.SECONDARY_SCREEN_RESULT,
                        "Result from Secondary Screen"
                    )
                    backStack.removeLastOrNull()
                }
            )
        }
    }
}
