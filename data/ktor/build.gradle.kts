plugins {
    id("multiplatform-setup")
}

android {
    namespace = "yegor.cheprasov.xtravel.data.ktor"
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.ktor.core)
        }

        androidMain.dependencies {
            implementation(libs.ktor.client.okhttp)
        }

        iosMain.dependencies {
            implementation(libs.ktor.client.darwin)
        }
    }
}