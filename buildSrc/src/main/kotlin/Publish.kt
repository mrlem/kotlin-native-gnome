import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.plugins.signing.SigningExtension
import java.net.URI

fun PublishingExtension.configure(projectName: String) {
    repositories {
        maven {
            name = "OSSRHStaging"
            url = URI.create("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
            credentials {
                username = System.getenv("ORG_GRADLE_PROJECT_SONATYPE_NEXUS_USERNAME")
                password = System.getenv("ORG_GRADLE_PROJECT_SONATYPE_NEXUS_PASSWORD")
            }
        }
        maven {
            name = "OSSRHSnapshots"
            url = URI.create("https://oss.sonatype.org/content/repositories/snapshots/")
            credentials {
                username = System.getenv("ORG_GRADLE_PROJECT_SONATYPE_NEXUS_USERNAME")
                password = System.getenv("ORG_GRADLE_PROJECT_SONATYPE_NEXUS_PASSWORD")
            }
        }
    }

    publications.withType(MavenPublication::class.java).configureEach {
        pom {
            name.set(projectName)
            description.set("GNOME bindings for Kotlin Native")
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
}

fun SigningExtension.configure(publishing: PublishingExtension) {
    publishing.publications.withType(MavenPublication::class.java).forEach {
        sign(it)
    }
}