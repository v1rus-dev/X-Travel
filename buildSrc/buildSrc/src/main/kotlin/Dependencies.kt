object Versions {
    const val kotlin = "2.0.0"
    const val agp = "8.3.1"
}

object Dependencies {
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.agp}"
    const val kotlinSerializationPlugin = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
    const val composeCompilerPlugin = "org.jetbrains.kotlin:compose-compiler-gradle-plugin:${Versions.kotlin}"
    const val composeGradlePlugin = "org.jetbrains.compose:compose-gradle-plugin:1.6.10"
}