package com.playground.navigation.screens

import LightDarkPreview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.playground.navigation.AppToolbar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenF(
    onNavigateBack: () -> Unit
) {
    Scaffold(
        topBar = {
            AppToolbar(
                onBackClick = { onNavigateBack.invoke() },
                title = "Screen F",
                modifier = Modifier.fillMaxWidth()
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentAlignment = Alignment.Center
        ) {
            Text(
                "Welcome to Screen F",
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
@LightDarkPreview
fun PreviewScreenF() {
    ScreenF {

    }
}