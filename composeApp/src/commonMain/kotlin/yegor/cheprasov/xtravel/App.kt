package yegor.cheprasov.xtravel

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import yegor.cheprasov.xtravel.root.compose.RootUI
import yegor.cheprasov.xtravel.root.decompose.RootComponent
import yegor.cheprasov.xtravel.theme.AppTheme

@Composable
internal fun App(rootComponent: RootComponent) = AppTheme {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.safeDrawing),
        contentAlignment = Alignment.Center
    ) {
        val height = this.maxHeight
        RootUI(rootComponent)
    }
}

internal expect fun openUrl(url: String?)
