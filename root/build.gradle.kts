plugins {
    id("multiplatform-setup")
    id("compose-setup")
    id("decompose-setup")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":design"))
            implementation(project(":pages"))
            implementation(project(":data:database"))
        }
    }
}

android {
    namespace = "yegor.cheprasov.xtravel.root"
}