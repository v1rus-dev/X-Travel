plugins {
    id("multiplatform-setup")
}

android {
    namespace = "yegor.cheprasov.xtravel.feature.register.presentation"
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":feature-register:domain"))
        }
    }
}