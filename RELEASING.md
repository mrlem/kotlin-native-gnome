# Releasing

## Binding

X: current stable version
Y: new stable version
Z: next stable version

1. Update versions in README.md: X to Y
2. Update versions in build scripts: Y-SNAPSHOT to Y
3. `git commit -am "release: prepare for release"`
4. publish to maven central staging:
   - check that `ORG_GRADLE_PROJECT_SONATYPE_NEXUS_USERNAME` & `ORG_GRADLE_PROJECT_SONATYPE_NEXUS_PASSWORD` are declared
   - `./gradlew :gtk-binding:publishAllPublicationsToOSSRHStagingRepository`
5. publish release:
   - go to https://oss.sonatype.org/#stagingRepositories
   - close the staging repository
   - release the staging directory
6. `git tag -a vY -m "release: version Y"`
7. Update versions in gtk/binding/build.gradle.kts: Y to Z-SNAPSHOT
8. `git commit -am "release: next development version"`

Wait a few minutes until the release appears on https://search.maven.org/artifact/org.mrlem.gnome/gtk-binding

9. `git push && git push --tags`

## Plugin

TODO

