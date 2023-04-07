plugins {
	id("org.springframework.boot") version "2.7.10"
	id("io.spring.dependency-management") version "1.1.0"
	java
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
    implementation("com.graphql-java:graphql-java:20.2")
    implementation("com.apollographql.federation:federation-graphql-java-support:3.0.0")
    implementation("org.springframework.boot:spring-boot-starter-graphql")
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework:spring-webflux")
	testImplementation("org.springframework.graphql:spring-graphql-test")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<Test>() {
    useJUnitPlatform()
}
