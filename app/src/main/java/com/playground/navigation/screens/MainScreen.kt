package com.playground.navigation.screens

import LightDarkPreview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.playground.navigation.AppToolbar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    onNavigateToScreenA: () -> Unit,
    onNavigateToScreenB: () -> Unit,
    onNavigateToScreenC: () -> Unit,
    onNavigateToScreenD: () -> Unit,
    onNavigateToScreenE: () -> Unit,
) {
    Scaffold(
        topBar = {
            AppToolbar(
                modifier = Modifier.fillMaxWidth()
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            TextButton(
                onClick = { onNavigateToScreenA.invoke() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Go to Screen A")
            }

            TextButton(
                onClick = { onNavigateToScreenB.invoke() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Go to Screen B")
            }

            TextButton(
                onClick = { onNavigateToScreenC.invoke() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Go to Screen C")
            }

            TextButton(
                onClick = { onNavigateToScreenD.invoke() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Go to Screen D")
            }

            TextButton(
                onClick = { onNavigateToScreenE.invoke() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Go to Screen E")
            }

            TextButton(
                onClick = { onNavigateToScreenE.invoke() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Go to Secondary Screen")
            }
        }
    }
}

@Composable
@LightDarkPreview
fun PreviewMainScreen() {
    MainScreen(
        onNavigateToScreenA = {},
        onNavigateToScreenB = {},
        onNavigateToScreenC = {},
        onNavigateToScreenD = {},
        onNavigateToScreenE = {},
    )
}