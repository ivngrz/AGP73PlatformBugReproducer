plugins {
  `java-platform`
}

javaPlatform {
  allowDependencies()
}

dependencies {
  api("androidx.core:core-ktx:1.7.0")
}
