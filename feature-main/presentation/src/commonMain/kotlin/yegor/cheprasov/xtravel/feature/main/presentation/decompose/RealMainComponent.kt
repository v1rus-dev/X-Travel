package yegor.cheprasov.xtravel.feature.main.presentation.decompose

import com.arkivanov.decompose.ComponentContext
import yegor.cheprasov.xtravel.design.decompose.BaseComponent
import yegor.cheprasov.xtravel.design.decompose.PageComponent
import yegor.cheprasov.xtravel.design.decompose.PageType

class RealMainComponent(
    componentContext: ComponentContext
) : BaseComponent(componentContext), MainComponent, PageComponent {
    override val type: PageType = PageType.Main

}