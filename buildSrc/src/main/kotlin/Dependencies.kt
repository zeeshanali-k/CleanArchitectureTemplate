object Versions {

    //TODO update to current latest versions
    const val RETROFIT = "2.9.0"
    const val LOGGING_INTERCEPTOR = "5.0.0-alpha.10"
    const val HILT = "2.47"
    const val APP_COMPACT = "1.7.0-alpha03"
    const val CORE_KTX = "1.10.1"
    const val MATERIAL = "1.9.0"
    const val CONSTRAINT_LAYOUT = "2.1.4"
    const val LIVE_DATA_KTX = "2.6.1"

    const val NAVIGATION = "2.7.0"

    const val FIREBASE_BOM = "30.5.0"
}


object Dependencies {

    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_GSON = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val LOGGING_INTERCEPTOR =
        "com.squareup.okhttp3:logging-interceptor:${Versions.LOGGING_INTERCEPTOR}"
    const val HILT = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val HILT_COMPILER = "com.google.dagger:hilt-compiler:${Versions.HILT}"

    const val APP_COMPACT = "androidx.appcompat:appcompat:${Versions.APP_COMPACT}"
    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"


    //Firebase
    const val FIREBASE_BOM = "com.google.firebase:firebase-bom:${Versions.FIREBASE_BOM}"
    const val FIREBASE_CORE = "com.google.firebase:firebase-core"
    const val FIREBASE_MESSAGING = "com.google.firebase:firebase-messaging"
    const val FIREBASE_CRASHLYTICS = "com.google.firebase:firebase-crashlytics"


    //Navigation Components
    const val NAVIGATION_FRAGMENT_KTX =
        "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
    const val NAVIGATION_UI_KTX = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"

    //Lifecycle Components
    const val LIVE_DATA_KTX = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIVE_DATA_KTX}"
    const val VIEW_MODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIVE_DATA_KTX}"

    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
}