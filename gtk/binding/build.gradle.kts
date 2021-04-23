import java.net.URI

plugins {
    kotlin("multiplatform")
    `maven-publish`
    signing
}

group = "org.mrlem.gnome"
version = "0.1.2"

repositories {
    mavenCentral()
}

kotlin {
    linuxX64("native") {
        val main by compilations.getting
        val interop by main.cinterops.creating
        binaries { sharedLib() }
    }

    val nativeMain by sourceSets.getting {
        languageSettings.useExperimentalAnnotation("kotlin.ExperimentalStdlibApi")
        languageSettings.useExperimentalAnnotation("kotlin.ExperimentalUnsignedTypes")
    }
}

publishing {
    repositories {
        maven {
            name = "OSSRH"
            url = URI.create("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
            credentials {
                username = System.getenv("ORG_GRADLE_PROJECT_SONATYPE_NEXUS_USERNAME")
                password = System.getenv("ORG_GRADLE_PROJECT_SONATYPE_NEXUS_PASSWORD")
            }
        }
    }

    publications.withType(MavenPublication::class.java).configureEach {
        pom {
            name.set(project.name)
            description.set("GTK binding for Kotlin Native")
            url.set("https://github.com/mrlem/kotlin-native-gnome")

            licenses {
                license {
                    name.set("LGPL-2.1")
                    url.set("https://github.com/mrlem/kotlin-native-gnome/blob/master/LICENSE")
                }
            }

            developers {
                developer {
                    id.set("mrlem")
                    name.set("Sébastien Guillemin")
                    email.set("sebastien.guillemin@gmail.com")
                }
            }

            scm {
                connection.set("scm:git:ssh://github.com/mrlem/kotlin-native-gnome.git")
                developerConnection.set("scm:git:ssh://github.com/mrlem/kotlin-native-gnome.git")
                url.set("https://github.com/mrlem/kotlin-native-gnome")
            }
        }
    }

    signing {
        publishing.publications.withType(MavenPublication::class.java).forEach {
            sign(it)
        }
    }
}
