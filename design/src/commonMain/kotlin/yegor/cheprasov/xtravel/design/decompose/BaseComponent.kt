package yegor.cheprasov.xtravel.design.decompose

import com.arkivanov.decompose.ComponentContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.koin.core.component.KoinComponent
import org.koin.mp.KoinPlatformTools
import yegor.cheprasov.xtravel.design.utils.CoroutineScope
import kotlin.coroutines.CoroutineContext

open class BaseComponent(componentContext: ComponentContext) : ComponentContext by componentContext, KoinComponent, AppComponent {
    
    protected val dispatcherIO by injectIODispatcher()
    protected val dispatcherDefault by injectDefaultDispatcher()
    protected val dispatcherMain by injectMainDispatcher()
    protected val scope = CoroutineScope(context = dispatcherMain, lifecycle = lifecycle)
    
    open fun onBack() = Unit
    
}

inline fun KoinComponent.injectIODispatcher(): Lazy<CoroutineContext> =
    lazy(KoinPlatformTools.defaultLazyMode()) {
        Dispatchers.IO
    }

inline fun KoinComponent.injectDefaultDispatcher(): Lazy<CoroutineContext> =
    lazy(KoinPlatformTools.defaultLazyMode()) {
        Dispatchers.Default
    }

inline fun KoinComponent.injectMainDispatcher(): Lazy<CoroutineContext> =
    lazy(KoinPlatformTools.defaultLazyMode()) {
        Dispatchers.Main
    }