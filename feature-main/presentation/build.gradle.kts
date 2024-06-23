plugins {
    id("multiplatform-setup")
    id("compose-setup")
    id("decompose-setup")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":design"))
            implementation(project(":feature-main:domain"))
        }
    }
}

android {
    namespace = "yegor.cheprasov.xtravel.feature.main.presentation"
}