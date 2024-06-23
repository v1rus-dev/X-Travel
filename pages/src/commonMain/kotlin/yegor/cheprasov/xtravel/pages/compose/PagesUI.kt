package yegor.cheprasov.xtravel.pages.compose

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.BoxWithConstraintsScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.stack.Children
import com.arkivanov.decompose.extensions.compose.stack.animation.stackAnimation
import com.arkivanov.decompose.extensions.compose.subscribeAsState
import org.jetbrains.compose.ui.tooling.preview.Preview
import yegor.cheprasov.xtravel.feature.favorites.presentation.compose.FavoritesUI
import yegor.cheprasov.xtravel.feature.favorites.presentation.decompose.FavoritesComponent
import yegor.cheprasov.xtravel.feature.main.presentation.compose.MainUI
import yegor.cheprasov.xtravel.feature.main.presentation.decompose.MainComponent
import yegor.cheprasov.xtravel.pages.compose.components.BottomNavigation
import yegor.cheprasov.xtravel.pages.decompose.PagesComponent
import yegor.cheprasov.xtravel.pages.decompose.PreviewPagesComponent

@Composable
fun BoxWithConstraintsScope.PagesUI(
    component: PagesComponent,
    modifier: Modifier = Modifier
) {
    val childStack = component.pages.subscribeAsState()
    val activePage = childStack.value.active.instance.type
    
    Scaffold(
        modifier = modifier.fillMaxSize(),
        bottomBar = {
            BottomNavigation(
                pagesComponent = component,
                activeConfig = activePage
            )
        }
    ) {
        Children(component.pages, animation = stackAnimation()) {
            when(val instance = it.instance) {
                is MainComponent -> MainUI(instance)
                is FavoritesComponent -> FavoritesUI(instance)
                else -> throw IllegalStateException("Is not page component")
            }
        }
    }
}

@Composable
@Preview
private fun PreviewPagesUI() {
    BoxWithConstraints {
        PagesUI(component = PreviewPagesComponent())   
    }
}