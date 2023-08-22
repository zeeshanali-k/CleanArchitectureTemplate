buildscript {
    val agpVersion by extra("8.1.1")
    val agp_version by extra("8.1.1")
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("com.android.library") version "7.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
    id("com.google.dagger.hilt.android") version "2.42" apply false
//    id("com.google.gms.google-services") version "4.3.13" apply false
//    id("com.google.firebase.crashlytics") version "2.9.1" apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.10" apply false
}


tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}