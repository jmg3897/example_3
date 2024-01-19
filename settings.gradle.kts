pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "example_3"
include(":app")
include(":core")
include(":features:feed")
include(":features:detail")
include(":features:detail")
include(":libraries:network")
include(":libraries:network-contract")
include(":ui_components")