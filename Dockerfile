# Build stage
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Run stage
FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build /app/target/Capstone-1-0.0.1-SNAPSHOT.jar app.jar
COPY src/main/resources/application.properties ./application.properties

# Create directories for file storage
RUN mkdir -p /app/files /app/certificates

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]