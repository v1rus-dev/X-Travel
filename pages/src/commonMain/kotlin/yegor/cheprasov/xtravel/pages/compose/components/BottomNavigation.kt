package yegor.cheprasov.xtravel.pages.compose.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import yegor.cheprasov.xtravel.design.decompose.PageType
import yegor.cheprasov.xtravel.pages.decompose.PagesComponent

@Composable
fun BottomNavigation(
    pagesComponent: PagesComponent,
    activeConfig: PageType,
    modifier: Modifier = Modifier
) {
    BottomAppBar(
        modifier = modifier,
        backgroundColor = Color.Black, contentPadding = PaddingValues(horizontal = 2.dp)
    ) {
        BottomNavigationItem(
            selected = activeConfig == PageType.Main,
            onClick = { pagesComponent.onMainClicked() },
            icon = {
                Icon(
                    imageVector = Icons.Filled.Home,
                    contentDescription = "Home"
                )
            },
            selectedContentColor = Color.White,
            unselectedContentColor = Color.LightGray.copy(alpha = 0.5f)
        )
        BottomNavigationItem(
            selected = activeConfig == PageType.Favorites,
            onClick = { pagesComponent.onFavoriteClicked() },
            icon = {
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "Favorites"
                )
            },
            selectedContentColor = Color.White,
            unselectedContentColor = Color.LightGray.copy(alpha = 0.5f)
        )
    }
}