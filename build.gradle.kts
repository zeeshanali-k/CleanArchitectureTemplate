// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    //TODO update to current latest versions
    id("com.android.application") version "8.1.1" apply false
    id("com.android.library") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.google.dagger.hilt.android") version Versions.HILT apply false
// TODO   id("com.google.gms.google-services") version "4.3.13" apply false
//  TODO  id("com.google.firebase.crashlytics") version "2.9.1" apply false
}


tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}