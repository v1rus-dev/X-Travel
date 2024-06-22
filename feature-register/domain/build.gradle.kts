plugins {
    id("multiplatform-setup")
}

android {
    namespace = "yegor.cheprasov.xtravel.feature.register.domain"
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":feature-register:data"))
        }
    }
}