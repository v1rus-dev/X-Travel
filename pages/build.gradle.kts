plugins {
    id("multiplatform-setup")
    id("compose-setup")
    id("decompose-setup")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":design"))
            implementation(project(":feature-main:presentation"))
            implementation(project(":feature-favorites:presentation"))
        }
    }
}

android {
    namespace = "yegor.cheprasov.xtravel.pages"
}