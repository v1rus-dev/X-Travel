package yegor.cheprasov.xtravel.design.decompose

import com.arkivanov.essenty.instancekeeper.InstanceKeeper
import com.arkivanov.essenty.instancekeeper.getOrCreate
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import org.koin.core.component.KoinComponent

open class BaseInstance : InstanceKeeper.Instance, KoinComponent {

    protected val dispatcherMain by injectMainDispatcher()
    protected val dispatcherIO by injectIODispatcher()

    protected val scope = CoroutineScope(SupervisorJob() + dispatcherMain)

    override fun onDestroy() {
        super.onDestroy()
        scope.cancel()
    }

}

inline fun <reified T : InstanceKeeper.Instance> AppComponent.injectInstance(
    crossinline factory: () -> T
): Lazy<T> = lazy { instanceKeeper.getOrCreate(factory) }

inline fun <reified T : InstanceKeeper.Instance> AppComponent.injectInstanceImmediatly(
    crossinline factory: () -> T
): Lazy<T> = lazy { instanceKeeper.getOrCreate(factory) }
    .also { it.value }


inline fun BaseComponent.injectInstance(
    key: Any,
    factory: () -> InstanceKeeper.Instance
) = instanceKeeper.getOrCreate(key = key, factory)