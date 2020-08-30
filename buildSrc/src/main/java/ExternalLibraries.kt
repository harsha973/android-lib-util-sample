object Versions {
    // libraries
    const val gradle = "4.0.1"
    const val kotlin = "1.4.0"
    const val coroutines = "1.3.8"
    const val okHttp = "4.2.0"
    const val androidXLifeCycle = "2.2.0"
    const val material = "1.1.0"
    const val androidXExifInterface = "1.1.0"
    const val crashlyticsSDK = "17.0.0"
    const val timberLog = "4.7.1"
    const val navigationSafeArgs = "2.1.0"

    // test
    const val testRunner = "1.2.0"
    const val espresso = "3.2.0"
    const val junit5 = "5.5.1"
    const val mockk = "1.9.3"
    const val androidXArchCoreTesting = "2.1.0"
}

object AndroidXLibraries {
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.androidXLifeCycle}"
    const val exifInterface= "androidx.exifinterface:exifinterface:${Versions.androidXExifInterface}"
}

object KotlinLibraries {
    const val stdLibJDK7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
}

object Libraries {
    const val material = "com.google.android.material:material:${Versions.material}"
    const val timberLog = "com.jakewharton.timber:timber:${Versions.timberLog}"
    const val crashlyticsSDK = "com.google.firebase:firebase-crashlytics:${Versions.crashlyticsSDK}"
}

object TestLibraries {
    const val junit5API = "org.junit.jupiter:junit-jupiter-api:${Versions.junit5}"
    const val junit5Engine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit5}"
    const val junit5Params = "org.junit.jupiter:junit-jupiter-params:${Versions.junit5}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val androidArchCoreTesting = "androidx.arch.core:core-testing:${Versions.androidXArchCoreTesting}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val mockwebserver = "com.squareup.okhttp3:mockwebserver:${Versions.okHttp}"

    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"

}