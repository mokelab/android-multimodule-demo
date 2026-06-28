pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MultiModule"
include(":app")
include(":core:model")

include(":core:data")
include(":core:data:api")
include(":core:data:impl")
include(":feature:feature1:api")
include(":feature:feature1:impl")
include(":feature:feature2:api")
include(":feature:feature2:impl")
include(":feature:feature3:api")
include(":feature:feature3:impl")
include(":feature:feature4:api")
include(":feature:feature4")
include(":feature:feature5")
include(":feature:feature6")
include(":feature:feature7")
include(":feature:feature8")
include(":feature:feature9")
include(":feature:feature10")
include(":core:ui")
include(":feature:feature5:api")
include(":feature:feature4:impl")
include(":feature:feature6:api")
include(":feature:feature5:impl")
include(":feature:feature7:api")
include(":feature:feature6:impl")
include(":feature:feature8:api")
include(":feature:feature7:impl")
include(":feature:feature9:api")
include(":feature:feature8:impl")
include(":feature:feature10:api")
include(":feature:feature9:impl")
include(":feature:feature10:impl")
