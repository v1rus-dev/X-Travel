rootProject.name = "X-Travel"
include(":composeApp")
include(":root")
include(":design")
include(":pages")

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

/**
 * Feature main
 */
include(":feature-main:data")
include(":feature-main:domain")
include(":feature-main:presentation")

/**
 * Feature favorites
 */
include(":feature-favorites:data")
include(":feature-favorites:domain")
include(":feature-favorites:presentation")

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
