plugins {
    id("com.android.application")
    kotlin("android")
}

android {

    compileSdk = ConfigurationData.compileSdk
    buildToolsVersion = ConfigurationData.buildToolsVersion

    defaultConfig {

        applicationId = ConfigurationData.applicationId
        minSdk = ConfigurationData.minSdk
        targetSdk = ConfigurationData.targetSdk
        versionCode = ConfigurationData.versionCode
        versionName = ConfigurationData.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        // Flag to enable support for the new language APIs
        isCoreLibraryDesugaringEnabled = true

        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Libs.AndroidX.Compose.compilerVersion
    }
}

dependencies {
    implementation(Libs.Kotlin.stdlib)
    implementation(Libs.AndroidX.appcompat)
    implementation(Libs.AndroidX.coreKtx)

    implementation(Libs.AndroidX.Activity.activityCompose)

    implementation(Libs.AndroidX.Compose.foundation)
    implementation(Libs.AndroidX.Compose.material)
    implementation(Libs.AndroidX.Compose.materialIconsExtended)
    implementation(Libs.AndroidX.Compose.toolingPreview)

    debugImplementation(Libs.AndroidX.Compose.tooling)

    coreLibraryDesugaring(Libs.jdkDesugar)

}