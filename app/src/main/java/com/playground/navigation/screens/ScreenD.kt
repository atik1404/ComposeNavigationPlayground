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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.playground.navigation.AppToolbar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenD(
    onNavigateBack: () -> Unit,
    onNavigateToScreen: () -> Unit,
) {
    Scaffold(
        topBar = {
            AppToolbar(
                onBackClick = { onNavigateBack.invoke() },
                title = "Screen D",
                modifier = Modifier.fillMaxWidth()
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Welcome to Screen D",
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextButton(
                onClick = {
                    onNavigateToScreen.invoke()
                }
            ) {
                Text("Clear back stack and Navigate to Main Screen")
            }
        }
    }
}

@Composable
@LightDarkPreview
fun PreviewScreenD() {
    ScreenD(
        onNavigateBack = {},
        onNavigateToScreen = {}
    )
}