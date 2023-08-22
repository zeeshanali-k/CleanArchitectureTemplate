import java.util.Properties

plugins {
    id("com.android.application")
    id("kotlin-kapt")
    kotlin("android")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
    id("com.google.devtools.ksp")
//    id("com.google.gms.google-services")
//    id("com.google.firebase.crashlytics")
}

android {
    compileSdk = 34
    namespace = "com.devname.cleanarchitecturetemplate"//TODO: Change package name

    val properties = Properties()
    val localProps = File(rootDir.absolutePath, "gradle.properties")

    defaultConfig {
        applicationId = "com.devname.cleanarchitecturetemplate"
        minSdk = 21
        targetSdk = 34
        versionCode = 18
        versionName = "18.0"
        resourceConfigurations += setOf("en", "fr", "hi", "ne", "mr")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        if (localProps.exists()) {
            properties.load(localProps.inputStream())
            buildConfigField(
                "String",
                "BASE_URL",
                properties["BASE_URL"] as String
            )
        }
    }

    lint {
        checkReleaseBuilds = false
    }


    applicationVariants.all {
        kotlin.sourceSets {
            getByName(name) {
                kotlin.srcDir("build/generated/ksp/$name/kotlin")
            }
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            isDebuggable = false
            buildConfigField("Boolean", "DEBUG_MODE", "false")
//            proguardFiles= getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
        }

        getByName("debug") {
            isMinifyEnabled = false
            isDebuggable = false
            buildConfigField("Boolean", "DEBUG_MODE", "false")
//            proguardFiles= getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
        }
    }


    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }


    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.LIFECYCLE_RUNTIME)
    implementation(Dependencies.LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.COMPOSE_ACTIVITY)

    implementation(platform(Dependencies.COMPOSE_BOM))
    implementation(Dependencies.COMPOSE_UI)
    implementation(Dependencies.COMPOSE_UI_PREVIEW)
    implementation(Dependencies.COMPOSE_MATERIAL3)
    implementation(Dependencies.COMPOSE_UI_GRAPHICS)

    implementation(Dependencies.COMPOSE_DESTINATIONS)
    ksp(Dependencies.COMPOSE_DESTINATIONS_KSP)
    implementation(Dependencies.ACCOMPAIST_SYSTEM_UI_CONTROLLER)
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")


    //Hilt for DI
    implementation(Dependencies.HILT)

    implementation(Dependencies.HILT_NAVIGATION_COMPOSE)
    kapt(Dependencies.HILT_COMPILER)



    //image loading
// TODO   implementation(Dependencies.COIL)

    //retrofit
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_GSON)
    implementation(Dependencies.LOGGING_INTERCEPTOR)


//    Firebase
//    implementation(platform(Dependencies.FIREBASE_BOM))
//    implementation(Dependencies.FIREBASE_CORE)
//    implementation(Dependencies.FIREBASE_MESSAGING)
//    implementation(Dependencies.FIREBASE_CRASHLYTICS)


}
