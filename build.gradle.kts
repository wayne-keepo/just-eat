plugins {
    java
}

group = "edu.wayne-keepo"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_16

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}


dependencies {

    runtimeOnly("org.postgresql:postgresql")

    compileOnly("org.projectlombok:lombok")

    annotationProcessor("org.projectlombok:lombok")

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}