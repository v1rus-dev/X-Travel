package yegor.cheprasov.xtravel.design.decompose

import com.arkivanov.essenty.instancekeeper.InstanceKeeper

interface AppComponent {
    val instanceKeeper: InstanceKeeper
}