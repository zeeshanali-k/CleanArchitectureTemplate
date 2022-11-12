plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
    id("kotlin-kapt")
    kotlin("android")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
//    id("com.google.firebase.crashlytics")
}

android {
    compileSdk = 33
    namespace = "com.mhvmedia.kawachx"

    defaultConfig {
        applicationId = "com.mhvmedia.kawachx"
        minSdk = 21
        targetSdk = 33
        versionCode = 18
        versionName = "18.0"
        resourceConfigurations += setOf("en", "fr", "hi", "ne", "mr")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    implementation("androidx.appcompat:appcompat:1.7.0-alpha01")
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("com.google.android.material:material:1.7.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    //Hilt for DI
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-compiler:2.44")


//    For responsiveness
    implementation("com.intuit.sdp:sdp-android:1.1.0")
    implementation("com.intuit.ssp:ssp-android:1.1.0")


//    Navigation Component
//    implementation("androidx.navigation:navigation-fragment-ktx:2.5.2")
//    implementation("androidx.navigation:navigation-ui-ktx:2.5.2")

//    room db
//    implementation("androidx.room:room-runtime:2.4.3")
//    implementation("androidx.room:room-ktx:2.4.3")
//    kapt("androidx.room:room-compiler:2.4.3")

    //retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.10")


//    Firebase
//    implementation(platform("com.google.firebase:firebase-bom:30.5.0"))
//    implementation("com.google.firebase:firebase-core")
//    implementation("com.google.firebase:firebase-messaging")
//    implementation("com.google.firebase:firebase-crashlytics")


}
