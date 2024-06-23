plugins {
    id("multiplatform-setup")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":feature-main:data"))
        }
    }
}

android {
    namespace = "yegor.cheprasov.xtravel.feature.main.domain"
}