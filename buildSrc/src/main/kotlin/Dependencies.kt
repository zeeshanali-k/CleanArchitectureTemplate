object Versions {
    const val RETROFIT = "2.9.0"
    const val LOGGING_INTERCEPTOR = "5.0.0-alpha.10"
    const val HILT = "2.47"
    const val HILT_NAVIGATION_COMPOSE = "1.1.0-alpha01"
    const val APP_COMPACT = "1.7.0-alpha03"
    const val CORE_KTX = "1.10.1"
    const val MATERIAL = "1.2.0-alpha05"
    const val COMPOSE_ACTIVITY = "1.6.1"
    const val COMPOSE_BOM = "2023.08.00"
    const val CONSTRAINT_LAYOUT = "2.1.4"
    const val LIVE_DATA_KTX = "2.6.1"
    const val LIFECYCLE_KTX = "2.5.1"
    const val COMPOSE_NAVIGATION = "2.7.0"
    const val COMPOSE_VERSION = "1.5.0"
    const val COMPOSE_DESTINATIONS = "1.9.52"
    const val KSP_PLUGIN = "1.9.0-1.0.13"
    const val ACCOMPANIST = "0.29.1-alpha"
    const val COIL = "2.2.2"

    const val NAVIGATION = "2.7.0"
    const val ROOM = "2.6.0-alpha03"

    const val FIREBASE_BOM = "30.5.0"
}


object Dependencies {

    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_GSON = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val LOGGING_INTERCEPTOR =
        "com.squareup.okhttp3:logging-interceptor:${Versions.LOGGING_INTERCEPTOR}"
    const val HILT = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val HILT_NAVIGATION_COMPOSE =
        "androidx.hilt:hilt-navigation-compose:${Versions.HILT_NAVIGATION_COMPOSE}"
    const val HILT_COMPILER = "com.google.dagger:hilt-compiler:${Versions.HILT}"

    const val APP_COMPACT = "androidx.appcompat:appcompat:${Versions.APP_COMPACT}"
    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"

    //Compose
    const val LIFECYCLE_RUNTIME =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_KTX}"
    const val LIFECYCLE_VIEWMODEL =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.LIFECYCLE_KTX}"
    const val COMPOSE_ACTIVITY = "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY}"
    const val COMPOSE_MATERIAL3 = "androidx.compose.material3:material3"
    const val COMPOSE_UI_GRAPHICS = "androidx.compose.ui:ui-graphics"
    const val COMPOSE_UI = "androidx.compose.ui:ui"
    const val COMPOSE_UI_PREVIEW = "androidx.compose.ui:ui-tooling-preview"
    const val COMPOSE_BOM = "androidx.compose:compose-bom:${Versions.COMPOSE_BOM}"
    const val ACCOMPAIST_SYSTEM_UI_CONTROLLER =
        "com.google.accompanist:accompanist-systemuicontroller:${Versions.ACCOMPANIST}"

    //destinations
    const val COMPOSE_DESTINATIONS =
        "io.github.raamcosta.compose-destinations:animations-core:${Versions.COMPOSE_DESTINATIONS}"
    const val COMPOSE_DESTINATIONS_KSP =
        "io.github.raamcosta.compose-destinations:ksp:${Versions.COMPOSE_DESTINATIONS}"

    const val COIL = "io.coil-kt:coil-compose:${Versions.COIL}"


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
    const val VIEW_MODEL_KTX =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIVE_DATA_KTX}"

    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
}