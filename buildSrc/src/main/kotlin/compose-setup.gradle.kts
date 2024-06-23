plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.kotlin.plugin.compose")
    id("org.jetbrains.compose")
}


internal val Project.libs: VersionCatalog
    get() = extensions.getByType<VersionCatalogsExtension>().named("libs")

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.ui)
            implementation(compose.components.uiToolingPreview)
            implementation(compose.foundation)
            implementation(compose.animation)
            implementation(compose.material)
            implementation(compose.material3)
            implementation(compose.materialIconsExtended)
        }
    }
}

android {
    compileSdk = DefaultConfig.compileSdk

    defaultConfig {
        minSdk = DefaultConfig.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

compose.resources {
    generateResClass = never
}