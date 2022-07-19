buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Libs.androidGradlePlugin)
        classpath(Libs.Kotlin.gradlePlugin)
        classpath(Libs.spotless)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
    }
    afterEvaluate {
        apply(plugin = "com.diffplug.spotless")
        configure<com.diffplug.gradle.spotless.SpotlessExtension>{
            kotlinGradle {
                target("*.gradle.kts")
                ktlint(Versions.ktlint)
            }
        }
    }
}
