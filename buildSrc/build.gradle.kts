plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    // kotlin generation
    implementation("com.squareup:kotlinpoet:1.8.0")
    implementation("com.github.vishna:watchservice-ktx:master-SNAPSHOT")

    // gradle
    // .. plugin API
    implementation(gradleApi())
    // .. kotlin plugin API
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.31")
}
