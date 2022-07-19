object Versions {
    const val ktlint = "0.45.2"
}

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.2.1"
    const val jdkDesugar = "com.android.tools:desugar_jdk_libs:1.1.5"
    const val spotless = "com.diffplug.spotless:spotless-plugin-gradle:6.0.1"

    object Kotlin {
        private const val version = "1.7.0"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.4.1"
        const val coreKtx = "androidx.core:core-ktx:1.7.0"

        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.4.0"
        }

        object Compose {
            private const val version = "1.2.0-rc03"
            const val compilerVersion = "1.2.0"

            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val foundation = "androidx.compose.foundation:foundation:${version}"

            const val material = "androidx.compose.material:material:${version}"
            const val materialIconsExtended = "androidx.compose.material:material-icons-extended:${version}"

            const val tooling = "androidx.compose.ui:ui-tooling:${version}"
            const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:${version}"
        }
    }
}
