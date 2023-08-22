import java.util.Properties

plugins {
    id("com.android.application")
    id("kotlin-kapt")
    kotlin("android")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Dependencies.APP_COMPACT)
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.CONSTRAINT_LAYOUT)
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation(Dependencies.LIVE_DATA_KTX)
    implementation(Dependencies.VIEW_MODEL_KTX)
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    //Hilt for DI
    implementation(Dependencies.HILT)
    kapt(Dependencies.HILT_COMPILER)


//    For responsiveness
    implementation("com.intuit.sdp:sdp-android:1.1.0")
    implementation("com.intuit.ssp:ssp-android:1.1.0")


//    Navigation Component
    implementation(Dependencies.NAVIGATION_FRAGMENT_KTX)
    implementation(Dependencies.NAVIGATION_UI_KTX)

//    room db
    implementation(Dependencies.ROOM_KTX)
    implementation(Dependencies.ROOM_RUNTIME)
    kapt(Dependencies.ROOM_COMPILER)

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
