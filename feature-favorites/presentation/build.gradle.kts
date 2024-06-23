plugins {
    id("multiplatform-setup")
    id("compose-setup")
    id("decompose-setup")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":design"))
            implementation(project(":feature-favorites:domain"))
        }
    }
}

android {
    namespace = "yegor.cheprasov.xtravel.feature.favorites.presentation"
}