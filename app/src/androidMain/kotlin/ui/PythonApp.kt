package ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.thisisthepy.pycomposeui.PythonAppView
import io.github.thisisthepy.pycomposeui.PythonLauncher
import ui.theme.AppTheme


@Preview
@Composable
fun App() {
    AppTheme {
        PythonLauncher {
            PythonAppView(Modifier.fillMaxSize().padding(10.dp))
        }
    }
}
