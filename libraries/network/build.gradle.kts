plugins {
    id("com.android.library")
}

apply {
    from("../../base.gradle")
}

android {

}

dependencies {
    implementation(project(":libraries:network-contract"))

    implementation("com.squareup.retrofit2:retrofit:${rootProject.extra["retrofit_version"]}")
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2")
    implementation("com.squareup.retrofit2:adapter-rxjava2:${rootProject.extra["retrofit_version"]}")

    implementation("com.google.code.gson:gson:${rootProject.extra["gson_version"]}")
}