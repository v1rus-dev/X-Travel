plugins {
    id("multiplatform-setup")
    id("compose-setup")
    id("decompose-setup")
}

kotlin {
    jvm()
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