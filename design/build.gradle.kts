import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("multiplatform-setup")
    id("compose-setup")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(compose.components.resources)
        }
    }
}

android {
    namespace = "yegor.cheprasov.xtravel.design"
}

compose.resources {
    generateResClass = always
    publicResClass = true
}