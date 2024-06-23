package yegor.cheprasov.xtravel.pages.decompose

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import yegor.cheprasov.xtravel.design.decompose.PageComponent

interface PagesComponent {
    
    val pages: Value<ChildStack<*, PageComponent>>
    
    fun onMainClicked()
    
    fun onFavoriteClicked()
    
}