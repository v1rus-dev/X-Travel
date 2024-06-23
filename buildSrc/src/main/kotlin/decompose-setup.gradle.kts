plugins {
    kotlin("multiplatform")
    id("kotlinx-serialization")
    id("com.android.library")
}

internal val Project.libs: VersionCatalog
    get() = extensions.getByType<VersionCatalogsExtension>().named("libs")

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.findLibrary("decompose-core").get())
            implementation(libs.findLibrary("decompose-ext").get())
        }
    }
}