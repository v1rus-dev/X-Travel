plugins {
    id(libs.plugins.multiplatform.get().pluginId).apply(false)
    id(libs.plugins.compose.compiler.get().pluginId).apply(false)
    id(libs.plugins.compose.asProvider().get().pluginId).apply(false)
    id(libs.plugins.android.application.get().pluginId).apply(false)
    id(libs.plugins.android.library.get().pluginId).apply(false)
    alias(libs.plugins.buildConfig)
    id(libs.plugins.kotlinx.serialization.get().pluginId).apply(false)
}

tasks.register("clean", Delete::class.java) {
    doLast { }
    delete(rootProject.layout.buildDirectory)
}