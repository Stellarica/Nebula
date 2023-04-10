pluginManagement {
	repositories {
		gradlePluginPortal()
		maven("https://papermc.io/repo/repository/maven-public/")
	}
}

rootProject.name = "nebula"
include("nebula-api", "nebula-server")
