import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
    id("multiplatform-setup")
    id("kotlinx-serialization")
    alias(libs.plugins.ksp)
    alias(libs.plugins.room)
}

android {
    namespace = "yegor.cheprasov.xtravel.data.database"
}

kotlin {

//    sourceSets.commonMain {
//        kotlin.srcDir("build/generated/ksp/metadata")
//    }

    sourceSets.iosMain {
        kotlin.srcDir("build/generated/ksp/metadata")
    }

    sourceSets {
        commonMain.dependencies {
                implementation(libs.room.runtime)
                implementation(libs.sqlite)
                implementation(libs.sqlite.bundle)
                implementation(libs.kotlinx.serialization.json)
            }
    }

    room {
        schemaDirectory("$projectDir/schemas")
    }

    dependencies {
        add("kspCommonMainMetadata", libs.room.compiler)
        add("kspAndroid", libs.room.compiler)
//        add("kspAndroid", libs.room.compiler)
//        add("kspIosSimulatorArm64", libs.room.compiler)
//        add("kspIosX64", libs.room.compiler)
//        add("kspIosArm64", libs.room.compiler)
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinCompile<*>>().configureEach {
    if (name != "kspCommonMainKotlinMetadata" ) {
        dependsOn("kspCommonMainKotlinMetadata")
    }
}