package yegor.cheprasov.xtravel.root.decompose

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import yegor.cheprasov.xtravel.pages.decompose.PagesComponent

interface RootComponent {
    
    val stack: Value<ChildStack<*, Child>>
    
    sealed interface Child {
        data class Pages(val component: PagesComponent) : Child
    }
    
}