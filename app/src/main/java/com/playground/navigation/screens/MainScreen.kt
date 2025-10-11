package com.playground.navigation.screens

import LightDarkPreview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.playground.navigation.AppToolbar
import com.playground.navigation.model.CustomData

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    secondaryScreenResult: String?,
    onNavigateToScreenA: () -> Unit,
    onNavigateToScreenB: () -> Unit,
    onNavigateToScreenC: () -> Unit,
    onNavigateToScreenD: () -> Unit,
    onNavigateToScreenE: (data: CustomData) -> Unit,
    onNavigateToSecondaryScreen: () -> Unit,
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

            if (secondaryScreenResult != null) {
                Text(
                    text = "Result from Secondary Screen: $secondaryScreenResult",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Spacer(
                    modifier = Modifier
                        .height(10.dp)
                )

            }

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
                onClick = {
                    val data = CustomData(
                        id = "1234567",
                        name = "Hello",
                    )
                    onNavigateToScreenE.invoke(data)
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Go to Screen E")
            }

            TextButton(
                onClick = { onNavigateToSecondaryScreen.invoke() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Get result from Secondary Screen")
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
        onNavigateToSecondaryScreen = {},
        secondaryScreenResult = "Result from Secondary Screen: 12345"
    )
}