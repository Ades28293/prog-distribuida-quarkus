plugins {
    id("java")
    id("io.quarkus") version "3.11.1"
}

group = "com.distribuida"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

val quarkusVersion = "3.11.1"

dependencies {
    implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:${quarkusVersion}")) //APLICA TODO
    implementation("io.quarkus:quarkus-arc") //CDI
    //motor jackRs (reactiva)
    implementation("io.quarkus:quarkus-resteasy-reactive") //REST
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson") //JSON para gestionar archivos tipo json

    //generar base de datos
//    implementation("io.quarkus:quarkus-hibernate-orm-panache") //JPA+Hibernate
//    implementation("com.h2database:h2:2.2.224")
}

