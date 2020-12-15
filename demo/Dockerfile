FROM maven:3.6.3-jdk-11-slim AS mavenBuild
WORKDIR mavenBuild
COPY . .
RUN mvn package -DskipTests

FROM openjdk:11
EXPOSE 8081
COPY --from=mavenBuild /mavenBuild/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]