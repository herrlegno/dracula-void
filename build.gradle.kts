import org.gradle.api.tasks.wrapper.Wrapper
import org.jetbrains.intellij.platform.gradle.tasks.VerifyPluginTask

val pluginSinceBuild = providers.gradleProperty("pluginSinceBuild").get()

plugins {
  id("java")
  id("org.jetbrains.intellij.platform") version "2.12.0"
}

group = "dev.herrlegno.draculavoid"
version = providers.gradleProperty("pluginVersion").get()

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(21)
  }
}

repositories {
  mavenCentral()

  intellijPlatform {
    defaultRepositories()
  }
}

dependencies {
  intellijPlatform {
    create(
      providers.gradleProperty("platformType").get(),
      providers.gradleProperty("platformVersion").get(),
    )
    pluginVerifier()
  }
}

intellijPlatform {
  buildSearchableOptions = false

  pluginConfiguration {
    ideaVersion {
      sinceBuild = pluginSinceBuild
      untilBuild = provider { null }
    }
  }

  signing {
    certificateChain = providers.environmentVariable("CERTIFICATE_CHAIN").orNull
    privateKey = providers.environmentVariable("PRIVATE_KEY").orNull
    password = providers.environmentVariable("PRIVATE_KEY_PASSWORD").orNull
  }

  publishing {
    token = providers.environmentVariable("PUBLISH_TOKEN").orNull
  }

  pluginVerification {
    ides {
      recommended()
    }
    failureLevel = listOf(
      VerifyPluginTask.FailureLevel.COMPATIBILITY_PROBLEMS,
      VerifyPluginTask.FailureLevel.INVALID_PLUGIN,
    )
  }
}

sourceSets {
  main {
    resources {
      setSrcDirs(listOf("resources"))
    }
  }
}

tasks {
  processResources {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
  }

  named<Wrapper>("wrapper") {
    gradleVersion = "9.1.0"
  }
}
