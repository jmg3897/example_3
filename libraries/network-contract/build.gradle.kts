plugins {
    id("com.android.library")
}

apply {
    from("../../base.gradle")
}

android {

}

dependencies {
    implementation("com.google.code.gson:gson:${rootProject.extra["gson_version"]}")
}