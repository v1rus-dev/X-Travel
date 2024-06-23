package yegor.cheprasov.xtravel.design.utils

import com.arkivanov.essenty.lifecycle.Lifecycle
import com.arkivanov.essenty.lifecycle.doOnDestroy
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel
import kotlin.coroutines.CoroutineContext

internal fun CoroutineScope(context: CoroutineContext, lifecycle: Lifecycle): CoroutineScope {
    val scope = kotlinx.coroutines.CoroutineScope(context)
    lifecycle.doOnDestroy(scope::cancel)
    return scope
}