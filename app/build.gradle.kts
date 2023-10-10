plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("kotlin-kapt")
}

android {
    namespace = "uz.dev.runningappyt"
    compileSdk = 33

    defaultConfig {
        applicationId = "uz.dev.runningappyt"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Material design
    implementation("com.google.android.material:material:1.10.0")

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")

    // Room
    implementation("androidx.room:room-runtime:2.5.2")
    annotationProcessor("androidx.room:room-compiler:2.5.2")

    // To use Kotlin Symbol Processing (KSP)
//    ksp("androidx.room:room-compiler:2.5.2")

    // optional - Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:2.5.2")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")

    // Coroutines Lifecycle scope
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")

    // glide
    implementation("com.github.bumptech.glide:glide:4.16.0")

    // Google maps
    implementation("com.google.maps.android:android-maps-utils:3.4.0")

    // dagger core
    implementation("com.google.dagger:dagger:2.37")
    kapt("com.google.dagger:dagger-compiler:2.x")

    api("com.google..dagger:dagger-android:2.32.2")
    api("com.google..dagger:dagger-android-support:2.32.2")
    kapt("com.google..dagger:dagger-android-processor:2.32.2")

    // easy permissions
    implementation("pub.devrel:easypermissions:3.0.0")

    // timber
    implementation("com.jakewharton.timber:timber:5.0.1")

    // MPAndroidChart
    implementation ("com.github.PhilJay:MPAndroidChart:v3.1.0")

    implementation("android.arch.lifecycle:extensions:1.1.1")
}
