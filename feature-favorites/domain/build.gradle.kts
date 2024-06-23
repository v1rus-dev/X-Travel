plugins {
    id("multiplatform-setup")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":feature-favorites:data"))
        }
    }
}

android {
    namespace = "yegor.cheprasov.xtravel.feature.favorites.domain"
}