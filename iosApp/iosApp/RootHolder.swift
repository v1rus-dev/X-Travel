//
//  RootHolder.swift
//  iosApp
//
//  Created by Yegor Cheprasov on 22.06.24.
//

import Foundation
import ComposeApp

class RootHolder : ObservableObject {
    let lifecycle: LifecycleRegistry
    let root: RootComponent
    
    init() {
        lifecycle = LifecycleRegistryKt.LifecycleRegistry()
        root = DefaultRootComponent(componentContext: DefaultComponentContext(lifecycle: lifecycle))
        
        LifecycleRegistryExtKt.create(lifecycle)
    }
    
    deinit {
        LifecycleRegistryExtKt.destroy(lifecycle)
    }
}
