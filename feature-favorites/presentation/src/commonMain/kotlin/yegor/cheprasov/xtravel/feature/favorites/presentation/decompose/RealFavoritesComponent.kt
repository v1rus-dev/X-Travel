package yegor.cheprasov.xtravel.feature.favorites.presentation.decompose

import com.arkivanov.decompose.ComponentContext
import yegor.cheprasov.xtravel.design.decompose.BaseComponent
import yegor.cheprasov.xtravel.design.decompose.PageComponent
import yegor.cheprasov.xtravel.design.decompose.PageType

class RealFavoritesComponent(
    componentContext: ComponentContext
) : BaseComponent(componentContext), FavoritesComponent, PageComponent {
    override val type: PageType = PageType.Favorites

}