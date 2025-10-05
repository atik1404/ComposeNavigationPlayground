plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.org.jetbrains.kotlin.plugin.serialization)
}

android {
    namespace = "com.playground.navigation"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.playground.navigation"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.kotlinx.serialization.core)

    implementation(libs.bundles.androidx.core.dependencies)
    implementation(libs.bundles.androidx.lifecycle.dependencies)
    implementation(libs.bundles.androidx.navigation.dependencies)

    implementation(libs.bundles.android.compose.dependencies)
    implementation(libs.bundles.android.compose.feature.dependencies)


    implementation(libs.bundles.compose.navigation.depedendencies)

    implementation(libs.image.coil)
    implementation(libs.timber)
    debugImplementation(libs.leakcanary)


    testImplementation(libs.test.junit)
    androidTestImplementation(libs.test.androidx.junit)
    androidTestImplementation(libs.test.androidx.espresso.core)
    androidTestImplementation(libs.test.androidx.compose.ui.junit)
    androidTestImplementation(libs.test.androidx.compose.ui.manifest)
    debugImplementation(libs.test.androidx.compose.ui.tooling)
}