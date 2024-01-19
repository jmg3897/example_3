plugins {
    id("com.android.library")
}

apply {
    from("../base.gradle")
}

android {

}

dependencies {
    implementation(project(":libraries:network-contract"))
    api(project(":ui_components"))

    implementation("com.google.code.gson:gson:${rootProject.extra["gson_version"]}")
}