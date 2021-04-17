plugins {
    kotlin("jvm")
    application
}

dependencies {
    // kotlin generation
    implementation("com.squareup:kotlinpoet:1.8.0")

    // xml parsing - TODO - remove me when old parser is removed
    implementation(localGroovy())

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
