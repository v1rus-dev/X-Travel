package yegor.cheprasov.xtravel.root.compose

import androidx.compose.foundation.layout.BoxWithConstraintsScope
import androidx.compose.runtime.Composable
import com.arkivanov.decompose.extensions.compose.stack.Children
import yegor.cheprasov.xtravel.pages.compose.PagesUI
import yegor.cheprasov.xtravel.root.decompose.RootComponent

@Composable
fun BoxWithConstraintsScope.RootUI(
    component: RootComponent
) {
    Children(component.stack) {
        when(val instance = it.instance) {
            is RootComponent.Child.Pages -> PagesUI(component = instance.component)
        }
    }
}