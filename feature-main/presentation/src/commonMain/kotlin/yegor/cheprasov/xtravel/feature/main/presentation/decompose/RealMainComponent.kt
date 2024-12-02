package yegor.cheprasov.xtravel.feature.main.presentation.decompose

import com.arkivanov.decompose.ComponentContext
import yegor.cheprasov.xtravel.design.decompose.BaseComponent
import yegor.cheprasov.xtravel.design.decompose.PageComponent
import yegor.cheprasov.xtravel.design.decompose.PageType
import yegor.cheprasov.xtravel.design.decompose.injectInstance
import yegor.cheprasov.xtravel.feature.main.presentation.instance.MainInstance

class RealMainComponent(
    componentContext: ComponentContext
) : BaseComponent(componentContext), MainComponent, PageComponent {
    override val type: PageType = PageType.Main

    private val instance: MainInstance by injectInstance(::MainInstance)

    
}