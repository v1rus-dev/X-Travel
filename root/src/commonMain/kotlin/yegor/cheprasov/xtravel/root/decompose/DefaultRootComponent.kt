package yegor.cheprasov.xtravel.root.decompose

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.lifecycle.doOnStart
import io.github.aakira.napier.Napier
import kotlinx.serialization.Serializable
import yegor.cheprasov.xtravel.design.decompose.BaseComponent
import yegor.cheprasov.xtravel.pages.decompose.RealPagesComponent

class DefaultRootComponent(
    componentContext: ComponentContext
) : BaseComponent(componentContext), RootComponent {
    
    init {
        lifecycle.doOnStart {
            Napier.v("ON START")
        }
    }
    
    private val navigation = StackNavigation<Configuration>()

    override val stack: Value<ChildStack<*, RootComponent.Child>> =
        childStack(
            source = navigation,
            serializer = Configuration.serializer(),
            handleBackButton = true,
            initialConfiguration = DefaultRootComponent.Configuration.Pages,
            childFactory = ::createChild
        )
    
    private fun createChild(configuration: Configuration, componentContext: ComponentContext): RootComponent.Child =
        when(configuration) {
            Configuration.Pages -> RootComponent.Child.Pages(
                component = RealPagesComponent(componentContext)
            )
        }

    @Serializable
    private sealed class Configuration {
        
        @Serializable
        data object Pages : Configuration()
        
    }
}