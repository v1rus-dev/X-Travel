rootProject.name = "X-Travel"
include(":composeApp")
include(":root")
include(":design")

/**
 * Data
 */
include(":data:ktor")
include(":data:api")
include(":data:database")

/**
 * Feature register
 */
include(":feature-register:data")
include(":feature-register:domain")
include(":feature-register:presentation")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()

        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
        maven("https://maven.pkg.jetbrains.space/public/p/ktor/eap")
    }
}
