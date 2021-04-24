plugins {
    kotlin("jvm") version(kotlinVersion)
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.squareup:kotlinpoet:1.8.0")

    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))

    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
}

application {
    mainClass.set("org.gnome.gir.MainKt")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
