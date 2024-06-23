package yegor.cheprasov.xtravel.pages.decompose

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import yegor.cheprasov.xtravel.design.decompose.PageComponent
import yegor.cheprasov.xtravel.design.decompose.PageType

class PreviewPagesComponent : PagesComponent {
    override val pages: Value<ChildStack<*, PageComponent>>
        get() = MutableValue(ChildStack<Any, PageComponent>(configuration = "", instance = object : PageComponent {
            override val type: PageType
                get() = PageType.Main

        }))

    override fun onMainClicked() = Unit

    override fun onFavoriteClicked() = Unit

}