FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests




FROM openjdk:17-jdk-slim
RUN apt-get update && apt-get install -y \
    libfreetype6 \
    fontconfig \
    fonts-dejavu \
    && rm -rf /var/lib/apt/lists/*
COPY --from=build /target/deployment-testing-0.0.1-SNAPSHOT.jar deployment-testing.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","deployment-testing.jar"]