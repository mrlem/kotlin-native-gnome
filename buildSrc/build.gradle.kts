plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
}

dependencies {
    // kotlin generation
    implementation("com.squareup:kotlinpoet:1.8.0")

    // gradle
    // .. plugin API
    implementation(gradleApi())
    implementation(localGroovy())
    // .. kotlin plugin API
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.31")
}
