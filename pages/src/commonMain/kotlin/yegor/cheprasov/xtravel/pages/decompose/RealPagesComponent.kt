package yegor.cheprasov.xtravel.pages.decompose

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.bringToFront
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.value.Value
import kotlinx.serialization.Serializable
import yegor.cheprasov.xtravel.design.decompose.BaseComponent
import yegor.cheprasov.xtravel.design.decompose.PageComponent
import yegor.cheprasov.xtravel.feature.favorites.presentation.decompose.RealFavoritesComponent
import yegor.cheprasov.xtravel.feature.main.presentation.decompose.RealMainComponent

class RealPagesComponent(
    componentContext: ComponentContext
) : BaseComponent(componentContext), PagesComponent {
    
    private val navigation = StackNavigation<Config>()
    
    override val pages: Value<ChildStack<*, PageComponent>> =
        childStack(
            source = navigation,
            serializer = Config.serializer(),
            handleBackButton = true,
            initialConfiguration = Config.Main
        ) { config, chilComponentContext ->
            when(config) {
                Config.Favorites -> RealFavoritesComponent(chilComponentContext)
                Config.Main -> RealMainComponent(chilComponentContext)
            }
        }

    override fun onMainClicked() {
        navigation.bringToFront(Config.Main)
    }

    override fun onFavoriteClicked() {
        navigation.bringToFront(Config.Favorites)
    }
    
    @Serializable
    sealed interface Config {
        @Serializable
        data object Main : Config
        
        @Serializable
        data object Favorites : Config
    }

}