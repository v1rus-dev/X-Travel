plugins {
    id("multiplatform-setup")
}

android {
    namespace = "yegor.cheprasov.xtravel.data.api"
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":data:ktor"))
        }
    }
}